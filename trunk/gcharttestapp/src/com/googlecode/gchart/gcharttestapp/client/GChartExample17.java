package com.googlecode.gchart.gcharttestapp.client;
import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.HoverParameterInterpreter;
/**
 * Illustrates how to use a <tt>HoverParameterInterpreter</tt> to define
 * your own custom parameter names that GChart will then expand when
 * included in a hover text template via <tt>setHovertextTemplate</tt>.
 * <p>
 *
 * This example adds a custom parameter called <tt>curveNumber</tt> that
 * expands into the index of the curve containing the hovered over
 * point.
 *
 * 
 */
public class GChartExample17 extends GChart {

 class CurveNumberHoverParameterInterpreter
       implements HoverParameterInterpreter {
 
   public String getHoverParameter(String paramName,
                            GChart.Curve.Point hoveredOver) {
                            
  // Returning null tells GChart "I don't know how to expand that
  // parameter name". The built-in parameters (${x}, ${y}, etc.) won't
  // be processed correctly unless you return null for this "no
  // matching parameter" case.
      String result = null; 
      if ("curveNumber".equals(paramName)) {
       // The parent of a point is the curve containing it, and the
       // parent of that curve is the GChart itself. So, from the
       // single hovered over point ref., we can get at any info
       // within the GChart we may need to generate our snippets.
           result = "" +
             hoveredOver.getParent().getParent().getCurveIndex(
               hoveredOver.getParent());
      }
      // add "else if" branches to support more parameter names

      return result;
    }

  }

  GChartExample17() {
     setChartSize(200, 200);
     setBorderWidth("0px");
     setHoverParameterInterpreter(
        new CurveNumberHoverParameterInterpreter());
     String template = GChart.formatAsHovertext(
                         "Curve #${curveNumber}:<br>x=${x}, y=${y}");
     for (int iCurve = 0; iCurve < 3; iCurve++) {
       addCurve();
       getCurve().getSymbol().setHovertextTemplate(template);
       for (int iPoint = 0; iPoint < 10; iPoint++) 
          getCurve().addPoint(iPoint, (iCurve+1)*iPoint);
     }
  }
}
