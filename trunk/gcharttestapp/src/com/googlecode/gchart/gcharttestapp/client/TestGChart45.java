package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.widgetideas.graphics.client.Color;
import com.google.gwt.widgetideas.graphics.client.GWTCanvas;
import com.googlecode.gchart.client.GChart;
/**
 * Allows us to test the overhead cost of using a GWTCanvas
 * instead of an Image Widget (to help decide between
 * implementation alternatives that use more or fewer
 * canvas widgets).
 * <p>
 * 
 * The difference in memory use between withCanvas==true and
 * withCanvas==false, divided by the number
 * of points on the test curve, represents the additional
 * cost, per widget, of replacing one Image Widget with one
 * GWTCanvas Widget.
 * 
 */
public class TestGChart45 extends GChart {
   final int SIZE = 5;
   final Label updateTimeMsg = new Label();
   final AbsolutePanel ap = new AbsolutePanel();
   String[] modeDescription={"Control", "No annotations", "GWTCanvas annotations", "Image annotations", "plainCanvasTest"};	
   TestGChart45(int mode) {  
	 setChartTitle("Mode = " + modeDescription[mode]);
    setChartSize(150, 150);
    setChartFootnotes(updateTimeMsg);
    setChartFootnotesThickness(200);
    getXAxis().setTickCount(0);
    getYAxis().setTickCount(0);
    getY2Axis().setTickCount(0);
     addCurve();
     long t0 = System.currentTimeMillis();
     for (int i = 0; i <= 100; i+=50) 
        getCurve().addPoint(i,i);
     
     ap.setPixelSize(200, 200);
     getCurve().getPoint(1).setAnnotationWidget(ap,500,500);
     getCurve().getPoint(1).setAnnotationLocation(AnnotationLocation.CENTER);
     DOM.setStyleAttribute(
         ap.getElement(), "overflow", "visible");
     
     GWTCanvas canvas = null;
     
     if (4 == mode) {
        canvas = new GWTCanvas();
        canvas.resize(200, 200);
        canvas.setPixelSize(200,200);
        ap.add(canvas, 0, 0);
     }
     
     for (int i = 0; i < 100; i+=1) {
        for (int j = 0; j < 100; j+=5) {
           if (mode == 0)
              break;
           else if (mode == 1)
              ;
           else if (mode == 2) {
              GWTCanvas w = new GWTCanvas();
              w.resize(SIZE, SIZE);
              w.setFillStyle(new Color("blue"));
              w.fillRect(0, 0, SIZE, SIZE);
              ap.add(w,i, j);
           }
           else if (mode == 3) {
              Image w = new Image(GChart.DEFAULT_BLANK_IMAGE_URL_FULLPATH);
              w.setPixelSize(SIZE,SIZE);
              DOM.setStyleAttribute(w.getElement(), "backgroundColor",
                                    "red");
              ap.add(w,i, j);
           }
           else if (mode == 4) {
              canvas.setFillStyle(new Color("blue"));
              canvas.fillRect(j, i, SIZE+j/10, SIZE);
           }
        }
     }
     
     update();
     long t1 = System.currentTimeMillis();
     updateTimeMsg.setText((t1-t0)+"ms");
  }
}
