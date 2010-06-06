package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TabPanel;
import com.googlecode.gchart.client.GChart;
/**
 * 
 * Reproduces the bug first uncovered by this live GChart demo at
 *  <a href="http://whatwouldnickdo.com/wordpress/264/simple-charts-in-gwt-with-gchart/">/home/nick</a>. 
 * 
 * Original code from which this test case is derived is Copyright 2009,
 * Nick of "/home/nick".  All rights reserved. Nick has agreed to
 * release the part of his code included in this test case under the
 * Apache 2.0 license.  <p>
 *
 * In GChart 2.4, within IE6 and IE7, this test incorrectly showed a 10
 * point curve when Chrome, FF2, FF3 correctly show a 1 point curve.
 * GChart 2.41 corrects this problem.  The underlying problem also
 * occurs in non-GChart-using GWT code, see TestGChart41a.java, filed on
 * the GWT issue tracker, for an example.
 * 
 */
public class TestGChart41 extends SimplePanel {
   TabPanel tp = new TabPanel();
   GChart g = new GChart();
   boolean flag = false;
   TestGChart41() {
     add(tp);
     tp.setAnimationEnabled(true);
     g.setChartFootnotes(
"Check: number of points flips between 10 and 1<br>" +
"with each Calculate button click, especially in IE.");
	  Button calcButton = new Button("Calculate");	
     calcButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
		        g.clearCurves();
				g.addCurve();
                for (int i = 0; i < (flag?1:10); i++) { 
                   g.getCurve().addPoint(i,i);
                   g.getCurve().getPoint().setAnnotationText(
                      g.getCurve().getPoint().getHovertext());
                }
                flag = flag?false:true;    
                g.update();
                tp.selectTab(1);
			}
		});
     
     tp.add(calcButton, "TheCalculateButtonTab______"); 
     tp.add(g, "_____TheGChartTab");
     tp.selectTab(0);
   }
}
