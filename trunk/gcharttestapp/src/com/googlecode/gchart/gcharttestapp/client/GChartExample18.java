package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.HoverUpdateable;

/**
 *
 * This chart allows the user to delete the hovered-over
 * point, by using a <tt>HoverUpdateable</tt> Button.
 * 
 */
public class GChartExample18 extends GChart {
   class HoverUpdateableButton extends Button
         implements HoverUpdateable {
      public void hoverUpdate(Curve.Point hoveredOver) {
         setText(hoveredOver.getHovertext()); 
      }
      public void hoverCleanup(Curve.Point hoveredAwayFrom){}
   }
   
   GChartExample18() {
     setChartSize(300, 300);
     setBorderStyle("none");

     // add a simple y = 2*x curve
     addCurve();
     getCurve().getSymbol().setHeight(30);
     getCurve().getSymbol().setWidth(30);
     getCurve().getSymbol().setBorderWidth(3);     
     for (int iPoint = 0; iPoint < 10; iPoint++) 
        getCurve().addPoint(iPoint, 2*iPoint);
   
     // pop-up delete button centered on hovered over point
     HoverUpdateableButton deletePoint =
        new HoverUpdateableButton();
     deletePoint.addClickHandler(new ClickHandler() {
        public void onClick(ClickEvent event) {
           getTouchedCurve().removePoint(getTouchedPoint());
           update();
        }
     });
     getCurve().getSymbol().setHoverWidget(deletePoint);
     getCurve().getSymbol().setHoverLocation(
        AnnotationLocation.CENTER);
     getCurve().getSymbol().setHovertextTemplate(
        "Delete (${x}, ${y})");     
   }
   
}
