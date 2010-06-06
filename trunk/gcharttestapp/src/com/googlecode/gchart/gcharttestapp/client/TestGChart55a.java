package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Grid;
import com.googlecode.gchart.client.GChart;
/**
 *
 * Tests that the GWTCanvas bug documented in TestGChart55 has
 * been worked around in GChart.
 * 
 */
public class TestGChart55a extends Grid {
   final int RECTANGLE_SIZE = 200;
   final int CELL_SIZE = 2*RECTANGLE_SIZE;
   GChart gchart = new GChartExample15e();
   int iCell = 0;  // grid cell to next contain canvas rectangle
   
   TestGChart55a() {
      super(2,2);
      DOM.setStyleAttribute(getElement(), "backgroundColor", "aqua");
      getCellFormatter().setWidth(0, 0, CELL_SIZE + "px");
      getCellFormatter().setWidth(0, 1, CELL_SIZE + "px");
      
      setWidget(1,0, new Button(
"Check: Clicking moves chart back/forth without 'color washout' in IE",
         new ClickHandler() {
           public void onClick(ClickEvent event) {
             iCell = (iCell + 1) % 2;
             setWidget(0, iCell, gchart);
           }
         })
      );
      gchart.setChartSize(2*RECTANGLE_SIZE, RECTANGLE_SIZE);
      gchart.update();
      setWidget(0, iCell, gchart);
   }
}
