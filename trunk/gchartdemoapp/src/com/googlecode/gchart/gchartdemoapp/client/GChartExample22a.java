package com.googlecode.gchart.gchartdemoapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.Grid;
import com.googlecode.gchart.client.GChart;
import java.util.HashMap;

/**
 *
 * This chart allows the user to:
 * <p>
 * 
 * <ol>
 *   <li> Drag to move curves within the plot area (panning)
 *   <li> Click to place the mouse position at center of plot area
 *   <li> Zoom in and out via +/- buttons on a zoomController panel
 *   <li> When zoomController panel has focus, use arrow keys
 *        to scroll and Ctrl+(DownArrow | UpArrow) to zoom in/out.
 *   <li> Use Ctrl+Click to add or delete points.
 * </ol>
 * <p>
 * 
 * When an existing point is selected, Ctrl+Click deletes it and sets
 * the insertionPoint to the position of the deleted point within the curve's
 * point sequence. Otherwise, Ctrl+Click inserts a new point at the
 * current mouse position, placing it, within the curve's point
 * sequence, at the position associated with the current insertionPoint.
 * <p>
 *
 * The chart initially shows a 100 point curve, plus several single
 * point 'starter curves'. The user can add points to one of these
 * starter curves by deleting (Ctrl+clicking on) the single point, and
 * then immediately Ctrl+clicking at the positions where they want to
 * create the curve's new points.
 * 
 */
public class GChartExample22a extends GChart {
      // fraction of full page that arrow key-press scrolls
      final double SCROLL_FRACTION = 0.05; 
      final int N_EDITABLE_CURVES = 10; 
      final int N_POINTS = 100;
      // index of curve where next point will be inserted
      int insertionCurve = N_EDITABLE_CURVES-1;  
      // index in curve's point sequence where next point will be inserted
      int insertionPoint = 1;                    
      boolean dragging = false;
      int x0 = GChart.NAI;   // starting mouse-down location
      int y0 = GChart.NAI;
      int x1 = GChart.NAI;   // current mouse location while dragging
      int y1 = GChart.NAI;
      // smallest x or y mouse move needed to begin dragging
      final static int MIN_DRAG_IN_PIXELS = 4;
      // various states user interface can be in:
      final static int HOVERING = 0;            // initial state 
      final static int MOUSE_JUST_PRESSED = 1;  // just after mouse down
      final static int DRAGGING = 2;            // after min drag occurs
      int state = HOVERING;      
      static final String BLUE = "#318ce0";
      static final String SKY_BLUE = "#c6defa";
      ZoomController zoomController = new ZoomController();
      // an index representing the current level of zoom
      int zoomIndex = 0;
      // we limit max allowed zoom in/out to this many clicks
      static final int MAX_ZOOM_INDEX = 10;
      /*
       * Panel with the buttons to zoom in and out, and that captures
       * focus/keystrokes for arrow key based scrolling and zooming.
       *
       * Note: I experimented with various ways of incorporating
       * keyboard handling into a GChart. What worked best was a
       * separate focusable widget (a FocusPanel, since it can contain
       * other widgets, often works best as that widget). Though also
       * operational, wrapping the entire GChart within a FocusPanel had
       * certain problems, such as inconsistent cross-browser focus
       * selection feedback, focus rectangles that exceeded the chart
       * rectangle, etc. If you want clicking any part of the chart to
       * capture focus, just add a click handler to the chart that
       * invokes the embedded focusable Widget's <tt>setFocus</tt>
       * method. 
       * 
       */ 
      class ZoomController extends FocusPanel {
         final Grid grid = new Grid(1,2);
         // shrink axis range around center by sqrt(2) to zoom in
         void zoomInAction() {
            if (zoomIndex == -MAX_ZOOM_INDEX) 
               zoomOut.setEnabled(true);
            if (zoomIndex < MAX_ZOOM_INDEX) {
               double xMin = getXAxis().getAxisMin(); 
               double xMax = getXAxis().getAxisMax(); 
               double yMin = getYAxis().getAxisMin(); 
               double yMax = getYAxis().getAxisMax();
               double xCenter = (xMin + xMax)/2;
               double yCenter = (yMin + yMax)/2;
               double dx = (xMax - xMin)/(2*Math.sqrt(2));
               double dy = (yMax - yMin)/(2*Math.sqrt(2));
               getXAxis().setAxisMin(xCenter - dx);
               getXAxis().setAxisMax(xCenter + dx);
               getYAxis().setAxisMin(yCenter - dy);
               getYAxis().setAxisMax(yCenter + dy);
               update();
               zoomIndex++;
            }
            if (zoomIndex == MAX_ZOOM_INDEX) {
               zoomIn.setEnabled(false);  
               zoomOut.setFocus(true);
            }
            else
               zoomIn.setFocus(true);
         }
         // expand axis range around center by sqrt(2) to zoom out
         void zoomOutAction() {
            if (zoomIndex == MAX_ZOOM_INDEX)
               zoomIn.setEnabled(true);
            if (zoomIndex > -MAX_ZOOM_INDEX) {
               double xMin = getXAxis().getAxisMin(); 
               double xMax = getXAxis().getAxisMax(); 
               double yMin = getYAxis().getAxisMin(); 
               double yMax = getYAxis().getAxisMax();
               double xCenter = (xMin + xMax)/2;
               double yCenter = (yMin + yMax)/2;
               double dx = (xMax - xMin)/Math.sqrt(2);
               double dy = (yMax - yMin)/Math.sqrt(2);
               getXAxis().setAxisMin(xCenter - dx);
               getXAxis().setAxisMax(xCenter + dx);
               getYAxis().setAxisMin(yCenter - dy);
               getYAxis().setAxisMax(yCenter + dy);
               update();
               zoomIndex--;
            }
            if (zoomIndex == -MAX_ZOOM_INDEX) { 
               zoomOut.setEnabled(false);
               zoomIn.setFocus(true);
            }
            else
               zoomOut.setFocus(true);
            
         }
         final Button zoomIn = new Button("<tt>+</tt>",
                                          new ClickHandler() {
            public void onClick(ClickEvent event) {
               zoomInAction();
            }});
         final Button zoomOut = new Button("<tt>-</tt>",
                                           new ClickHandler() {
            public void onClick(ClickEvent event) {
               zoomOutAction();
            }});
         ZoomController() {
            setWidget(grid);         
            grid.setCellSpacing(0);
            grid.setCellPadding(0);
            zoomIn.setTitle(
                            "Zoom in (Ctrl+DownArrow)");
            zoomOut.setTitle(
                            "Zoom out (Ctrl+UpArrow)");
            grid.setWidget(0, 0, zoomIn);
            grid.setWidget(0, 1, zoomOut);

            zoomIn.addMouseDownHandler(new MouseDownHandler() {
               public void onMouseDown(MouseDownEvent event) {
// button doesn't get focus without this line (a FocusPanel problem?)
                  zoomIn.setFocus(true);
               }
            });
            zoomOut.addMouseDownHandler(new MouseDownHandler() {
               public void onMouseDown(MouseDownEvent event) {
                  zoomOut.setFocus(true);
               }
            });
            // parent FocusPanel sees keystrokes when buttons have focus
            addKeyDownHandler(new KeyDownHandler() {
               public void onKeyDown(KeyDownEvent event) {
                  double dx = 0;
                  double dy = 0;
                  if (event.isLeftArrow()) {
                     event.preventDefault();
                     dx = -SCROLL_FRACTION * (getXAxis().getAxisMax() -
                           getXAxis().getAxisMin());
                     moveViewport(dx, dy);
                  }
                  else if (event.isRightArrow()) {
                     event.preventDefault();
                     dx = SCROLL_FRACTION * (getXAxis().getAxisMax() -
                           getXAxis().getAxisMin());
                     moveViewport(dx, dy);
                  }
                  else if (event.isUpArrow()) {
                     event.preventDefault();
                     if (event.isControlKeyDown())
                        zoomController.zoomOutAction();
                     else {
                        dy = SCROLL_FRACTION * (getYAxis().getAxisMax() -
                                                getYAxis().getAxisMin());
                        moveViewport(dx, dy);
                     }
                  }
                  else if (event.isDownArrow()) {
                     event.preventDefault();
                     if (event.isControlKeyDown())
                        zoomController.zoomInAction();
                     else {
                        dy = - SCROLL_FRACTION * (getYAxis().getAxisMax() -
                           getYAxis().getAxisMin());
                        moveViewport(dx, dy);
                     }
                  }
               }
            }); 
         }
      } // end of class ZoomController

      // removes touched point if selected, else inserts a new point.
      private void addOrRemovePoint(double x, double y) {
         if (null == getTouchedPoint()) { 
            // insert new point at current mouse position
            getCurve(insertionCurve).addPoint(insertionPoint++, x, y);
         }
         else { // delete the clicked on point and switch insertion point
            insertionCurve = getCurveIndex(getTouchedCurve());
            insertionPoint =
               getTouchedCurve().getPointIndex(getTouchedPoint());
            getTouchedCurve().removePoint(getTouchedPoint());
         }
         update();
      }

      // enable/disable drag cursor feedback
      void setDragCursorEnabled(boolean enabled) {
        DOM.setStyleAttribute(getElement(),"cursor", enabled?"move":"default");
        for (int i = 0; !enabled && i < N_EDITABLE_CURVES; i++) {
           getCurve(i).setXShift(0);
           getCurve(i).setYShift(0);
        }
      }
      // moves axis limits so as to shift the viewing window by (dx, dy)
      void moveViewport(double dx, double dy) {
          getXAxis().setAxisMin(getXAxis().getAxisMin() + dx); 
          getXAxis().setAxisMax(getXAxis().getAxisMax() + dx); 
          getYAxis().setAxisMin(getYAxis().getAxisMin() + dy); 
          getYAxis().setAxisMax(getYAxis().getAxisMax() + dy);
          update();
      }
      // centers viewing window on point at the given model coordinates 
      void centerChart(double x, double y) {
         double xCenter = (getXAxis().getAxisMin() +
                           getXAxis().getAxisMax())/2; 
         double yCenter = (getYAxis().getAxisMin() +
                           getYAxis().getAxisMax())/2;
         moveViewport(x - xCenter, y - yCenter);
      }

      GChartExample22a() {
         final String SOURCE_CODE_LINK =
           "<a href='GChartExample22a.txt' target='_blank'>Source code</a>";
         setChartSize(380, 90); 
         setCanvasExpansionFactors(0.3, 0.3);
         setBorderStyle("none");
         setChartTitle(
"<div style='font-size: 12px'>LayZLine&trade; Chart Editor: Bezier <i>not</i> Busier&reg;</div>");
         setChartTitleThickness(30);
         getYAxis().setTickLabelThickness(40);
         setChartFootnotes(SOURCE_CODE_LINK);
         setChartFootnotesThickness(20);
         setClipToPlotArea(true);
         setPlotAreaBorderColor(SKY_BLUE);
         setPlotAreaBorderWidth(1);
         setPlotAreaBorderStyle("dotted");
         // pad rendering so we don't have to update while dragging
         setRenderPaddingFactor(1.5);
         
         // start with a simple range on each axis
         getXAxis().setAxisMin(0);
         getXAxis().setAxisMax(100);
         getXAxis().setTickCount(11);
         getXAxis().setHasGridlines(false);
         getXAxis().setTickLocation(TickLocation.CENTERED);
         getXAxis().setTickLabelFontSize(10);
         getXAxis().setOutOfBoundsMultiplier(32);
         getYAxis().setAxisMin(-100);
         getYAxis().setAxisMax(100);
         getYAxis().setTickCount(11);
         getYAxis().setTicksPerLabel(2);
         getYAxis().setHasGridlines(false);
         getYAxis().setTickLabelFontSize(10);
         getYAxis().setOutOfBoundsMultiplier(32);

         
         /*
          * Switch to OpenOffice color sequence (it looks
          * better).  Though the legal situation for colors
          * is a bit murky, since it is part of
          * <a href="http://www.openoffice.org/license.html">LGPL
          * licensed OpenOffice</a>, this color sequence, if
          * used for the specific purpose of a default chart
          * color sequence, and hence this
          * example code line, is likely itself also copy
          * protected under the LGPL 
          * Use only as directed.
          * <p>
          *
          * Note that the GChart library itself (gchart.jar)
          * contains only Apache 2.0 licensed code. 
          * 
          * 
          * This page provides a nice picture of the <a href=
          * "http://ui.openoffice.org/VisualDesign/
          * OOoChart_colors_drafts.html#02"> OpenOffice color
          * sequence</a>, and details on the voting process used
          * to select it.  <p>
          *
          */
         GChart.setDefaultSymbolBorderColors(new String[] {
            "#0084d1", "#004586", "#ff420e", "#ffd320",
            "#579d1c", "#7e0021", "#83caff",
            "#314004", "#aecf00", "#4b1f6f",
            "#ff950e", "#c5000b", });
         HashMap<String, Double> curveData = new HashMap<String, Double>();
         // use a number from 0 (straight lines) to 1 (VERY curvy)   
         curveData.put("catmull-rom-tension",
                   GChartDemoApp.CurvyLineCanvasLite.REASONABLY_CURVY_TENSION);
         // add all editable curves to the chart
         for (int i = 0; i < N_EDITABLE_CURVES; i++) {
            addCurve();
            getCurve().setCurveData((Object) curveData);
            getCurve().getSymbol().setHeight(7); 
            getCurve().getSymbol().setWidth(7);
            getCurve().getSymbol().setBorderWidth(1);
            getCurve().getSymbol().setSymbolType(SymbolType.LINE);
            getCurve().getSymbol().setFillThickness(2);
            getCurve().getSymbol().setFillSpacing(0);
            if (i == 0) {
              // enveloped sin to give them something to zoom in on 
              for (int j = 0; j < N_POINTS; j++) 
                getCurve().addPoint(j, 100*Math.sin((4*Math.PI*j)/N_POINTS)*
                                       Math.sin(15*(Math.PI * j)/N_POINTS));
            }
            else {
               // single point "starter curve" for editing purposes
               getCurve().addPoint(getXAxis().getAxisMin(),
                                   getYAxis().getAxisMin() +
                                   ((i+0.0)/N_EDITABLE_CURVES)*
                                   (getYAxis().getAxisMax() -
                                    getYAxis().getAxisMin()));
            }

         }
         // Switch global colors back to their original defaults:
         GChart.setDefaultSymbolBorderColors(GChart.DEFAULT_SYMBOL_BORDER_COLORS);

         // curve whose annotation will hold the zoom in/out buttons
         addCurve();
         getCurve().getSymbol().setSymbolType(SymbolType.ANCHOR_NORTHEAST);
         getCurve().addPoint(Double.MAX_VALUE, -Double.MAX_VALUE);
         getCurve().getPoint().setAnnotationLocation(
            AnnotationLocation.NORTHWEST);
         getCurve().getPoint().setAnnotationYShift(8);
         getCurve().getPoint().setAnnotationWidget(zoomController);
         getCurve().getSymbol().setHoverSelectionEnabled(false);
         getCurve().getSymbol().setHoverAnnotationEnabled(false);

         // curve whose annotation will hold on-line help
         addCurve();
         // this keeps plot area clipping from clipping off our circle 
         getCurve().setClipToPlotArea(Boolean.FALSE);
         // slice size defaults to a full circle (2*Pi) angle
         getCurve().getSymbol().setSymbolType(
               SymbolType.PIE_SLICE_OPTIMAL_SHADING);
         final int RADIUS = 14;
         getCurve().getSymbol().setWidth(2*RADIUS); 
         getCurve().getSymbol().setHeight(0);
         getCurve().getSymbol().setFillSpacing(0);
         getCurve().getSymbol().setFillThickness(1);
         getCurve().getSymbol().setBorderColor(BLUE);
         getCurve().getSymbol().setBackgroundColor(SKY_BLUE);
         getCurve().getSymbol().setBorderWidth(1);
         // centered on upper left corner, then pixel shift from there
         getCurve().addPoint(-Double.MAX_VALUE, Double.MAX_VALUE);
         getCurve().setXShift(RADIUS + 6);
         getCurve().setYShift(RADIUS + 6);
         getCurve().getPoint().setAnnotationLocation(
            AnnotationLocation.ON_PIE_ARC);
         // centered on topmost arc, shift down to pie center
         getCurve().getPoint().setAnnotationXShift(-RADIUS);
         getCurve().getPoint().setAnnotationText("?");
         getCurve().getPoint().setAnnotationFontSize(RADIUS + 6);
         getCurve().getPoint().setAnnotationFontColor("white");
         getCurve().getPoint().setAnnotationFontWeight("bold");
         getCurve().getSymbol().setHoverSelectionBackgroundColor(
            GChart.TRANSPARENT_BORDER_COLOR);
         getCurve().getSymbol().setHoverSelectionBorderColor(BLUE);
         getCurve().getSymbol().setHoverSelectionWidth(2*RADIUS+3);
         getCurve().getSymbol().setHoverSelectionHeight(0);
         // position hover msg to right and above circled '?'
         getCurve().getSymbol().setHoverAnnotationSymbolType(
            SymbolType.BOX_CENTER);
         getCurve().getSymbol().setHoverLocation(
            AnnotationLocation.NORTHEAST);
         getCurve().getSymbol().setHoverXShift(15);
         getCurve().getSymbol().setHoverYShift(15);
         getCurve().getSymbol().setHovertextTemplate(
            GChart.formatAsHovertext(
"<center>LayZLine&trade; for Laggards</center>" +
"<tt>Drag</tt> to pan.<br>" +
"<tt>Click</tt> to center.<br>" +
"<tt>Ctrl+Click</tt> on empty space to add.<br>"+
"<tt>Ctrl+Click</tt> on a point to delete.<br>"+
"<tt>Arrows</tt> to scroll.<br>" +
"<tt>Ctrl+(Up|Down)</tt> to zoom.<small><br>" +
"<center>LayZLine&trade;: <i>Recline on supine splines</i>&reg;</small></center>"
));
         
         addMouseDownHandler(new MouseDownHandler() {
            public void onMouseDown(MouseDownEvent event) {
               /*
                * Most browsers, by default, support the ability to
                * to "drag-copy" any web page image to the desktop.
                * But GChart's rendering makes extensive use of
                * images, and the image-dragging cursor isn't appropriate
                * for panning, so we prevent this default behavior.
                * 
                */
               event.preventDefault();
               x0 = event.getClientX(); 
               y0 = event.getClientY(); 
               // ignore clicks on zoom buttons or on the source code link
               if (y0 > getYAxis().modelToClient(getYAxis().getAxisMin()) ||
                   y0 < getYAxis().modelToClient(getYAxis().getAxisMax()))
                  return;

               state = MOUSE_JUST_PRESSED;
            }
         });
         
         addMouseMoveHandler(new MouseMoveHandler() {
            public void onMouseMove(MouseMoveEvent event) {
               event.preventDefault();
               x1 = event.getClientX();
               y1 = event.getClientY();
               if (state == MOUSE_JUST_PRESSED &&
                   (MIN_DRAG_IN_PIXELS <= Math.abs(x1-x0) ||
                    MIN_DRAG_IN_PIXELS <= Math.abs(y1-y0))) {
                  state = DRAGGING;
                  setDragCursorEnabled(true);
               }
               if (state == DRAGGING) {
                  for (int i = 0; i < N_EDITABLE_CURVES; i++) {
                     getCurve(i).setXShift(x1 - x0);
                     getCurve(i).setYShift(y0 - y1);
                  }
                  update();   
               }
            }
         });
         addMouseUpHandler(new MouseUpHandler() {
            public void onMouseUp(MouseUpEvent event) {
               event.preventDefault();
               // if you do this on mouse down, it won't work in IE
               zoomController.setFocus(true);
               if (state == DRAGGING) {
                  x1 = event.getClientX(); 
                  y1 = event.getClientY(); 
                  setDragCursorEnabled(false);
                  double dx = getXAxis().clientToModel(x1) -
                              getXAxis().clientToModel(x0);
                  double dy = getYAxis().clientToModel(y1)-
                              getYAxis().clientToModel(y0);  
                  moveViewport(-dx, -dy);
               }
               else if (state == MOUSE_JUST_PRESSED) {
                  if (event.isControlKeyDown())
                     addOrRemovePoint(getXAxis().clientToModel(x0),
                                      getYAxis().clientToModel(y0));
                  else
                     centerChart(getXAxis().clientToModel(x0),
                                 getYAxis().clientToModel(y0));
               }
               state = HOVERING;
            }
         });
         addMouseOutHandler(new MouseOutHandler() {
            public void onMouseOut(MouseOutEvent event) {
               setDragCursorEnabled(false);
               update();
               state = HOVERING;
            }
         });
         addMouseOverHandler(new MouseOverHandler() {
            public void onMouseOver(MouseOverEvent event) {
               setDragCursorEnabled(false);
               update();
               state = HOVERING;
            }
         });

         update();
      }
}

