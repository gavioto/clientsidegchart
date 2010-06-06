package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

// test that explicit axis limit setting methods work as expected.
public class TestGChart04 extends GChart {
   TestGChart04() {
     super(300,300); 
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes("Check: x: 0..90, y: -90..0, y2: -45...45");
     
     getXAxis().setHasGridlines(true);
     getY2Axis().setHasGridlines(true);
     addCurve();
     getCurve().setYAxis(Y_AXIS);
     addCurve();
     getCurve().setYAxis(Y2_AXIS);
     getXAxis().setAxisMin(0.); 
     getXAxis().setAxisMax(90.); 
     getYAxis().setAxisMin(-90.); 
     getYAxis().setAxisMax(0.); 
     getY2Axis().setAxisMin(-45.); 
     getY2Axis().setAxisMax(45); 
     setLegendVisible(false);
   }
}
