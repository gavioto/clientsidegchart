package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.widgetideas.graphics.client.Color;
import com.google.gwt.widgetideas.graphics.client.GWTCanvas;
/**
 * 
 * Reproduces a bug in GWTCanvas that prevents you from using
 * a GWTCanvas within a Grid cell unless that table cell
 * is left-aligned (ALIGN_LEFT).
 * <p>
 * 
 * To assure that GChart's can be included in annotations without
 * bumping up against this GWTCanvas bug, GChart explicitly adds
 * left alignment to the canvas widget, short-circuiting the
 * inherited alignment that triggers the bug, so that those using
 * GWTCanvas in GChart can avoid hitting this one.
 * <p>
 * 
 * Submitted to the GWT incubator issue tracker as <a href=
 * "http://code.google.com/p/google-web-toolkit-incubator/issues/detail?id=275">
 * issue #275</a>.
 * 
 */
public class TestGChart46 extends Grid {
   final int CANVAS_SIZE = 100;
   final int CELL_SIZE = 4*CANVAS_SIZE;

   /* To reproduce, add an instance of this class to root panel.
    * In FF, you get the red, green, blue squares forming the
    * expected top-to-bottom, left-to-right,pattern. In IE7, only the
    * red square is where it should be, the green is shifted
    * too far right (and thus half clipped off) and the
    * blue is shifted right off the entire canvas, and thus
    * not visible at all.
    *
    * See commented out line below for a workaround.
    * 
    */ 


   
   // fixed size canvas entirely occupied by a solid fill rectangle
   GWTCanvas makeCanvasRectangle(String color) {
    GWTCanvas gwtCanvas = new GWTCanvas();
    gwtCanvas.resize(CANVAS_SIZE, CANVAS_SIZE);
    gwtCanvas.setFillStyle(new Color(color));
    gwtCanvas.fillRect(0, 0, CANVAS_SIZE, CANVAS_SIZE);
// Workaround: if you uncomment the next line, IE7 works as it should  
//    DOM.setElementAttribute(gwtCanvas.getElement(), "align", "left");
    return gwtCanvas;
   }
   TestGChart46() {
      super(3,1);
      
      // the left aligned cell
      int iRow = 0;
      setWidget(iRow, 0, makeCanvasRectangle("red"));
      getCellFormatter().setAlignment(iRow, 0,
         HasHorizontalAlignment.ALIGN_LEFT,
         HasVerticalAlignment.ALIGN_MIDDLE);
      getCellFormatter().setWidth(iRow, 0, CELL_SIZE + "px");
      
     // the center aligned cell
      iRow++;
      setWidget(iRow, 0, makeCanvasRectangle("green"));
      getCellFormatter().setAlignment(iRow, 0,
         HasHorizontalAlignment.ALIGN_CENTER,
         HasVerticalAlignment.ALIGN_MIDDLE);
      getCellFormatter().setWidth(iRow, 0,CELL_SIZE + "px");

     // the right aligned cell
      iRow++;
      setWidget(iRow, 0, makeCanvasRectangle("blue"));
      getCellFormatter().setAlignment(iRow, 0,
         HasHorizontalAlignment.ALIGN_RIGHT,
         HasVerticalAlignment.ALIGN_MIDDLE);
      getCellFormatter().setWidth(iRow, 0, CELL_SIZE + "px");
   }
  }

