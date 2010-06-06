package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.user.client.ui.HTML;
import com.googlecode.gchart.client.GChart;
/**
 * Various tests for new LINE and ANCHOR_* symbol types, tests of
 * the HTML-based heuristics for default axis, title, and
 * footnote thicknesses, and a test of the
 * setShowOffDecoratedChartGlyphs method.
 *
 * 
 */
public class TestGChart26 extends GChart {
   TestGChart26() {
     setChartSize(100, 100);
     addCurve();
     getCurve().getSymbol().setSymbolType(SymbolType.LINE);
     getCurve().getSymbol().setFillSpacing(100);
     getCurve().getSymbol().setFillThickness(10);
     getCurve().getSymbol().setWidth(3);
     getCurve().getSymbol().setHeight(3);
     for (int i = 0; i <= 10; i++) {
        getCurve().addPoint(i,10-i);
     }
     // add same points in reverse order (doubling the 10th)
     for (int i = 10; i >= 0; i--) {
        getCurve().addPoint(i,10-i);
     }

     addCurve();
     getCurve().setYAxis(Y2_AXIS);
     getCurve().getSymbol().setSymbolType(SymbolType.LINE);
     getCurve().getSymbol().setFillSpacing(10);
     getCurve().getSymbol().setFillThickness(10);
     getCurve().getSymbol().setWidth(3);
     getCurve().getSymbol().setHeight(3);

     for (int i = 0; i <= 10; i++) 
       getCurve().addPoint(i,i);

     String[] text =
          {"NW", "N", "NE", "W", "CENTER", "E", "SW", "S", "SE"};
     SymbolType[] symType = {
        SymbolType.ANCHOR_NORTHWEST,
        SymbolType.ANCHOR_NORTH,
        SymbolType.ANCHOR_NORTHEAST,
        SymbolType.ANCHOR_WEST,
        SymbolType.ANCHOR_CENTER,
        SymbolType.ANCHOR_EAST,
        SymbolType.ANCHOR_SOUTHWEST,
        SymbolType.ANCHOR_SOUTH,
        SymbolType.ANCHOR_SOUTHEAST};
        
     for (int i = 0; i < symType.length; i++) {
       addCurve();
       // use convention that +/-MAX_VALUE ==> min/max position
       getCurve().addPoint(-Double.MAX_VALUE,Double.MAX_VALUE); 
       getCurve().getSymbol().setSymbolType(symType[i]);
       getCurve().getPoint().setAnnotationText(""+text[i]);
       getCurve().getPoint().setAnnotationFontColor("blue");
       getCurve().getPoint().setAnnotationLocation(
          AnnotationLocation.CENTER);
     }
     
     setChartTitle("line1<br>line2");
     getXAxis().setTickCount(11);
     getXAxis().setTickLength(20);
     getXAxis().setAxisLabel("line0<br>line1<br>line2<br>line3<br>line4");
     setChartFootnotes("line0<br>line1<br>line2<br>line3<br>line4<br>line5<br>line6<br>line7<br>line8<br>line9<br>" +
"Check: <ol><li>Compass point labels<li>Square stair-step up/down lines<li>footnotes left-justified <li> vspace proportional to # of lines <li>hspace to char count <li>This line clipped--this line clipped--this line clipped--this line clipped--this line clipped.");
     setChartFootnotesLeftJustified(true);
     setClipToDecoratedChart(true);
     setClipToPlotArea(true);
     
     HTML h1 = new HTML();
     HTML h2 = new HTML();
     h1.setText("0");
     h2.setText("0123456789");
     getYAxis().setAxisLabel(h1);
     getYAxis().setTickLength(20);
     getYAxis().setTickCount(11);
     getY2Axis().setAxisLabel(h2);
     getY2Axis().setTickLength(20);
     getY2Axis().setTickCount(11);
     
  }
}
