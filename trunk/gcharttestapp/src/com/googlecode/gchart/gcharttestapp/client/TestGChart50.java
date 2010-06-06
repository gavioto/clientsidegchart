package com.googlecode.gchart.gcharttestapp.client;
import com.googlecode.gchart.client.GChart;
/**
 * Tests the setTickLocation (INSIDE, OUTSIDE, CENTERED) and
 * setTickLabelPadding methods.
 * 
 */
public class TestGChart50 extends GChart {
   TestGChart50(GChart.TickLocation tickLocation, int padding) {
     String tl =
        ((tickLocation == TickLocation.OUTSIDE)?"OUTSIDE":
         ((tickLocation == TickLocation.INSIDE)?"INSIDE":"CENTERED"));
     setChartFootnotes("Check: tickLabelPadding=" + padding +
                        " TickLocation = " + tl);
     setChartSize(150, 150);
     getXAxis().setTickLocation(tickLocation);
     getYAxis().setTickLocation(tickLocation);
     getY2Axis().setTickLocation(tickLocation);
     getXAxis().setTickLabelPadding(padding);
     getYAxis().setTickLabelPadding(padding);
     getY2Axis().setTickLabelPadding(padding);

     getXAxis().setAxisLabel("X");
     getYAxis().setAxisLabel("Y");
     getY2Axis().setAxisLabel("Y2");
     
     addCurve();
     for (int i = 0; i < 10; i++) 
       getCurve().addPoint(i,i*i);
     addCurve();
     getCurve().setYAxis(Y2_AXIS);
     for (int i = 0; i < 10; i++) 
       getCurve().addPoint(9-i,i*i);
  }
}
