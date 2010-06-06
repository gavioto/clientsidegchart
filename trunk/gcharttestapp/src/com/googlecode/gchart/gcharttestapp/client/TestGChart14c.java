package com.googlecode.gchart.gcharttestapp.client;


import com.googlecode.gchart.client.GChart;

/** A multi-slice pie similar TestGChart14 only with many more
 * slices with a wider variety of sizes */
public class TestGChart14c extends GChart {
   TestGChart14c() {
     this.setChartSize(750, 200);
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes(
"Check: On left pie: Slice sizes keep getting cut in half<br>" +
"starting at 50% and eventually degenerate into invisible<br>" +
"but still selectable series of evenly-spaced, 0-sized, slices<br>" +
"Two single, tiny, 1%, slices intersect, on right,<br>" +
"1 large empty circle which turns semi-transparent blue on mouseover.");
     setLegendVisible(false);
     
     getXAxis().setAxisMin(-0.1);
     getXAxis().setAxisMax(4.5);
     getXAxis().setAxisVisible(false);
     getXAxis().setTickCount(0);
     getYAxis().setAxisMin(-1);
     getYAxis().setAxisMax(1);
     getYAxis().setAxisVisible(false);
     getYAxis().setTickCount(0);
     double orientation = .25;
     for (int i=0; i < 32; i++) {
       addCurve();
       getCurve().addPoint(.5,0);
       getCurve().getSymbol().setBorderWidth(1);
//       getCurve().getSymbol().setHoverSelectionBorderWidth(-3);
//       getCurve().getSymbol().setHoverSelectionBorderColor("black");
//       getCurve().getSymbol().setBackgroundColor(getCurve().getSymbol().getBorderColor());
//       getCurve().getSymbol().setBorderColor("black");

       getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
       getCurve().getSymbol().setModelWidth(1);
       getCurve().getSymbol().setHeight(0);
       getCurve().getSymbol().setFillSpacing(0);
       getCurve().getSymbol().setPieSliceSize(1/Math.pow(2.,i+1));
       getCurve().getSymbol().setPieSliceOrientation(orientation);
       orientation += Math.max(1/Math.pow(2.,i+1), 0.01);
       if (orientation >= 1)
          orientation -= 1;
       getCurve().getPoint().setAnnotationText(i+"");
       getCurve().getPoint().setAnnotationXShift(10);
       getCurve().getPoint().setAnnotationLocation(
          AnnotationLocation.OUTSIDE_PIE_ARC);
       getCurve().getSymbol().setBrushSize(5,5);
     }
     addCurve();
     getCurve().addPoint(1.75,0);
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setModelWidth(1);
     getCurve().getSymbol().setHeight(0);
     getCurve().getSymbol().setFillSpacing(0);
     getCurve().getSymbol().setBackgroundColor("red");
     getCurve().getSymbol().setPieSliceOrientation(1/6.);
     getCurve().getSymbol().setPieSliceSize(.01);
     getCurve().getPoint().setAnnotationXShift(20);
     getCurve().getPoint().setAnnotationYShift(20);
     getCurve().getPoint().setAnnotationText("I should be shifted 20 pixels up, and 20 pixels left.");
     getCurve().getPoint().setAnnotationLocation(
    		   AnnotationLocation.OUTSIDE_PIE_ARC);
     addCurve();
     getCurve().addPoint(2.55,0);
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setModelWidth(1);
     getCurve().getSymbol().setHeight(0);
     getCurve().getSymbol().setFillSpacing(0);     
     getCurve().getSymbol().setBackgroundColor(
         getCurve().getSymbol().getBorderColor());
     getCurve().getSymbol().setPieSliceOrientation(5./12.);
     getCurve().getSymbol().setPieSliceSize(.01);
     getCurve().getPoint().setAnnotationXShift(20);
     getCurve().getPoint().setAnnotationText("I should be 20 px outside slice.");
     getCurve().getPoint().setAnnotationLocation(
    		   AnnotationLocation.OUTSIDE_PIE_ARC);
     addCurve();
     getCurve().addPoint(2,0);
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setModelWidth(1);
     getCurve().getSymbol().setHeight(0);
     getCurve().getSymbol().setBackgroundColor(TRANSPARENT_BORDER_COLOR);
     getCurve().getSymbol().setHoverSelectionBackgroundColor("rgba(0,0,255,0.5)");
     getCurve().getSymbol().setFillSpacing(0);     
     getCurve().getSymbol().setPieSliceOrientation(0.25);
     getCurve().getSymbol().setPieSliceSize(1);
     getCurve().getPoint().setAnnotationXShift(-20);
     getCurve().getPoint().setAnnotationText("I should get filled with semi-transparent blue on hover over.");
     getCurve().getPoint().setAnnotationLocation(
    		   AnnotationLocation.OUTSIDE_PIE_ARC);
   }
}
