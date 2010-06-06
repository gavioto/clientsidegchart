package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

/**
 * Defines a chart with a scatterplot on one y-axis, and a
 *  barchart on the other.
 */
public class GChartExample03 extends GChart {
  public GChartExample03() {
    setChartTitle("<h2>10x and x<sup>2</sup></h2>");
    setChartSize(300, 300);
    addCurve();
    getCurve().setLegendLabel("<i>10x</i>");
    getCurve().setYAxis(Y_AXIS);
    getCurve().getSymbol().setSymbolType(SymbolType.VBAR_SOUTH); 
    getCurve().getSymbol().setBackgroundColor("#DDF");
    getCurve().getSymbol().setBorderColor("red");
    getCurve().getSymbol().setBorderWidth(1);
    getCurve().getSymbol().setModelWidth(0.5);
    for (int i=0; i < 10; i++) {
      getCurve().addPoint(i,i*10);
    }
    addCurve();
    getCurve().setLegendLabel("<i>x<sup>2</sup></i>");
    getCurve().setYAxis(Y2_AXIS);
    getCurve().getSymbol().setSymbolType(SymbolType.BOX_CENTER); 
    getCurve().getSymbol().setWidth(5);
    getCurve().getSymbol().setHeight(5);
    getCurve().getSymbol().setBorderWidth(0);
    getCurve().getSymbol().setBackgroundColor("navy");
    getCurve().getSymbol().setFillThickness(2);
    getCurve().getSymbol().setFillSpacing(5);
    
    for (int i=0; i < getCurve(0).getNPoints(); i++) {
      getCurve().addPoint(i,i*i);
    }
    
    getXAxis().setAxisLabel("<i>x</i>");
    getXAxis().setHasGridlines(true);
    getXAxis().setTickThickness(0); // hide tick marks... 
    getXAxis().setTickLength(3);    // but leave a small gap
    getYAxis().setAxisLabel("<i>10x</i>");
    getYAxis().setAxisMax(100);
    getYAxis().setTickLabelFormat("#.#");
    getYAxis().setTickCount(11);
    getY2Axis().setAxisLabel("<i>x<sup>2</sup></i>");
    getY2Axis().setHasGridlines(true);
    // last bar 'sticks out' over right edge, so extend 'grid' right:
    getY2Axis().setTickLength(15); 
  }
}
