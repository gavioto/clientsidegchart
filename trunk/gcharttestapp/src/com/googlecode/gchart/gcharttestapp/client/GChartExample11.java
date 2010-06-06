package com.googlecode.gchart.gcharttestapp.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.DeferredCommand;
import com.google.gwt.user.client.ui.Button;
import com.googlecode.gchart.client.GChart;

/** Combination chart containing pie, line, and bar-based curves */
public class GChartExample11 extends GChart {
  final double INITIAL_PRICE = 100;
  final double MAX_MONTHLY_RELATIVE_CHANGE = 0.2;
  final int N_FORCASTED_MONTHS = 13;
  double[] prices = new double[N_FORCASTED_MONTHS];
  double minPrice = INITIAL_PRICE;
  double maxPrice = INITIAL_PRICE;
  final static int REPS = 1000;
  boolean firstTime = true;
// updates the chart with results of a new oil price simulation  
  private void updateChart() {
    minPrice = INITIAL_PRICE;
    maxPrice = INITIAL_PRICE;
    prices[0] = INITIAL_PRICE;
    for (int i=1; i < N_FORCASTED_MONTHS; i++) {
       prices[i] = prices[i-1] *
         (1 + MAX_MONTHLY_RELATIVE_CHANGE*(2*GChartTestApp.rnd()-1));
       minPrice = Math.min(minPrice, prices[i]);
       maxPrice = Math.max(maxPrice, prices[i]);
    }

    // update pie slice sizes to reflect new min and max
    getCurve(0).getSymbol().setPieSliceSize(
    		minPrice/(minPrice+maxPrice));
    getCurve(0).getSymbol().setHovertextTemplate(
      GChart.formatAsHovertext("Minimum price (per barrel): "+
      getYAxis().formatAsTickLabel(minPrice)));
    getCurve(1).getSymbol().setPieSliceSize(
    		maxPrice/(minPrice+maxPrice));
    getCurve(1).getSymbol().setHovertextTemplate(
      GChart.formatAsHovertext( 
      "Maximum price (per barrel): " +
      getYAxis().formatAsTickLabel(maxPrice)));


// update backward-price-difference and price curves    
    getCurve(2).clearPoints();
    getCurve(3).clearPoints();
    for (int i = 0; i < N_FORCASTED_MONTHS; i++) {
      getCurve(2).addPoint(i, (i == 0)?0:(prices[i]-prices[i-1]));
      getCurve(3).addPoint(i,prices[i]);
    
      if (prices[i]!=minPrice && prices[i]!=maxPrice) {
        //no min/max;
        getCurve(3).getPoint().setAnnotationText(null); //no label
      }
      else {
        // label point to indicate it's at a min or max price
        getCurve(3).getPoint().setAnnotationFontSize(10);
        getCurve(3).getPoint().setAnnotationFontWeight("bold");
        if (prices[i]==minPrice) {
          getCurve(3).getPoint().setAnnotationLocation(
            AnnotationLocation.SOUTH);
          getCurve(3).getPoint().setAnnotationText("min");
          getCurve(3).getPoint().setAnnotationFontColor("blue");
        }
        else {
          getCurve(3).getPoint().setAnnotationLocation(
            AnnotationLocation.NORTH);
      	  getCurve(3).getPoint().setAnnotationText("max");
      	  getCurve(3).getPoint().setAnnotationFontColor("blue");
        }
      }
    }
    if (firstTime)
       firstTime = false;
    else
       update();  
  }

  
  GChartExample11(int id, int borderWidth, boolean forMemory) {
// id==3 x,y,y2 dynamic; id==2 y,y2; id==1 y2; id==0 fixed axes
    // misc chart configuration
	 setOptimizeForMemory(forMemory);
     setChartSize(300, 300);
     setPlotAreaBackgroundColor("#CCC");
     setLegendBackgroundColor(getPlotAreaBackgroundColor());
//     setShowOffChartPoints(true);
     setGridColor("white");
// convenience methods; these properties could also have been defined
// via CSS. See the javadoc comment for GChart.USE_CSS for more info.
     setBackgroundColor("#DDF");
     setBorderColor("black");
     setBorderWidth("1px");
     setBorderStyle("outset");
     setFontFamily("Veranda, Arial, sans-serif");
     setPadding("5px");
// title and footnotes (w. update button)
     setChartTitle(
"<b><big><big>Estimated Future Oil Prices " +
"</big></big><small><small><br> " +
"<i>All results are pseudo-random. " + 
"Randomize fully before you invest." + 
"</i><br>&nbsp;id =" + id + " reps="+REPS+" optimizeForMemory=" + forMemory + "</small></small></b>");
     final Button updateButton = new Button(
"<b><big><big><big>Update Estimates</big></big></big></b>");
     updateButton.setTitle(
"Click for new totally unbiased, totally random, estimates.");
     updateButton.addClickHandler(new ClickHandler() {
        public void onClick(ClickEvent event) {
           for (int i=0; i < REPS; i++) {
           DeferredCommand.addCommand(new Command() {
              public void execute() {
                   updateChart();
              }
           });
           }
          updateButton.setFocus(true);
        }
     });
     setChartFootnotes(updateButton);

// x-axis config    
     getXAxis().setAxisLabel(
"<small>time (months from now)</small><br>&nbsp;");
     getXAxis().setTickCount(13);
     getXAxis().setTicksPerLabel(2);
     getXAxis().setAxisMin(0);
     getXAxis().setAxisMax(N_FORCASTED_MONTHS-1);
     if (id == 1)
       getXAxis().setAxisMin(Double.NaN);
        
     getXAxis().setHasGridlines(true);
//     getXAxis().setTickLabelThickness(10);
// y-axis config
     getYAxis().setAxisLabel(
"<center><small>p<br>r<br>i<br>c<br>e</small></center>");
     getYAxis().getAxisLabel().setTitle("price");
     getYAxis().setAxisMin(0);
     getYAxis().setAxisMax(200);
     if (id == 2)
       getYAxis().setAxisMin(Double.NaN);
     getYAxis().setTickCount(5);
     getYAxis().setTickLabelFormat("$#.##");
     getYAxis().setHasGridlines(true);
//     getYAxis().setTickLabelThickness(50);
     // y2-axis config
     
/* Because the tick labels contain the narrower-than-average
 * characters "($50)", GChart's heuristic leaves too much space
 * for the axis labels. So we set the space to 0, and then use
 * the old HTML trick of &nbsp; in the axis label to add the
 * space we need explicitly (could also have used CSS to pad
 * the widget representing the axis label appropriately).
 */
     getY2Axis().setTickLabelThickness(0);
     getY2Axis().setAxisLabel(
"<center><small>&Delta;<br>p<br>r<br>i<br>c<br>" + 
"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
"e&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
"</small></center>");
     getY2Axis().setAxisMin(-50);
     getY2Axis().setAxisMax(50);
     if (id == 3) {
        getY2Axis().setAxisMin(Double.NaN);
        getY2Axis().setAxisMax(Double.NaN);
     }
     getY2Axis().setTickCount(5);
     getY2Axis().setTickLabelFormat("$#.##;($#.##)");
//     getY2Axis().setTickLabelThickness(50);

// pie shows the relative size of smallest and largest prices

     final double X_AT_PIE_CENTER = 15.5; // in chart-model
     final double Y_AT_PIE_CENTER = 175;  // coordinates
     final int PIE_DIAMETER = 80;         // in pixels
     addCurve(); // slice representing largest price over simulation
     getCurve().getSymbol().setSymbolType(
       SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setFillSpacing(3);
     getCurve().getSymbol().setFillThickness(3);
     getCurve().getSymbol().setBorderWidth(1);
     getCurve().getSymbol().setBorderColor("#E78");
     getCurve().getSymbol().setBackgroundColor("#F00");
     getCurve().getSymbol().setHeight(PIE_DIAMETER); 
     getCurve().getSymbol().setWidth(0);
     getCurve().addPoint(X_AT_PIE_CENTER,Y_AT_PIE_CENTER); 
     getCurve().getPoint().setAnnotationText("min");
     getCurve().getPoint().setAnnotationLocation(
       AnnotationLocation.ON_PIE_ARC);
     getCurve().getPoint().setAnnotationFontSize(12);
     getCurve().getPoint().setAnnotationFontWeight("bold");
     getCurve().getPoint().setAnnotationFontColor("blue");
     
     addCurve(); // slice representing smallest price over simulation
     getCurve().getSymbol().setSymbolType(
       SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setFillSpacing(3);
     getCurve().getSymbol().setFillThickness(3);
     getCurve().getSymbol().setBorderWidth(1);
     getCurve().getSymbol().setBorderColor("#7E8");
     getCurve().getSymbol().setBackgroundColor("#0F0");
     getCurve().getSymbol().setHeight(PIE_DIAMETER); 
     getCurve().getSymbol().setWidth(0);
     getCurve().addPoint(X_AT_PIE_CENTER,Y_AT_PIE_CENTER); 
     getCurve().getPoint().setAnnotationText("max");
     getCurve().getPoint().setAnnotationLocation(
       AnnotationLocation.ON_PIE_ARC);
     getCurve().getPoint().setAnnotationFontSize(12);
     getCurve().getPoint().setAnnotationFontWeight("bold");
     getCurve().getPoint().setAnnotationFontColor("blue");

     
     // baseline bars (on y2) represent monthly change in prices
     addCurve();
     getCurve().getSymbol().setSymbolType(
       SymbolType.VBAR_BASELINE_CENTER);
     getCurve().getSymbol().setBaseline(0);
     getCurve().getSymbol().setBorderWidth(borderWidth);
     getCurve().getSymbol().setBorderColor("black");
     getCurve().getSymbol().setBorderStyle("solid");    
     getCurve().getSymbol().setBackgroundColor("red");
     getCurve().setLegendLabel("&Delta;price");
     getCurve().getSymbol().setWidth(11);
     getCurve().getSymbol().setHovertextTemplate(
      GChart.formatAsHovertext("Month=${x}; Price change=${y}"));
     getCurve().setYAxis(Y2_AXIS);

     // line curve (on y) represents actual price
     addCurve();
     getCurve().setLegendLabel("price");
     getCurve().getSymbol().setFillSpacing(10);
     getCurve().getSymbol().setFillThickness(2);
     getCurve().getSymbol().setBackgroundColor("blue");
     getCurve().getSymbol().setBorderColor("blue");

     // line to extenuate the baseline of the baseline-based bars
     addCurve();
     getCurve().setYAxis(Y2_AXIS);
     getCurve().getSymbol().setSymbolType(SymbolType.YGRIDLINE);
     getCurve().getSymbol().setBackgroundColor("black");
     getCurve().getSymbol().setHeight(1);
     getCurve().getSymbol().setBorderWidth(0);
     getCurve().addPoint(0,0);     
     
     updateChart();
     
//     getYAxis().setAxisLabel((Widget) null);
//     update();
// button must be rendered in browser before it can accept focus
//     DeferredCommand.addCommand(new Command() {
//       public void execute() {
//          updateButton.setFocus(true);
//       }
//     });

   }

}
