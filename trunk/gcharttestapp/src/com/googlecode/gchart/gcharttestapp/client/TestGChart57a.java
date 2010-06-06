package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.ui.FocusPanel;
/**
 *  Tests technique of wrapping a FocusPanel around the GChart to
 *  add keyboard support (arrow keys for scrolling, for example).
 *  <p>
 *
 *  This is the officially recommended way of adding keyboard support
 *  to any GWT Widget, and making it focusable.
 *  <p>
 *
 * However, a viable, and the preferable recommended (by me) way to making a
 * GChart focusable is to simply add a focusable widget or two to the
 * GChart as annotations, hover widgets, footnotes, etc. For example,
 * instead of arrow key support, it may be easier/better to simply add
 * scroll left and scroll right buttons to a chart's footnotes, and allow them
 * to handle arrow keys when they have the focus.
 *
 *  
 */
public class TestGChart57a extends FocusPanel {
   /*
    * Here we let the GChart do it's own click, dbl-click, mouse
    * handling. But, some applications may prefer to add these handlers
    * to the containing focus panel. One difference: the browser area
    * associated with the focus panel, in this example, extends across
    * the entire width of the browser, so the "hot region" for mouse
    * moves, clicks, etc. would be larger than when (as in this example)
    * these handlers are added directly to the GChart.
    * 
    */ 
   final TestGChart57 childGChart = new TestGChart57();
   
   TestGChart57a() { 
     setWidget(childGChart);
     childGChart.setChartFootnotes(
                                   "Check the Blur, Focus, KeyDown, KeyPress, KeyUp, Mouse move, out, over, down, up, click, doubleclick events are triggered, with no exceptions thrown.");
// Tried this to make focus feedback rectangle tighter, BUT...IE could
// no longer accept mouse focus via clicks after I added this line:
// setPixelSize(childGChart.getXChartSizeDecorated()+50,
// childGChart.getYChartSizeDecorated()+50);
     childGChart.update();
     // handlers not directly supported by the GChart are added to
     // the wrapping FocusPanel.
     addBlurHandler(new BlurHandler() {
        public void onBlur(BlurEvent event) {
           childGChart.handleEvent(event, TestGChart57a.this);
        }
     });
     addFocusHandler(new FocusHandler() {
        public void onFocus(FocusEvent event) {
           childGChart.handleEvent(event, TestGChart57a.this);
        }
     }); 
     addKeyDownHandler(new KeyDownHandler() {
        public void onKeyDown(KeyDownEvent event) {
           childGChart.handleEvent(event, TestGChart57a.this);
        }
     }); 
     addKeyPressHandler(new KeyPressHandler() {
        public void onKeyPress(KeyPressEvent event) {
           childGChart.handleEvent(event, TestGChart57a.this);
        }
     }); 
     addKeyUpHandler(new KeyUpHandler() {
        public void onKeyUp(KeyUpEvent event) {
           childGChart.handleEvent(event, TestGChart57a.this);
        }
     });      
  }
}
