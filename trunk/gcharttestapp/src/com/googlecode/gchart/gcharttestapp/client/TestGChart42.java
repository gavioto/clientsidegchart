package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.CheckBox;
import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.HoverParameterInterpreter;
/**
 * 
 * Tests the getMouseCoordinate() method, both via
 * the typical hover/click, and via an external
 * timer that polls the current mouse location.
 *
 * Also tests the use of ANCHOR_MOUSE symbol type
 * with ordinary (non-system) curves (in 2.4, this
 * unusual usage scenario caused GChart to crash).
 * 
 */
public class TestGChart42 extends GChart {

    String hovertemplate =
        GChart.formatAsHovertext("xMouse=${xMouse}<br>" +
                                 "yMouse=${yMouse}<br>" +
                                 "y2Mouse=${y2Mouse}");
     final CheckBox sketchMode = new CheckBox("Sketch mode");
     final Timer sketchTimer = new Timer() {
        public void run() {
             getCurve().addPoint(
                getXAxis().getMouseCoordinate(),
                                  getY2Axis().getMouseCoordinate());
             update();
        }
     };

  // these curves, mapped to the y2 axis, hold "sketched" curves.
   void addSketchCurve() {
     addCurve();
     getCurve().getSymbol().setSymbolType(SymbolType.ANCHOR_MOUSE);
     getCurve().addPoint(0,0);
     getCurve().getPoint().setAnnotationText("X");
     getCurve().getPoint().setAnnotationYShift(100);
     addCurve();
     getCurve().setYAxis(Y2_AXIS);
     getCurve().getSymbol().setBrushSize(15, 600);
     getCurve().getSymbol().setHovertextTemplate(hovertemplate);
     getCurve().getSymbol().setHoverYShift(-200);
     getCurve().getSymbol().setSymbolType(SymbolType.LINE);
     getCurve().getSymbol().setWidth(0);
     getCurve().getSymbol().setHeight(0);
     
   }
     
   TestGChart42() {
      sketchMode.addClickHandler(new ClickHandler() {
         public void onClick(ClickEvent event) {
           if (sketchMode.getValue()) {
              sketchTimer.scheduleRepeating(500);
              addSketchCurve();
           }
           else {
             sketchTimer.cancel();
           }
         }
     });
     getY2Axis().setAxisLabel(sketchMode); 
     class MouseCoordinateInterpreter implements HoverParameterInterpreter {
        public String getHoverParameter(String pName, Curve.Point p) {
            String result = null;
            if (pName.equals("xMouse")) 
               result = getXAxis().formatAsTickLabel(
                          getXAxis().getMouseCoordinate());
            else if (pName.equals("yMouse")) 
               result = getYAxis().formatAsTickLabel(
                           getYAxis().getMouseCoordinate());
            else if (pName.equals("y2Mouse")) 
               result = getY2Axis().formatAsTickLabel(
                           getY2Axis().getMouseCoordinate());
            return result;
         }
     }
     setHoverParameterInterpreter(new MouseCoordinateInterpreter());
     setChartFootnotes(
"Check: hover message represents mouse position projected on each axis.<br>" + 
"(click to update hover-message so it reflects current mouse position)<br>" + 
"Check that, in 'sketch mode', it kind of sketches a line on Y2<br>" + 
"and that an X is placed 100 px above start of 1st sketched line.");
     setChartSize(300, 300);
     addCurve();
     getCurve().getSymbol().setBrushSize(15, 600);
     getCurve().getSymbol().setHovertextTemplate(hovertemplate);
     
     for (int i = 0; i < 10; i++) 
        getCurve().addPoint(i,i);

     addCurve();                      // force y2 axis to appear
     getCurve().setYAxis(Y2_AXIS);
     
     getXAxis().setHasGridlines(true);
     getYAxis().setHasGridlines(true);
     getXAxis().setAxisMin(0);
     getXAxis().setAxisMax(9);
     getY2Axis().setAxisMin(0);
     getY2Axis().setAxisMax(135);
  }
}
