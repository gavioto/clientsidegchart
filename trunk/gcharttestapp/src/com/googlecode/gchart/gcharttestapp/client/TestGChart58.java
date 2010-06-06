package com.googlecode.gchart.gcharttestapp.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.Label;


/*
 * Add an instance to the RootPanel, then click on the "clickMe" label.
 * <p>
 * 
 * Rather than the Composite object ref, the internal FocusPanel
 * ref is returned by event.getSource within the click handler.
 * <p>
 *
 * This kind of Composite is useful if you want to add focus
 * handling/keyboarding capability without directly extending
 * FocusPanel.
 * <p>
 *
 * Though returning the initWidget widget seems logical, note that
 * external users of this class would not even know that it is using a
 * FocusPanel behind the scenes. And because the FocusPanel
 * encapsulates a lot of keyboard and focus handling capability, there
 * is no easy way to add all the relevant handlers directly to the
 * Composite without using a FocusPanel in this way.
 * 
 */ 
class TestGChart58 extends Composite implements HasClickHandlers {
   private FocusPanel fp = new FocusPanel(new Label("Click Me"));
   // TestGChart58 clients would add click handlers via this method.
   public HandlerRegistration addClickHandler(ClickHandler handler) {
      return fp.addClickHandler(handler);
   }
   TestGChart58() {
      initWidget(fp);
      // add a default handler to illustrate the problem
      // (an external user of the TestGChart58 would generally do this)
      addClickHandler(new ClickHandler() {
         public void onClick(ClickEvent event) {
            Object obj = event.getSource();
            if (obj instanceof Composite)
               Window.alert("event.getSource returns the Composite object ref ('right')");
            if (obj instanceof FocusPanel)
               Window.alert("event.getSource() returned the internal object ref ('wrong')");
         }
      });                            
   }
}
