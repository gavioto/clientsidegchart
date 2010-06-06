package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

// test that turning off clipping of points works as expected
public class TestGChart06 extends GChart {
   TestGChart06(boolean testCanvas) {
     super(300,300); 
     setChartTitle(GChartTestApp.getTitle(this));
     if (testCanvas)
             setChartFootnotes("Check: a point at each corner plus 4 outside points<br>Line extends beyond chart area limits<br>1 top pie, one bottom pie, one pie on right. Canvas rendered.");
     else        
             setChartFootnotes("Check: a point at each corner plus 4 outside points<br>Line extends beyond chart area limits<br>1 horizontally shaded top pie, one vertically shadded bottom pie, one hatched pie on right. HTML rendered.");

     setClipToDecoratedChart(false);
     
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
     
     // continuous line whose edges extend beyond plot area
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
     getCurve().addPoint(0,-100); 
     getCurve().getPoint().setAnnotationText(getCurve().getPoint().getHovertext());
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

     // this should be entirely visible, too.
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
     
     // this should be entirely visible, too.
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

     getXAxis().setAxisMin(0.); 
     getXAxis().setAxisMax(90.); 
     getYAxis().setAxisMin(-90.); 
     getYAxis().setAxisMax(0.); 
     getY2Axis().setAxisMin(-45.); 
     getY2Axis().setAxisMax(45); 
     
   }
}
