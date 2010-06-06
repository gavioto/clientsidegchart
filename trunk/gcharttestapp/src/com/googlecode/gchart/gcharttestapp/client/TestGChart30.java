package com.googlecode.gchart.gcharttestapp.client;
import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.HoverParameterInterpreter;
/**
 * Hit testing grid that tests basic hit testing and provides a
 * sanity check that our binned hit testing algorithm really does
 * speed things up compared to brute force sequential searching.
 * 
 */
public class TestGChart30 extends GChart {

   static final int N = 25;
   static final int M = 25;
   
   class RowColInterpreter implements HoverParameterInterpreter {
      public String getHoverParameter(String paramName, Curve.Point p) {
         String result = null;
         if ("rowCol".equals(paramName))
            result = p.getParent().getPointIndex(p)/M + ", " +
                     p.getParent().getPointIndex(p) % M;
         return result;
      }      
   }
  TestGChart30(boolean bigBrush, boolean isHorizontallyBinned) {
     setChartSize(500, 500);
     
     setHoverParameterInterpreter(new RowColInterpreter());
     getXAxis().setAxisMin(0);  
     getXAxis().setAxisMax(M-1);
     getXAxis().setTickCount(M);
     getYAxis().setAxisMin(0);  
     getYAxis().setAxisMax(N-1);
     getYAxis().setTickCount(N);     
     addCurve();
     if (bigBrush)
         getCurve().getSymbol().setBrushSize(2*getXChartSize(), 2*getYChartSize());
      else
    	 getCurve().getSymbol().setBrushSize(getXChartSize()/M, getYChartSize()/N);
     for (int i = 0; i < N; i++)  
        for (int j = 0; j < M; j++) 
           getCurve().addPoint(j,i);  
     
     getCurve().getSymbol().setSymbolType(isHorizontallyBinned?
        SymbolType.HBAR_WEST: SymbolType.BOX_CENTER);
     getCurve().getSymbol().setHoverSelectionBorderWidth(-5);
     getCurve().getSymbol().setBackgroundColor("red");
     getCurve().getSymbol().setBorderWidth(0);
     getCurve().getSymbol().setWidth(1);
     getCurve().getSymbol().setHeight(1);
     getCurve().getSymbol().setHovertextTemplate(
        GChart.formatAsHovertext("(row, col) = ${rowCol}"));
     getXAxis().setHasGridlines(true);
     getYAxis().setHasGridlines(true);
     setChartFootnotes(
"Hovering lights up closest point, with appropriate grid coordinates displayed<br>This is the " + ((bigBrush)?"SLOW":"FAST") +
 " " + ((isHorizontallyBinned)?"HORIZONTALLY":"VERTICALLY") +  " binned version.");
   }
}
