package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

/**
 * Defines a traditional "semi-log" chart by using custom ticks on the y
 * axis, in conjunction with log-transformed y data.
 */
public class GChartExample04a extends GChart {
// GWT 1.4's Math class does not include JDK's Math.log10--so emulate it.
  private static double log10(double x) {
    return Math.log(x)/Math.log(10.0);
  }
  public GChartExample04a() {
    super(300, 450);
    setChartTitle("<h2>2<sup>x</sup> vs x</h2>");
    addCurve();
    getCurve().getSymbol().setHovertextTemplate(
       GChart.formatAsHovertext("${y}=2^${x}")); 
    getCurve().setLegendLabel("<b>2<sup>x</sup></b>");
    getCurve().getSymbol().setBackgroundColor("red");
    getCurve().getSymbol().setBorderColor("black");
    getCurve().getSymbol().setWidth(9);
    getCurve().getSymbol().setHeight(9);

    // these lines draw a thin line between each point
    getCurve().getSymbol().setFillSpacing(2);
    getCurve().getSymbol().setFillThickness(1);
    
    // add (log10-transformed) powers of 2 from 1/4 to 8
    for (int i=-2; i < 4; i++) 
      getCurve().addPoint(i,log10(Math.pow(2,i)));
    
    // GChart's "=10^" NumberFormat prefix inverts the log10 transform
    getYAxis().setTickLabelFormat("=10^#.##"); 
    // add conventional log-scaled ticks from .1 to 10
    getYAxis().addTick(log10(0.1));
    for (double x=0.1; x < 10; x*=10) 
      for (int y = 2; y <= 10; y++) 
         getYAxis().addTick(log10(x*y));

    getXAxis().setAxisLabel("<b>x</b>");
    getXAxis().setHasGridlines(true);
    getXAxis().setTickCount(6);
    
    getYAxis().setAxisLabel("<b>2<sup>x</sup></b>");
    getYAxis().setHasGridlines(true);
    
  }
}
