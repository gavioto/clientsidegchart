package com.googlecode.gchart.gcharttestapp.client;


import com.googlecode.gchart.client.GChart;

/** Empty chart without anything on it except a title and footnotes */
public class TestGChart00 extends GChart {
   TestGChart00() {
     super(150,150);
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes("Check: Consistent with a 'no data' chart (and it doesn't crash).");
   }
}
