package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Button;
import com.googlecode.gchart.client.GChart;
/**
 * Tests that setVisible(false) and visibility: hidden work
 * as advertised in the update method's javadocs.
 * 
 */
public class TestGChart51 extends GChart {
   final GChart thisGChart = this;
   TestGChart51(int mode) {
     if (0 == mode) { 
       setChartFootnotes(new Button("Check: Clicking me removes chart from DOM"));
       ((Button) getChartFootnotes()).addClickHandler(new ClickHandler() {
          public void onClick(ClickEvent event) {
             setVisible(false);
           }
        });
     }
     else if (1 == mode) { 
        setChartTitle(new Button("Check: Clicking me hides all but this button"));
        setChartTitleThickness(40);
       ((Button) getChartTitle()).addClickHandler(new ClickHandler() {
          public void onClick(ClickEvent event) {
             DOM.setStyleAttribute(thisGChart.getElement(),"overflow","hidden");
             thisGChart.setHeight(thisGChart.getChartTitleThickness()+"px");
           }
        });
     }
     else
        throw new IllegalArgumentException("mode must be 0 or 1");
     
     setChartSize(200, 200);

     getXAxis().setAxisLabel("X");
     getYAxis().setAxisLabel("Y");
     getY2Axis().setAxisLabel("Y2");
     
     addCurve();
     // make it a continuous line
     getCurve().getSymbol().setFillSpacing(0);
     getCurve().getSymbol().setFillThickness(1);
     for (int i = 0; i < 10; i++) 
       getCurve().addPoint(i,i*i);
     addCurve();
     getCurve().setYAxis(Y2_AXIS);
     for (int i = 0; i < 10; i++) 
       getCurve().addPoint(9-i,i*i);
  }
}
