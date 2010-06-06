package com.googlecode.gchart.gcharttestapp.client;


import com.googlecode.gchart.client.GChart;

/** Simplest possible pie chart: one slice takes up entire pie*/
public class TestGChart10 extends GChart {
   TestGChart10() {
     this.setChartSize(150, 150);
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes(
"Check: a single, evenly-hatched, red circle (pie)");
     setLegendVisible(false);
     getXAxis().setAxisMax(1);
     getXAxis().setAxisMin(-1);
     getXAxis().setTickCount(0);
     getYAxis().setAxisMin(-1);
     getYAxis().setAxisMax(1);
     getYAxis().setTickCount(0);
     addCurve();
     getCurve().addPoint(0,0);
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_HATCHED_SHADING);
     getCurve().getSymbol().setBackgroundColor("red");
     getCurve().getSymbol().setBorderWidth(0);
     getCurve().getSymbol().setFillThickness(1);
     getCurve().getSymbol().setFillSpacing(4);
     getCurve().getSymbol().setWidth(100);
     getCurve().getSymbol().setHeight(0);
   }
}
