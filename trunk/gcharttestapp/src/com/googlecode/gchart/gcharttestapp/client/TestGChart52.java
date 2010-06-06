package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.gchart.client.GChart;
/**
 *
 * Test that switches between a line and a pie chart; to reproduce
 * symptoms of issue #35 (they could not be reproduced, but the
 * test case is a good one, as this sequence had not been tested)
 * 
 */
public class TestGChart52 extends GChart {
   
   final Button chartSwitcher1 = new Button("Check: Clicking me switches to a Pie Chart",
                                           new ClickHandler() {
      public void onClick(ClickEvent event) {
            clearCurves();
            buildPieChart();
            update();
      }});
   final Button chartSwitcher2 = new Button("Check: Clicking me switches to a Line Chart",
                                           new ClickHandler() {
      public void onClick(ClickEvent event) {
            clearCurves();
            buildLineChart();
            update();
   }});
   TestGChart52() {      
      buildLineChart();
   }

  void buildLineChart() {
     setChartSize(300,200);
     this.setLegendVisible(true);
     getXAxis().setAxisVisible(true);
     getYAxis().setAxisVisible(true);
     getXAxis().setAxisMin(0);
     getXAxis().setAxisMax(10);
     getXAxis().setTickCount(11);
     getYAxis().setAxisMin(0);
     getYAxis().setAxisMax(100);
     getYAxis().setTickCount(11);
     setChartTitle("<b>x<sup>2</sup> vs x</b>");
     setChartFootnotes(chartSwitcher1);
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

  void buildPieChart() {
     double[] pieMarketShare = {0.65,0.20,0.10,0.05};
     String[] pieTypes = {"Apple", "Cherry", "Pecan", "Bannana"};
     String[] pieColors = {"green", "red", "maroon", "yellow"};
       
     this.setChartSize(300, 200);
     setChartTitle("<h3>2008 Sales by Pie Flavor" + 
                   "<br>(Puny Pies, Inc.) </h3>");
     setChartFootnotes(chartSwitcher2);
     this.setLegendVisible(false);
     getXAxis().setAxisVisible(false);
     getYAxis().setAxisVisible(false);
     getXAxis().setAxisMin(0);
     getXAxis().setAxisMax(10);
     getXAxis().setTickCount(0);
     getYAxis().setAxisMin(0);
     getYAxis().setAxisMax(10);
     getYAxis().setTickCount(0);
// this line orients the center of the first slice (apple) due east
     setInitialPieSliceOrientation(0.75 - pieMarketShare[0]/2);
     for (int i=0; i < pieMarketShare.length; i++) {
       addCurve();
       getCurve().addPoint(5,5);
       getCurve().getSymbol().setSymbolType(
         SymbolType.PIE_SLICE_OPTIMAL_SHADING);
       getCurve().getSymbol().setBorderColor("white");
       getCurve().getSymbol().setBackgroundColor(pieColors[i]);
       // next two lines define pie diameter in x-axis model units
       getCurve().getSymbol().setModelWidth(6);
       getCurve().getSymbol().setHeight(0);
       getCurve().getSymbol().setFillSpacing(0);
       getCurve().getSymbol().setFillThickness(3);
       getCurve().getSymbol().setHovertextTemplate(
         GChart.formatAsHovertext(pieTypes[i] + ", " + 
            Math.round(100*pieMarketShare[i])+"%"));
       getCurve().getSymbol().setPieSliceSize(pieMarketShare[i]);
       getCurve().getPoint().setAnnotationText(pieTypes[i]);
       getCurve().getPoint().setAnnotationLocation(
         AnnotationLocation.OUTSIDE_PIE_ARC);
     }
     getXAxis().setAxisLabel((Widget) null);
     getYAxis().setAxisLabel((Widget) null);
  }
}
