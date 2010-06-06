package com.googlecode.gchart.gcharttestapp.client;
import com.googlecode.gchart.client.GChart;
/**
 * Defines an area-chart of x*x vs. x, with gridlines.
 * <p>
 * 
 * Note: This chart uses GChart's built-in HTML-element based
 * area chart rendering. As of GChart 2.5, faster drawn, better
 * looking, area charts can be produced by plugging an external
 * canvas library into GChart.  See the <tt>setCanvasFactory</tt>
 * method's javadocs for the details, and the oil price
 * simulation chart on GChart's live demo for a complete working
 * example.
 * 
 */
public class GChartExample01a extends GChart {
  GChartExample01a(int fillSpacing) {
     setChartTitle("<b>x<sup>2</sup> vs x</b>");
     setChartSize(150, 150);
     addCurve();
     for (int i = 0; i < 10; i++) 
       getCurve().addPoint(i,i*i);
     getCurve().setLegendLabel("x<sup>2</sup>");
     getCurve().getSymbol().setSymbolType(SymbolType.VBAR_SOUTHEAST);
     getCurve().getSymbol().setBackgroundColor("red");
     getCurve().getSymbol().setBorderColor("gray");
     getCurve().getSymbol().setBorderWidth(fillSpacing==0?1:0);
// 3px is a little jaggy, but it uses 3 times less elements than 1px 
     getCurve().getSymbol().setWidth(fillSpacing);
     getCurve().getSymbol().setFillThickness(Math.max(1, fillSpacing));
     getCurve().getSymbol().setFillSpacing(fillSpacing);
     getXAxis().setAxisLabel("<b>x</b>");
     getXAxis().setHasGridlines(true);
     getYAxis().setAxisLabel("<b>x<sup>2</sup></b>");
     getYAxis().setHasGridlines(true);
  }
}
