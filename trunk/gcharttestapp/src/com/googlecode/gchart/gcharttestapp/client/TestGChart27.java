package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Image;
import com.googlecode.gchart.client.GChart;
/**
 * Tests the new decoration layout algorithm, and related
 * new "thickness" methods.
 * 
 */
public class TestGChart27 extends GChart {
   private Image getBox(int boxSize, String color) {
      Image result = new Image("clear.cache.gif");
      DOM.setStyleAttribute(result.getElement(),
                            "backgroundColor", color);
      result.setPixelSize(boxSize, boxSize);
      return result;
   }
                               
   TestGChart27(boolean includeAxisLabel) {
     final int boxSize = 100;
     setChartSize(boxSize, boxSize);
     if (includeAxisLabel) getYAxis().setAxisLabel(getBox(boxSize, "red"));
     getYAxis().setAxisLabelThickness(boxSize);
     getYAxis().setAxisVisible(false);
     if (boxSize != getYAxis().getAxisLabelThickness())
        throw new IllegalStateException("boxSize != getYAxis().getAxisLabelThickness()");
     getYAxis().setTickCount(0);
     getYAxis().setTickLength(0);
     if (includeAxisLabel) getY2Axis().setAxisLabel(getBox(boxSize, "green"));
     getY2Axis().setAxisLabelThickness(boxSize);
// XXX: things don't quite align right, but I'll wait till I can fix the
// main 'centered pixels ==> edge-positioned pixels' issue. That can
// be a little disruptive to some applications and needs to be done
// carefully. SO, just declare 1px off as the new standard, for now.
     getY2Axis().setTickLabelPadding(1);
     if (boxSize != getY2Axis().getAxisLabelThickness())
        throw new IllegalStateException("boxSize != getY2Axis().getAxisLabelThickness()");
     getY2Axis().setTickCount(0);
     getY2Axis().setTickLength(0);
     setChartTitle(getBox(boxSize, "blue"));
     setChartTitleThickness(boxSize);
     if (boxSize != getChartTitleThickness())
        throw new IllegalStateException("boxSize != getChartTitleThickness()");
     if (includeAxisLabel) getXAxis().setAxisLabel(getBox(boxSize, "gray"));
     getXAxis().setAxisLabelThickness(boxSize);
     getXAxis().setTickLabelPadding(1); // see previous comment
     if (boxSize != getXAxis().getAxisLabelThickness())
        throw new IllegalStateException("boxSize != getXAxis().getAxisLabelThickness()");
     getXAxis().setTickCount(0);
     getXAxis().setTickLength(0);
     addCurve();
     getCurve().addPoint(0,0);
     getCurve().getSymbol().setSymbolType(SymbolType.NONE);     

     if (includeAxisLabel)
             setChartFootnotes("Check: <br><ol><li>100px red, blue, green, gray boxes... <li>left, above, right, below white 100px box");
     else
             setChartFootnotes("Check: same as prev. chart except all but the blue box are missing/");
             
     setChartFootnotesThickness(boxSize);
     if (boxSize != getChartFootnotesThickness())
        throw new IllegalStateException("boxSize != getChartFootnotesThickness()");
     setChartFootnotesLeftJustified(true);

     setLegendThickness(boxSize);
     // since no legend, thickness is ignored and sized 0.
     if (0 != getLegendThickness())
        throw new IllegalStateException("boxSize != getLegendThickness()");
     
   }
}
