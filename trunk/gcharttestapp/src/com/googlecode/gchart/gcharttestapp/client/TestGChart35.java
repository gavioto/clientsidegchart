package com.googlecode.gchart.gcharttestapp.client;
import com.googlecode.gchart.client.GChart;
/**
 *
 * Tests the disabling of hover annotation feedback,
 * hover selection feedback, and both.
 * 
 */
public class TestGChart35 extends GChart {

   TestGChart35() {
     String[] color = {"red", "green", "blue"}; 
     setChartSize(200, 200);
     setInitialPieSliceOrientation(0.125);
     
     for (int i=0; i < 3; i++) {
        addCurve();
        getCurve().getSymbol().setHovertextTemplate(
           GChart.formatAsHovertext("Curve "+i+": (${x}, ${y})"));
        getCurve().getSymbol().setHoverSelectionBackgroundColor("aqua");
        getCurve().getSymbol().setHoverSelectionBorderColor("yellow");
        getCurve().getSymbol().setHoverSelectionBorderWidth(-5);
        getCurve().getSymbol().setBackgroundColor(color[i]);
        getCurve().getSymbol().setBorderColor("black");
        getCurve().getSymbol().setWidth(20);
        getCurve().getSymbol().setHeight(20);
        for (int j = 0; j < 10; j++)
           getCurve().addPoint(j, i*j);
     }
     getCurve(0).getSymbol().setHoverAnnotationEnabled(false);
     getCurve(1).getSymbol().setHoverSelectionEnabled(false);
     getCurve(2).getSymbol().setHoverAnnotationEnabled(false);
     getCurve(2).getSymbol().setHoverSelectionEnabled(false);
     getXAxis().setHasGridlines(true);
     getYAxis().setHasGridlines(true);
     setChartFootnotes(
"(Color, Selection,Annotation): (Red, Yes, No); (Green, No, Yes); (Blue, No, No)");
  }
}
