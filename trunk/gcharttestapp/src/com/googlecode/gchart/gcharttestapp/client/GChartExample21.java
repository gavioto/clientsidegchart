package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.HoverUpdateable;

/**
 * 
 * In this example, whenever the user clicks on a point, a
 * hover widget that allows them to increase or decrease
 * the y value of that point appears below the chart.
 * <p>
 *
 * The chart uses <tt>setHoverTouchingEnabled(false)</tt> to
 * disable GChart's "auto-select-on-mouseover" feature. This
 * assures that, when the user clicks on a point, that point
 * remains selected, as required, when their mouse moves
 * below the chart to interact with the y-value-changing
 * hover widget.<p>
 *
 * In general, by disabling hover touching in this manner,
 * you can make a GChart act much like a single-selection
 * listbox, with points playing the role of list items.
 * <p>
 *
 * The screen shot shows what the chart looks like after the
 * user clicks on a center bar, and then clicks the
 * "Increment Y" button a few times.
 * 
 * 
 */
public class GChartExample21 extends GChart {

   // hover widget that changes y value of selected point
   class YChanger extends HorizontalPanel
         implements HoverUpdateable {
         final Button incrementY = new Button("Increment Y");
         final HTML coordinates = new HTML(""); // x,y of selected point
         final Button decrementY = new Button("Decrement Y");
         YChanger() {
            // y-changing, x,y coordinate displaying, widget
            incrementY.addClickHandler(new ClickHandler() {
               public void onClick(ClickEvent event) {
                  getTouchedPoint().setY(
                     getTouchedPoint().getY() + 1);
                  update();
               }
            });
            decrementY.addClickHandler(new ClickHandler() {
               public void onClick(ClickEvent event) {
                  getTouchedPoint().setY(
                     getTouchedPoint().getY() - 1);
                  update();
               }
            });
            add(incrementY);
            add(coordinates);
            add(decrementY);
         }
         // The 2 HoverUpdateable interface methods:
         public void hoverCleanup(Curve.Point hoveredAwayFrom) {}
         public void hoverUpdate(Curve.Point hoveredOver) {
            // update (x,y) display when they click new point
            coordinates.setHTML(hoveredOver.getHovertext());
         }
   }  
   
   GChartExample21() {
     setChartSize(300, 300);
     setBorderStyle("none");
     /*
      * So selection changing requires the user to click
      * (not just mouseover a new point). This allows the
      * selection to stay put while user moves to click the
      * y-changing buttons.
      * 
      */ 
     setHoverTouchingEnabled(false);
     addCurve();
     // make a y-changer pop up when they click a point
     getCurve().getSymbol().setHoverWidget(new YChanger());
     // Configure hover annotation so it appears below chart
     getCurve().getSymbol().setHoverAnnotationSymbolType(
        SymbolType.ANCHOR_SOUTH);
     getCurve().getSymbol().setHoverLocation(
        AnnotationLocation.SOUTH);
     getCurve().getSymbol().setHoverYShift(-30);
     // 3px, external point selection border
     getCurve().getSymbol().setHoverSelectionBorderWidth(-3);

     // configure curve as a baseline-based bar chart
     getCurve().getSymbol().setSymbolType(
        SymbolType.VBAR_BASELINE_EAST);
     getCurve().getSymbol().setModelWidth(1);
     getCurve().getSymbol().setBorderWidth(1);     
     getCurve().getSymbol().setBorderColor("black");     
     getCurve().getSymbol().setBackgroundColor("blue");
     // add a simple y = 2*x curve
     for (int iPoint = 0; iPoint < 10; iPoint++) 
        getCurve().addPoint(iPoint, 2*iPoint);
   }
}
