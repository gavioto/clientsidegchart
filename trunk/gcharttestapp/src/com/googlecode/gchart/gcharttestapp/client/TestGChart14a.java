package com.googlecode.gchart.gcharttestapp.client;


import com.googlecode.gchart.client.GChart;

/** Tests annotations: inside, outside, on perimeter of pie */
public class TestGChart14a extends GChart {
   TestGChart14a() {
     this.setChartSize(500, 200);
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes(
"Check: same as TestGChart14, except all annotations hidden");
     setLegendVisible(false);
     
     getXAxis().setAxisMin(-0.1);
     getXAxis().setAxisMax(3);
     getXAxis().setAxisVisible(false);
     getXAxis().setTickCount(0);
     getYAxis().setAxisMin(-1);
     getYAxis().setAxisMax(1);
     getYAxis().setAxisVisible(false);
     getYAxis().setTickCount(0);
     // should work correctly regarless of explicit or implicit
     // orientation specifications; check via random explicit/implicit
     // pattern of specifications.
     boolean[] isExplicit = {true, false, true, true, false,
                             false, true, true, true, false,
                             false, false, true, false, true};
     for (int i=0; i < 16; i++) {
       addCurve();
       getCurve().addPoint(.5,0);
       // this is ignored because pie bars are much less than 20 px
       getCurve().getSymbol().setBorderWidth(10);
       getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
       getCurve().getSymbol().setModelWidth(1);
       getCurve().getSymbol().setHeight(0);
       getCurve().getSymbol().setPieSliceSize(1/16.);
       if (isExplicit[i])
         getCurve().getSymbol().setPieSliceOrientation(i*1/16.);
       getCurve().getPoint().setAnnotationText(i+"");
       getCurve().getPoint().setAnnotationLocation(
    		   AnnotationLocation.OUTSIDE_PIE_ARC);
       getCurve().getPoint().setAnnotationVisible(false);
     }
     addCurve();
     getCurve().addPoint(1.5,0);
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setModelWidth(1);
     getCurve().getSymbol().setHeight(0);
     getCurve().getSymbol().setFillSpacing(3);     
     getCurve().getSymbol().setPieSliceOrientation(1/6.);
     getCurve().getSymbol().setPieSliceSize(4/6.);
     getCurve().getPoint().setAnnotationXShift(20);
     getCurve().getPoint().setAnnotationText("I should be 20 px above slice.");
     getCurve().getPoint().setAnnotationLocation(
    		   AnnotationLocation.OUTSIDE_PIE_ARC);
     getCurve().getPoint().setAnnotationVisible(false);
     addCurve();
     getCurve().addPoint(2.5,0);
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setModelWidth(1);
     getCurve().getSymbol().setHeight(0);
     getCurve().getSymbol().setFillSpacing(3);     
     getCurve().getSymbol().setPieSliceOrientation(5./12.);
     getCurve().getSymbol().setPieSliceSize(4/6.);
     getCurve().getPoint().setAnnotationXShift(20);
     getCurve().getPoint().setAnnotationText("I should be 20 px outside slice.");
     getCurve().getPoint().setAnnotationLocation(
    		   AnnotationLocation.OUTSIDE_PIE_ARC);
     getCurve().getPoint().setAnnotationVisible(false);
   }
}
