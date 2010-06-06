package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

/*
 * This chart checks that the special TRANSPARENT_BORDER_COLOR GChart
 * keyword defeats the "transparent borders are black in IE6" bug in the
 * various API methods where it is accepted in lieu of a CSS color
 * specification string.
 * 
 */
public class TestGChart20a extends GChart {
    
   TestGChart20a() {
     super(300,300);
     setChartTitle(GChartTestApp.getTitle(this));
     getXAxis().setTickCount(0);
     getXAxis().setAxisVisible(false);
     getYAxis().setTickCount(0);
     getYAxis().setAxisVisible(false);
     
     setChartFootnotes(
"Check: Esp. in IE6...<br>" + 
"When you hover over these points, you don't see black borders <br>" +
"or black fill appear and legend key is properly centered and does<br>" +
"NOT have a 100px black border, and the green point has an expanded<br>"+
"hover-over area without a black border and red and blue points do <br>" +"not have hover selection feedback, and the legend has no border.");
     addCurve();
     getCurve().setLegendLabel("Red");
     getCurve().addPoint(0,0);
     getCurve().getSymbol().setBorderColor("red");
     getCurve().getSymbol().setHoverSelectionBorderColor(GChart.TRANSPARENT_BORDER_COLOR);
     // transparent external border
     getCurve().getSymbol().setHoverSelectionBorderWidth(-10);
     getCurve().getSymbol().setWidth(20);
     getCurve().getSymbol().setHeight(20);


     addCurve();
     getCurve().setLegendLabel("Green");
     getCurve().addPoint(1,1);
     getCurve().getSymbol().setBackgroundColor("green");
     getCurve().getSymbol().setBorderColor(GChart.TRANSPARENT_BORDER_COLOR);
     // transparent internal border should expand hit test region
     getCurve().getSymbol().setBorderWidth(20);
     getCurve().getSymbol().setWidth(100);
     getCurve().getSymbol().setHeight(100);


     addCurve();
     getCurve().setLegendLabel("Blue");
     getCurve().addPoint(2,2);
     getCurve().getSymbol().setBorderColor("blue");
     getCurve().getSymbol().setHoverSelectionBorderColor(GChart.TRANSPARENT_BORDER_COLOR);
     // transparent internal border
     getCurve().getSymbol().setHoverSelectionBorderWidth(10);
     getCurve().getSymbol().setWidth(20);
     getCurve().getSymbol().setHeight(20);

     setLegendBorderWidth(100);
     setLegendBorderColor(GChart.TRANSPARENT_BORDER_COLOR);
   }  
}
