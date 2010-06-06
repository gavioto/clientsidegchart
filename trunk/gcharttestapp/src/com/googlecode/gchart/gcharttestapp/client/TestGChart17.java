package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

// Tests bold, italic annotation options.
public class TestGChart17 extends GChart {
   TestGChart17() {
     super(300,300); 
     setChartTitle(GChartTestApp.getTitle(this));
     setLegendVisible(false);
     setChartFootnotes(
"Check: point labels at x=1, 2, 3, 4 are in <br>" +
"normal, bold, italic, and bold-italic fonts, <br>" +
"are in colors: default, red, blue, and green<br>" + 
"and are in font sizes: default, default, 20px, 20px");
     addCurve();
     getXAxis().setTickCount(6);
     getXAxis().setAxisMin(0); 
     getXAxis().setAxisMax(5);
     getYAxis().setTickCount(6);
     getYAxis().setAxisMin(0); 
     getYAxis().setAxisMax(5);
     getCurve().addPoint(1,1); 
     getCurve().getPoint().setAnnotationText("not bold");
     getCurve().addPoint(2,2); 
     getCurve().getPoint().setAnnotationText("bold");
     getCurve().getPoint().setAnnotationFontWeight("bold");
     getCurve().getPoint().setAnnotationFontStyle("normal");
     getCurve().getPoint().setAnnotationFontColor("red");
     getCurve().addPoint(3,3); 
     getCurve().getPoint().setAnnotationText("italic");
     getCurve().getPoint().setAnnotationFontWeight("normal");
     getCurve().getPoint().setAnnotationFontStyle("italic");
     getCurve().getPoint().setAnnotationFontColor("blue");
     getCurve().getPoint().setAnnotationFontSize(20);
     getCurve().addPoint(4,4); 
     getCurve().getPoint().setAnnotationText("bold-italic");
     getCurve().getPoint().setAnnotationFontWeight("bold");
     getCurve().getPoint().setAnnotationFontStyle("italic");
     getCurve().getPoint().setAnnotationFontColor("green");
     getCurve().getPoint().setAnnotationFontSize(20);
   }
}
