package com.googlecode.gchart.gcharttestapp.client;

import java.util.Date;

import com.googlecode.gchart.client.GChart;

/** Simple time sequence example with date-time x-axis labels */
public class GChartExample12 extends GChart {

   static class DateStampedValue {
     Date date;
     double value;
     public DateStampedValue(String dateTimeString, double value) {
       this.date = new Date(dateTimeString);
       this.value = value;
     }
   }
// Data from Malcolm Gorman's GWT forum post:
// http://groups.google.com/group/Google-Web-Toolkit/msg/6125ce39fd2339ac
   DateStampedValue[] dateSequence = {
    new DateStampedValue("1/28/2008 03:00", 13.0),
    new DateStampedValue("1/28/2008 03:30", 12.9),
    new DateStampedValue("1/28/2008 03:51", 12.9),
    new DateStampedValue("1/28/2008 04:11", 12.9),
    new DateStampedValue("1/28/2008 04:24", 13.0),
    new DateStampedValue("1/28/2008 04:46", 12.5),
    new DateStampedValue("1/28/2008 05:00", 12.2),
    new DateStampedValue("1/28/2008 05:30", 12.8),
    new DateStampedValue("1/28/2008 06:00", 11.6),
    new DateStampedValue("1/28/2008 06:30", 12.5),
    new DateStampedValue("1/28/2008 07:00", 11.4),
    new DateStampedValue("1/28/2008 07:30", 12.9),
    new DateStampedValue("1/28/2008 08:00", 12.9),
    new DateStampedValue("1/28/2008 08:30", 11.2),
    new DateStampedValue("1/28/2008 09:00", 11.7),
    new DateStampedValue("1/28/2008 09:30", 12.4),
    new DateStampedValue("1/28/2008 10:00", 14.4),
    new DateStampedValue("1/28/2008 10:12", 13.7),
    new DateStampedValue("1/28/2008 10:30", 11.9),
    new DateStampedValue("1/28/2008 11:00", 14.3),
    new DateStampedValue("1/28/2008 11:30", 14.0),
    new DateStampedValue("1/28/2008 12:00", 14.7),
    new DateStampedValue("1/28/2008 12:30", 15.4),
    new DateStampedValue("1/28/2008 13:00", 15.5),
   };
   
    GChartExample12() {
     super(400,200); 
     setChartTitle("<b><i><big>Temperature vs Time</big></i></b>");
     setPadding("5px");
     
     getXAxis().setAxisLabel("<small><b><i>Time</i></b></small>");
     getXAxis().setHasGridlines(true);
     getXAxis().setTickCount(6);
     // Except for "=(Date)", a standard GWT DateTimeFormat string
     getXAxis().setTickLabelFormat("=(Date)dd/h:mm a");
          
     getYAxis().setAxisLabel("<small><b><i>&deg;C</i></b></small>");
     getYAxis().setHasGridlines(true);
     getYAxis().setTickCount(11);
     getYAxis().setAxisMin(11);
     getYAxis().setAxisMax(16);
     
     addCurve();
     getCurve().setLegendLabel("<i>T (&deg;C)</i>");
     getCurve().getSymbol().setBorderColor("blue");
     getCurve().getSymbol().setBackgroundColor("blue");
     getCurve().getSymbol().setFillSpacing(10);
     getCurve().getSymbol().setFillThickness(3);

     for (int i = 0; i < dateSequence.length; i++)
       // Note that getTime() returns milliseconds since
       // 1/1/70--required whenever "date cast" tick label
       // formats (those beginning with "=(Date)") are used.
       getCurve().addPoint(dateSequence[i].date.getTime(),
                           dateSequence[i].value);
   }
}
