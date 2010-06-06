package com.googlecode.gchart.gcharttestapp.client;


import com.googlecode.gchart.client.GChart;

/** "Exploded pie" example*/
public class GChartExample08 extends GChart {
   GChartExample08() {
     double[] pieMarketShare = {0.65,0.20,0.05,0.10};
     String[] pieTypes = {"Apple", "Cherry", "Bannana", "Pecan"};
     String[] pieColors = {"green", "red", "yellow", "maroon"};
       
     this.setChartSize(300, 200);
     setChartTitle(
       "<b><big>Exploding Puny Pies, Inc. 2008 Sales</b></big>");
     setPadding("10px 0px 0px 0px");
     getXAxis().setHasGridlines(false);
     this.setLegendVisible(false);
     getXAxis().setAxisVisible(false);
     getXAxis().setAxisMin(0);
     getXAxis().setAxisMax(10);
     getXAxis().setTickLength(30);  // adds a little spacing
     getXAxis().setTickCount(0);
     getYAxis().setAxisMin(0);
     getYAxis().setAxisMax(10);
     getYAxis().setTickCount(0);
     getYAxis().setAxisVisible(false);
     
     double orientation = 0;     
     for (int i=0; i < pieMarketShare.length; i++) {
       addCurve();
       // adjust slice center to create "exploding" slices
       final double explodingXRadius = 0.48;
       final double explodingYRadius = 0.32;
       double theta = 3*Math.PI/2 
         - 2*Math.PI*(orientation + pieMarketShare[i]/2.0);
       getCurve().addPoint(5+explodingXRadius*Math.cos(theta),
                           5+explodingYRadius*Math.sin(theta));
       getCurve().getSymbol().setSymbolType(
          SymbolType.PIE_SLICE_OPTIMAL_SHADING);
       getCurve().getSymbol().setBorderColor("white");
       getCurve().getSymbol().setBackgroundColor(pieColors[i]);
       // next two lines define pie diameter as 6 x-axis model units
       getCurve().getSymbol().setModelWidth(6);
       getCurve().getSymbol().setHeight(0);
       getCurve().getSymbol().setFillSpacing(3);
       getCurve().getSymbol().setFillThickness(3);
       getCurve().getSymbol().setHovertextTemplate(
         GChart.formatAsHovertext(
         pieTypes[i] + ", " + Math.round(100*pieMarketShare[i])+"%"));
       getCurve().getSymbol().setPieSliceOrientation(orientation);
       getCurve().getSymbol().setPieSliceSize(pieMarketShare[i]);
       getCurve().getPoint().setAnnotationText(pieTypes[i]);
       getCurve().getPoint().setAnnotationLocation(
         AnnotationLocation.OUTSIDE_PIE_ARC);
       // add a 5px gap between label and pie slice
       getCurve().getPoint().setAnnotationXShift(5);
       orientation = (orientation + pieMarketShare[i]) % 1.0;
     }
   }
   
}
