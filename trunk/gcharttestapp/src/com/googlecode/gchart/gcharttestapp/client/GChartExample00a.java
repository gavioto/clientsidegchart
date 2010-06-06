package com.googlecode.gchart.gcharttestapp.client;
import com.googlecode.gchart.client.GChart;
/**
 * Defines a line-plot of x*x vs. x, with dotted connecting lines.
 */
public class GChartExample00a extends GChart {
  GChartExample00a() {
     setChartTitle("<b>x<sup>2</sup> vs x</b>");
     setChartSize(150, 150);
     addCurve();
// 2 pixel square connecting dots, spaced 5 pixels apart:
     getCurve().getSymbol().setFillThickness(2);
     getCurve().getSymbol().setFillSpacing(5);
     for (int i = 0; i < 10; i++) 
       getCurve().addPoint(i,i*i);
     getCurve().setLegendLabel("x<sup>2</sup>");
     getXAxis().setAxisLabel("x");
     getYAxis().setAxisLabel("x<sup>2</sup>");
  }
}
