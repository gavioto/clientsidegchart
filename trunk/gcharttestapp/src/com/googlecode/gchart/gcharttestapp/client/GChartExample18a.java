package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.googlecode.gchart.client.GChart;

/**
 *
 * This chart allows the user to delete points by
 * clicking on them (while preventing them from
 * deleting the last two points) to illustrate
 * how to handle click events on a GChart.
 * 
 */
public class GChartExample18a extends GChart
   implements ClickHandler { 
   final HandlerRegistration hr = addClickHandler(this);
   
   public void onClick(ClickEvent event) {
/*
 * In this example, we could drop all the "g." prefixes
 * since we are inside the GChart.  But you'll need them
 * if an independent object is listening to the clicks.
 * 
 */ 
      GChart g = (GChart) (event.getSource());
      if (null != g.getTouchedPoint()) {
         // they clicked on a point...
         if (g.getTouchedCurve().getNPoints() == 3) {
            // Down to last 3 points. Disable future deletes:
            hr.removeHandler();
            // replace "click to delete" msg with standard hovertext
            g.getTouchedCurve().getSymbol().setHovertextTemplate(
                 GChart.DEFAULT_HOVERTEXT_TEMPLATE);     
         }
         g.getTouchedCurve().removePoint(g.getTouchedPoint());
         // without this update, chart display freezes up.
         g.update();
      }
      // else, they clicked on nothing, so do nothing.
   }
   GChartExample18a() {
     setChartSize(300, 300); 
     setBorderStyle("none");
     // chart listens to its own click events: 
     // add a simple y = 2*x curve
     addCurve();
     getCurve().getSymbol().setHovertextTemplate(
        GChart.formatAsHovertext(
        "Click to delete point at (${x}, ${y})"));     
     getCurve().getSymbol().setHeight(30); 
     getCurve().getSymbol().setWidth(30);
     getCurve().getSymbol().setBorderWidth(3);     
     for (int iPoint = 0; iPoint < 10; iPoint++) 
        getCurve().addPoint(iPoint, 2*iPoint);
   }
}
