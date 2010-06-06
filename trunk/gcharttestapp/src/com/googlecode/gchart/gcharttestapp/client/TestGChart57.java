package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.event.dom.client.DoubleClickEvent;
import com.google.gwt.event.dom.client.DoubleClickHandler;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.dom.client.MouseWheelEvent;
import com.google.gwt.event.dom.client.MouseWheelHandler;
import com.google.gwt.user.client.ui.Grid;
import com.googlecode.gchart.client.GChart;
/**
 *  Test to exercise all of GChart's "natively supported" event handling
 *  related methods (the click and mouse handlers).
 *  
 */
public class TestGChart57 extends GChart {
   // maintains a rolling list of recent events
   final int N_EVENTS = 10;
   String[] eventList = new String[N_EVENTS];
   final Grid title = new Grid(N_EVENTS, 1);
   int iEvent = 0;
   // generic event handler that scrolls event names into chart title
   void handleEvent(DomEvent<?> event, Object source) {
//      if (event.getSource() != source)
//         throw new IllegalStateException(
//event.getSource().toString() + "!=" + source.toString());
      eventList[iEvent % N_EVENTS] = event.toDebugString();
      iEvent = iEvent + 1;
      int j = 0;
      for (int i = iEvent-1; i >=0 && i >= iEvent - N_EVENTS; i--) 
         title.setText(j++, 0, eventList[i % N_EVENTS]);
   }

   TestGChart57() { 
     setChartTitle(title);
     setChartSize(400, 150);
     setChartTitleThickness(250);
     addCurve();
     setChartFootnotes(
"Check: mouse click, doubleclick, move, down/up, over, out, wheeling <br>" + 
"==> Corresponding chart title changes, with no exceptions thrown.");
     for (int i = 0; i <= 10; i++) 
        getCurve().addPoint(i,i);

     addClickHandler(new ClickHandler() {
        public void onClick(ClickEvent event) {
           handleEvent(event, TestGChart57.this);
        }
     }); 
     addDoubleClickHandler(new DoubleClickHandler() {
        public void onDoubleClick(DoubleClickEvent event) {
           handleEvent(event, TestGChart57.this);
        }
     }); 
     addMouseDownHandler(new MouseDownHandler() {
        public void onMouseDown(MouseDownEvent event) {
           handleEvent(event, TestGChart57.this);
        }
     });
     addMouseMoveHandler(new MouseMoveHandler() {
        public void onMouseMove(MouseMoveEvent event) {
           handleEvent(event, TestGChart57.this);
        }
     });
     addMouseOutHandler(new MouseOutHandler() {
        public void onMouseOut(MouseOutEvent event) {
           handleEvent(event, TestGChart57.this);
        }
     });
     addMouseOverHandler(new MouseOverHandler() {
        public void onMouseOver(MouseOverEvent event) {
           handleEvent(event, TestGChart57.this);
        }
     });
     addMouseUpHandler(new MouseUpHandler() {
        public void onMouseUp(MouseUpEvent event) {
           handleEvent(event, TestGChart57.this);
        }
     });
     addMouseWheelHandler(new MouseWheelHandler() {
        public void onMouseWheel(MouseWheelEvent event) {
           event.preventDefault();
           handleEvent(event, TestGChart57.this);
        }
     });
     
  }
}
