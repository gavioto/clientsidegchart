package com.googlecode.gchart.gcharttestapp.client;
import com.googlecode.gchart.client.GChart;
/**
 * Defines a "square pie chart", that is, a
 * fat, axes-free, stacked bar chart that is
 * often an acceptable alternative to a pie-chart.
 * <p>
 * 
 * Even though, as of version 2.0, GChart also supports
 * round pie charts, square pie charts are still
 * much more efficient.
 * 
 */
public class GChartExample06 extends GChart {
  GChartExample06() {
     setChartTitle("<b><i>Market Share by Region</i></b>");
     final int SIZE = 200;   
     setChartSize(SIZE, SIZE);
     final String[] region =
       {"USA", "Canada", "Mexico", "India", "France", "Iceland"};
     // elements in this array must sum to 100.
     final double[] percent = {35, 25, 15, 10, 10, 5};
     final String[] colors =
       {"red", "green", "yellow", "fuchsia", "silver", "aqua"};
     double sum = 0;     
     for (int i = percent.length-1; i >= 0; i--) {
       addCurve();
       getCurve().getSymbol().setSymbolType(
          SymbolType.BOX_SOUTHEAST);
       getCurve().getSymbol().setModelHeight(percent[i]);
       getCurve().getSymbol().setBackgroundColor(colors[i]);
       getCurve().getSymbol().setBorderColor(colors[i]);
       getCurve().getSymbol().setWidth(SIZE);
       getCurve().getSymbol().setHoverAnnotationSymbolType(
          SymbolType.ANCHOR_MOUSE_SNAP_TO_Y);
       getCurve().getSymbol().setHoverLocation(
          AnnotationLocation.SOUTHEAST);
       
       getCurve().getSymbol().setHovertextTemplate(
          GChart.formatAsHovertext(region[i] + ", " + percent[i] + "%"));
       getCurve().setLegendLabel(region[i]);
       getCurve().addPoint(0, 100-sum);
       getCurve().getPoint().setAnnotationText(region[i]);
       getCurve().getPoint().setAnnotationFontWeight("bold");
       getCurve().getPoint().setAnnotationLocation(
         AnnotationLocation.CENTER);
       sum += percent[i];
     }

     getXAxis().setTickCount(0);
     getXAxis().setTickThickness(0);
     getXAxis().setAxisMin(0);
     getXAxis().setAxisMax(SIZE);
     getYAxis().setTickCount(0);
     getYAxis().setTickThickness(0);
     getYAxis().setAxisMin(0);
     getYAxis().setAxisMax(100); 
     
  }
}
