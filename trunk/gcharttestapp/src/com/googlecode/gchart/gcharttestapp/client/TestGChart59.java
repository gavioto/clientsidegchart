package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.gchart.client.GChart;
/**
 * Used to test setLegendLocation
 */
public class TestGChart59 extends GChart {
   private String legendName(LegendLocation ll) {
      String result = (ll == LegendLocation.OUTSIDE_LEFT ? "OUTSIDE_LEFT" :
                      (ll == LegendLocation.INSIDE_LEFT ? "INSIDE_LEFT" : 
                      (ll == LegendLocation.OUTSIDE_RIGHT ? "OUTSIDE_RIGHT" : 
                      (ll == LegendLocation.INSIDE_RIGHT ? "INSIDE_RIGHT" : 
                      (ll == LegendLocation.INSIDE_TOP ? "INSIDE_TOP":
                      (ll == LegendLocation.INSIDE_TOPLEFT ? "INSIDE_TOPLEFT":
                      (ll == LegendLocation.INSIDE_TOPRIGHT ?"INSIDE_TOPRIGHT" :
                      (ll == LegendLocation.INSIDE_BOTTOM ? "INSIDE_BOTTOM" :
                      (ll == LegendLocation.INSIDE_BOTTOMRIGHT ? "INSIDE_BOTTOMRIGHT" :
                      (ll == LegendLocation.INSIDE_BOTTOMLEFT ? "INSIDE_BOTTOMLEFT" : "Error"))))))))));
      return result;
   }
   TestGChart59(LegendLocation ll, int xShift, int yShift,
                Widget legend) {
     setChartFootnotes(
"Check: legendLocation=" + legendName(ll) +
" xShift="+xShift+" yShift="+yShift);
     setChartSize(150, 150);
     setLegendLocation(ll);
     setLegend(legend);
     setLegendXShift(xShift);
     setLegendYShift(yShift);
     setPlotAreaBorderColor("red");
     setPlotAreaBorderStyle("dashed");
     setPlotAreaBorderWidth(1);
     setLegendBackgroundColor("silver");
     for (int j = 1; j < 4; j++) {
       addCurve();
       for (int i = 0; i < 10; i++) { 
         getCurve().addPoint(i,j*i);
         getCurve().setLegendLabel(j + "*x");
       }
     }
     getXAxis().setAxisLabel("x");
     getYAxis().setAxisLabel("j*x");
  }
}
