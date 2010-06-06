package com.googlecode.gchart.gcharttestapp.client;

import java.util.Date;

import com.googlecode.gchart.client.GChart;

// tests the special "=(Date)" tick label format prefix 
public class TestGChart04a extends GChart {
   private Date toDate(String s) {
	   return new Date(s);
   }
   TestGChart04a() {
     super(600,300); 
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes(
"Check: x: Jan 01...Jan 27, y: 12/1/2007 12:00 AM..12/27/2007 12:00 AM, y2: Jan-01-1970 00 (GMT,varies w. time zone)...Jan-02-1970 01 (GMT)" + 
"<br>Red point hovertext=(Jan 10, 12/10/2007 12:00 AM)" +
"<br>Blue point hovertext=(Jan 20, Jan 02 1970 00 (in GMT time zone))" 
                      );
     
     getXAxis().setHasGridlines(true);
     getY2Axis().setHasGridlines(true);
     getXAxis().setAxisMin(toDate("1/1/2008").getTime()); 
     getXAxis().setAxisMax(toDate("1/27/2008").getTime()); 
     getXAxis().setTickLabelFormat("=(Date)MMM dd");
     getYAxis().setAxisMin(toDate("12/1/2007").getTime()); 
     getYAxis().setAxisMax(toDate("12/27/2007").getTime()); 
     getYAxis().setTickLabelFormat("=(Date)");
     getY2Axis().setAxisMin(0); 
     getY2Axis().setAxisMax(25.*60.*60.*1000.); 
     // default Date format is DateTimeFormat.getShortDateTimeFormat()
     getY2Axis().setTickLabelFormat("=(Date)MMM-dd-yyyy HH");
     // test y axis hovertext
     addCurve();
     getCurve().getSymbol().setBorderWidth(0);
     getCurve().getSymbol().setWidth(20);
     getCurve().getSymbol().setHeight(20);
     getCurve().getSymbol().setBackgroundColor("red");

     getCurve().addPoint(toDate("1/10/2008").getTime(),
                         toDate("12/10/2007").getTime());

     // test y2-axis hovertext
     addCurve();
     getCurve().getSymbol().setBorderWidth(0);
     getCurve().getSymbol().setBackgroundColor("blue");
     getCurve().getSymbol().setWidth(20);
     getCurve().getSymbol().setHeight(20);
     getCurve().setYAxis(Y2_AXIS);
     getCurve().addPoint(toDate("1/20/2008").getTime(),
                         24*60.*60.*1000.);
     
     setLegendVisible(false);
   }
}
