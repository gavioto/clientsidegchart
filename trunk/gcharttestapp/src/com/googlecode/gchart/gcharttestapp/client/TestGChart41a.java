package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TabPanel;
/*
  Reproduces an incorrect IE behavior first discovered in an
   earlier version of a Client-side GChart tutorial
   available at <a
   href="http://whatwouldnickdo.com/wordpress/264/simple-charts-in-gwt-with-gchart/">/home/nick</a>.

   Code below is a revision of that earlier code, used with
   Nick's permission.
   
   To reproduce the problem:

      Add an instance of this class to the RootPanel in an
      HelloWorld GWT app.

      Click the Calculate button, click on "ButtonTab",
      click the Calculate button again.

   Expected behavior is to see at first a full line, then a
   half line, drawn diagonally across the "GraphicTab" tab.
      
   Works fine in FF2, FF3 and Chrome.

   But, in IE6, IE7 you see a full line both times.  In
   effect, the 50 setVisible(false) invocations are
   improperly ignored by IE.
   
   Comments show 3 workarounds that make IE behave as the
 * others do.

   Note that workaround #2 would in general change the page
   layout since it switches from "display: none" (I think
   used by setVisible(false)) to "visibility: hidden", so it
   might not be appropriate unless your Widgets are placed,
   as in this example, on an AbsolutePanel.

   Finally, in earlier tests, I recollect the problem did
   not occur if I swapped in an HTML widget for the Image
   Widgets used below, and the problem also does not occur
   in analogous Client-side GChart code that uses Grid
   widgets. 
*/
public class TestGChart41a extends SimplePanel {
   TabPanel tp = new TabPanel();
   AbsolutePanel ap = new AbsolutePanel();
   int counter = 0;
   TestGChart41a() {
     add(tp);
// Workaround #1: disable animation
     tp.setAnimationEnabled(true);
	  Button calcButton = new Button("Calculate");	
     calcButton.addClickHandler(new ClickHandler() {
        public void onClick(ClickEvent event) {
           if (counter == 0) { // create, show, full line
              for (int i=0; i < 100; i++) {
                 Image img = new Image("clear.cache.gif");
                 DOM.setStyleAttribute(img.getElement(),
                                       "backgroundColor",
                                       "red");
                 img.setPixelSize(3, 3);
                 ap.add(img, 3*i, 3*i);
              }
           }
           else if (counter % 2 == 1) { // next, the half line
              for (int i=50; i < 100; i++) {
                 ap.getWidget(i).setVisible(false);
// Workaround #2: swap setVisible line above with next line:
//               DOM.setStyleAttribute(ap.getWidget(i).getElement(),
//                                     "visibility",
//                                     "hidden");
              }
           }
           else if (counter % 2 == 0) { // back to full line again
              for (int i=50; i < 100; i++) {
                 ap.getWidget(i).setVisible(true);
// Workaround #2: swap setVisible line above with next line:
//               DOM.setStyleAttribute(ap.getWidget(i).getElement(),
//                                     "visibility",
//                                     "");
              }
           }
// Workaround #3: move next line to top of this onClick() method
           tp.selectTab(1);
           counter++;
			}
		});
     
     tp.add(calcButton, "ButtonTab_____");  
     tp.add(ap, "_____GraphicTab");
     ap.setPixelSize(300, 300);
     tp.selectTab(0);
     tp.setPixelSize(300,300);
   }
}
