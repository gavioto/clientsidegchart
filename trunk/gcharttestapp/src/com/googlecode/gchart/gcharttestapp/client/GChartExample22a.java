package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.googlecode.gchart.client.GChart;

/**
 *
 * This chart allows the user to delete points by clicking
 * on them, and to add points at the mouse location, by
 * clicking on empty space.  <p>
 *
 * New points are inserted at the current curve's insertion
 * index which begins at the end of the curve and is
 * maintained at the position of the last deleted, or just
 * after the last inserted, point.  <p>
 *
 * Initially, six 1-point "starter curves" are placed along
 * the y axis. By deleting and immediately recreating
 * those points, the user can switch to adding points
 * to a different curve. The screen shot shows what the
 * chart looks like after the user has extended the
 * bottom two curves across the chart, with the other
 * four curves in their initial, "starter curve"
 * configuration.
 * 
 */
public class GChartExample22a extends GChart
   implements ClickHandler {
   final int MAX_CURVES = 6; 
   int[] insertionPoint = new int[MAX_CURVES];
   int insertionCurve = 0;
   public void onClick(ClickEvent event) {
      if (null == getTouchedPoint()) { 
    	  // add point at mouse position
         getCurve(insertionCurve).addPoint(
             insertionPoint[insertionCurve]++, 
             getXAxis().getMouseCoordinate(), 
             getYAxis().getMouseCoordinate());
      }
      else { // delete the clicked on point
         insertionCurve = getCurveIndex(getTouchedCurve());
         insertionPoint[insertionCurve] = getTouchedCurve().getPointIndex(
            getTouchedPoint());
         getTouchedCurve().removePoint(getTouchedPoint());
      }
      update();
   }
   GChartExample22a() {
     setChartSize(300, 300); 
     setBorderStyle("none");
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
           "#004586", "#ff420e", "#ffd320",
           "#579d1c", "#7e0021", "#83caff",
           "#314004", "#aecf00", "#4b1f6f",
           "#ff950e", "#c5000b", "#0084d1"});
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
     // add the 1-point "starter curves" along the y-axis. 
     for (int i = 0; i < MAX_CURVES; i++) {
        addCurve();
        getCurve().getSymbol().setHeight(10); 
        getCurve().getSymbol().setWidth(10);
        getCurve().getSymbol().setBorderWidth(3);
        getCurve().getSymbol().setSymbolType(SymbolType.LINE);
        getCurve().addPoint(0, 100*i/(MAX_CURVES-1.0));
        insertionPoint[i]++; 
     }
     // lock in a simple 0..100 range on each axis
     getXAxis().setAxisMin(0);
     getXAxis().setAxisMax(100);
     getXAxis().setTickCount(11);
     getXAxis().setHasGridlines(true);
     getYAxis().setAxisMin(0);
     getYAxis().setAxisMax(100);
     getYAxis().setTickCount(11);
     getYAxis().setHasGridlines(true);
     // switch back to GChart's built-in default colors
     GChart.setDefaultSymbolBorderColors(GChart.DEFAULT_SYMBOL_BORDER_COLORS);
     
   }
}

