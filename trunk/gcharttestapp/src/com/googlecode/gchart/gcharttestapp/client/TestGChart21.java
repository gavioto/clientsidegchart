package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

/* 
 * Tests axis' ability to modify ticks per gridline
 *
 */
public class TestGChart21 extends GChart {

   TestGChart21() {
     super(400,400);
     setChartTitle(GChartTestApp.getTitle(this));
     getXAxis().setHasGridlines(true);
     getXAxis().setTickCount(11);
     getXAxis().setTicksPerGridline(2);
     if (getXAxis().getTicksPerGridline() != 2)
       throw new IllegalStateException("Test GChart21 failed. " +
                                       "getXAxis().getTicksPerGridline() != 2");
     getYAxis().setHasGridlines(true);
     getYAxis().setTickCount(11);
     getYAxis().setTicksPerGridline(3);
     if (getYAxis().getTicksPerGridline() != 3)
       throw new IllegalStateException("Test GChart21 failed. " +
                                       "getYAxis().getTicksPerGridline() != 3");
     
     getY2Axis().setHasGridlines(true);
     getY2Axis().setHasGridlines(true);
     getY2Axis().setTickCount(18);
     getY2Axis().setTicksPerGridline(4);
     if (getY2Axis().getTicksPerGridline() != 4)
       throw new IllegalStateException("Test GChart21 failed. " +
                                       "getY2Axis().getTicksPerGridline() != 4");
     setChartFootnotes(
"Check: x-axis 2 ticks/gridline; y-axis 3 ticks/gridline; y2-axis 4 tick/gridline.");
     addCurve();
     for (int i=0; i < 11; i++) {
       getCurve().addPoint(i, i);
     }
     addCurve();
     getCurve().setYAxis(Y2_AXIS);
     for (int i=0; i < 11; i++) {
	     getCurve().addPoint(i, 10-i);
     }
   }  
}
