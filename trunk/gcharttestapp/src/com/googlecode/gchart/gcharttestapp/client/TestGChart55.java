package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.widgetideas.graphics.client.Color;
import com.google.gwt.widgetideas.graphics.client.GWTCanvas;
/**
 * 
 * Reproduces a bug in GWTCanvas that, in IE, causes previously
 * rendered fill and stroke color, and stroke thickness, to be
 * changed if Widget is removed and re-added to the DOM.
 * 
 * To reproduce, add an instance of this class to root panel,
 * and click the "Move Canvas" button.
 * 
 * In FF, Chrome you get the red square moving from left to
 * right, as expected.
 * 
 * In IE, initial display is fine, but the square fill and border
 * color, as well as border stroke width, get reset to some
 * "default" values (white, black, 1px is what I see) when the
 * canvas is moved (VML elements previously rendered are
 * otherwise sized and positioned appropriately). Interestingly,
 * the alpha-transparency factors for fill and stroke colors are
 * retained even though the colors themselves are not.
 *
 * Workaround: Just redraw entire canvas whenever it is
 * re-inserted into the DOM. This imposes a big performance
 * penalty on applications that render once, then shuffle the
 * same canvas around in the DOM (moving a piece in a board game,
 * for example) <p>
 *
 * You might also use an AbsolutePanel instead of a Grid, and
 * then change the canvas' position rather than canvas' parent.
 * Or, in principle, since the VML elements are still there and
 * properly positioned and sized, it should be possible to reset
 * just these three incorrectly reset VML attributes somehow.
 * 
 * Submitted to the GWT incubator issue tracker as <a href=
 * "http://code.google.com/p/google-web-toolkit-incubator/issues/detail?id=293">
 * issue #293</a>.
 * 
 */
public class TestGChart55 extends Grid {
   final int RECTANGLE_SIZE = 100;
   final int CELL_SIZE = 2*RECTANGLE_SIZE;
   final String FILL_COLOR = "rgba(255,0,0,0.5)";
   final String STROKE_COLOR = "rgba(0,0,255,0.5)";
   final int LINE_WIDTH = 15;
   GWTCanvas canvasRect = new GWTCanvas();
   int iCell = 0;  // grid cell to next contain canvas rectangle
   String html;
   
   // Puts a single bordered, filled rectangle on the canvas
   void drawBorderedRectangle(GWTCanvas gwtCanvas) {      
      gwtCanvas.resize(RECTANGLE_SIZE+4*LINE_WIDTH,
                       RECTANGLE_SIZE+4*LINE_WIDTH);
      gwtCanvas.beginPath();
      gwtCanvas.setFillStyle(new Color(FILL_COLOR));
      gwtCanvas.setStrokeStyle(new Color(STROKE_COLOR));
      gwtCanvas.setLineWidth(LINE_WIDTH);
      gwtCanvas.moveTo(LINE_WIDTH+0.5, LINE_WIDTH+0.5);
      gwtCanvas.lineTo(RECTANGLE_SIZE+LINE_WIDTH+0.5, LINE_WIDTH+0.5);
      gwtCanvas.lineTo(RECTANGLE_SIZE+LINE_WIDTH+0.5,
                       RECTANGLE_SIZE+LINE_WIDTH+0.5);
      gwtCanvas.lineTo(LINE_WIDTH, RECTANGLE_SIZE+LINE_WIDTH+0.5);
      gwtCanvas.closePath();
      gwtCanvas.fill();
      gwtCanvas.stroke();
   }
   
   TestGChart55() {
      super(2,2);
      DOM.setStyleAttribute(getElement(), "backgroundColor", "#AFA");
      getCellFormatter().setWidth(0, 0, CELL_SIZE + "px");
      getCellFormatter().setWidth(0, 1, CELL_SIZE + "px");
      
      setWidget(1,0, new Button("Move Canvas", new ClickHandler() {
         public void onClick(ClickEvent event) {
            iCell = (iCell + 1) % 2;
            setWidget(0, iCell, canvasRect);
// These lines patch things up in IE only (basis for a submitted patch)
//            if (null == html)
//              html = canvasRect.getElement().getInnerHTML();
//            setHTML(0, iCell, html);
            
// Workaround: just redraw everything whenever DOM parent changes
//            drawBorderedRectangle(canvasRect);
         }
      }));
      drawBorderedRectangle(canvasRect);
      setWidget(0, iCell, canvasRect);
   }
}
