package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

// test that clipping of points to plot area works as expected
public class TestGChart05 extends GChart {
   TestGChart05(boolean testCanvas) {
     super(300,300); 
     setChartTitle(GChartTestApp.getTitle(this));
     setClipToPlotArea(true);
     setChartFootnotes("Check: an unclipped point at each corner.<br> No x-ticks.<br>Line clipped at plot area limits<br>Three clipped-off pies visible<br>Every at-least-partly visible symbol labeled.");
     
     getXAxis().setHasGridlines(true);
     getY2Axis().setHasGridlines(true);
     addCurve();
     if (testCanvas)
        getCurve().getSymbol().setFillSpacing(0);
     getCurve().setYAxis(Y_AXIS);
     getCurve().addPoint(0,-95); // clipped
     getCurve().getPoint().setAnnotationText(getCurve().getPoint().getHovertext());
     getCurve().addPoint(0,-90);
     getCurve().getPoint().setAnnotationText(getCurve().getPoint().getHovertext());
     getCurve().addPoint(0,0); 
     getCurve().getPoint().setAnnotationText(getCurve().getPoint().getHovertext());
     getCurve().addPoint(0,5);   // clipped
     getCurve().getPoint().setAnnotationText(getCurve().getPoint().getHovertext());
     
     getCurve().setLegendLabel("On Y");
     addCurve();
     if (testCanvas)
        getCurve().getSymbol().setFillSpacing(0);
     getCurve().setYAxis(Y2_AXIS);
     getCurve().addPoint(90,-50); // clipped
     getCurve().getPoint().setAnnotationText(getCurve().getPoint().getHovertext());
     getCurve().addPoint(90,-45);
     getCurve().getPoint().setAnnotationText(getCurve().getPoint().getHovertext());
     getCurve().addPoint(90,45);
     getCurve().getPoint().setAnnotationText(getCurve().getPoint().getHovertext());
     getCurve().addPoint(90,50);  // clipped
     getCurve().getPoint().setAnnotationText(getCurve().getPoint().getHovertext());
     getCurve().setLegendLabel("On Y2");

     // continuous line whose edges get clipped off
     addCurve();
     getCurve().setLegendLabel("clipped line");
     getCurve().getSymbol().setBackgroundColor("blue");
     getCurve().getSymbol().setBorderColor("blue");
     if (testCanvas)
        getCurve().getSymbol().setFillSpacing(0);
     else
       getCurve().getSymbol().setFillSpacing(10);
     getCurve().getSymbol().setFillThickness(3);
     getCurve().setYAxis(Y_AXIS);
//     getCurve().addPoint(50,-50); 
     getCurve().addPoint(0,-100); 
     getCurve().getPoint().setAnnotationText(getCurve().getPoint().getHovertext());
//     getCurve().addPoint(50,-50); 
     getCurve().addPoint(100,0);
     getCurve().getPoint().setAnnotationText(getCurve().getPoint().getHovertext());

     // this should be entirely visible
     addCurve();
     if (testCanvas)
        getCurve().getSymbol().setFillSpacing(0);
     getCurve().setLegendLabel("inside pie");
     getCurve().getSymbol().setSymbolType(
           SymbolType.PIE_SLICE_HORIZONTAL_SHADING);
     getCurve().getSymbol().setFillThickness(1);
     getCurve().getSymbol().setWidth(100);
     getCurve().getSymbol().setHeight(0);
     getCurve().setYAxis(Y_AXIS);
     getCurve().addPoint(45,0); 
     getCurve().getPoint().setAnnotationText(getCurve().getPoint().getHovertext());

     // this should be entirely clipped.
     addCurve();
     if (testCanvas)
        getCurve().getSymbol().setFillSpacing(0);
     getCurve().setLegendLabel("outside right pie");
     getCurve().getSymbol().setSymbolType(
           SymbolType.PIE_SLICE_HATCHED_SHADING);
     getCurve().getSymbol().setFillThickness(1);
     getCurve().getSymbol().setWidth(100);
     getCurve().getSymbol().setHeight(0);
     getCurve().setYAxis(Y2_AXIS);
     getCurve().addPoint(95,0);
     getCurve().getPoint().setAnnotationText(getCurve().getPoint().getHovertext());
     // this should be entirely clipped
     addCurve();
     if (testCanvas)
        getCurve().getSymbol().setFillSpacing(0);
     getCurve().setLegendLabel("outside bottom pie");
     getCurve().getSymbol().setSymbolType(
           SymbolType.PIE_SLICE_VERTICAL_SHADING);
     getCurve().getSymbol().setFillThickness(1);
     getCurve().getSymbol().setWidth(100);
     getCurve().getSymbol().setHeight(0);
     getCurve().setYAxis(Y_AXIS);
     getCurve().addPoint(45,-95); 
     getCurve().getPoint().setAnnotationText(getCurve().getPoint().getHovertext());
     
     getXAxis().setAxisLabel("<small><small><small>X</small></small></small>");
     getXAxis().setTickCount(0);
     getXAxis().setAxisMin(0.); 
     getXAxis().setAxisMax(90.); 
     getYAxis().setAxisMin(-90.); 
     getYAxis().setAxisMax(0.); 
     getY2Axis().setAxisMin(-45.); 
     getY2Axis().setAxisMax(45); 
     
   }
}
