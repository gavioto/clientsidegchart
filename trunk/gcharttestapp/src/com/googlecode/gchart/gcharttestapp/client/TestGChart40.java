package com.googlecode.gchart.gcharttestapp.client;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.SuggestBox;
import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.HoverUpdateable;
/**
 * This test uses a <tt>HoverUpdateable</tt> SuggestBox
 * that lets the user change the color and symbol type of
 * the curve.
 *
 */
public class TestGChart40 extends GChart {
   
   class HoverUpdateableSuggestBox extends Composite implements HoverUpdateable {
	   MultiWordSuggestOracle oracle = new MultiWordSuggestOracle();
	   MultiWordSuggestOracle emptyOracle = new MultiWordSuggestOracle();
      SuggestBox suggestBox = new SuggestBox(oracle);
      SimplePanel panel = new SimplePanel();
      HoverUpdateableSuggestBox() {
       panel.add(suggestBox);
       initWidget(panel);
       panel.setPixelSize(175,30);
       DOM.setStyleAttribute(panel.getElement(),"border","1px solid black");
    	 oracle.add("color/size: red 10 pixels");
    	 oracle.add("color/size: green 10 pixels");
    	 oracle.add("color/size: blue 10  pixels");
    	 oracle.add("color/size: red 20 pixels");
    	 oracle.add("color/size: green 20 pixels");
    	 oracle.add("color/size: blue 20 pixels");
    	 oracle.add("color/size: red 40 pixels");
    	 oracle.add("color/size: green 40 pixels");
    	 oracle.add("color/size: blue 40 pixels");
         
//       DOM.setStyleAttribute(getElement(),
//                            "backgroundColor", "EEE"); 
//       DOM.setStyleAttribute(getElement(),
//                            "padding", "3px"); 
//       DOM.setStyleAttribute(getElement(),
//                            "border", "2px solid black"); 
      }

      public SuggestBox getSuggestBox() {return suggestBox;}
	 
      public void hoverUpdate(GChart.Curve.Point p) {
         suggestBox.setText("color/size: " +
            p.getParent().getSymbol().getBackgroundColor() + " " +
            p.getParent().getSymbol().getWidth() + " pixels");
     }
      public void hoverCleanup(GChart.Curve.Point p) {
      }

   }
   
   TestGChart40() {
     final int N_CURVES = 2;
     setChartSize(200, 200);
     setBorderStyle("none");

     for (int iCurve = 0; iCurve < N_CURVES; iCurve++) {  
        addCurve();
        HoverUpdateableSuggestBox hoverWidget = 
           new HoverUpdateableSuggestBox();
     hoverWidget.getSuggestBox().addValueChangeHandler(new ValueChangeHandler<String>() {
        public void onValueChange(ValueChangeEvent<String> event) {
           String s = event.getValue();
           String[] part = s.split(" ");
           String color = part[1];
           int pixels = Integer.parseInt(part[2]);
           getTouchedCurve().getSymbol().setBackgroundColor(color);
           getTouchedCurve().getSymbol().setBorderColor(color);
           getTouchedCurve().getSymbol().setHeight(pixels);
           getTouchedCurve().getSymbol().setWidth(pixels);
           update();
        }
     });
        getCurve().getSymbol().setHoverWidget(hoverWidget);
        getCurve().getSymbol().setHoverLocation(AnnotationLocation.CENTER);
        getCurve().getSymbol().setHoverSelectionBorderWidth(-3);
        // initialize to "red 10 pixels" and "blue 20 pixels"
        getCurve().getSymbol().setHeight(10+iCurve*10);
        getCurve().getSymbol().setWidth(10+iCurve*10);
        getCurve().getSymbol().setBorderColor(iCurve==0?"red":"blue");
        getCurve().getSymbol().setBackgroundColor(iCurve==0?"red":"blue");
        getCurve().getSymbol().setBorderStyle("solid");
        for (int iPoint = 0; iPoint < 10; iPoint++) 
           getCurve().addPoint(iPoint, (1+iCurve)*iPoint);
     }
     getXAxis().setHasGridlines(true);
     getYAxis().setHasGridlines(true);
     setChartFootnotes(
"Check: hover over suggest box changes color/size as indicated;<br>" + 
"Default text in suggest box reflects curve's color/size.");           
  }
}
