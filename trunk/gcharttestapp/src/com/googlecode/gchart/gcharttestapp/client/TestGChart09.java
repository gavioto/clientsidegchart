package com.googlecode.gchart.gcharttestapp.client;


import com.googlecode.gchart.client.GChart;

/** Simplest possible line chart: two points connected by dotted line*/
public class TestGChart09 extends GChart {
   TestGChart09() {
     this.setChartSize(211, 211);
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes("Check: big squares at (10,10) and (20,20) <br>little 'dots' on gridpoints in between.");
     setLegendVisible(false);
     getYAxis().setHasGridlines(true);
     getXAxis().setHasGridlines(true);
     getYAxis().setTickCount(11);
     getXAxis().setTickCount(11);
     addCurve();
     getCurve().addPoint(10, 10);
     getCurve().addPoint(20, 20);
     getCurve().getSymbol().setSymbolType(SymbolType.BOX_CENTER);
     getCurve().getSymbol().setBackgroundColor("red");
     getCurve().getSymbol().setBorderWidth(0);
     getCurve().getSymbol().setFillThickness(3);
     getCurve().getSymbol().setFillSpacing((int) (Math.sqrt(2)*getXChartSize()/10.));
   }
}
