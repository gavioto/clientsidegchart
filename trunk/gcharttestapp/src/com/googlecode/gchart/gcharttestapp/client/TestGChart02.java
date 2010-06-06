package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

/** Simple chart that uses every possible symbol type.*/
public class TestGChart02 extends GChart {
   TestGChart02() {
     super(400,400); // bit bigger so 29 curve legend fits
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes("Check: Rendering consistent with SymbolType on legend.");
     GChart.SymbolType[] symbolTypes = {
       GChart.SymbolType.BOX_CENTER,
       GChart.SymbolType.BOX_EAST,
       GChart.SymbolType.BOX_NORTH,
       GChart.SymbolType.BOX_NORTHEAST,
       GChart.SymbolType.BOX_NORTHWEST,
       GChart.SymbolType.BOX_SOUTH,
       GChart.SymbolType.BOX_SOUTHEAST,
       GChart.SymbolType.BOX_SOUTHWEST,
       GChart.SymbolType.BOX_WEST,
       GChart.SymbolType.HBAR_EAST,
       GChart.SymbolType.HBAR_NORTHEAST,
       GChart.SymbolType.HBAR_NORTHWEST,
       GChart.SymbolType.HBAR_SOUTHEAST,
       GChart.SymbolType.BOX_SOUTHWEST,
       GChart.SymbolType.HBAR_WEST,
       GChart.SymbolType.HBAR_NEXT,
       GChart.SymbolType.HBAR_PREV,
       GChart.SymbolType.NONE,
       GChart.SymbolType.VBAR_NORTH,
       GChart.SymbolType.VBAR_NORTHEAST,
       GChart.SymbolType.VBAR_NORTHWEST,
       GChart.SymbolType.VBAR_SOUTH,
       GChart.SymbolType.VBAR_SOUTHEAST,
       GChart.SymbolType.VBAR_SOUTHWEST,
       GChart.SymbolType.VBAR_NEXT,
       GChart.SymbolType.VBAR_PREV,
       GChart.SymbolType.XGRIDLINE,
       GChart.SymbolType.Y2GRIDLINE,
       GChart.SymbolType.YGRIDLINE       
     };
     String[] symbolNames = {
       "BOX_CENTER",
       "BOX_EAST",
       "BOX_NORTH",
       "BOX_NORTHEAST",
       "BOX_NORTHWEST",
       "BOX_SOUTH",
       "BOX_SOUTHEAST",
       "BOX_SOUTHWEST",
       "BOX_WEST",
       "HBAR_EAST",
       "HBAR_NORTHEAST",
       "HBAR_NORTHWEST",
       "HBAR_SOUTHEAST",
       "BOX_SOUTHWEST",
       "HBAR_WEST",
       "HBAR_NEXT",
       "HBAR_PREV",
       "NONE",
       "VBAR_NORTH",
       "VBAR_NORTHEAST",
       "VBAR_NORTHWEST",
       "VBAR_SOUTH",
       "VBAR_SOUTHEAST",
       "VBAR_SOUTHWEST",
       "VBAR_NEXT",
       "VBAR_PREV",
       "XGRIDLINE",
       "Y2GRIDLINE",
       "YGRIDLINE"       
     };
     for (int i=0; i < symbolTypes.length; i++) {
       addCurve();
       getCurve(i).addPoint(i, i);
       getCurve(i).getSymbol().setSymbolType(symbolTypes[i]);
       getCurve(i).getSymbol().setHeight(7);
       getCurve(i).getSymbol().setWidth(7);
       getCurve(i).setLegendLabel(i + " " + symbolNames[i]);
     }
     setLegendFontSize(8);     
     getXAxis().setTickLabelFontSize(8);
     getXAxis().setHasGridlines(true);
     getXAxis().setTickCount(symbolTypes.length);
     getYAxis().setTickLabelFontSize(8);
     getYAxis().setHasGridlines(true);
     getYAxis().setTickCount(symbolTypes.length);
     
   }
}
