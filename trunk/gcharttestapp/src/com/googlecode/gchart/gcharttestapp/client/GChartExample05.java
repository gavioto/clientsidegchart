package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

/**
 * Defines a traditional "semi-log2" chart by using custom ticks on the y
 * axis, in conjunction with log-transformed y data.
 */
public class GChartExample05 extends GChart {
// Math class does not have Math.log2--so emulate it.
  private static double log2(double x) {
    return Math.log(x)/Math.log(2.);
  }
  public GChartExample05() {
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
    
    // add (log10-transformed) powers of 2 from 1/4 to 8
    for (int i=-2; i < 4; i++) 
      getCurve().addPoint(i,log2(Math.pow(2,i)));
    
    // GChart's "=2^" NumberFormat prefix inverts the log2 transform
    getYAxis().setTickLabelFormat("=2^#.##"); 
    getYAxis().setTickCount(6);
    // add conventional log-scaled ticks from .1 to 10
//    getYAxis().addTick(log2(0.25));
//    for (double x=0.25; x <= 8; x*=2) 
//       getYAxis().addTick(log2(x));

    getXAxis().setAxisLabel("<b>x</b>");
    getXAxis().setHasGridlines(true);
    getXAxis().setTickCount(6);
    
    getYAxis().setAxisLabel("<b>2<sup>x</sup></b>");
    getYAxis().setHasGridlines(true);
    
  }
}
