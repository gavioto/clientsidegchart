package com.googlecode.gchart.gcharttestapp.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.googlecode.gchart.client.GChart;

/** Random curve with lots of points on it, to test the better
 * line-filling of v2.11
 * <p>
 *
 * Prior to GChart 2.11, line-filling created a separate image
 * for each dot, even when those images formed horizontal or
 * vertical blocks. As of 2.11, when such blocks can be merged,
 * they are, which is far more efficient for line charts that
 * contain, for example, many vertical and horizontal (or nearly
 * vertical or horizontal) connecting lines as in this example.
 * 
 * <p>
 *
 * It can be shown that, with this enhancement, the upper bound
 * on the number of elements required to render a continuous
 * line curve whose x-values increase monotonically is
 * approximately the number of pixels that that x-range spans
 * across the chart. Previously, that upper bound was closer
 * to the total number of pixels in the entire x-y range spanned
 * by the curve.
 *
 */


public class GChartExample15a extends GChart {
   final int PERIOD = 125;
   final int N_PERIODS = 4;
   final int DELTA_TIME = 10;
   final int DELTA_PHASE = 10;
   
   public int phase = 0;

   private double squareWave(double x) {
      if (x < 0) return squareWave(-x);
      if ((x % 1.0) <= 0.5)
         return -1;
      else
         return 1;
   }
   
   void updateChart(int phase) {
      boolean firstTime = getCurve(0).getNPoints() == 0;      
      for (int i = 0; i < PERIOD*N_PERIODS; i+=DELTA_TIME) {
//            double y = Math.sin((2*Math.PI*(i+phase))/PERIOD);
            double y = squareWave((0.0+i+phase)/PERIOD);
//            double y = 1 - 2*Math.random();   
            if (firstTime)
               getCurve(0).addPoint(i, y);
            else
               getCurve(0).getPoint(i/DELTA_TIME).setY(y);
       }
      
   }

    GChartExample15a() {
      super();

      Button left = new Button("<big><big>&lt;</big></big>");
      left.addClickHandler(new ClickHandler() {
         public void onClick(ClickEvent event) {
            phase -= DELTA_PHASE;
            updateChart(phase);
            update();
         }
      });
      Button right = new Button("<big><big>&gt;</big></big>");
      right.addClickHandler(new ClickHandler() {
         public void onClick(ClickEvent event) {
            phase += DELTA_PHASE;
            updateChart(phase);
            update();
         }
      });
      FlowPanel p = new FlowPanel();
      p.add(left);
      p.add(right);
      setChartFootnotes(p);
      
      this.setChartSize(2*PERIOD*N_PERIODS,100);
      setChartTitle("<big><i>Sine vs Time</i></big>");
      setPadding("2px");
     
      getXAxis().setAxisLabel("<small><i>Time (seconds)</i></small>");
      getXAxis().setHasGridlines(true);
      getXAxis().setTickCount(6);
      getXAxis().setTickLabelFormat("#.##");
      getXAxis().setAxisMin(0);
      getXAxis().setAxisMax(PERIOD*N_PERIODS);
          
      getYAxis().setHasGridlines(true);
      getYAxis().setTickCount(5);
      getYAxis().setAxisMin(-1);
      getYAxis().setAxisMax(1);
      getYAxis().setTickLabelThickness(10);
     
      addCurve();
      getCurve().getSymbol().setSymbolType(SymbolType.LINE);
      getCurve().getSymbol().setBorderWidth(0);
      getCurve().getSymbol().setBorderColor("blue");
      getCurve().getSymbol().setBackgroundColor("red");
      getCurve().getSymbol().setFillSpacing(1);
      getCurve().getSymbol().setFillThickness(1);
      getCurve().getSymbol().setHeight(5);
      getCurve().getSymbol().setWidth(5);

      updateChart(phase);
   }
}
