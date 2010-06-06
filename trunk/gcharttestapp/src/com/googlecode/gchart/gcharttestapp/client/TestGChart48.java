package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

/** Generates regular polygons as area charts to test that area
 * charts work as expected if the curves "loop back"
 * rather than being of the typical "monotonic x or y" variety.*/
public class TestGChart48 extends GChart {
   TestGChart48(double nSides) {
     setChartSize(100,100); 
     
     getXAxis().setHasGridlines(true);
     getXAxis().setTickCount(11);
     getXAxis().setAxisMin(-10);
     getXAxis().setAxisMax(10);
     
     getYAxis().setHasGridlines(true);
     getYAxis().setTickCount(11);
     getYAxis().setAxisMin(-10);
     getYAxis().setAxisMax(10);
     
     setChartFootnotes("Check: Chart shows a " +
                       nSides +
"-sided regular polygon<br>w 10px red border and transparent blue background.");
     
     addCurve();
     getCurve().getSymbol().setSymbolType(SymbolType.HBAR_BASELINE_CENTER);
     getCurve().getSymbol().setFillSpacing(0);
     getCurve().getSymbol().setFillThickness(10);
     getCurve().getSymbol().setHeight(0);
     getCurve().getSymbol().setWidth(0);
     getCurve().getSymbol().setBaseline(0);
     getCurve().getSymbol().setBorderWidth(10);
     getCurve().getSymbol().setBorderColor("red");
     getCurve().getSymbol().setBackgroundColor("rgba(0,0,255,0.3)");
     for (int j = 0; j <= nSides; j++) {
        getCurve().addPoint(10*Math.sin(2*Math.PI*j/nSides),
                            10*Math.cos(2*Math.PI*j/nSides));
     }
   }
}
