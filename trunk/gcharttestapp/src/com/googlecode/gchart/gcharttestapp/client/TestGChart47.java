package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

/** Tests various bar charts with continuous filling option that
 * (when an external canvas library is bolted on) define area charts*/
public class TestGChart47 extends GChart {
   final int N_POINTS = 11;
   TestGChart47(int id, int startPoint, int groupSize) {
     setChartSize(400,400); 
     GChart.SymbolType[] symbolTypes = {
       GChart.SymbolType.HBAR_BASELINE_CENTER,
       GChart.SymbolType.HBAR_WEST,
       GChart.SymbolType.HBAR_EAST,
       GChart.SymbolType.VBAR_BASELINE_CENTER,
       GChart.SymbolType.VBAR_NORTH,
       GChart.SymbolType.VBAR_SOUTH,
       GChart.SymbolType.BOX_CENTER,
       GChart.SymbolType.LINE,
       GChart.SymbolType.XGRIDLINE,
       GChart.SymbolType.YGRIDLINE
     };

     String[] symbolTypeLabels = {
       "HBAR_BASELINE_CENTER",
       "HBAR_WEST",
       "HBAR_EAST",
       "VBAR_BASELINE_CENTER",
       "VBAR_NORTH",
       "VBAR_SOUTH",
       "BOX_CENTER",
       "LINE",
       "XGRIDLINE",
       "YGRIDLINE",
     };

     getXAxis().setHasGridlines(true);
     getXAxis().setTickCount(N_POINTS);
     getYAxis().setHasGridlines(true);
     getYAxis().setTickCount(groupSize-1);
     setChartFootnotes("Check: Area chart consistent with: " +
                       symbolTypeLabels[id] +
                       " startPoint=" + startPoint + " groupSize="
                      +groupSize);
     addCurve();
     getCurve().getSymbol().setBrushSize(100,100);
     getCurve().getSymbol().setSymbolType(symbolTypes[id]);
     getCurve().getSymbol().setFillSpacing(0);
     getCurve().getSymbol().setFillThickness(1);
     getCurve().getSymbol().setHeight(0);
     getCurve().getSymbol().setWidth(0);
     getCurve().getSymbol().setBackgroundColor("rgba(0,0,255,0.3)");
     for (int j = 0; j < N_POINTS; j++) {
        if (0 == ((j+startPoint) % groupSize))
           getCurve().addPoint(Double.NaN, Double.NaN);
        else
           getCurve().addPoint(j, (j + startPoint) %  groupSize);
     }
   }
}
