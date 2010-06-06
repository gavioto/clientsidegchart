package com.googlecode.gchart.gcharttestapp.client;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.googlecode.gchart.client.GChart;

/*
 * Test to invoke all (at least, I think I got them all) public methods
 * not invoked in any previous test charts at least once.  Also tests
 * that we can produce a chart with a reasonably large number of points
 * on it (100) with reasonable efficiency.
 * 
 * <p>
 * If this test displays a random looking chart, doesn't crash,
 * and finishes in a reasonable time frame, it passed.
 * 
 */

public class TestGChart08 extends GChart {
     private int iAction = 0;
     /* because roughly 2/5th of points get deleted, final chart
      will have a little over 100 points on it. */
     final int NPOINTS = 200;
     final int POINTS_PER_CURVE = 20;
     final int NCURVEACTIONS = 5;
     private int curveCount = 0;
     private int curveId = 0;
     
     private void require(boolean condition) {
       if (!condition)
         throw new IllegalStateException("TestGChart08 test failed.");
     }

     // does an operation on this chart's curve collection
     private void doCurveAction() {
       int iCurve = 0;
       curveId++;
       switch(iAction) { // one complete cycle adds a single curve
         case 0:
           addCurve();
           getCurve().setLegendLabel("" + curveId);
           getCurve().getSymbol().setHovertextTemplate("Curve:" + curveId);
           require(getCurve().onY2() == false);
           getCurve().setYAxis((curveCount % 2 == 0)?Y_AXIS:Y2_AXIS);
           require(getCurve().getLegendLabel().equals("" + curveId));
           require(getCurve().getSymbol().getHovertextTemplate().equals("Curve:"+curveId));
           require(getCurve().getNPoints() == 0);
           require(getCurve().isVisible() == true);
           getCurve().setVisible(false);
           require(getCurve().isVisible() == false);
           getCurve().setVisible(true);
           curveCount++;
           break;    
         case 1:
           addCurve(0);
           getCurve(0).setLegendLabel("" + curveId);
           getCurve(0).getSymbol().setHovertextTemplate("Curve:" + curveId);
           Symbol s = getCurve(0).getSymbol();
           getCurve(0).setYAxis((curveCount % 2 == 0)?Y_AXIS:Y2_AXIS);
           require(s.getBackgroundColor().equals(DEFAULT_SYMBOL_BACKGROUND_COLOR));
           s.setBorderColor("#AAF");
           require(s.getBorderColor().equals("#AAF"));
           require(s.getBorderStyle().equals(DEFAULT_SYMBOL_BORDER_STYLE));
           require(s.getBorderWidth() == DEFAULT_SYMBOL_BORDER_WIDTH);
           require(s.getHeight() == DEFAULT_SYMBOL_HEIGHT);
           require(Double.isNaN(s.getModelHeight()));
           require(Double.isNaN(s.getModelWidth()));
           require(s.getSymbolType() == DEFAULT_SYMBOL_TYPE);
           require(s.getWidth()==DEFAULT_SYMBOL_WIDTH);
           curveCount++;
           break;    
         case 2:
           
           iCurve = (int) (GChartTestApp.rnd()*getNCurves());
           addCurve(iCurve); 
           getCurve(iCurve).setLegendLabel("" + curveId);
           getCurve(iCurve).getSymbol().setHovertextTemplate("Curve:" + curveId);
           getCurve(iCurve).setYAxis((curveCount % 2 == 0)?Y_AXIS:Y2_AXIS);
           curveCount++;
           break;    
         case 3:
           if (getCurve(0).getNPoints() > 0)
             getCurve(0).removePoint((int)
               (GChartTestApp.rnd()*getCurve(0).getNPoints()));
           getCurve(0).clearPoints();
           removeCurve(0);
           curveCount--;
           break;    
         case 4:          
           iCurve = (int) (GChartTestApp.rnd()*getNCurves());
           removeCurve(iCurve); 
           curveCount--;
           break;    
       }
       iAction = (iAction+1) % NCURVEACTIONS;
     }

     
   TestGChart08() {
     HTML html = new HTML(GChartTestApp.getTitle(this));
     setChartTitle(html);
     
     // Invoke various trivial getters not used elsewhere

     require(getChartTitle() == html);
     require(getChartFootnotes() == null);
     require(getClipToPlotArea() == false);
     require(getXChartSize() == DEFAULT_X_CHARTSIZE);     
     require(getYChartSize() == DEFAULT_Y_CHARTSIZE);     
     require(hasYAxis() == false); // false since no curves added yet.
     require(hasY2Axis() == false);
     require(isLegendVisible() == true);
     
     require(getXAxis().getAxisLabel() == null);
     require(getYAxis().getAxisLabel() == null);
     require(getY2Axis().getAxisLabel() == null);
     getXAxis().setAxisLabel(new Label("X"));
     getYAxis().setAxisLabel(new Label("Y"));
     getY2Axis().setAxisLabel(new Label("Y2"));
     require(((Label) (getXAxis().getAxisLabel())).getText().equals("X"));
     require(((Label) (getYAxis().getAxisLabel())).getText().equals("Y"));
     require(((Label) (getY2Axis().getAxisLabel())).getText().equals("Y2"));
     require(getXAxis().getHasGridlines() == false);
     require(getYAxis().getHasGridlines() == false);
     require(getY2Axis().getHasGridlines() == false);
     require(getXAxis().getTickCount() == DEFAULT_TICK_COUNT);
     require(getYAxis().getTickCount() == DEFAULT_TICK_COUNT);
     require(getY2Axis().getTickCount() == DEFAULT_TICK_COUNT);
     require(getXAxis().getTickLabelFontSize() == DEFAULT_TICK_LABEL_FONTSIZE);
     require(getYAxis().getTickLabelFontSize() == DEFAULT_TICK_LABEL_FONTSIZE);
     require(getY2Axis().getTickLabelFontSize() == DEFAULT_TICK_LABEL_FONTSIZE);
     require(getXAxis().getTickLabelFormat().equals(DEFAULT_TICK_LABEL_FORMAT));
     require(getYAxis().getTickLabelFormat().equals(DEFAULT_TICK_LABEL_FORMAT));
     require(getY2Axis().getTickLabelFormat().equals(DEFAULT_TICK_LABEL_FORMAT));
     
     getXAxis().clearTicks();
     getYAxis().clearTicks();
     getY2Axis().clearTicks();
     clearCurves();

     getXAxis().setHasGridlines(true);
     
     for (int iPass=0; iPass < 2; iPass++) {
       iAction = 0;
       curveId = 0;
       curveCount = 0;
       doCurveAction();
       for (int i=0; i < NPOINTS; i++) {
         int iCurve = (int) (GChartTestApp.rnd()*getNCurves());
         int iPoint = (int) (GChartTestApp.rnd()*getCurve(iCurve).getNPoints());
         getCurve(iCurve).addPoint(iPoint,1,2);
         require(getCurve(iCurve).getPoint(iPoint).getX() == 1);
         require(getCurve(iCurve).getPoint(iPoint).getY() == 2);
         getCurve(iCurve).getPoint(iPoint).setX(i);
         getCurve(iCurve).getPoint(iPoint).setY(i);
         require(getCurve(iCurve).getPoint(iPoint).getX() == i);
         require(getCurve(iCurve).getPoint(iPoint).getY() == i);
         GChart.Curve.Point p = getCurve(iCurve).getPoint(iPoint);
         require(p.getAnnotationText() == null);
         require(p.getAnnotationFontSize() == DEFAULT_ANNOTATION_FONTSIZE);
         require(p.getAnnotationLocation() == AnnotationLocation.NORTHWEST);
         
         // assures, on average, the specified points per curve
         if (POINTS_PER_CURVE*GChartTestApp.rnd() < NCURVEACTIONS)
            doCurveAction();
       }
       for (int i = 0; i <= NPOINTS; i+=10) {
         getXAxis().addTick(i,"" + i/10);
         getYAxis().addTick(i,"" + i/10);
         getY2Axis().addTick(i,"" + i/10);
       }

       // points are randomly added/deleted, so inequality is needed
       require(getXAxis().getDataMin() >= 0);
       require(getYAxis().getDataMin() >= 0);
       require(getY2Axis().getDataMin() >= 0);
       require(getXAxis().getDataMax() < NPOINTS);
       require(getYAxis().getDataMax() < NPOINTS);
       require(getY2Axis().getDataMax() < NPOINTS);

       // these include tick positions, and thus equality holds
       require(getXAxis().getAxisMin() == 0);    
       require(getYAxis().getAxisMin() == 0);
       require(getY2Axis().getAxisMin() == 0);
       require(getXAxis().getAxisMax() == NPOINTS);
       require(getYAxis().getAxisMax() == NPOINTS);
       require(getY2Axis().getAxisMax() == NPOINTS);

       
       if (iPass == 0) {
         update();
         getXAxis().clearTicks();
         getYAxis().clearTicks();
         getY2Axis().clearTicks();
         clearCurves();
       }
     }    
     setChartFootnotes("Check: Random points/curves along y=x; nCurves="+getNCurves() +
                       "; Points on last curve=" + getCurve().getNPoints());
     setXChartSize(750);
     setYChartSize(400);
     getCurve().getSymbol().setBorderWidth(0);
     getCurve().getSymbol().setBackgroundColor("red");
     getCurve().getSymbol().setSymbolType(SymbolType.VBAR_SOUTH);
     getCurve().getSymbol().setWidth(2);
     update();
   }
}
