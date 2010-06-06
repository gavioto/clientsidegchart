package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.Window;
import com.googlecode.gchart.client.GChart;

/**
 *
 * This chart allows the user to delete points by clicking
 * on them, and to add points at the mouse location, by
 * clicking on empty space.  <p>
 *
 * New points are inserted at the current insertion index,
 * which begins at 0 and is maintained at the position of
 * the last deleted, or just after the last inserted, point.
 * <p>
 *
 * Note: The equations contained in this example,
 * appropriately modified, would make very helpful
 * clientToModel (and, inverted, modelToClient) methods of
 * GChart's Axis-derived classes. If you get sick of typing
 * them in and decided to solve the problem of implementing
 * such generalized methods, it would be a big help to
 * the GChart project. All contributions gratefully
 * acknowledged and properly documented. 
 * 
 */
public class GChartExample22 extends GChart
   implements ClickHandler {
   int insertionPoint = 0;
   public void onClick(ClickEvent event) {
      if (null == getTouchedPoint()) { // add point at mouse
       // 1st, translate mouse client x,y coordinates into
       // pixel distances from upper-left of plot area:
         double xPx = Window.getScrollLeft()
                      + Event.getCurrentEvent().getClientX()
                      - getAbsoluteLeft()
                      - getYAxis().getAxisLabelThickness()
                      - getYAxis().getTickLabelThickness()
                      - getYAxis().getTickLength();
         double yPx = Window.getScrollTop()
                    + Event.getCurrentEvent().getClientY()
                    - getAbsoluteTop()      
                    - getChartTitleThickness();
      // 2nd, transform those pixel offsets to model units:   
         double x = getXAxis().getAxisMin()*(1-xPx/getXChartSize()) +
                    getXAxis().getAxisMax()*(xPx/getXChartSize());
         // note the pixelY-to-cartesianY min/max swap
         double y = getYAxis().getAxisMax()*(1-yPx/getYChartSize()) +
                    getYAxis().getAxisMin()*(yPx/getYChartSize());
      // add point, using the model units:
         getCurve().addPoint(insertionPoint++, x, y);
      }
      else { // delete the clicked on point
         insertionPoint = getTouchedCurve().getPointIndex(
            getTouchedPoint());
         getTouchedCurve().removePoint(getTouchedPoint());
      }
      update();
   }
   GChartExample22() {
     setChartSize(300, 300); 
     setBorderStyle("none");
     setChartTitle("<h2>World's Simplest Line Chart Editor</h2>"); 
     setChartFootnotesLeftJustified(true); 
     setChartFootnotes(
"<ol>" + 
"<li>Click on empty space to add a new point there." +
"<li>Click on any point to delete it." +
"<li>Points are added after the last inserted or deleted point." +
"</ol>"); 
     // chart listens to its own click events: 
     addClickHandler(this);
     addCurve();
     getCurve().getSymbol().setHeight(10); 
     getCurve().getSymbol().setWidth(10);
     getCurve().getSymbol().setBorderWidth(3);
     getCurve().getSymbol().setSymbolType(SymbolType.BOX_CENTER);
     getCurve().getSymbol().setFillSpacing(10); // dotted lines
     getCurve().getSymbol().setFillThickness(3);

     /*
      * With less than two distinct points on the chart, the
      * auto-computed axis min/max can become undefined, or
      * equal to each other: special cases for our linear
      * transformation equations we'd rather not handle in
      * this simple example, so we just explicitly set,
      * rather than dynamically compute, min and max.
      * 
      */ 
     getXAxis().setAxisMin(0);
     getXAxis().setAxisMax(100);
     getXAxis().setTickCount(11);
     getXAxis().setHasGridlines(true);
     getYAxis().setAxisMin(0);
     getYAxis().setAxisMax(100);
     getYAxis().setTickCount(11);
     getYAxis().setHasGridlines(true);
   }
}

