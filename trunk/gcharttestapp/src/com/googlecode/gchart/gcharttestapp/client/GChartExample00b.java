package com.googlecode.gchart.gcharttestapp.client;
import com.googlecode.gchart.client.GChart;
/**
 * Defines a line-plot of x*x vs. x, with solid connecting lines.
 *
 * Note: This chart uses the built-in HTML-element based line
 * rendering.  As of GChart 2.5, faster drawn, better looking,
 * solid connecting lines can be produced by plugging an external
 * canvas library into GChart.  See the <tt>setCanvasFactory</tt>
 * method's javadocs for the details, and the sine + cosine chart
 * on GChart's live demo for a complete working example.
 * 
 */
public class GChartExample00b extends GChart {
  GChartExample00b() {
     setChartTitle("<b>x<sup>2</sup> vs x</b>");
     setChartSize(150, 150);
     addCurve();
// solid, 2px thick, 1px resolution, connecting lines:
     getCurve().getSymbol().setSymbolType(SymbolType.LINE);
     getCurve().getSymbol().setFillThickness(2);
     getCurve().getSymbol().setFillSpacing(1);
// Make center-fill of square point markers same color as line:
     getCurve().getSymbol().setBackgroundColor(
    		 getCurve().getSymbol().getBorderColor());
     for (int i = 0; i < 10; i++) 
       getCurve().addPoint(i,i*i);
     getCurve().setLegendLabel("x<sup>2</sup>");
     getXAxis().setAxisLabel("x");
     getYAxis().setAxisLabel("x<sup>2</sup>");
  }
}
