package com.googlecode.gchart.gcharttestapp.client;
import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.HoverParameterInterpreter;
/**
 *
 * Exercises all possible default hover locations
 * 
 */
public class TestGChart31 extends GChart {

   SymbolType[] symType = {
      SymbolType.PIE_SLICE_HATCHED_SHADING,
      SymbolType.VBAR_BASELINE_CENTER,
      SymbolType.VBAR_SOUTH,
      SymbolType.VBAR_NORTH,
      SymbolType.HBAR_BASELINE_CENTER,
      SymbolType.HBAR_WEST,
      SymbolType.HBAR_EAST,
      SymbolType.BOX_CENTER,
   };

   // where we expect the hover messages to show up.
   String[] defaultLocations = {
      "OUTSIDE_PIE_ARC",
      "FARTHEST_FROM_HORIZONTAL_BASELINE",
      "NORTH",
      "SOUTH",
      "FARTHEST_FROM_VERTICAL_BASELINE",
      "EAST",
      "WEST",
      "NORTHWEST"
   };
      
   class RowColInterpreter implements HoverParameterInterpreter {
      public String getHoverParameter(String paramName, Curve.Point p) {
         String result = null;
         if ("defaultLocation".equals(paramName))
            result = defaultLocations[
               p.getParent().getParent().getCurveIndex(p.getParent())];
         return result;
      }
   }
  TestGChart31() {
     setChartSize(500, 500);
     setHoverParameterInterpreter(new RowColInterpreter());
     setInitialPieSliceOrientation(0.125);
     
     for (int i = 0; i < symType.length; i++) {
        addCurve();
        getCurve().getSymbol().setPieSliceSize(0.99);
        getCurve().getSymbol().setSymbolType(symType[i]);
        getCurve().addPoint(i,i);
        getCurve().getSymbol().setBackgroundColor("red");
        getCurve().getSymbol().setModelWidth(1);
        getCurve().getSymbol().setModelHeight(1);
        getCurve().getSymbol().setHovertextTemplate(
           GChart.formatAsHovertext("Check that my location is: ${defaultLocation}"));
     }
     getXAxis().setHasGridlines(true);
     getYAxis().setHasGridlines(true);
     setChartFootnotes(
"Check: Hovering over each symbol produces a hover message<br>" +
"at the location indicated within the hover message.");
  }
}
