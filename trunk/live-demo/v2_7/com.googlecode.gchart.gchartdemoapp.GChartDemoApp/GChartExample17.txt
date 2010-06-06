/**
 ** This example displays a sine and cosine curve using the LINE
 ** symbol type. For the fastest, clearest connecting lines, an
 ** external canvas library must be bolted on to GChart. The code
 ** to do this for the live demo is available via a link at the
 ** bottom of the live demo. Or, see the <tt>setCanvasFactory</tt>
 ** method's javadocs for full details.  <p>
 **
 ** The example also uses a <tt>HoverParameterInterpreter</tt> to
 ** define trig parameters named sin, cos, and tan, which
 ** are then embedded in the HTML hovertext template to
 ** produce a popup that displays the values of these functions
 ** for the hover-selected point.
 ** <p>
 ** 
 **
 **/

package com.googlecode.gchart.gchartdemoapp.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.HoverParameterInterpreter;

public class GChartExample17 extends GChart {
   static final int PERIOD = 200;    // of one complete sine wave cycle
   static final double FACTOR = 2*Math.PI/PERIOD;
   static final int N_PERIODS = 5;   // number of complete sine waves shown
   static final int DELTA_TIME = 20; // time between line-connected points
   int oldDt = DELTA_TIME;
   static final int DELTA_PHASE = 10;// time phase shift per user click
   // use large positive phase so we can safely ignore phase < 0.
   int[] phase = {Integer.MAX_VALUE/2, Integer.MAX_VALUE/2};
   
   // size of the plot area, in pixels
   final int WIDTH = 1000; 
   final int HEIGHT = 50;                            
   final String SOURCE_CODE_LINK =
"<a href='GChartExample17.txt' target='_blank'>Source code</a>";
   final Label updateTimeMsg = new Label(); 
    final CheckBox renderingMode = new CheckBox("GWTCanvas&nbsp;&nbsp;&nbsp;&nbsp;", true);
    final CheckBox sinScrolling = new CheckBox("Scroll blue&nbsp;&nbsp;&nbsp;&nbsp;",true);
    final CheckBox cosScrolling = new CheckBox("Scroll red&nbsp;&nbsp;&nbsp;&nbsp;",true);
    final CheckBox bigPointSet = new CheckBox("2,000&nbsp;pts&nbsp;&nbsp;&nbsp;&nbsp;", true);
   
   // supports use of ${sin}, ${cos}, and ${tan} in hovertext templates.
   class TrigHoverParameterInterpreter implements
         HoverParameterInterpreter {
       public String getHoverParameter(String paramName,
                                       GChart.Curve.Point hoveredOver) {
          String result = null;
          double x = hoveredOver.getX();
          if ("sin".equals(paramName))
             result = getY2Axis().formatAsTickLabel(Math.sin(FACTOR*(x+phase[0])));
          else if ("cos".equals(paramName))
             result = getY2Axis().formatAsTickLabel(Math.cos(FACTOR*(x+phase[1])));
          else if ("tan".equals(paramName)) {
             // tangent is computed at average of the two phase angles 
             double sin = Math.sin(FACTOR*(x+(phase[0]+phase[1])/2));
             if (sin == 1)
                result = "+Inf ";
             else if (sin == -1)
                result = "-Inf ";
             else
                result = getY2Axis().formatAsTickLabel(
                   Math.tan(FACTOR*(x+(phase[0]+phase[1])/2)));
          }
          return result;
       }
   }
       
 
   // Returns Grid with code link, update button, & timing message
   // shown at the bottom of Client-side GChart live-demo charts.
   private Grid getDemoFootnotes(String sourceCodeLink,
                                 Widget updateWidget,
                                 Label updateTimeMsg) {
         HTML sourceCode = new HTML(sourceCodeLink);
         Widget[] w = {sourceCode, updateWidget, updateTimeMsg};
         String[] wWidth = {"20%", "60%", "20%"};
         Grid result = new Grid(1, w.length);
         for (int i = 0; i < w.length; i++) {
           result.setWidget(0, i, w[i]);
           result.getCellFormatter().setWidth(0,i, wWidth[i]);
           result.getCellFormatter().setHorizontalAlignment(0,i, 
              HasHorizontalAlignment.ALIGN_CENTER);
         }
         result.setWidth(getXChartSizeDecorated()+"px");
         return result;
   }
   // adds or updates sin and cos curves on the chart
   void updateCurves(int[] phase) {
      boolean scrollSin = sinScrolling.getValue();
      boolean scrollCos = cosScrolling.getValue();
      int dt = bigPointSet.getValue() ? 1 : DELTA_TIME;
      if (dt != oldDt) {
         getCurve(0).clearPoints();
         getCurve(1).clearPoints();
         oldDt = dt;
      }
      int nExisting = getCurve(0).getNPoints();
      for (int i = 0; i*dt <= PERIOD*N_PERIODS; i++) {
         double ySin = Math.sin(FACTOR*(i*dt+phase[0]));
         double yCos = Math.cos(FACTOR*(i*dt+phase[1]));
         if (i < nExisting) {
// save time by not setting x (exploits regular x-spacing)
            if (scrollSin) getCurve(0).getPoint(i).setY(ySin);
            if (scrollCos) getCurve(1).getPoint(i).setY(yCos);
         }
         else {
            getCurve(0).addPoint(i*dt, ySin);
            getCurve(1).addPoint(i*dt, yCos);
         }
      }
   }

   GChartExample17() {
      long t0 = System.currentTimeMillis();
      setChartSize(WIDTH,HEIGHT);
      setPadding("5px 0px 0px 0px");
      setBorderStyle("none");
      setChartTitle("<i style='font-size: 12px'>Sine and Cosine</i>");
      setChartTitleThickness(30);
      setHoverParameterInterpreter(
         new TrigHoverParameterInterpreter());

      renderingMode.addClickHandler(new ClickHandler() {
         public void onClick(ClickEvent event) {
            long t0 = System.currentTimeMillis();
            if (renderingMode.getValue()) {
               getCurve(0).getSymbol().setFillSpacing(0);
               getCurve(1).getSymbol().setFillSpacing(0);
               setOptimizeForMemory(true);
            }
            else {
               getCurve(0).getSymbol().setFillSpacing(1);
               getCurve(1).getSymbol().setFillSpacing(1);
               setOptimizeForMemory(false);
            }
            update(); 
            long t1 = System.currentTimeMillis();
            updateTimeMsg.setText((t1-t0)+"ms");        
         }
      });
      renderingMode.setTitle("GWTCanvas (checked) or HTML (unchecked) rendering");
      renderingMode.setValue(true);
      sinScrolling.setValue(true);
      sinScrolling.setTitle("Enables scrolling of the blue sine curve");
      cosScrolling.setValue(true);
      cosScrolling.setTitle("Enables scrolling of the red cosine curve");
      bigPointSet.setValue(false);
      bigPointSet.setTitle("2,000 points (checked) or 100 points (unchecked)");
      bigPointSet.addClickHandler(new ClickHandler() {
         public void onClick(ClickEvent event) {
            long t0 = System.currentTimeMillis();
            updateCurves(phase);
            update(); 
            long t1 = System.currentTimeMillis();
            updateTimeMsg.setText((t1-t0)+"ms");        
         }
      });
        
      // add buttons for scrolling left or right
      final Button leftScrollerButton = new Button("<big>&lt;</big>");
      leftScrollerButton.setTitle("Scroll left");
      leftScrollerButton.addClickHandler(new ClickHandler() {
         public void onClick(ClickEvent event) {
            long t0 = System.currentTimeMillis();
            if (sinScrolling.getValue()) phase[0] -= DELTA_PHASE;
            if (cosScrolling.getValue()) phase[1] -= DELTA_PHASE;
            updateCurves(phase);
            update(); 
            long t1 = System.currentTimeMillis();
            updateTimeMsg.setText((t1-t0)+"ms");
            // No idea why, but only Chrome needs this gain focus
            leftScrollerButton.setFocus(true);
         }
      });

      final Button rightScrollerButton = new Button("<big>&gt;</big>");
      rightScrollerButton.setTitle("Scroll right");
      rightScrollerButton.addClickHandler(new ClickHandler() {
         public void onClick(ClickEvent event) {
            long t0 = System.currentTimeMillis();
            if (sinScrolling.getValue()) phase[0] += DELTA_PHASE;
            if (cosScrolling.getValue()) phase[1] += DELTA_PHASE;
            updateCurves(phase);
            update();
            long t1 = System.currentTimeMillis();
            updateTimeMsg.setText((t1-t0)+"ms");
            // needed only in Chrome to capture focus
            rightScrollerButton.setFocus(true);
         }
      });
      HorizontalPanel buttonPanel = new HorizontalPanel();
      buttonPanel.add(renderingMode);
      buttonPanel.add(bigPointSet);
      buttonPanel.add(leftScrollerButton);
      buttonPanel.add(rightScrollerButton);
      buttonPanel.add(new HTML("&nbsp;&nbsp;&nbsp;&nbsp;"));
      buttonPanel.add(sinScrolling);
      buttonPanel.add(cosScrolling);
      setChartFootnotes(getDemoFootnotes(
    	         SOURCE_CODE_LINK, buttonPanel, updateTimeMsg));

      
      // configure x-axis 
      getXAxis().setAxisMin(0);
      getXAxis().setAxisMax(PERIOD*N_PERIODS);
      getXAxis().setHasGridlines(true);
      getXAxis().setTickCount(2*N_PERIODS + 1); // half-period ticks
      getXAxis().setTicksPerGridline(2);        // full-period grid 
      getXAxis().setTickLabelFontSize(10);
      getXAxis().setAxisLabelThickness(20);

      // configure y-axis
      getYAxis().setAxisMin(-1);
      getYAxis().setAxisMax(1);
      getYAxis().setHasGridlines(true);
      getYAxis().setTickCount(5); // ticks at: -1, -0.5, 0, 0.5, 1
      getYAxis().setTicksPerLabel(2); // labels at: -1, 0, 1
      getYAxis().setTickLabelThickness(10);
      getYAxis().setTickLabelFontSize(10);
      getYAxis().setAxisLabelThickness(20);

      // There's no y2 axis, but it's handy to use it to format our
      // hovertext via getY2Axis().formatAsTickLabel()
      getY2Axis().setTickLabelFormat("+0.00;-0.00"); 

      // add/configure sine curve
      addCurve();
      getCurve().getSymbol().setSymbolType(SymbolType.LINE);
      getCurve().getSymbol().setFillThickness(8);   // px line width
      getCurve().getSymbol().setBorderColor("#0c6ac1");
      getCurve().getSymbol().setBorderWidth(2);
      getCurve().getSymbol().setBackgroundColor("#c6defa");
      getCurve().setLegendLabel("sin");
      getCurve().getSymbol().setWidth(0);  // remove square symbols
      getCurve().getSymbol().setHeight(0); // marking each data point
      getCurve().getSymbol().setHoverSelectionWidth(1);  
      getCurve().getSymbol().setHoverSelectionBackgroundColor("gray");  
      // use a vertical line for the selection cursor
      getCurve().getSymbol().setHoverSelectionSymbolType(
         SymbolType.XGRIDLINE);  
      // with annotation on top of this line (above chart)
      getCurve().getSymbol().setHoverAnnotationSymbolType(
         SymbolType.XGRIDLINE);  
      getCurve().getSymbol().setHoverLocation(
          AnnotationLocation.NORTH);
      // small gap between plot area and hover popup HTML
      getCurve().getSymbol().setHoverYShift(5);
      // note use of custom hover parameter names ${sin}, ${cos}, etc.
      getCurve().getSymbol().setHovertextTemplate(GChart.formatAsHovertext(
         "<b><tt>&nbsp;sin=${sin}&nbsp;<br>&nbsp;cos=${cos}&nbsp;<br>&nbsp;tan=${tan}</tt></b>"));
      // tall brush so it touches independent of mouse y position
      getCurve().getSymbol().setBrushSize(25, 200);
      // so only point-to-mouse x-distance matters for hit testing
      getCurve().getSymbol().setDistanceMetric(1, 0); 
           
      
      // add/configure cosine curve
      addCurve();
      getCurve().getSymbol().setSymbolType(SymbolType.LINE);
      getCurve().getSymbol().setFillThickness(8);  // px line width
      getCurve().getSymbol().setBorderWidth(2); 
      getCurve().getSymbol().setBorderColor("#ff0000");
      getCurve().getSymbol().setBackgroundColor("#ffc6de");
      getCurve().setLegendLabel("cos");
      getCurve().getSymbol().setWidth(0);   // remove square symbols
      getCurve().getSymbol().setHeight(0);  // marking each data point
      getCurve().getSymbol().setHoverSelectionEnabled(false);  
      getCurve().getSymbol().setHoverAnnotationEnabled(false);  
      
      updateCurves(phase); 
      update();
      long t1 = System.currentTimeMillis();
      updateTimeMsg.setText((t1-t0)+"ms"); 
   }
}
