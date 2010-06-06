package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.HoverUpdateable;
/**
 * This example displays a pie chart that, when you hover
 * over any slice, opens a dialog that lets you modify the
 * color, shading pattern, and size of of that slice. 
 * 
 * <p>
 *
 * The slice properties dialog in this example is an
 * ordinary GWT modeless dialog (a <tt>DialogBox</tt> with
 * modal=false, autoHide=false) that implements GChart's
 * HoverUpdateable interface, and is made each slice's hover
 * widget via GChart's <tt>setHoverWidget</tt> method.  <p>
 * 
 * When the user first hovers over a slice, the hover
 * widget's hoverUpdate method loads current slice
 * information into the hover widget. As the user makes
 * changes via the form, they are copied back into the chart
 * on-the-fly and the chart's <tt>update</tt> method is
 * invoked to immediately show these changes on the chart.
 * <p> <p>
 *
 * This example achieves the same slice-editing
 * functionality (and uses much of the same code) as
 * GChartExample20.java (available on the GChart live demo).
 * However, it has a very different user interface than that
 * example, which uses a modal DialogBox, launched via an
 * <tt>onClick</tt> handler that exploits GChart's support
 * for GWT's SourcesClickEvents interface.  <p>
 *
 * In general the modal dialog approach is better for
 * "wholesale" editing situations where you need to make
 * many changes efficiently (for example, in our live-demo
 * slice editing example, using a modal DialogBox allows for
 * programmatic slice selection via next/prev slice
 * buttons). On the other hand, the hover widget approach is
 * most effective when you just need to make a few quick
 * changes (for example, it requires zero clicks to open and
 * close the dialog in this example--ideal for quick, single
 * click tweaks).  Playing with each example to get a sense
 * of the tradeoffs involved can help you choose the right
 * strategy for your application. And, yes, you can use both
 * approaches together, though I expect that won't usually
 * be needed.
 * 
 * 
 */
public class GChartExample20a extends GChart {
   // columns within label/object property table
    static final int LABEL_COL = 0;  
    static final int OBJECT_COL = 1; 
    static final int N_COLS = 2;     
   /*
    * A helper class to facilitate property editing via
    * drop-down lists in the dialog (there's nothing
    * GChart-specific here):
    *
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
         
      // currently selected object in the drop-down list
      public Object getSelectedObject() {
         Object result = getObject(getSelectedIndex());
         return result;
      }

      // select given object (assumes it's on list--once)
      public void setSelectedObject(Object selectedObject) {
         for (int i = 0; i < labelObjectPairs.length; i++) {
            if (selectedObject.equals(
                  labelObjectPairs[i][OBJECT_COL])) {
               setSelectedIndex(i);
               return;
            }
         }
         throw new IllegalArgumentException(
"selectedObject not found on labelObjectPairs list.");
         
      }

      // number of label, object pairs
      public int getNObjects() {
         return labelObjectPairs.length;
      }

   } // class ObjectSelectorDropdownList


   // user-selectable "background + border" pie-color combo 
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
	    new ObjectSelectorDropdownList(new Object[][] {
       {"Vertical shading",
	     SymbolType.PIE_SLICE_VERTICAL_SHADING},
	    {"Horizontal shading", 
	     SymbolType.PIE_SLICE_HORIZONTAL_SHADING},
	    {"Optimal shading",
	     SymbolType.PIE_SLICE_OPTIMAL_SHADING}});
// pie slice sizing choices dropdown
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

// editing dialog that pops up when they click on a slice
    class SliceEditor extends DialogBox
          implements HoverUpdateable {
      final VerticalPanel mainPanel = new VerticalPanel();
      final FlexTable propertyForm = new FlexTable();
      // loads properties of point/slice into form
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
     // saves form settings into associated point/slice
     void copyFormPropertiesIntoChart(GChart.Curve.Point p) {
        p.getParent().getSymbol().setBackgroundColor(((ColorSpec)
           colorSelector.getSelectedObject()).backgroundColor);
        p.getParent().getSymbol().setBorderColor(((ColorSpec)
           colorSelector.getSelectedObject()).borderColor);

        // selection flips border and background colors
        p.getParent().getSymbol().setHoverSelectionBorderColor(
           ((ColorSpec)
            colorSelector.getSelectedObject()).backgroundColor);
        p.getParent().getSymbol().setHoverSelectionBackgroundColor(
           ((ColorSpec)
            colorSelector.getSelectedObject()).borderColor);
        p.getParent().getSymbol().setSymbolType(
         (SymbolType) shadingSelector.getSelectedObject());
        int sliceSize = ((Integer)
          sliceSizeSelector.getSelectedObject()).intValue();
        p.getParent().getSymbol().setPieSliceSize(sliceSize/100.);
     }
     
     /* Very important to use MODELESS dialog with hover
      * widgets.  Modal dialogs live at the root level but
      * GChart places it's hover widgets INSIDE the DOM
      * element containing the chart.  These are
      * fundamentally incompatible approaches leading to
      * strange behaviors when used together.  <p>
      *
      * If you want to use a modal dialog, have your
      * DialogBox implement <tt>ClickHandler</tt> (not
      * <tt>HoverUpdateable</tt> !) and then use GChart's
      * addClickHandler to connect clicks on points ==>
      * showing of the dialog. See GChartExample20.java in
      * live demo for details.
      * 
      */   
     static final boolean modal = false;     
     static final boolean autoHide = false;  
      SliceEditor() {
 /* DialogBox CSS Style settings of this example:

Note: These simplified CSS styles make the dialog's title
bar behave a little quirkily in IE6 when dragging. For more
sophisticated CSS that fixes this problem somewhere within
its 5 pages (and also provides a more professional look) see
the CSS tab of the DialogBox example in the GWT "Showcase of
Features" (a very helpful demo app, which also doubles as a
kind of GWT-CSS library, that ships with GWT 1.5). 

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
         super(modal, autoHide);
         colorSelector.addChangeHandler(new ChangeHandler() {
            public void onChange(ChangeEvent event) {
               copyFormPropertiesIntoChart(getTouchedPoint());
// Changes in slice size can place a different, or no, slice
// under GChart's "current mouse position". Such chart
// changes "underneath the mouse" (so-called "ONMOUSEUNDER"
// events) would normally result in a change in the touched
// point; the TOUCHED_POINT_LOCKED update option keeps that
// from happening.
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
         propertyForm.setHTML(  0, 0, "Color:");
         propertyForm.setWidget(0, 1, colorSelector);
         propertyForm.setHTML(  1, 0, "Shading&nbsp;Pattern:");
         propertyForm.setWidget(1, 1, shadingSelector);
         propertyForm.setHTML(  2, 0, "Slice&nbsp;Size:");
         propertyForm.setWidget(2, 1, sliceSizeSelector);
         // add additional properties here, if desired

         
         // create main form and place it in DialogBox
         mainPanel.add(propertyForm);
         // (add more horizontal slabs of the form here)
         // add the DialogBox' single, defining, widget
         add(mainPanel);  
     }

     // Get ColorSpec object reference, given its colors
      ColorSpec getColorSpec(String backgroundColor,
                             String borderColor) {
        for (int i = 0; i < colorSelector.getNObjects(); i++) {
           ColorSpec cs = (ColorSpec) colorSelector.getObject(i);
           if (backgroundColor.equals(cs.backgroundColor) &&
               borderColor.equals(cs.borderColor))
              return cs;
        }
         throw new IllegalArgumentException(
           "Non-existing color combination.");
     }

      // this,next methods implement HoverUpdateable
      public void hoverUpdate(Curve.Point hoveredOver) {
         // load slice properties into the form
         copyChartPropertiesIntoForm(hoveredOver); 
      }
      public void hoverCleanup(Curve.Point p) {
         // Form properties get copied on-the-fly, as they
         // get changed.  You could do it here if you
         // prefered that the changes got copied when the
         // user hovered away from the point. 
      }

   }

   // the single dialog box that gets used to edit any slice
   SliceEditor theSliceEditor = new SliceEditor();
   
   GChartExample20a() {
     final int N_SLICES = 5;
     setChartSize(100, 100);
     setBorderStyle("none");
     setChartTitle("<h2>Hover over pie to edit!</h2>");
     setChartTitleThickness(50);
     // initial slice sizes
     double[] initSliceSize = {0.3, 0.2, 0.1, 0.2, 0.2};
     
     for (int iCurve = 0; iCurve < N_SLICES; iCurve++) {  
        addCurve();
        getCurve().getSymbol().setHoverWidget(theSliceEditor);
        getCurve().getSymbol().setBorderWidth(1);
        getCurve().getSymbol().setFillThickness(4);
        getCurve().getSymbol().setFillSpacing(4);
        getCurve().getSymbol().setHoverLocation(
           AnnotationLocation.OUTSIDE_PIE_ARC);
        getCurve().getSymbol().setBorderColor(((ColorSpec)
           colorSelector.getObject(iCurve)).borderColor);
        getCurve().getSymbol().setBackgroundColor(((ColorSpec)
           colorSelector.getObject(iCurve)).backgroundColor);
        // selection flips border and background colors
        getCurve().getSymbol().setHoverSelectionBackgroundColor(
           ((ColorSpec)
            colorSelector.getObject(iCurve)).borderColor);
        getCurve().getSymbol().setHoverSelectionBorderColor(
           ((ColorSpec)
            colorSelector.getObject(iCurve)).backgroundColor);
        getCurve().getSymbol().setSymbolType(
            SymbolType.PIE_SLICE_OPTIMAL_SHADING);
        getCurve().getSymbol().setPieSliceSize(
            initSliceSize[iCurve]);
        getCurve().getSymbol().setModelHeight(1.0); //(yMax-yMin)/3
        getCurve().getSymbol().setModelWidth(0);
        getCurve().getSymbol().setBrushSize(100, 0);
        // pie centered in "model units" 
        getCurve().addPoint(0.5, 0.5);  
     }
     getXAxis().setAxisMin(0);  // "model unit" ranges
     getXAxis().setAxisMax(1);  
     getYAxis().setAxisMin(0);  
     getYAxis().setAxisMax(1);
     // hides axes, ticks, etc. (they're not needed for pies)
     getXAxis().setHasGridlines(false); 
     getXAxis().setAxisVisible(false);  
     getXAxis().setTickCount(0);
     getYAxis().setHasGridlines(false);
     getYAxis().setAxisVisible(false);
     getYAxis().setTickCount(0);
     // create some blank space on left/right/bottom edge of
     // chart so hover widget has a place to pop into
     getYAxis().setTickLabelThickness(250);
     getY2Axis().setTickLabelThickness(250);
     getXAxis().setTickLabelThickness(250);
     update();
  }
}
