package com.googlecode.gchart.gcharttestapp.client;
import com.googlecode.gchart.client.GChart;
/** Illustrates how the standard 16 HTML colors look on a GChart  */
public class GChartExample10 extends GChart {
  GChartExample10() {

    String[] colors = {
      "aqua", "black", "blue", "fuchsia",
      "green","gray",  "lime", "maroon",
      "navy","olive","purple","red",
      "silver","teal","white","yellow"};
      
     this.setChartSize(300, 310);
     setChartTitle("<h3>The 16 Standard HTML colors</h3>");
     getXAxis().setAxisMin(0);
     getXAxis().setAxisMax(1);
     getXAxis().setTickCount(0);
     getYAxis().setAxisMin(-0.5);
     getYAxis().setAxisMax(15.5);
     getYAxis().setTickCount(0);
     
     for (int i = 0; i < colors.length; i++) {
        addCurve();
        getCurve().getSymbol().setSymbolType(SymbolType.HBAR_EAST);
        getCurve().getSymbol().setHoverLocation(AnnotationLocation.EAST);
        getCurve().getSymbol().setModelHeight(1);
        getCurve().getSymbol().setBorderColor("black");
        getCurve().getSymbol().setBackgroundColor(colors[i]);
        getCurve().setLegendLabel(colors[i]);
        getCurve().addPoint(0,15-i);
        getCurve().getPoint().setAnnotationText(colors[i]);  
        getCurve().getPoint().setAnnotationLocation(
         AnnotationLocation.CENTER);
     }
   }
   
}
