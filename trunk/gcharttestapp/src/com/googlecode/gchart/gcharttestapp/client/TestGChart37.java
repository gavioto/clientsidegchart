package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.HoverUpdateable;
/**
 * This example uses a <tt>HoverUpdateable</tt> widget (a "hover
 * widget") to create a radio-button-based form that pops up whenever
 * the user hovers over a point on any curve, and that allows the user
 * to change that curve's color and symbol type.  <p>
 *
 * As this example illustrates, a hoverWidget can do many of the same kinds
 * of things you might do with a popup. But not everything.  For
 * example, it lacks the ability to be repositioned and remains open
 * only as long as the mouse is over it. It also requires that when the
 * hoverWidget is made invisible, all widgets launched/owned by it
 * become invisible, a requirement not satisfied by a nested
 * MenuBar-based menu system--so only a single-level MenuBar works
 * properly as a hoverWidget out of the box. Limit yourself to
 * traditional fixed-layout forms--such as the radio buttons of this
 * example--and steer clear of the more complex Widgets like MenuBar and
 * Tree, and you should be able to get away with using a hoverWidget as
 * if it were a popup, as we do here.
 * 
 */
public class TestGChart37 extends GChart {
   final String[] color = {"red", "green", "blue"};
   final String[] colorLabel = {"Red", "Green", "Blue"};
   final SymbolType[] symbol = {SymbolType.VBAR_SOUTH,
                               SymbolType.BOX_CENTER,
                               SymbolType.PIE_SLICE_HATCHED_SHADING};
   final String[] symbolLabel = {"Bar", "Box", "Pie"};
   final TouchedPointUpdateOption updateOption;
   
   class CurveEditingForm extends VerticalPanel implements HoverUpdateable {
 
      CurveEditingForm() {
       setStyleName("gchartestapp-GChartExample19-CurveEditingForm");
       add(new HTML()); // to hold label for color radio-group
       for (int i = 0; i < colorLabel.length; i++) {
         RadioButton radioButton = new RadioButton("color", colorLabel[i]);
         radioButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
               String label = ((RadioButton) event.getSource()).getText(); 
               for (int i = 0; i < colorLabel.length; i++)
                  if (label.equals(colorLabel[i]))
                    getTouchedCurve().getSymbol().setBorderColor(color[i]);
               update(updateOption);
            }

         });
         add(radioButton);
       }
       add(new HTML()); // to hold label for symbol radio-group
       for (int i = 0; i < symbolLabel.length; i++) {
         RadioButton radioButton = new RadioButton("symbol", symbolLabel[i]);
         radioButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
               String label = ((RadioButton) event.getSource()).getText(); 
               for (int i = 0; i < symbolLabel.length; i++)
                  if (label.equals(symbolLabel[i]))
                     getTouchedCurve().getSymbol().setSymbolType(symbol[i]);
               update(updateOption);
            }
         });
         add(radioButton);
       }
      }
      
      void loadCurveProperties(Curve c) {
         int iWidget = 0;
         ((HTML) getWidget(iWidget)).setHTML(
              "<div style='padding: 0px 0px 5px 0px;'>Curve&nbsp;" + (1+c.getParent().getCurveIndex(c)) + 
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
              "<div style='padding: 10px 0px 5px 0px;'>Curve&nbsp;" + (1+c.getParent().getCurveIndex(c)) + 
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
         
      
      public void hoverUpdate(Curve.Point p) {
         // GChart calls hoverUpdate just before menu widget pops up
         loadCurveProperties(getTouchedCurve());
      }
	   public void hoverCleanup(Curve.Point p) {}
   }

   
   TestGChart37(TouchedPointUpdateOption option) {
     updateOption = option;
     setChartSize(200, 200);
     setPadding("10px");
     setOptimizeForMemory(true);
     HoverUpdateable hoverWidget = new CurveEditingForm();
     //     ((MenuBar) hoverWidget).setPixelSize(200, 200);
     final int N_CURVES = 3;
     for (int iCurve = 0; iCurve < N_CURVES; iCurve++) {
       addCurve();
       getCurve().getSymbol().setHoverWidget(hoverWidget);
       getCurve().getSymbol().setSymbolType(symbol[1]);
       getCurve().getSymbol().setBorderColor(color[iCurve]);
       getCurve().getSymbol().setBorderStyle("solid");
       getCurve().getSymbol().setBorderWidth(3);
       getCurve().getSymbol().setHoverAnnotationSymbolType(
          SymbolType.ANCHOR_MOUSE);
       getCurve().getSymbol().setHoverLocation(
          AnnotationLocation.SOUTHEAST);
       getCurve().getSymbol().setHoverXShift(-5);
       getCurve().getSymbol().setHoverYShift(5);
       getCurve().getSymbol().setBrushSize(20,20); 
       getCurve().getSymbol().setHeight(20);
       getCurve().getSymbol().setWidth(20);
       for (int iPoint = 0; iPoint < 10; iPoint++) 
          getCurve().addPoint(iPoint, (N_CURVES-iCurve)*iPoint);
     }
     getXAxis().setHasGridlines(true);
     getYAxis().setHasGridlines(true);
  }
}
