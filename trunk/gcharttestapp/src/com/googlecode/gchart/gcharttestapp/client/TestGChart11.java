package com.googlecode.gchart.gcharttestapp.client;


import com.googlecode.gchart.client.GChart;

/** Simplest possible pie chart: one slice takes up entire pie*/
public class TestGChart11 extends GChart {
   TestGChart11() {
	 int fillSpacing = 2;
	 int fillThickness = 1;
     int borderWidth = 0;
   
     this.setChartSize(300, 300);
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes(
"Check: pie slices: 1/8 (green/vert), 3/4 (red/horiz), 1/8 (blue/hatch<br>" +
"starting at 6 o'clock and going clockwise"                       
                      );
     getXAxis().setHasGridlines(true);
     getXAxis().setAxisMax(1);
     getXAxis().setAxisMin(-1);
     getXAxis().setTickCount(2);
     getYAxis().setHasGridlines(true);
     getYAxis().setAxisMin(-1);
     getYAxis().setAxisMax(1);
     getYAxis().setTickCount(2);
     addCurve();
     getCurve().addPoint(0,0);
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_VERTICAL_SHADING);
     getCurve().getSymbol().setBackgroundColor("green");
     getCurve().getSymbol().setFillThickness(fillThickness);
     getCurve().getSymbol().setFillSpacing(fillSpacing);
     getCurve().getSymbol().setBorderWidth(borderWidth);     
     getCurve().getSymbol().setModelWidth(2);
     getCurve().getSymbol().setModelHeight(0);
     getCurve().getSymbol().setPieSliceSize(1./8.);
     addCurve();
     getCurve().addPoint(0,0);
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_HORIZONTAL_SHADING);
     getCurve().getSymbol().setBackgroundColor("red");
     getCurve().getSymbol().setFillThickness(fillThickness);
     getCurve().getSymbol().setFillSpacing(fillSpacing);
     getCurve().getSymbol().setModelWidth(2);
     getCurve().getSymbol().setBorderWidth(borderWidth);     
     getCurve().getSymbol().setModelHeight(0);
     getCurve().getSymbol().setPieSliceSize(6./8.);
     addCurve();
     getCurve().addPoint(0,0); 
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_HATCHED_SHADING);
     getCurve().getSymbol().setBackgroundColor("blue");
     getCurve().getSymbol().setFillThickness(fillThickness);
     getCurve().getSymbol().setFillSpacing(fillSpacing);
     getCurve().getSymbol().setModelWidth(2);
     getCurve().getSymbol().setBorderWidth(borderWidth);     
     getCurve().getSymbol().setModelHeight(0);
     getCurve().getSymbol().setPieSliceSize(1./8.);

   }
}
