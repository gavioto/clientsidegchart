package com.googlecode.gchart.gcharttestapp.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.googlecode.gchart.client.GChart;

/* 
 * Tests the LINE SymbolType
 * 
 */
public class TestGChart25 extends GChart {

   double phase = 0;   // angular rotational position of "wheel"
   public int nSpokes; // # spokes in the "wheel" of triangles
                       // (assumed to be even in code below)  
   public double len;  // length of the spokes
   final Button rotate = new Button("Rotate");
   
   public void rotateWheel() {

     phase += 0.5*Math.PI/nSpokes; 
      
     for (int i=0; i < nSpokes/2; i++) {
        // rotate the "spokes of the wheel"
        // (point at 0,0 is unchanged and is at index 3*i)
        getCurve().getPoint(3*i+1).setX(
             len*Math.cos(2*i*2*Math.PI/nSpokes+phase));
        getCurve().getPoint(3*i+1).setY(
             len*Math.sin(2*i*2*Math.PI/nSpokes+phase));
        getCurve().getPoint(3*i+2).setX(
             len*Math.cos((2*i+1)*2*Math.PI/nSpokes+phase));
        getCurve().getPoint(3*i+2).setY(
             len*Math.sin((2*i+1)*2*Math.PI/nSpokes+phase));
     }
     update();
     
   }
      
   TestGChart25(int nSpokes, int thickness, double spacing,
                double len, int width, int height) {
 	  super(400,400);
     this.nSpokes = nSpokes;
     this.len = len;
//     setShowOffChartPoints(true);
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes("You should see "+nSpokes/2+
                       " equal pie-slice like triangles " +
"separated by the same number of missing slices.<br>" +
"Params: thicknesss="+thickness+" len= "+len+
" width= "+width+" height="+height + " spacing="+spacing+"<br>" +
"And a 45 degree fixed line with 10 closely spaced points at its end."); 

     getXAxis().setHasGridlines(true);
     getYAxis().setHasGridlines(true);

     getXAxis().setAxisMin(-1);
     getXAxis().setAxisMax(1);
     getYAxis().setAxisMin(-1);
     getYAxis().setAxisMax(1);
     
     rotate.addClickHandler(new ClickHandler() {
        public void onClick(ClickEvent event) {
           rotateWheel();
        }
     });
     getXAxis().setAxisLabel(rotate);
     addCurve();
     getCurve().addPoint(0,0);
     getCurve().getSymbol().setWidth(width);
     getCurve().getSymbol().setHeight(height);
     getCurve().getSymbol().setSymbolType(SymbolType.LINE);
     getCurve().getSymbol().setFillSpacing(spacing);
     getCurve().getSymbol().setFillThickness(thickness);
     for (int i=0; i < nSpokes; i+=2) {
        // draws the outline of a narrow, pie-slice-like region
        getCurve().addPoint(len*Math.cos(i*2*Math.PI/nSpokes+phase),
                            len*Math.sin(i*2*Math.PI/nSpokes+phase));
        getCurve().addPoint(
                      len*Math.cos((i+1)*2*Math.PI/nSpokes+phase),
                      len*Math.sin((i+1)*2*Math.PI/nSpokes+phase));
        getCurve().addPoint(0,0);
     }
     // Extra point exactly on top of last pt, or very close to
     // on top, to make sure nothing untoward (div 0, etc.)
     // happens. All points are essentially on top of each other,
     // so should do nothing visually.
        getCurve().addPoint(0,0);
        getCurve().addPoint(0.00001, 0);
        getCurve().addPoint(0,0);
        getCurve().addPoint(0,0.00001);
        getCurve().addPoint(0,0);
        getCurve().addPoint(0.00001,0.00001);
        // also try a small grid of fractional pixels
        for (int i = 0; i < 10; i++) 
          getCurve().addPoint(0.5+i/400.0,0.5+i/400.0);
   }
}
