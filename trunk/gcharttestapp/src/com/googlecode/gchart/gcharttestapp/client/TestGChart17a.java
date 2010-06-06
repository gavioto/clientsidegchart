package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

// Tests bold, italic annotation options.
public class TestGChart17a extends GChart {
   TestGChart17a() {
     super(300,300); 
     setChartTitle(GChartTestApp.getTitle(this));
     setLegendVisible(false);
     setChartFootnotes(
"Same as TestGChart17, except every other annotation is hidden");
     addCurve();
     getXAxis().setTickCount(6);
     getXAxis().setAxisMin(0); 
     getXAxis().setAxisMax(5);
     getYAxis().setTickCount(6);
     getYAxis().setAxisMin(0); 
     getYAxis().setAxisMax(5);
     getCurve().addPoint(1,1); 
     getCurve().getPoint().setAnnotationText("not bold");
     getCurve().getPoint().setAnnotationVisible(true);
     getCurve().addPoint(2,2); 
     getCurve().getPoint().setAnnotationText("bold");
     getCurve().getPoint().setAnnotationFontWeight("bold");
     getCurve().getPoint().setAnnotationFontStyle("normal");
     getCurve().getPoint().setAnnotationFontColor("red");
     getCurve().getPoint().setAnnotationVisible(false);
     getCurve().addPoint(3,3); 
     getCurve().getPoint().setAnnotationText("italic");
     getCurve().getPoint().setAnnotationFontWeight("normal");
     getCurve().getPoint().setAnnotationFontStyle("italic");
     getCurve().getPoint().setAnnotationFontColor("blue");
     getCurve().getPoint().setAnnotationFontSize(20);
     getCurve().getPoint().setAnnotationVisible(true);
     getCurve().addPoint(4,4); 
     getCurve().getPoint().setAnnotationText("bold-italic");
     getCurve().getPoint().setAnnotationFontWeight("bold");
     getCurve().getPoint().setAnnotationFontStyle("italic");
     getCurve().getPoint().setAnnotationFontColor("green");
     getCurve().getPoint().setAnnotationFontSize(20);
     getCurve().getPoint().setAnnotationVisible(false);
   }
}
