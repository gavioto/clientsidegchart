package com.googlecode.gchart.gcharttestapp.client;
import com.googlecode.gchart.client.GChart;
/**
 * Defines a line-plot of x*x vs. x, with canvas-based, solid
 * connecting lines (requires use of setCanvasFactory in your
 * application module to tell GChart how to access an external
 * canvas-based GWT library of your choice)
 */
public class GChartExample00c extends GChart {
  GChartExample00c() {
     setChartTitle("<b>x<sup>2</sup> vs x</b>");
     setChartSize(150, 150);
     addCurve();
// solid, 2px thick connecting lines:
     getCurve().getSymbol().setSymbolType(SymbolType.LINE);
     getCurve().getSymbol().setFillThickness(2);
     for (int i = 0; i < 10; i++) 
       getCurve().addPoint(i,i*i);
     getCurve().setLegendLabel("x<sup>2</sup>");
     getXAxis().setAxisLabel("x");
     getYAxis().setAxisLabel("x<sup>2</sup>");
  }
}
