package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

/* 
 * Tests multi-line tick labels (via HTML)
 */
public class TestGChart23 extends GChart {

   private static String getRepeatedLines(String line, int nLines) {
      String result = "<html>"+line;
      for (int i = 1; i < nLines; i++)
         result += "<br>" + line;
      return result;
   }
   TestGChart23(int nLines) {
     super(400,400);
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes("Each Y, Y2, and X axis tick has " + nLines + " lines.");
     
     getXAxis().setHasGridlines(true);
     getYAxis().setHasGridlines(true);

     addCurve();
     for (int i=0; i < 10; i++) {
        getCurve().addPoint(i, i);
     }

     addCurve();
     getCurve().setYAxis(Y2_AXIS);
     for (int i=0; i < 10; i++) {
       getCurve().addPoint(i, 9-i);
     }

     for (int i=0; i < 10; i++) {
       String repeatedLabel = getRepeatedLines(i+"", nLines);
       getXAxis().addTick(i, repeatedLabel);
       getYAxis().addTick(i, repeatedLabel);
       getY2Axis().addTick(i, repeatedLabel);
     }
   }  
}
