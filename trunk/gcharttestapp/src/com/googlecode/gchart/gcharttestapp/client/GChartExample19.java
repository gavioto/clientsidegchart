package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.HoverUpdateable;
/**
 * This example uses a <tt>HoverUpdateable</tt> widget (a
 * "hover widget") to create a radio-button-based form that
 * pops up whenever the user hovers over a point on any
 * curve, and that allows the user to change that curve's
 * color and symbol type.  <p>
 *
 * As this example illustrates, a hoverWidget can do many of
 * the same kinds of things you might consider doing with a
 * modal dialog launched when the user clicks on a point.
 * But be aware of these important differences/limitations:
 * 
 * <p>
 * 
 * <ul>
 * 
 *   <li> The user cannot drag the hover widget into an
 *   arbitrary position after it opens.<p>
 *
 *   <li> The hover widget only remains open as long as the
 *   mouse is either touching the hovered-over point, or
 *   over the opened hover widget. This means that you must
 *   arrange things so that the hover widget can be reached
 *   by the mouse without going outside of the hit-test area
 *   associated with the point.  A simple way to assure that
 *   is via the use of
 *   <tt>setHoverAnnotationSymbolType(SymbolType.ANCHOR_MOUSE)</tt>,
 *   (optionally also using <tt>setHoverXShift</tt> and
 *   <tt>setHoverYShift</tt> to provide a little overlap) as
 *   we do in this example.<p>
 *
 *   <li> The hoverWidget will be on top of any elements
 *   within the GChart, but it is a child of the GChart, so
 *   any elements extrinsic to the GChart that are on top of
 *   it will occlude the hover widget, too. This is mainly
 *   an issue with hoverWidgets that extrude out of the
 *   GChart's rectangle.<p>
 *
 *   <li> GChart tacitly assumes that if the hover widget is
 *   made invisible, all associated widgets are
 *   automatically hidden, too.  But some GWT widgets
 *   (suggest boxes, menu bars, pop-ups, etc.) don't satisfy
 *   this requirement.  To avoid situations where part of
 *   the hover widget remains on the screen after they are
 *   no longer hovering over a point, it's best to limit
 *   input-accepting hover widgets to containers of
 *   conventional form elements (buttons, list boxes, text
 *   boxes, and the like) that, when you hide them, don't
 *   leave any auxiliary "helper" elements behind them.<p>
 *
 * </ul>
 * 
 * <p>
 *
 * In general, although hover widgets were originally
 * intended for the static display of additional info about
 * the hovered-over point, as long as you recognize and work
 * within their limitations, they also provide an excellent
 * way of quickly accepting point/curve related user inputs,
 * too. Kind of like a right click menu without the click.
 *   
 * 
 */
public class GChartExample19 extends GChart {
// various choices, and their labels, in the "hover-form"
   final String[] color = {"red", "green", "blue"};
   final String[] colorLabel = {"Red", "Green", "Blue"};
   final SymbolType[] symbol = {
      SymbolType.VBAR_SOUTH,
      SymbolType.BOX_CENTER,
      SymbolType.PIE_SLICE_HATCHED_SHADING};
   final String[] symbolLabel = {"Bar", "Box", "Pie"};

   // integer offset of the given value in given array
   private int indexOf(String[] array, String value) {
     for (int i = 0; i < array.length; i++)
        if (array[i].equals(value)) return i;
     throw new IllegalArgumentException(
         "Value (" + value + ") not found.");  
   }
   
   class CurveEditingForm extends VerticalPanel
         implements HoverUpdateable {
 
      CurveEditingForm() {
/*

  For reference, here's the CSS style-name definition in
  gcharttestapp.css:
  
.gchartestapp-GChartExample19-CurveEditingForm {
   background-color: #DDF;   
   border-width: 10px;         
   border-color: black;       
   border-style: solid;
   border-width: 1px;    
   padding: 10px;
}

*/
       setStyleName("gchartestapp-GChartExample19-CurveEditingForm");

       add(new HTML()); // to hold label for color radio-group
       for (int i = 0; i < colorLabel.length; i++) {
          RadioButton radioButton =
             new RadioButton("color", colorLabel[i]);
         radioButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
               String label = ((RadioButton) event.getSource()).getText(); 
               getTouchedCurve().getSymbol().setBorderColor(
                  color[indexOf(colorLabel, label)]);
               update();
            }

         });
         add(radioButton);
       }
       add(new HTML()); // to hold label for symbol radio-group
       for (int i = 0; i < symbolLabel.length; i++) {
         RadioButton radioButton =
             new RadioButton("symbol", symbolLabel[i]);
         radioButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
               String label = ((RadioButton) event.getSource()).getText(); 
               getTouchedCurve().getSymbol().setSymbolType(
                  symbol[indexOf(symbolLabel, label)]);
               // symbol changes can change point "touching"
               // mouse: lock touched point to prevent this
               update(TouchedPointUpdateOption.TOUCHED_POINT_LOCKED);
            }
         });
         add(radioButton);
       }
      }
      
      private void loadCurveProperties(Curve c) {
         int iWidget = 0;
         ((HTML) getWidget(iWidget)).setHTML(
              "<div style='padding: 0px 0px 5px 0px;'>Curve&nbsp;" + 
               (1+c.getParent().getCurveIndex(c)) + 
               "&nbsp;<i>color</i>:</div>");
         iWidget++;
         for (int i = 0; i < color.length; i++) {
           if (color[i].equals(c.getSymbol().getBorderColor()))
              ((RadioButton) getWidget(iWidget)).setValue(true);  
           else
              ((RadioButton) getWidget(iWidget)).setValue(false);  
           iWidget++;
         }
         ((HTML) getWidget(iWidget)).setHTML(
              "<div style='padding: 10px 0px 5px 0px;'>Curve&nbsp;" + 
              (1+c.getParent().getCurveIndex(c)) + 
              "&nbsp;<i>symbol</i>:</div>");
         iWidget++;
         for (int i = 0; i < symbol.length; i++) {
           if (symbol[i] == c.getSymbol().getSymbolType())
              ((RadioButton) getWidget(iWidget)).setValue(true);  
           else
              ((RadioButton) getWidget(iWidget)).setValue(false);
           iWidget++;
         }
         
      }
         
      // these are the two methods of the HoverUpdateable
      // interface that turns a Widget into a "hover-widget"
      public void hoverUpdate(Curve.Point hoveredOver) {
         loadCurveProperties(getTouchedCurve());
      }
      // no special cleanup required (normally there isn't)
	   public void hoverCleanup(Curve.Point hoveredAwayFrom) {}
   }

   
   GChartExample19() {
     setChartSize(200, 200);
     setPadding("10px");
     HoverUpdateable hoverWidget = new CurveEditingForm();
     final int N_CURVES = 3;
     final int INITIAL_SYMBOL = indexOf(symbolLabel, "Box");
     for (int iCurve = 0; iCurve < N_CURVES; iCurve++) {
       addCurve();
       getCurve().getSymbol().setHoverWidget(hoverWidget);
       getCurve().getSymbol().setSymbolType(symbol[INITIAL_SYMBOL]);
       getCurve().getSymbol().setBorderColor(color[iCurve]);
       getCurve().getSymbol().setBorderWidth(3);
       // negative value ==> an external border
       getCurve().getSymbol().setHoverSelectionBorderWidth(-3);
       getCurve().getSymbol().setHoverAnnotationSymbolType(
          SymbolType.ANCHOR_MOUSE_SNAP_TO_X);
       getCurve().getSymbol().setHoverLocation(
          AnnotationLocation.SOUTHEAST);
       getCurve().getSymbol().setHeight(20);
       getCurve().getSymbol().setWidth(20);
       
       for (int iPoint = 0; iPoint < 10; iPoint++) 
          getCurve().addPoint(iPoint, (N_CURVES-iCurve)*iPoint);
     }
     getXAxis().setHasGridlines(true);
     getYAxis().setHasGridlines(true);
  }
}
