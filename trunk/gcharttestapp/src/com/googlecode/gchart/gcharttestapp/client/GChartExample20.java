package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.googlecode.gchart.client.GChart;
/**
 * This example displays a pie chart that, when you click on any slice,
 * opens a dialog that lets you modify the color, shading pattern, and
 * size of of that slice. That dialog also contains "Prev Slice" and "Next
 * Slice" buttons that, by invoking GChart's <tt>touch</tt> method,
 * programmatically emulate the user sequentially "touching" (selecting)
 * slices with their mouse.
 * 
 * <p>
 *
 * The slice properties dialog in this example is an ordinary GWT modal
 * dialog (a <tt>DialogBox</tt> with modal=true, autoHide=true). It gets
 * GChart to inform it of click events on the chart by implementing the
 * standard GWT <tt>ClickHandler</tt> interface, and then passing
 * itself to GChart's <tt>addClickHandler</tt> method. The dialog's
 * <tt>onClick</tt> method shows itself (via <tt>DialogBox.show</tt>)
 * and then uses GChart's <tt>getTouchedPoint</tt> method to get a
 * reference to the clicked-on slice that it uses to load that slice's
 * properties into the form. As the user makes changes via the form,
 * they are copied back into the chart and the chart's <tt>update</tt>
 * method is invoked to immediately show the changes on the chart. 
 * <p>
 * 
 * GChart's "currently touched point" (available via
 * <tt>getTouchedPoint</tt>) ordinarily moves in lock-step with current
 * mouse location, and thus falls short of a true point selection
 * capability. This example works around this limitation by exploiting
 * the fact that a GWT modal dialog "eats" all mouse events while it is
 * open. So, when the modal dialog is opened, the mouse location seen by
 * GChart, and hence the "currently touched" point is frozen. This lets
 * us use GChart's currently touched point as if it were the "selected"
 * point in this example.
 * 
 */
public class GChartExample20 extends GChart {
    static final int LABEL_COL = 0;  // for the label/object pairs
    static final int OBJECT_COL = 1; // associated with the property
    static final int N_COLS = 2;     // editing form


   /*
    * A helper class to facilitate property editing via drop-down
    * lists in this example (there's nothing GChart-specific here):
    */ 
   class ObjectSelectorDropdownList extends ListBox {
      final Object[][] labelObjectPairs;
      
      public ObjectSelectorDropdownList(Object[][] labelObjectPairs) {
         super();
         this.labelObjectPairs = labelObjectPairs;
         setVisibleItemCount(1); // makes it a drop-down list
         // add each label as an item on the drop-down list
         for (int i = 0; i < labelObjectPairs.length; i++) 
            addItem((String) labelObjectPairs[i][LABEL_COL]);
      }
      //  returns object at given index
      public Object getObject(int index) {
         Object result = labelObjectPairs[index][OBJECT_COL];
         return result;
      }
         
      // returns the currently selected object in the drop-down list
      public Object getSelectedObject() {
         Object result = getObject(getSelectedIndex());
         return result;
      }

      // makes given object the selected one (assumes it's on list--once)
      public void setSelectedObject(Object selectedObject) {
         for (int i = 0; i < labelObjectPairs.length; i++) {
            if (selectedObject.equals(labelObjectPairs[i][OBJECT_COL])) {
               setSelectedIndex(i);
               return;
            }
         }
         throw new IllegalArgumentException(
"selectedObject specified was not found on the labelObjectPairs list.");
         
      }

      // number of label, object pairs
      public int getNObjects() {
         return labelObjectPairs.length;
      }

   } // class ObjectSelectorDropdownList


   // holds color information associated with color selection drop-down
   public class ColorSpec {
      String backgroundColor;
      String borderColor;
      public ColorSpec(String backgroundColor, String borderColor) {
         this.backgroundColor = backgroundColor;
         this.borderColor =borderColor;
      }
   }
   
   
// labels/values for color selection drop-down list:   
   final ObjectSelectorDropdownList colorSelector =
      new ObjectSelectorDropdownList(
	         new Object[][] 
	         {{"Red", new ColorSpec("red", "#F88")},
	         {"Fuchsia", new ColorSpec("#F0F", "#F8F")},
	         {"Lime", new ColorSpec("#0F0", "#8F8")},
	         {"Blue", new ColorSpec("#00F", "#88F")}, 
	         {"Aqua", new ColorSpec("#0FF", "#8FF")},
	         {"Maroon", new ColorSpec("#800", "#C88")},
	         {"Purple", new ColorSpec("#808", "#C8C")},
	         {"Green", new ColorSpec("#080", "#8C8")},
	         {"Olive", new ColorSpec("#880", "#CC8")},
	         {"Navy", new ColorSpec("#008", "#88C")},
	         {"Teal", new ColorSpec("#088", "#8CC")}});

// labels/values for slice shading pattern drop-down list
    final ObjectSelectorDropdownList shadingSelector = 
	        new ObjectSelectorDropdownList(
	            new Object[][] {{"Vertical shading",
	                             SymbolType.PIE_SLICE_VERTICAL_SHADING},
	                            {"Horizontal shading", 
	                             SymbolType.PIE_SLICE_HORIZONTAL_SHADING},
	                             {"Optimal shading",
	                             SymbolType.PIE_SLICE_OPTIMAL_SHADING}});
// labels/values for pie slice size (as percentage) drop-down list
    final ObjectSelectorDropdownList sliceSizeSelector =
       new ObjectSelectorDropdownList(new Object[][] {
         {"0%", new Integer(0)},
         {"5%", new Integer(5)},                            
         {"10%", new Integer(10)},                            
         {"15%", new Integer(15)},                            
         {"20%", new Integer(20)},                            
         {"25%", new Integer(25)},                            
         {"30%", new Integer(30)},                            
         {"35%", new Integer(35)},                            
         {"40%", new Integer(40)},                            
         {"45%", new Integer(45)},                            
         {"50%", new Integer(50)},                            
         {"55%", new Integer(55)},                            
         {"60%", new Integer(60)},                            
         {"65%", new Integer(65)},                            
         {"70%", new Integer(70)},                            
         {"75%", new Integer(75)},                            
         {"80%", new Integer(80)},                            
         {"85%", new Integer(85)},                            
         {"90%", new Integer(90)},                            
         {"95%", new Integer(95)},                            
         {"100%", new Integer(100)},                            
       });

// the modal dialog that pops up when they click on a slice to edit it
   class SliceEditor extends DialogBox implements ClickHandler {
      static final boolean modal = true;     
// Clicking outside form auto-closes; that same click gets passed up to
// GChart, where (if it was on a slice) it opens the new slice's editor
      static final boolean autoHide = true;  
      final VerticalPanel mainPanel = new VerticalPanel();
      final FlexTable propertyForm = new FlexTable();
      final DockPanel commandBar = new DockPanel();
      final HorizontalPanel sliceSwitcher = new HorizontalPanel();
      final Button prevSlice = new Button("&lt;Prev Slice");
      final Button nextSlice = new Button("Next Slice&gt;");
      final Button closeButton = new Button("Close");
      // loads properties associated with point/slice into form
      void copyChartPropertiesIntoForm(GChart.Curve.Point p) {
         // dialog title bar caption:
         setText("Slice " + getCurveIndex(p.getParent()) +
                  " Properties");
         colorSelector.setSelectedObject(
           getColorSpec(                              
            p.getParent().getSymbol().getBackgroundColor(),
            p.getParent().getSymbol().getBorderColor()));
         shadingSelector.setSelectedObject(
           p.getParent().getSymbol().getSymbolType());
         int sliceSize = (int) Math.round(100*
           p.getParent().getSymbol().getPieSliceSize());
         sliceSizeSelector.setSelectedObject(
           new Integer(sliceSize));
      }
     // saves current form settings into associated point/slice of chart 
     void copyFormPropertiesIntoChart(GChart.Curve.Point p) {
        p.getParent().getSymbol().setBackgroundColor(
           ((ColorSpec) colorSelector.getSelectedObject()).backgroundColor);
        p.getParent().getSymbol().setBorderColor(
           ((ColorSpec) colorSelector.getSelectedObject()).borderColor);

        // selection flips border and background colors
        p.getParent().getSymbol().setHoverSelectionBorderColor(
           ((ColorSpec) colorSelector.getSelectedObject()).backgroundColor);
        p.getParent().getSymbol().setHoverSelectionBackgroundColor(
           ((ColorSpec) colorSelector.getSelectedObject()).borderColor);
        p.getParent().getSymbol().setSymbolType(
         (SymbolType) shadingSelector.getSelectedObject());
        int sliceSize = ((Integer)
                        sliceSizeSelector.getSelectedObject()).intValue();
        p.getParent().getSymbol().setPieSliceSize(sliceSize/100.);
     }
     
      SliceEditor() {
 /* DialogBox CSS Style settings used with this example for reference:

Note: These simplified CSS styles make the dialog's title bar behave a
little quirkily in IE6 when dragging. For more sophisticated CSS that
fixes this problem (and also provides a more professional look) see the
CSS tab of the DialogBox example in the GWT <a href="xxx"> Showcase of
Features</a> (I just didn't want to copy 5 pages of obscure DialogBox
CSS into what is after all a Client-side GChart example).

.gwt-DialogBox .Caption {
  font-size: 18;
  color: #eef;
  background: #00f repeat-x 0px -2003px;
  padding: 4px 4px 4px 8px;
  cursor: default;
  border-bottom: 2px solid #008;
  border-top: 3px solid #448;
}

.gwt-DialogBox .dialogContent {
  border: 1px solid #008;
  background: #ddd;  
  padding: 3px;   
}

*/
         super(autoHide, modal);
         colorSelector.addChangeHandler(new ChangeHandler() {
            public void onChange(ChangeEvent event) {
               copyFormPropertiesIntoChart(getTouchedPoint());
// Changes in slice size can place a different, or no, slice under
// GChart's "current mouse position". Such chart changes "underneath the
// mouse" would normally result in a change in the touched point; the
// TOUCHED_POINT_LOCKED update option keeps that from happening.
               update(TouchedPointUpdateOption.TOUCHED_POINT_LOCKED);
            }
         });
         shadingSelector.addChangeHandler(new ChangeHandler() {
            public void onChange(ChangeEvent event) {
               copyFormPropertiesIntoChart(getTouchedPoint());
               update(TouchedPointUpdateOption.TOUCHED_POINT_LOCKED);
            }
         });
         sliceSizeSelector.addChangeHandler(new ChangeHandler() {
            public void onChange(ChangeEvent event) {
               copyFormPropertiesIntoChart(getTouchedPoint());
               update(TouchedPointUpdateOption.TOUCHED_POINT_LOCKED);
            }
         });
         // slice properties table (slice color, shading and size)
         propertyForm.setText(  0, 0, "Color:");
         propertyForm.setWidget(0, 1, colorSelector);
         propertyForm.setText(  1, 0, "Shading Pattern:");
         propertyForm.setWidget(1, 1, shadingSelector);
         propertyForm.setText(  2, 0, "Slice Size:");
         propertyForm.setWidget(2, 1, sliceSizeSelector);
         // add additional properties here, if desired

         // buttons for changing the selected slice from the form
         prevSlice.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
               int iCurve = getCurveIndex(getTouchedCurve());
               int iPrev = (iCurve == 0) ? (getNCurves()-1) : (iCurve-1); 
               touch(getCurve(iPrev).getPoint(0));
               copyChartPropertiesIntoForm(getTouchedPoint());
               update(TouchedPointUpdateOption.TOUCHED_POINT_LOCKED);
            }
         });
         nextSlice.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
               int iCurve = getCurveIndex(getTouchedCurve());
               int iNext = (iCurve+1 == getNCurves()) ? 0 : (iCurve+1); 
               touch(getCurve(iNext).getPoint(0));
               copyChartPropertiesIntoForm(getTouchedPoint());
               update(TouchedPointUpdateOption.TOUCHED_POINT_LOCKED);
            }
         });
         sliceSwitcher.add(prevSlice);
         sliceSwitcher.add(nextSlice);
         closeButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
               hide();
               touch(null);  // clears any selected slice
               update(TouchedPointUpdateOption.TOUCHED_POINT_LOCKED);
            }
         });

         commandBar.add(sliceSwitcher, DockPanel.WEST);
         commandBar.add(closeButton, DockPanel.EAST);
         commandBar.setCellHorizontalAlignment(closeButton,
              HasHorizontalAlignment.ALIGN_RIGHT);
         commandBar.setWidth("100%"); // pushes close button to right edge
         
         // create main form and place it in DialogBox
         mainPanel.add(propertyForm);
         mainPanel.add(commandBar);
         add(mainPanel);  // add the DialogBox' single, defining, widget
         
     }

     // Retrieves an existing ColorSpec object reference, given its colors
      ColorSpec getColorSpec(String backgroundColor, String borderColor) {
        for (int i = 0; i < colorSelector.getNObjects(); i++) {
           ColorSpec cs = (ColorSpec) colorSelector.getObject(i);
           if (backgroundColor.equals(cs.backgroundColor) &&
               borderColor.equals(cs.borderColor))
              return cs;
        }
         throw new IllegalArgumentException(
           "Attempt to retrieve a non-existing color combination.");
     }


      boolean isFirstTime = true; 
      public void onClick(ClickEvent event) {
        // don't shown property editor if they clicked on nothing
        if (null == getTouchedPoint()) return;
        
        // load properties of clicked-on slice into form
        copyChartPropertiesIntoForm(getTouchedPoint());
        if (isFirstTime) {
           // initially put upper left corner wherever they clicked...
           setPopupPosition(
             Window.getScrollLeft()+Event.getCurrentEvent().getClientX(),
             Window.getScrollTop() + Event.getCurrentEvent().getClientY());
           show();
           isFirstTime= false;               
        }
        else
           // ...thereafter, just stay whereever they dragged it to
           show();   
     }
     
   }

   // the single dialog box that gets used to edit any slice
   SliceEditor theSliceEditor = new SliceEditor();
   
   GChartExample20() {
     final String SOURCE_CODE_LINK =
"<a href='GChartExample20.txt' target='_blank'>Source code</a>";
     final int N_SLICES = 5;
     setChartSize(100, 100);
     setBorderStyle("none");
     setChartTitle("<big>Click pie to edit!</big>");
     setChartTitleThickness(20);
     setChartFootnotes(SOURCE_CODE_LINK);
     setChartFootnotesThickness(20);
     // initial slice sizes
     double[] initSliceSize = {0.3, 0.2, 0.1, 0.2, 0.2};

     addClickHandler(theSliceEditor); 
     
     for (int iCurve = 0; iCurve < N_SLICES; iCurve++) {  
        addCurve();
        getCurve().getSymbol().setBorderWidth(1);
        getCurve().getSymbol().setFillThickness(4);
        getCurve().getSymbol().setFillSpacing(4);
        getCurve().getSymbol().setHoverLocation(
           AnnotationLocation.ON_PIE_ARC);
        getCurve().getSymbol().setBorderColor(
           ((ColorSpec) colorSelector.getObject(iCurve)).borderColor);
        getCurve().getSymbol().setBackgroundColor(
           ((ColorSpec) colorSelector.getObject(iCurve)).backgroundColor);
        // selection flips border and background colors
        getCurve().getSymbol().setHoverSelectionBackgroundColor(
           ((ColorSpec) colorSelector.getObject(iCurve)).borderColor);
        getCurve().getSymbol().setHoverSelectionBorderColor(
           ((ColorSpec) colorSelector.getObject(iCurve)).backgroundColor);
        getCurve().getSymbol().setSymbolType(SymbolType.PIE_SLICE_OPTIMAL_SHADING);
        getCurve().getSymbol().setPieSliceSize(initSliceSize[iCurve]);
        getCurve().getSymbol().setModelHeight(1.0); //diameter = yMax-yMin
        getCurve().getSymbol().setModelWidth(0);
        getCurve().addPoint(0.5, 0.5);  // pie centered in world units
     }
     getXAxis().setAxisMin(0);  // so 0.5,0.5 (see above) centers pie
     getXAxis().setAxisMax(1);
     getYAxis().setAxisMin(0);
     getYAxis().setAxisMax(1);
     getXAxis().setHasGridlines(false); // hides axes, ticks, etc.
     getXAxis().setAxisVisible(false);  // (not needed for the pie)
     getXAxis().setTickCount(0);
     getYAxis().setHasGridlines(false);
     getYAxis().setAxisVisible(false);
     getYAxis().setTickCount(0);
     update();
  }
}
