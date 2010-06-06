package com.googlecode.gchart.gcharttestapp.client;
import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.HoverParameterInterpreter;
/**
 * Example of a single curve whose points are exactly the same,
 * to see that last point gets selected when you hover over it.
 * 
 */
public class TestGChart29 extends GChart {

   class PointIndexInterpreter implements HoverParameterInterpreter {
      public String getHoverParameter(String paramName, Curve.Point p) {
         String result = null;
         if ("pointIndex".equals(paramName))
            result = p.getParent().getPointIndex(p) + "";
         return result;
      }      
   }
  TestGChart29() {
     setChartSize(100, 100);
     setHoverParameterInterpreter(new PointIndexInterpreter());
     getXAxis().setAxisMin(0);  
     getXAxis().setAxisMax(9);
     getYAxis().setAxisMin(0);  
     getYAxis().setAxisMax(9);
     addCurve();
     for (int i = 0; i < 10; i++)  {
        getCurve().addPoint(4.5,4.5);  // all at the exact same point
     }
     getCurve().getSymbol().setSymbolType(SymbolType.BOX_CENTER);
     getCurve().getSymbol().setBackgroundColor("red");
     getCurve().getSymbol().setBorderColor("black");
     getCurve().getSymbol().setModelWidth(5);
     getCurve().getSymbol().setModelHeight(5);
     getCurve().getSymbol().setHovertextTemplate(
        GChart.formatAsHovertext("iPoint=${pointIndex}"));
     getXAxis().setHasGridlines(true);
     getYAxis().setHasGridlines(true);
     setChartFootnotes(
"Check: when you hover over the red square, you see 'iPoint=9'");
  }
}
