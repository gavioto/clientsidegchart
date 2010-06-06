package com.googlecode.gchart.gcharttestapp.client;


import com.googlecode.gchart.client.GChart;

/** Solid-fill version of pie chart tests of TestGChart14 */
public class TestGChart14b extends GChart {
   TestGChart14b() {
     this.setChartSize(750, 200);
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes(
"Check: On left pie: Slice labels 0..15 approx. evenly spaced around pie<br>" +
"All sliced solidly filled<br>" +
"Corresponding labels at due north, south, east, and west positions<br>" +
"Middle and right pie 1 large solidly shaded non-convex slice<br>" +
"Small, upper-right, solid filled, full-circle red pie that turns purple on mouseover.");
     setLegendVisible(false);
     
     getXAxis().setAxisMin(-0.1);
     getXAxis().setAxisMax(4.5);
     getXAxis().setAxisVisible(false);
     getXAxis().setTickCount(0);
     getYAxis().setAxisMin(-1);
     getYAxis().setAxisMax(1);
     getYAxis().setAxisVisible(false);
     getYAxis().setTickCount(0);
     for (int i=0; i < 16; i++) {
        if (i % 4 == 0) {
          final String[] compassLabels = {"south", "west", "north", "east"};
          addCurve();
          getCurve().addPoint(.5,0);
          getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
          getCurve().getSymbol().setModelWidth(1);
          getCurve().getSymbol().setHeight(0);
          // zero-sized slice doesn't show--just to test annotations
          getCurve().getSymbol().setPieSliceSize(0);
          getCurve().getPoint().setAnnotationText(compassLabels[i/4]);
          getCurve().getPoint().setAnnotationLocation(
    		   AnnotationLocation.OUTSIDE_PIE_ARC);
       }
       addCurve();
       getCurve().addPoint(.5,0);
       // this is ignored because pie bars are much less than 20 px
       getCurve().getSymbol().setBorderWidth(0);
       getCurve().getSymbol().setHoverSelectionBorderWidth(-3);
       getCurve().getSymbol().setHoverSelectionBorderColor("black");
       getCurve().getSymbol().setBackgroundColor(getCurve().getSymbol().getBorderColor());
       getCurve().getSymbol().setBorderColor("silver");
       getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
       getCurve().getSymbol().setModelWidth(1);
       getCurve().getSymbol().setHeight(0);
       getCurve().getSymbol().setFillSpacing(0);
       getCurve().getSymbol().setPieSliceSize(1/16.);
       getCurve().getPoint().setAnnotationText(i+"");
       getCurve().getPoint().setAnnotationLocation(
          AnnotationLocation.OUTSIDE_PIE_ARC);
     }
     addCurve();
     getCurve().addPoint(1.75,0);
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setModelWidth(1);
     getCurve().getSymbol().setHeight(0);
     getCurve().getSymbol().setFillSpacing(0);
     getCurve().getSymbol().setBackgroundColor(
         getCurve().getSymbol().getBorderColor());
     getCurve().getSymbol().setPieSliceOrientation(1/6.);
     getCurve().getSymbol().setPieSliceSize(4/6.);
     getCurve().getPoint().setAnnotationXShift(20);
     getCurve().getPoint().setAnnotationYShift(20);
     getCurve().getPoint().setAnnotationText("I should be shifted 20 pixels up, and 20 pixels left.");
     getCurve().getPoint().setAnnotationLocation(
    		   AnnotationLocation.OUTSIDE_PIE_ARC);
     addCurve();
     getCurve().addPoint(2.5,0);
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setModelWidth(1);
     getCurve().getSymbol().setHeight(0);
     getCurve().getSymbol().setFillSpacing(0);     
     getCurve().getSymbol().setBackgroundColor(
         getCurve().getSymbol().getBorderColor());
     getCurve().getSymbol().setPieSliceOrientation(5./12.);
     getCurve().getSymbol().setPieSliceSize(4/6.);
     getCurve().getPoint().setAnnotationXShift(20);
     getCurve().getPoint().setAnnotationText("I should be 20 px outside slice.");
     getCurve().getPoint().setAnnotationLocation(
    		   AnnotationLocation.OUTSIDE_PIE_ARC);
     addCurve();
     getCurve().addPoint(4,.75);
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setModelWidth(0.5);
     getCurve().getSymbol().setHeight(0);
     getCurve().getSymbol().setBackgroundColor("red");
     getCurve().getSymbol().setHoverSelectionBackgroundColor("rgba(0,0,255,0.5)");
     getCurve().getSymbol().setFillSpacing(0);     
     getCurve().getSymbol().setPieSliceOrientation(0.25);
     getCurve().getSymbol().setPieSliceSize(1);
     getCurve().getPoint().setAnnotationXShift(-20);
     getCurve().getPoint().setAnnotationText("I should turn purple when you hover over me.");
     getCurve().getPoint().setAnnotationLocation(
    		   AnnotationLocation.OUTSIDE_PIE_ARC);
   }
}
