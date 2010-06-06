package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.googlecode.gchart.client.GChart;
/**
 *
 * This test switches the same curve between canvas and HTML-only
 * rendering by changing fillThickness between 0 and 1 (code reading
 * suggested that this particular, not previously tested, usage scenario
 * might be a problem).
 * 
 */
public class TestGChart56 extends GChart {
  int thickness = 0;
  int spacing = 0;
  TestGChart56() {
     setChartTitle("<b>x<sup>2</sup> vs x</b>");
     setChartSize(150, 150);
     addCurve();
// solid, 2px thick connecting lines:
     getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);

     getCurve().getSymbol().setFillSpacing(0);
     getCurve().getSymbol().setFillThickness(thickness);
     getCurve().getSymbol().setBorderWidth(-1);
     getCurve().getSymbol().setBackgroundColor("aqua");

     for (int i = 0; i < 10; i++) 
       getCurve().addPoint(i,i*i);
     getCurve().setLegendLabel("x<sup>2</sup>");
     getXAxis().setAxisLabel("x");
     getYAxis().setAxisLabel("x<sup>2</sup>");

     setChartFootnotes(new Button("Switch Rendering Mode",
        new ClickHandler() {
          public void onClick(ClickEvent event) {
            thickness = (thickness + 1) % 2;
            spacing = (spacing + 1) % 4;
            getCurve().getSymbol().setFillThickness(thickness);
            getCurve().getSymbol().setFillSpacing(spacing/2);
            setChartTitle("Thickness="+thickness+" spacing="+(spacing/2));
            update();
          }
        }
      ));

  }
}
