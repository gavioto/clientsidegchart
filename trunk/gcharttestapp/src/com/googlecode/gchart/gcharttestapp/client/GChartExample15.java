package com.googlecode.gchart.gcharttestapp.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.googlecode.gchart.client.GChart;

/** Sine curve with 4000 points on it.
 * <p>
 *
 * This test originally failed in FF3 until the
 * PartitionedAbsolutePanel was used as a drop-in
 * replacement for AbsolutePanel to render this chart.
 * <p>
 * 
 * See PartionedAbsolutePanel comments for further details.
 *
 */


public class GChartExample15 extends GChart {
   final int PERIOD = 125;
   final int N_PERIODS = 32;
   final int DELTA_TIME = 1;
   final int DELTA_PHASE = 10;
   
   public int phase = 0;
   
   void updateChart(int phase) {
      boolean firstTime = getCurve(0).getNPoints() == 0;      
      for (int i = 0; i < PERIOD*N_PERIODS; i+=DELTA_TIME) {
            double y = Math.sin((2*Math.PI*(i+phase))/PERIOD);
            if (firstTime)
               getCurve(0).addPoint(i, y);
            else
               getCurve(0).getPoint(i/DELTA_TIME).setY(y);
       }
      
   }

    GChartExample15() {
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
     getCurve().getSymbol().setSymbolType(SymbolType.VBAR_BASELINE_CENTER);
     getCurve().getSymbol().setBorderWidth(1);
     getCurve().getSymbol().setBorderColor("blue");
     getCurve().getSymbol().setBackgroundColor("blue");
     getCurve().getSymbol().setHeight(1);
     getCurve().getSymbol().setWidth(2);
     getCurve().getSymbol().setBrushSize(1, 2*getYChartSize());
     getCurve().getSymbol().setHoverYShift(-20);
     getCurve().getSymbol().setBrushHeight(2*getYChartSize());

     updateChart(phase);
   }
}
