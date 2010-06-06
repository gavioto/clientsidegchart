package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.HoverUpdateable;
/**
 * Tests the use of a clickable button as a hover widget.
 */
public class TestGChart32 extends GChart {
   class MyHoverButton extends Button implements HoverUpdateable {
      public void hoverUpdate(Curve.Point p) {
         setText(p.getHovertext()); 
      }
	   public void hoverCleanup(Curve.Point p) {}
   }
  TestGChart32() {
     setChartSize(150, 150);
     addCurve();
     for (int i = 0; i < 10; i++) 
        getCurve().addPoint(i,i*i);
     MyHoverButton hoverWidget = new MyHoverButton();
     hoverWidget.addClickHandler(new ClickHandler() {
        public void onClick(ClickEvent event) {
           Window.alert("You clicked on: " + ((Button) event.getSource()).getText());
        }
     });
     getCurve().getSymbol().setHoverWidget(hoverWidget);
     getCurve().getSymbol().setHoverLocation(AnnotationLocation.CENTER);
     getCurve().getSymbol().setHovertextTemplate("(${x},${y})");
     getCurve().getSymbol().setHeight(15);
     getCurve().getSymbol().setWidth(15);
     getXAxis().setHasGridlines(true);
     getYAxis().setHasGridlines(true);
     getYAxis().setAxisMax(90);

     setChartFootnotes(
"Check: buttons containing default hover text appear when you hover<br>" + 
"over points (and an appropriate message pops up when you click on them)"
     );
  }
}
