package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.googlecode.gchart.client.GChart;
/**
 * Tests placing a GChart into nested scrolling windows to assure
 * hit testing can find objects under such conditions.
 * 
 */

public class TestGChart33 extends ScrollPanel {
   TestGChart33() {
     GChart g = new GChart(); 
     g.setChartSize(200, 200);
     g.addCurve();
     for (int i = 0; i < 10; i++) 
        g.getCurve().addPoint(i,i*i);
     g.getCurve().getSymbol().setHeight(15);
     g.getCurve().getSymbol().setWidth(15);
     g.getXAxis().setHasGridlines(true);
     g.getYAxis().setHasGridlines(true);
     g.getYAxis().setAxisMax(90);
     g.setChartFootnotes(
"Check: Scrolling browser window or scroll pane does not impact<br>" + 
"ability to see hover feedback when you mouse over chart symbols."
                        );
     g.update();
     setWidget(g);
     setWidth("200px");
     setHeight("200px");
  }
}
