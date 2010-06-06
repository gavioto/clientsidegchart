package com.googlecode.gchart.gcharttestapp.client;
import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.HoverParameterInterpreter;
/**
 *
 * Exercise main "flavors" of valid and invalid paramter names
 * associated with a HoverParameterInterpreter.
 * 
 */
public class TestGChart34 extends GChart {
   // bunch of valid and invalid hover parameter names
   String[] paramNames = {
     "a",               // these are various flavors of valid names  
     "a1",
     "a_1",
     "a_1_b_2",
     "XyZ___4",
     "x",               // these override defaults. Test that this works
     "y",
     "pieSliceSize",  
     "_2",              // These are invalid parameter names
     "2a",               
     " b",               
   };
      
   class TestParameterInterpreter implements HoverParameterInterpreter {
      public String getHoverParameter(String paramName, Curve.Point p) {
         String result = null;
         for (int i = 0; i < paramNames.length; i++)
           if (paramNames[i].equals(paramName))
             result = paramNames[i] + " at point #" + p.getParent().getPointIndex(p);
         return result;
      }
   }
  TestGChart34() {
     setChartSize(200, 200);
     setHoverParameterInterpreter(new TestParameterInterpreter());
     setInitialPieSliceOrientation(0.125);

     String hoverTemplate = "";
     for (int i = 0; i < paramNames.length; i++)
       hoverTemplate += paramNames[i] + "=${" + paramNames[i] + "}<br>";
          
     addCurve();
     getCurve().addPoint(0,0);
     getCurve().addPoint(4.5,4.5);
     getCurve().addPoint(9,9);
     getCurve().getSymbol().setBorderColor("black");
     getCurve().getSymbol().setBackgroundColor("red");
     getCurve().getSymbol().setWidth(20);
     getCurve().getSymbol().setHeight(20);
     getCurve().getSymbol().setHoverLocation(
          AnnotationLocation.SOUTHEAST);
     getCurve().getSymbol().setHovertextTemplate(
           GChart.formatAsHovertext(hoverTemplate));
     getXAxis().setHasGridlines(true);
     getYAxis().setHasGridlines(true);
     setChartFootnotes(
"Check: Hover message shows 'paramName=value' list <br>consistent with GChart's rules.");
  }
}
