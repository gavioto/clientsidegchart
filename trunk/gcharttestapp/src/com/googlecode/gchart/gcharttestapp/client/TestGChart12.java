package com.googlecode.gchart.gcharttestapp.client;


import com.googlecode.gchart.client.GChart;

/** Tests annotations: inside, outside, on perimeter of pie */
public class TestGChart12 extends GChart {
   TestGChart12() {
//	 int fillSpacing = 4;  
//	 int fillThickness = 2;  
     int diameter = 200;
     int[] slices = {2,4,8,16,32,32};
     AnnotationLocation[] locations = {
       AnnotationLocation.INSIDE_PIE_ARC,
       AnnotationLocation.ON_PIE_ARC,
       AnnotationLocation.OUTSIDE_PIE_ARC,
       AnnotationLocation.INSIDE_PIE_ARC,
       AnnotationLocation.ON_PIE_ARC,
       AnnotationLocation.OUTSIDE_PIE_ARC};
       
     String[] colors = {"aqua","maroon", "lime", "red", "green", "blue"};
     this.setChartSize(300, 300);
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes("Check: starting at 6 O'clock, slice size (annotation):<br>" +
                       "1/2 (in-0px),1/4 (on) ,1/8 (out-0px) <br>" +
                       "1/16 (in-10px) ,1/32 (on), 1/32 (out-10px)");
     getXAxis().setHasGridlines(true);
     getXAxis().setAxisMax(1);
     getXAxis().setAxisMin(-1);
     getXAxis().setTickCount(2);
     getYAxis().setHasGridlines(true);
     getYAxis().setAxisMin(-1);
     getYAxis().setAxisMax(1);
     getYAxis().setTickCount(2);
     
     for (int i=0; i < slices.length; i++) {
       addCurve();
       getCurve().addPoint(0,0);
       getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_VERTICAL_SHADING);
       if (i==2)
         getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_HORIZONTAL_SHADING);
       getCurve().getSymbol().setBorderColor(colors[i]);
//       getCurve().getSymbol().setFillSpacing(fillSpacing);
//       getCurve().getSymbol().setFillThickness(fillThickness);
       getCurve().getSymbol().setWidth(diameter);
       getCurve().getSymbol().setHeight(0);
       getCurve().getSymbol().setPieSliceSize(1./slices[i]);
       getCurve().getPoint().setAnnotationText(colors[i]);
       getCurve().getPoint().setAnnotationLocation(locations[i]);
       if (i == 3) getCurve().getPoint().setAnnotationXShift(-10);
       if (i == 5) getCurve().getPoint().setAnnotationXShift(10);
     }
   }
}
