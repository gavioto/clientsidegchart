package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

// Test bold, italic, color, size, font-family options for text on axes & legend
public class TestGChart18 extends GChart {
   TestGChart18() {
     super(300,300);
     setClipToPlotArea(true); 
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes(
"Check: red, bold, 20px sans-serif font on x axis<br>" +
"black, italic, 40px serif font on y axis <br>" +
"blue, bold-italic, 30px monospace font on y2 axis<br>" +
"silver gridlines, ticks, and axes<br>" +                       
"key: aqua, bold-italic, 40 px serif font, gray background, 10px wide red border<br>" +
"2px red border around yellow plot area<br>" +
"10px red border around green overall chart background. Monospaced footnotes. <br>" +
"Serif point annotation.");
 
     setFontFamily("monospace");
     setLegendFontWeight("bold");
     setLegendFontStyle("italic");
     setLegendFontFamily("serif");
     setLegendFontColor("aqua");
     setLegendFontSize(40);
     setLegendBackgroundColor("gray");
     setLegendBorderColor("red"); 
     setLegendBorderWidth(10);
     setGridColor("silver");
     
     setBackgroundColor("green");
     setBorderColor("red");
     setBorderWidth("10px");
     setBorderColor("red");
     setBorderStyle("solid");
     
     setPlotAreaBackgroundColor("yellow");
     setPlotAreaBorderColor("red");
     setPlotAreaBorderWidth(2);

     getXAxis().setTickCount(11);
     getXAxis().setAxisMin(0); 
     getXAxis().setAxisMax(10);
     getXAxis().setTickLabelFontWeight("bold");
     getXAxis().setTickLabelFontColor("red");
     getXAxis().setTickLabelFontStyle("normal");
     getXAxis().setTickLabelFontFamily("sans-serif");
     getXAxis().setTickLabelFontSize(20);
     getXAxis().setHasGridlines(true);
     getYAxis().setTickCount(11);
     getYAxis().setAxisMin(0); 
     getYAxis().setAxisMax(10);
     getYAxis().setTickLabelFontWeight("normal");
     getYAxis().setTickLabelFontColor("black");
     getYAxis().setTickLabelFontFamily("serif");
     getYAxis().setTickLabelFontStyle("italic");
     getYAxis().setTickLabelFontSize(40);
     getYAxis().setHasGridlines(true);
     
     getY2Axis().setTickCount(11);
     getY2Axis().setAxisMin(0); 
     getY2Axis().setAxisMax(1);
     getY2Axis().setTickLabelFontWeight("bold");
     getY2Axis().setTickLabelFontColor("blue");
     getY2Axis().setTickLabelFontStyle("italic");
     getY2Axis().setTickLabelFontFamily("monospace");
     getY2Axis().setTickLabelFontSize(30);
     getYAxis().setHasGridlines(true);

     
     addCurve();
     getCurve().setYAxis(Y_AXIS);
     getCurve().setLegendLabel("On Y");
     for (int i=0; i < 11; i++)
       getCurve().addPoint(i,i);
     getCurve().getPoint(5).setAnnotationText("Test annotation");
     getCurve().getPoint(5).setAnnotationFontFamily("serif");
     addCurve();
     getCurve().setYAxis(Y2_AXIS);
     getCurve().setLegendLabel("On Y2");
     for (int i=0; i < 11; i++)
       getCurve().addPoint(i/2.,i/2.);

   }
}
