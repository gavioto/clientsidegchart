package com.googlecode.gchart.gcharttestapp.client;
import com.googlecode.gchart.client.GChart;
/**
 * Defines a bar-chart with black-and-white striped bars, using setImageURL
 * and an appropriate image.
 */
public class GChartExample01c extends GChart {
  GChartExample01c() {
     setChartTitle("<b>x<sup>2</sup> vs x</b>");
     setChartSize(500, 150);
     addCurve();
     for (int i = 0; i < 10; i++) 
       getCurve().addPoint(i,i*i);
     getCurve().setLegendLabel("x<sup>2</sup>");
     getCurve().getSymbol().setSymbolType(SymbolType.VBAR_SOUTH);
     getCurve().getSymbol().setBackgroundColor(TRANSPARENT_BORDER_COLOR);
     getCurve().getSymbol().setImageURL("alternating-black-white-row.gif");
     getCurve().getSymbol().setBorderColor("red");
     // image is 40px, allow 2 extra pixels for the red border
     getCurve().getSymbol().setWidth(42);
     getCurve().getSymbol().setHoverAnnotationSymbolType(SymbolType.ANCHOR_MOUSE);
     getXAxis().setAxisLabel("<b>x</b>");
     getXAxis().setHasGridlines(true);
     getYAxis().setAxisLabel("<b>x<sup>2</sup></b>");
     getYAxis().setHasGridlines(true);
  }
}
