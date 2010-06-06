package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.CheckBox;
import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.HoverUpdateable;
/**
 * This example uses a <tt>HoverUpdateable</tt> checkbox
 * widget that toggles a border around a curve's points.
 * <p>
 *
 * The example also exercises the setHoverSelectionURL method,
 * by making the hover selection feedback red by using
 * setHoverSelectionURL("red.gif").
 *
 *
 */
public class TestGChart39 extends GChart {

   class HoverUpdateableCheckBox extends CheckBox implements HoverUpdateable {
      HoverUpdateableCheckBox(String label) {
         super(label);
         DOM.setStyleAttribute(getElement(),
                            "backgroundColor", "EEE"); 
         DOM.setStyleAttribute(getElement(),
                            "padding", "3px"); 
         DOM.setStyleAttribute(getElement(),
                            "border", "2px solid black"); 
      }
      public void hoverUpdate(Curve.Point p) {
         // exercise different getters on different curves
         // (both properties are changed together)
        if (getCurveIndex(getTouchedCurve()) == 0)  
        	setValue(getBlankImageURL() !=
               p.getParent().getSymbol().getHoverSelectionImageURL());
        else
        	setValue(0 !=
                   p.getParent().getSymbol().getBorderWidth());
     }
     public void hoverCleanup(Curve.Point p) {
     }
   }
   
   TestGChart39() {
     final int N_CURVES = 2;
     setChartSize(200, 200);
     setBorderStyle("none");
     HoverUpdateableCheckBox hoverWidget = 
        new HoverUpdateableCheckBox(
        "green border & red hover selection background");
     hoverWidget.addClickHandler(new ClickHandler() {
        public void onClick(ClickEvent event) {
           if (((CheckBox) event.getSource()).getValue()) {
              getTouchedCurve().getSymbol().setBorderWidth(-3);
              getTouchedCurve().getSymbol().setHoverSelectionImageURL(
                 "red.gif");
           }
           else {
              getTouchedCurve().getSymbol().setBorderWidth(0);
              getTouchedCurve().getSymbol().setHoverSelectionImageURL(
                 null);
           }
           update();
        }
     });

     for (int iCurve = 0; iCurve < N_CURVES; iCurve++) {  
        addCurve();
        getCurve().getSymbol().setHoverWidget(hoverWidget);
        getCurve().getSymbol().setHoverLocation(AnnotationLocation.CENTER);
        getCurve().getSymbol().setHoverSelectionBorderWidth(-3);
        getCurve().getSymbol().setHoverSelectionBorderColor("#F88");
        getCurve().getSymbol().setHoverSelectionBorderStyle("dotted");
        getCurve().getSymbol().setHeight(30);
        getCurve().getSymbol().setWidth(30);
        getCurve().getSymbol().setHoverSelectionImageURL(
                 "red.gif");
        getCurve().getSymbol().setBorderColor("green");
        getCurve().getSymbol().setBackgroundColor("blue");
        getCurve().getSymbol().setBorderStyle("solid");
        getCurve().getSymbol().setBorderWidth(-3);
        for (int iPoint = 0; iPoint < 10; iPoint++) 
           getCurve().addPoint(iPoint, (1+iCurve)*iPoint);
     }
     getXAxis().setHasGridlines(true);
     getYAxis().setHasGridlines(true);
     setChartFootnotes("Check for pink dotted selection border. <br>Check that clicking the checkbox toggles green external border w red selection center, on both curves");
           
  }
}
