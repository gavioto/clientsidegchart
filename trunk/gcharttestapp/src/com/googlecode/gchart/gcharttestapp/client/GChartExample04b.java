package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

/**
 * Defines a traditional "semi-log" chart by using custom
 * ticks on the y axis, in conjunction with log-transformed
 * y data (adds parameters that make it easier to modify
 * the example for different axis limits, tick spacings, etc.)
 *
 * This example was added in response to the following post by
 * "rrockwell" on the GWT forum:
 *
 * http://groups.google.com/group/Google-Web-Toolkit/msg/1b89eb9a0fbf849c
 * 
 */
public class GChartExample04b extends GChart {
// GWT 1.4's Math class does not include JDK's
// Math.log10--so emulate it.
  private static double log10(double x) {
    return Math.log(x)/Math.log(10.0);
  }
  private static double log2(double x) {
	    return Math.log(x)/Math.log(2.0);
  }
  public GChartExample04b() {
    super(300, 450);
    final double Y_MIN = 0.1;
    final double Y_MAX = 100000.;
    // these define "between-the-decade" line positions
    // (use an increasing sequence starting at 1 and ending at 10)
    final double[] relativeTickPositions = {1.0, 2.0, 3.0, 4.0, 5.0, 10.0};
    setChartTitle("<h2>2<sup>x</sup> vs x</h2>");
    addCurve();
    getCurve().getSymbol().setHovertextTemplate(
      GChart.formatAsHovertext("${y}=2^${x}")); 
    getCurve().setLegendLabel("<b>2<sup>x</sup></b>");
    getCurve().getSymbol().setBackgroundColor("rgba(255,0,0,0.3)");
    getCurve().getSymbol().setBorderColor("rgba(0,0,0,0.3)");
    getCurve().getSymbol().setWidth(9);
    getCurve().getSymbol().setHeight(9);
    getCurve().getSymbol().setFillSpacing(0);
    getCurve().getSymbol().setFillThickness(4);
    
    // add (log10-transformed) powers of 2 that fall in y-axis range
    for (int i=(int) Math.ceil(log2(Y_MIN)); Math.pow(2,i) < Y_MAX; i++) 
      getCurve().addPoint(i,log10(Math.pow(2,i)));
    
    // GChart's "=10^" NumberFormat prefix inverts the log10 transform
    getYAxis().setTickLabelFormat("=10^###,###.##"); 
    // add conventional log-scaled ticks according to specs
    getYAxis().addTick(log10(Y_MIN));
    for (double x=Y_MIN; x < Y_MAX; x*=10) 
      for (int i = 1; i < relativeTickPositions.length; i++)
         getYAxis().addTick(log10(x*relativeTickPositions[i]));

    getXAxis().setAxisLabel("<b>x</b>");
    getXAxis().setHasGridlines(true);
    getXAxis().setTickCount(6);
    
    getYAxis().setAxisLabel("<b>2<sup>x</sup></b>");
    getYAxis().setHasGridlines(true);
    
  }
}
