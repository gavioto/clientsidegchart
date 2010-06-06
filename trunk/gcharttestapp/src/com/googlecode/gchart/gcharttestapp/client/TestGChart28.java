package com.googlecode.gchart.gcharttestapp.client;
import com.googlecode.gchart.client.GChart;
/**
 * A chart with symbols that extend off left/right (or top/bottom) edges
 * of decorated chart, and that overlap each other, in order to test
 * that hit testing works as expected under such conditions.
 * 
 */
public class TestGChart28 extends GChart {
   TestGChart28(boolean horizontalLayout, double width,
                boolean usePies) {
     setChartSize(100, 100);
     
// adjust axis range so that most points are "off plot area"
     if (horizontalLayout) {
       getYAxis().setAxisMin(4);  
       getYAxis().setAxisMax(6);
     }
     else {
       getXAxis().setAxisMin(4);  
       getXAxis().setAxisMax(6);
     }
     getXAxis().setTickCount(3);
     getYAxis().setTickCount(3);
//     setShowOffChartPoints(true);
     setBorderWidth("200px");      // make room for off-chart stuff
     setBorderColor("aqua");
     setBorderStyle("solid");
     addCurve();
//     getCurve().getSymbol().setBrushHeight(2);
     for (int i = 0; i < 10; i++) 
        getCurve().addPoint(horizontalLayout ? i*i : i,
                            horizontalLayout ? i : i*i);
     getCurve().getSymbol().setDistanceMetric(0, 0);
     getCurve().getSymbol().setSymbolType(usePies ?
        SymbolType.PIE_SLICE_OPTIMAL_SHADING :                                  
        (horizontalLayout ? SymbolType.HBAR_WEST : SymbolType.VBAR_SOUTH));
     getCurve().getSymbol().setBackgroundColor("red");
     getCurve().getSymbol().setBorderColor("red");
     getCurve().getSymbol().setModelHeight(width);
     getCurve().getSymbol().setModelWidth(width);
     getXAxis().setHasGridlines(true);
     getYAxis().setHasGridlines(true);
     setChartFootnotes(
"Check: you can hover over all symbols and they light up (symbols may <br>overlaps with the next) and provide hover feedback appropriately.");
  }
}
