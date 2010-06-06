package com.googlecode.gchart.gcharttestapp.client;


import com.google.gwt.user.client.ui.TextBox;
import com.googlecode.gchart.client.GChart;

/** Reproduces error reported by secnoc in issue #24. See the
 * <tt>isContainedIn</tt> method in GChart.java for more information */
public class TestGChart44 extends GChart {
   TestGChart44() {
     super(150,150);
     setChartTitle(GChartTestApp.getTitle(this));
     getXAxis().setAxisLabel(new TextBox());
     setChartFootnotes("Check: In FF2, moving mouse over text box does not produce an exception");
   }
}
