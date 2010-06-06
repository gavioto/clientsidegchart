package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.HoverUpdateable;

/**
 *
 * Test that deletes the hovered over point or curve from within a
 * hoverWidget. Expected behaviour: the hovered over widget ref gets
 * nullified when it, or the curve containing it, gets deleted, so hover
 * feedback on the deleted point/curve gets removed on the next update.
 *
 *
 */ 

public class TestGChart36 extends GChart {
   final TouchedPointUpdateOption updateOption;
   
   class HoverUpdateableButton extends Button implements HoverUpdateable {
      Curve.Point thePoint = null;
      public void hoverUpdate(Curve.Point p) {
         // GChart calls hoverUpdate just before menu widget pops up
         thePoint = p;
      }
	   public void hoverCleanup(Curve.Point p) {}
      
   }

   
   TestGChart36(GChart.TouchedPointUpdateOption option) {
	 updateOption = option;  
     setChartSize(200, 200);
     setPadding("10px");
     setOptimizeForMemory(true);
     HoverUpdateableButton removeCurveButton = new HoverUpdateableButton();
     removeCurveButton.setText("Remove Curve");
     removeCurveButton.addClickHandler(new ClickHandler() {
        public void onClick(ClickEvent event) {
           removeCurve(
             ((HoverUpdateableButton) event.getSource()).thePoint.getParent());
           update(updateOption);
        }
     });
     HoverUpdateableButton removePointButton = new HoverUpdateableButton();
     removePointButton.setText("Remove Point");
     removePointButton.addClickHandler(new ClickHandler() {
        public void onClick(ClickEvent event) {
           ((HoverUpdateableButton) event.getSource()).thePoint.getParent().removePoint(
             ((HoverUpdateableButton) event.getSource()).thePoint);
           update(updateOption);
        }
     });
     final int N_CURVES = 2;
     for (int iCurve = 0; iCurve < N_CURVES; iCurve++) {
       addCurve();
       getCurve().getSymbol().setHoverWidget(
           iCurve==0?removeCurveButton:removePointButton);
       getCurve().getSymbol().setBorderWidth(3);
       // next two lines position it like a typical right-click menu 
       getCurve().getSymbol().setHoverLocation(
          AnnotationLocation.CENTER);
       getCurve().getSymbol().setHeight(20);
       getCurve().getSymbol().setWidth(20);
       for (int iPoint = 0; iPoint < 10; iPoint++) 
          getCurve().addPoint(iPoint, (N_CURVES-iCurve)*iPoint);
     }
     getXAxis().setHasGridlines(true);
     getYAxis().setHasGridlines(true);
     setChartFootnotes(
"Check: Hover over each curve. \"Remove Point\" button should remove BOTH point<br>" + 
"and button, as should \"Remove Curve\" button");
  }
}

