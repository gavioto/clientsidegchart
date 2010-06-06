package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

/** Generates regular polygons as area charts to test that area
 * charts work as expected if the curves "loop back"
 * rather than being of the typical "monotonic x or y" variety.*/
public class TestGChart49 extends GChart {
   TestGChart49(double nSides, boolean clipToPlotArea,
                boolean clipToDecoratedChart) {
     setChartSize(100,100); 
     
     getXAxis().setHasGridlines(true);
     getXAxis().setTickCount(11);
     getXAxis().setAxisMin(-5);
     getXAxis().setAxisMax(5);
     
     getYAxis().setHasGridlines(true);
     getYAxis().setTickCount(11);
     getYAxis().setAxisMin(-5);
     getYAxis().setAxisMax(5);

     setClipToPlotArea(clipToPlotArea);
     setClipToDecoratedChart(clipToDecoratedChart);
     setChartFootnotes("Check: Chart shows <br>a " +
                       nSides +
"-sided regular polygon<br>w red border and " + 
"<br>transparent blue background<br>" + 
"clipToPlotArea=" + clipToPlotArea + "<br>" +
"clipToDecoratedChart=" + clipToDecoratedChart);
     setChartFootnotesLeftJustified(true);
     
     addCurve();
     getCurve().getSymbol().setSymbolType(SymbolType.HBAR_BASELINE_CENTER);
     getCurve().getSymbol().setFillSpacing(0);
     getCurve().getSymbol().setFillThickness(1);
     getCurve().getSymbol().setHeight(0);
     getCurve().getSymbol().setWidth(0);
     getCurve().getSymbol().setBaseline(0);
     getCurve().getSymbol().setBackgroundColor("rgba(0,0,255,0.3)");
     for (int j = 0; j <= nSides; j++) {
        getCurve().addPoint(10*Math.sin(2*Math.PI*j/nSides),
                            10*Math.cos(2*Math.PI*j/nSides));
     }
   }
}
