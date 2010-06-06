package com.googlecode.gchart.gcharttestapp.client;
import com.googlecode.gchart.client.GChart;
/** A simple three slice pie chart  */
public class GChartExample09 extends GChart {
   GChartExample09() {
     this.setChartSize(400, 200);
     setChartTitle("<h3>Three Slice Pie Chart</h3>");
     // Configure the plot region/axes appropriately:
     getXAxis().setAxisVisible(false);
     getXAxis().setAxisMin(-1);
     getXAxis().setAxisMax(1);
     getXAxis().setTickCount(0);
     getYAxis().setAxisVisible(false);
     getYAxis().setAxisMin(-1);
     getYAxis().setAxisMax(1);
     getYAxis().setTickCount(0);
     // add first slice
     addCurve();
     getCurve().addPoint(0,0); // centers pie in -1..1 x,y range 
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setModelWidth(1); 
     getCurve().getSymbol().setModelHeight(0);
     getCurve().getSymbol().setPieSliceSize(0.70);
     // add second slice
     addCurve();
     getCurve().addPoint(0,0); 
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setModelWidth(1);
     getCurve().getSymbol().setModelHeight(0);
     getCurve().getSymbol().setPieSliceSize(0.10);

    // add third slice
     addCurve();
     getCurve().addPoint(0,0);
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setModelWidth(1);
     getCurve().getSymbol().setModelHeight(0);
     getCurve().getSymbol().setPieSliceSize(0.20);
 
     
   }
   
}
