package com.googlecode.gchart.gcharttestapp.client;
import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.HoverParameterInterpreter;
/**
 * Uses a <tt>HoverParameterInterpreter</tt> to define a
 * family of custom parameter names that can be used to
 * select the x and y properties of points a specified
 * number of points before or after the hovered over point.
 * <p>
 *
 * The interpreter supports a family of parameter names that
 * allow x or y to be prefixed by an arbitrary number of
 * Backwards (B) or Forwards (F) operators, each of which
 * shifts the referenced point backwards or forwards from
 * the index of the hovered over point. For example:
 * 
 * <pre>
 *   ${Bx}   - x value of point before hovered over point 
 *   ${By}   - y value of point before hovered over point 
 *   ${Fx}   - x value of point after hovered over point 
 *   ${Fy}   - y value of point after hovered over point 
 *   ${BBx}  - x value 2 points before hovered over point 
 *   ${FFFy} - y value 3 points after hovered over point
 *   etc.
 * </pre>
 * <p>
 *
 * Once support for these custom parameters has been added
 * to the GChart via passing an appropriate
 * <tt>HoverParameterInterpreter</tt> to
 * <tt>setHoverParameterInterpreter</tt>, these specially
 * named parameters are then embedded within an HTML table
 * to create a kind of "auto-scrolling" window into the
 * chart's data.  Specifically, the "hover table" displays
 * the x,y properties of 7 adjacent chart points, such that
 * the table's center row (which is shown in bold) always
 * contains the hovered-over point's data.
 * <p>
 *
 * You could also just code everything directly into a
 * <tt>HoverUpdateable</tt> Widget's <tt>hoverUpdate</tt>
 * method (perhaps by extending a GWT <tt>Grid</tt> for that
 * purpose). The advantage of this approach, though, is
 * that, once your interpreter has been defined, you (or
 * other team members that may prefer to work in HTML) can
 * quickly generate a large variety of hover annotations
 * simply by changing the HTML template.  <p>
 *
 * Note that, because it's just an HTML table, you can
 * select this entire data table with your mouse, and quickly
 * copy and paste it into another application.
 * 
 */
public class GChartExample17a extends GChart {

 // Implements support for Backwards (B) and Forwards (F)
 // operators applicable to the built-in x and y parameters.
 static class BackwardAndForwardHoverParameterInterpreter
       implements HoverParameterInterpreter {

   // returns string representing parameter at given index
   private String getIndexedParam(Curve c, int iPoint, String pName) {
      final String EMPTY_CELL = "&nbsp;"; 
      String result;
      if (iPoint < 0 || iPoint >= c.getNPoints()) // out of bounds
         result = EMPTY_CELL;                     // (nothing there) 
      else if (pName.equals("x")) 
         result = c.getParent().getXAxis().formatAsTickLabel(
            c.getPoint(iPoint).getX());
      else if (pName.equals("y"))
         result = c.getParent().getYAxis().formatAsTickLabel(
            c.getPoint(iPoint).getY());
      else
         throw new IllegalArgumentException("Bad name: " + pName);
      
      return result;
   }
   
   public String getHoverParameter(String paramName,
                            GChart.Curve.Point hoveredOver) {
      String result = null;
      Curve c = hoveredOver.getParent();
      int iPoint = c.getPointIndex(hoveredOver);
      // number of Bs or Fs in string (assuming it matches):
      int shift = paramName.length() - 1;
      if (paramName.matches("B*x")) { // 0 or more Bs, then an x
        result = getIndexedParam(c, iPoint - shift, "x");
      }
      else if (paramName.matches("F*x")) { // 0 or more Fs, then an x
        result = getIndexedParam(c, iPoint + shift, "x");
      }
      else if (paramName.matches("B*y")) { // 0 or more Bs, then a y
        result = getIndexedParam(c, iPoint - shift, "y");
      }
      else if (paramName.matches("F*y")) { // 0 or more Fs, then a y
        result = getIndexedParam(c, iPoint + shift, "y");
      }
      // else name does not have one of the recognized patterns
      return result;
    }

  }

  GChartExample17a() {
     setChartSize(200, 200);
     setBorderWidth("0px");
     setHoverParameterInterpreter(
        new BackwardAndForwardHoverParameterInterpreter());
     // a 7 point, hover-centered, window into the x,y data 
     String template = "<html>" +  // REQUIRED (else plaintext)
             "<table border style='background-color:silver'>" + 
              "<tr><th>x</th><th>y</th></tr>" +
              "<tr><td>${BBBx}</td><td>${BBBy}</td></tr>" +
              "<tr><td>${BBx}</td><td>${BBy}</td></tr>" +
              "<tr><td>${Bx}</td><td>${By}</td></tr>" +
              "<tr><th>${x}</th><th>${y}</th></tr>" +
              "<tr><td>${Fx}</td><td>${Fy}</td></tr>" +
              "<tr><td>${FFx}</td><td>${FFy}</td></tr>" +
              "<tr><td>${FFFx}</td><td>${FFFy}</td></tr>" +
            "</table>";
     for (int iCurve = 0; iCurve < 3; iCurve++) {
       addCurve();
       getCurve().getSymbol().setHovertextTemplate(template);
       getCurve().getSymbol().setHoverSelectionBorderColor(
          getCurve().getSymbol().getBorderColor());
       // 3px wide, external (that's the minus) border
       getCurve().getSymbol().setHoverSelectionBorderWidth(-3);
       getCurve().getSymbol().setHoverAnnotationSymbolType(
          SymbolType.ANCHOR_MOUSE_SNAP_TO_X);
       getCurve().getSymbol().setHoverLocation(
          AnnotationLocation.SOUTH);
       getCurve().getSymbol().setBrushHeight(400);
       getCurve().getSymbol().setBrushWidth(20);
       for (int iPoint = 0; iPoint < 10; iPoint++) 
          getCurve().addPoint(iPoint, (iCurve+1)*iPoint);
     }
     getXAxis().setHasGridlines(true);
     getYAxis().setHasGridlines(true);
  }
}
