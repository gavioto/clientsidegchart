package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

/* 
 * Tests that hiding curves works, and impacts auto-determined
 * axis limits properly.
 */
public class TestGChart24 extends GChart {

   // range of Y's for 1st, 2nd curves on each Y axis.
   int maxY[] = {0, 9, 90}; 

   TestGChart24(int nCurves) {
     super(400,400);
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes("On each y-axis: <ol>" +
         "<li>There are "+ nCurves + " curves." + 
         "<li>There is a 0 to "+ maxY[nCurves] + " axis range.");
     
     getXAxis().setHasGridlines(true);
     getYAxis().setHasGridlines(true);

     addCurve();
     getCurve().setLegendLabel("0 to "+maxY[1]+" (y)");
     for (int i=0; i <= maxY[1]; i++) {
        getCurve().addPoint(i, i);
     }
     addCurve();
     getCurve().setLegendLabel("0 to "+maxY[2]+" (y)");
     for (int i=0; i <= maxY[2]; i+=10) {
        getCurve().addPoint(i, i);
     }

     addCurve();
     getCurve().setYAxis(Y2_AXIS);
     getCurve().setLegendLabel("0 to "+maxY[1]+" (y2)");
     for (int i=0; i <= maxY[1]; i++) {
       getCurve().addPoint(i, 9-i);
     }
     addCurve();
     getCurve().setYAxis(Y2_AXIS);
     getCurve().setLegendLabel("0 to "+maxY[2]+" (y2)");
     for (int i=0; i <= maxY[2]; i+=10) {
       getCurve().addPoint(i, 90-i);
     }
     update();
     if (nCurves == 1) {
       getCurve(1).setVisible(false);
       getCurve(3).setVisible(false);
       update();
     }
   }  
}
