package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.googlecode.gchart.client.GChart;
/**
 * Tests that two click handlers work in the expected manner
 * (that both get invoked with every click)
 */
public class TestGChart54 extends GChart  {
   TestGChart54() {
      setChartSize(300, 150);
      setChartFootnotes(
"Check: clicking on the chart adds one more point to BOTH curves.");
     addCurve();
     for (int i = 0; i < 2; i++) 
       getCurve().addPoint(i,i);
     addCurve();
     for (int i = 0; i < 2; i++) 
       getCurve().addPoint(i,2*i);
     getXAxis().setAxisLabel("x");
     getYAxis().setAxisLabel("y");
     addClickHandler(new ClickHandler() {
        public void onClick(ClickEvent event) {
           GChart g = (GChart) event.getSource();
           g.getCurve(0).addPoint(getCurve(0).getPoint().getX()+1,
                                  getCurve(0).getPoint().getY()+1);
//           g.update();
        }
     });
     addClickHandler(new ClickHandler() {
        public void onClick(ClickEvent event) {
           GChart g = (GChart) event.getSource();
           g.getCurve(1).addPoint(getCurve(1).getPoint().getX()+1,
                                  getCurve(1).getPoint().getY()+2);
           g.update();
        }
     });
   }
}
