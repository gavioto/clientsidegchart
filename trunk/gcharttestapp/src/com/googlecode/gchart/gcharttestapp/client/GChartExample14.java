package com.googlecode.gchart.gcharttestapp.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.DeferredCommand;
import com.google.gwt.user.client.ui.Button;
import com.googlecode.gchart.client.GChart;

/** Sine curve with lots of points on it, to illustrate the
 * incremental update technique.
 * <p>
 *
 * Prior to GChart 2.1, this approach would not have worked;
 * GChart 2.1 allows curves that have not changed since the
 * last update (as long as they occur before the first curve
 * that HAS changed) to be skipped over in re-updates. So you
 * don't lose much time by updating incrementally in this
 * manner, and you gain much better user feedback during
 * that all-important first page display.
 * <p>
 *
 * Whenever possible, try to avoid very numbers of HTML
 * elements in your charts (swapping in data as needed in
 * response to user requests instead). That way, this kind
 * of delay can be avoided entirely, and you won't have to
 * implement an incrementally updating chart at all.
 *
 *
 */


public class GChartExample14 extends GChart {
   final int PERIOD = 100;
   final int N_PERIODS = 5;
   final int DELTA_TIME = 1;
   final int DELTA_PHASE = 8;
   public int phase = 0;
   boolean firstTime = true;
   
   public class IncrementalUpdate implements Command {
      private int iCurve;
      private GChart gchart;
      private int phaseShift;
      private int n;
      IncrementalUpdate(GChart gchart, int iCurve, int phaseShift, int n) {
         this.gchart = gchart;
         this.iCurve = iCurve;
         this.phaseShift = phaseShift;
         this.n = n;
      }

      public void execute() {
       for (int iC = iCurve; iC < iCurve+n; iC++) {
          if (gchart.getNCurves() <= iCurve) {
//            gchart.getCurve(0).getPoint(0).setY(
//                gchart.getCurve(0).getPoint(0).getY());
            gchart.addCurve();
            // copy symbol properties from curve 0, except, null
            // legend label (so only one curve row on legend)
            getCurve().getSymbol().setSymbolType(
               getCurve(0).getSymbol().getSymbolType());
            getCurve().getSymbol().setBorderWidth(
               getCurve(0).getSymbol().getBorderWidth());
            getCurve().getSymbol().setBackgroundColor(
               getCurve(0).getSymbol().getBackgroundColor());
            getCurve().getSymbol().setFillSpacing(
                  getCurve(0).getSymbol().getFillSpacing());
            getCurve().getSymbol().setFillThickness(
                  getCurve(0).getSymbol().getFillThickness());
            getCurve().getSymbol().setHeight(
                  getCurve(0).getSymbol().getHeight());
            getCurve().getSymbol().setWidth(
                  getCurve(0).getSymbol().getWidth());
         }
         for (int i = 0; i < PERIOD; i+=DELTA_TIME) {
            double y = Math.sin((2*Math.PI*(iC*PERIOD+i+phaseShift))/PERIOD);
            if (gchart.getCurve(iC).getNPoints()*DELTA_TIME <= i)
               gchart.getCurve(iC).addPoint(iC*PERIOD+i+phaseShift, y);
            else
               gchart.getCurve(iC).getPoint(i/DELTA_TIME).setY(y);
         }
       }
         gchart.update();
       }
      
   }

    GChartExample14() {
      super();

      Button btn = new Button("Update");
      btn.addClickHandler(new ClickHandler() {
         public void onClick(ClickEvent event) {
           phase += DELTA_PHASE;
           for (int i = 0; i < N_PERIODS; i++)
             DeferredCommand.addCommand(new IncrementalUpdate(GChartExample14.this,i, phase, 1)); 
         }
      });
      setChartFootnotes(btn);
      
     this.setChartSize(1000,100);
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
     getCurve().getSymbol().setBorderWidth(0);
     getCurve().getSymbol().setBackgroundColor("blue");
     getCurve().getSymbol().setFillSpacing(Double.NaN);
     getCurve().getSymbol().setFillThickness(0);
     getCurve().getSymbol().setHeight(1);
     getCurve().getSymbol().setWidth(1);

     for (int i = 0; i < N_PERIODS; i++) {
          DeferredCommand.addCommand(new IncrementalUpdate(this,i, 0, 1));
     }
//     for (int phaseShift=0; phaseShift < N_PERIODS*PERIOD; phaseShift+=DELTA_PHASE)
//         DeferredCommand.addCommand(new IncrementalUpdate(this,0, phaseShift, N_PERIODS)); 
   }
}
