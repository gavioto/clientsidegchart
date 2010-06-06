package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

/** Tests solid fill pies */
public class TestGChart15 extends GChart {
   TestGChart15(int fillSpacing) {
     this.setChartSize(100, 100);
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes(
"Check: 12 1/12 pie slices, solidly filled Red, Green, Blue, repeat");
     getXAxis().setAxisMin(-1);
     getXAxis().setAxisMax(1);
     getYAxis().setAxisMin(-1);
     getYAxis().setAxisMax(1);
     setInitialPieSliceOrientation(1/12.);
     for (int i=0; i < 12; i++) {
       addCurve();
       getCurve().addPoint(0,0);
       getCurve().getSymbol().setBorderWidth(0);
       getCurve().getSymbol().setBackgroundColor(
         ((i%3)==0)?"red":(((i%3)==1)?"green":"blue")); 
       getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
       getCurve().getSymbol().setFillThickness(Math.max(1, fillSpacing));
       getCurve().getSymbol().setFillSpacing(fillSpacing);
       getCurve().getSymbol().setModelWidth(2);
       getCurve().getSymbol().setHeight(0);
       getCurve().getSymbol().setPieSliceSize(1/12.);
     }
   }
}
