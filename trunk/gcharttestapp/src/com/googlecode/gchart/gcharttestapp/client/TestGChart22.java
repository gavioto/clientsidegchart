package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

/* 
 * Tests use of NaN points to create a break in an otherwise
 * connected curve, and to hide an otherwise visible pie slice.
 *
 * Also tests that a zero-sized slice does...nothing.
 *
 * Also tests that a point repeated so close together that it
 * has no interpolated dots, and an exactly repeated point,
 * don't explode (via a div 0, say).
 *
 */
public class TestGChart22 extends GChart {

   TestGChart22(boolean testCanvas) {
     super(400,400);
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes("First two points, last two points, and middle group connected.<br>" +
                       "Pie with a quarter-slice (6-o'clock to 9 o'clock) missing");
     
     getXAxis().setHasGridlines(true);
     getYAxis().setHasGridlines(true);

     // zero-sized slice--should be ignored
     addCurve();
     if (testCanvas)
        getCurve().getSymbol().setFillSpacing(0);
     
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setPieSliceSize(0);
     getCurve().getSymbol().setModelWidth(3);
     getCurve().getSymbol().setModelHeight(0);
     getCurve().addPoint(5,5);
     
     addCurve();
     if (testCanvas)
        getCurve().getSymbol().setFillSpacing(0);
     getCurve().getSymbol().setFillThickness(3);
     for (int i=0; i < 10; i++) {
       getCurve().addPoint(i, i);
     }
     // try exactly, and almost exactly, repeated points
     getCurve().addPoint(9, 9);
     getCurve().addPoint(9.0, 9.0001);
     getCurve().addPoint(9.0001, 9.0001);
     getCurve().addPoint(9, 9);

     // undefined points
     getCurve().getPoint(2).setX(Double.NaN);
     getCurve().getPoint(7).setY(Double.NaN);
     
     // zero-sized slice--should be ignored
     addCurve();
     if (testCanvas)
        getCurve().getSymbol().setFillSpacing(0);
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setPieSliceSize(0);
     getCurve().getSymbol().setModelWidth(3);
     getCurve().getSymbol().setModelHeight(0);
     getCurve().addPoint(5,5);
     
     addCurve();
     if (testCanvas)
        getCurve().getSymbol().setFillSpacing(0);
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setPieSliceSize(0.25);
     getCurve().addPoint(Double.NaN,5);
     getCurve().getSymbol().setModelWidth(3);
     getCurve().getSymbol().setModelHeight(0);
     
     // zero-sized slice--should be ignored
     addCurve();
     if (testCanvas)
        getCurve().getSymbol().setFillSpacing(0);
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setPieSliceSize(0);
     getCurve().getSymbol().setModelWidth(3);
     getCurve().getSymbol().setModelHeight(0);
     getCurve().addPoint(5,5);

     addCurve();
     if (testCanvas)
        getCurve().getSymbol().setFillSpacing(0);
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setPieSliceSize(0.75);
     getCurve().getSymbol().setModelWidth(3);
     getCurve().getSymbol().setModelHeight(0);
     getCurve().addPoint(5,5);

     // zero-sized slice--should be ignored
     addCurve();
     if (testCanvas)
        getCurve().getSymbol().setFillSpacing(0);
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setPieSliceSize(0);
     getCurve().getSymbol().setModelWidth(3);
     getCurve().getSymbol().setModelHeight(0);
     getCurve().addPoint(5,5);

     // zero-sized slice--should be ignored
     addCurve();
     if (testCanvas)
        getCurve().getSymbol().setFillSpacing(0);
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setPieSliceSize(0);
     getCurve().getSymbol().setModelWidth(3);
     getCurve().getSymbol().setModelHeight(0);
     getCurve().addPoint(7.5,7.5);     

     
   }  
}
