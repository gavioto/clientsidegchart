package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

/** Simple chart that tests the symbol types that depend on two or more points*/
public class TestGChart03 extends GChart {
   TestGChart03() {
     super(150,150); 
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes(
"Check: (0,0)--(1,0); (2,3)--(3,3); (4,4)--(4,5), (7,6)--(7,7)<br>" +
"2 horizontal lines 3px high w. black gridline showing through; <br>" + 
"2 vertical 1px wide lines that occlude gridline.");
     GChart.SymbolType[] symbolTypes = {
       GChart.SymbolType.HBAR_NEXT,
       GChart.SymbolType.HBAR_PREV,
       GChart.SymbolType.VBAR_NEXT,
       GChart.SymbolType.VBAR_PREV,
     };
     int[][] points = {{0,0}, {1,0},
                       {2,3}, {3, 3},
                       {4,4}, {4, 5},
                       {7, 6}, {7, 7}};
     int[] sizes = {3, 3, 1, 1};
     for (int i=0; i < symbolTypes.length; i++) {
       addCurve();
       getCurve(i).addPoint(points[2*i][0], points[2*i][1]);
       getCurve(i).addPoint(points[2*i+1][0], points[2*i+1][1]);
       getCurve(i).getSymbol().setSymbolType(symbolTypes[i]);
       getCurve(i).getSymbol().setWidth(sizes[i]);
       getCurve(i).getSymbol().setHeight(sizes[i]);
       getCurve(i).getSymbol().setFillThickness(sizes[i]);
       if (i > 1) getCurve(i).setYAxis(Y2_AXIS);
       getCurve(i).setLegendLabel("Curve " + i);
     }
     
     getXAxis().setHasGridlines(true);
     getXAxis().setTickCount(2*symbolTypes.length);
     getYAxis().setHasGridlines(true);
     getYAxis().setTickCount(2*symbolTypes.length);
     
   }
}
