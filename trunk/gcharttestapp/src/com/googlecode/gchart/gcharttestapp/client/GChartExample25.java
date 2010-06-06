package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.user.client.ui.FocusPanel;
import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.GChart.Curve;
import com.googlecode.gchart.client.GChart.Curve.Point;
/**
 * Example of how to add direct keyboard support to a GChart
 * by wrapping it within a FocusPanel.
 * <p>
 *
 * The example allows lets the user press the left and right arrow keys
 * to move the selected point to the previous or next point after the
 * currently selected point.
 * 
 * For the more common case where you are handling mouse click
 * events only, as of v2.61, GChart implements both GWT's
 * HasMouse*Handlers and HasClickHandlers interfaces (c.f.
 * GChartExample24.java) so this wrapper technique is usually not
 * needed.
 * 
 */

public class GChartExample25 extends FocusPanel {
  static final int N_POINTS = 100;
  static final String BLUE = "#318ce0";
  static final String SKY_BLUE = "#c6defa";
  
  static class ChildGChart extends GChart {

     ChildGChart() {  
      setChartTitle(
"Click on chart, then use left/right arrows to switch selected point");
     setHoverTouchingEnabled(true);
     setChartSize(500, 150);
     setPadding("10px");
     getXAxis().setTickCount(11);
     getYAxis().setTickCount(11);
     addCurve();
     for (int i = 0; i <= N_POINTS; i++) 
        getCurve().addPoint(i, Math.sin((2* Math.PI * i)/N_POINTS));
     
     getCurve().getSymbol().setWidth(5);
     getCurve().getSymbol().setBorderColor(BLUE);
     getCurve().getSymbol().setBackgroundColor(SKY_BLUE);
     getCurve().getSymbol().setHoverSelectionBackgroundColor(BLUE);
     getCurve().getSymbol().setHoverSelectionBorderColor(SKY_BLUE);
     getCurve().getSymbol().setSymbolType(
        SymbolType.VBAR_BASELINE_CENTER);
     getCurve().getSymbol().setHoverLocation(
        AnnotationLocation.NORTH);
     getCurve().getSymbol().setHoverYShift(5);
     setPixelSize(getXChartSizeDecorated(),
                  getYChartSizeDecorated());
   }
  }
  GChart theChild = new ChildGChart(); 
  GChartExample25() {
	 theChild.update();
    setWidget(theChild);
    addKeyDownHandler(new KeyDownHandler() {
       public void onKeyDown(KeyDownEvent event) {
           event.preventDefault();
           // ignore mouse position when arrow-key pressing
           if (theChild.getHoverTouchingEnabled()) 
              theChild.setHoverTouchingEnabled(false);
           Point p = theChild.getTouchedPoint();           
           Curve c = theChild.getCurve(); // only one curve on chart
           int iPoint = (null == p) ? 0 : c.getPointIndex(p);
           if (event.isLeftArrow()) 
             iPoint = (iPoint + N_POINTS) % (N_POINTS+1);
           else if (event.isRightArrow()) 
             iPoint = (iPoint + 1) % (N_POINTS+1);
           theChild.touch(c.getPoint(iPoint));
           theChild.update();
        }
     });
     addMouseMoveHandler(new MouseMoveHandler() {
        public void onMouseMove(MouseMoveEvent event) {
           event.preventDefault();
           // mousing auto re-enables mouse-over hover feedback
           if (!theChild.getHoverTouchingEnabled()) {
              theChild.setHoverTouchingEnabled(true);
              theChild.update();
           }
        }
     });
  }
   
}