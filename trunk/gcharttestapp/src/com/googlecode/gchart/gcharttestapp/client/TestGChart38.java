package com.googlecode.gchart.gcharttestapp.client;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.MenuBar;
import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.HoverUpdateable;
/**
 * This example uses a <tt>HoverUpdateable</tt> widget (a "hover
 * widget") to display a menu bar that allows the user to
 * change symbol color and symbol type.
 *
 */
public class TestGChart38 extends GChart {
   final String[] color = {"red", "green", "blue"};
   final String[] colorLabel = {"Red", "Green", "Blue"};
   final SymbolType[] symbol = {SymbolType.VBAR_SOUTH,
                               SymbolType.BOX_CENTER,
                               SymbolType.PIE_SLICE_HATCHED_SHADING};
   final String[] symbolLabel = {"Bar", "Box", "Pie"};
   final TouchedPointUpdateOption updateOption;
   
   class CurveEditingMenu extends Grid implements HoverUpdateable {
          MenuBar colorMenu = new MenuBar(true);        
          MenuBar symbolMenu = new MenuBar(true);
       class SetColor implements Command {
          String color;
          SetColor(String color) {
             this.color = color;
          }
          public void execute() {
             getTouchedCurve().getSymbol().setBorderColor(color);
             update(updateOption);
          }
       }
       class SetSymbol implements Command {
          SymbolType symbol;
          SetSymbol(SymbolType symbol) {
             this.symbol = symbol;
          }
          public void execute() {
             getTouchedCurve().getSymbol().setSymbolType(symbol);
             update(updateOption);
          }
       }
       

       MenuBar createMenuSystem() {
          MenuBar result = new MenuBar(true);
          colorMenu = new MenuBar(true);        
          symbolMenu = new MenuBar(true);
//       setStyleName("gchartestapp-GChartExample20-CurveEditingMenu");
    for (int i = 0; i < colorLabel.length; i++) 
       colorMenu.addItem(colorLabel[i],
                         new SetColor(color[i]));
    for (int i = 0; i < symbolLabel.length; i++) 
       symbolMenu.addItem(symbolLabel[i],
                         new SetSymbol(symbol[i]));
       result.addItem("Color", colorMenu);
       result.addItem("Symbol", symbolMenu);
       result.setWidth("5em");
       result.setAutoOpen(true);
       return result;
     }
         
     CurveEditingMenu() {
         super(1,1);
         setWidget(0,0,createMenuSystem());
         setWidth("10em");
         setHeight("7em");    
         getCellFormatter().setAlignment(0, 0, HasHorizontalAlignment.ALIGN_LEFT,
                      HasVerticalAlignment.ALIGN_TOP);
    }
      public void hoverUpdate(Curve.Point p) {
         //        mainMenu.clearItems();
 //        DeferredCommand.addCommand(new Command() { public void execute() {
 //        colorMenu.setVisible(true);
 //        symbolMenu.setVisible(true);
 //        Window.alert("Deferred Update");
 //        }});
//         Window.alert("Update");
//         mainMenu.setVisible(true);
//         mainMenu.addItem("Color", colorMenu);
         //         mainMenu.addItem("Symbol", symbolMenu);
         colorMenu.setVisible(false);
         symbolMenu.setVisible(false);
         setWidget(0, 0, createMenuSystem());
      }
      public void hoverCleanup(Curve.Point p) {
         colorMenu.setVisible(false);
         symbolMenu.setVisible(false);
         //         mainMenu.clearItems();
           
//         update(TouchedPointUpdateOption.TOUCHED_POINT_UPDATED);
//         mainMenu.setVisible(false);
//         Window.alert("Cleanup");
      }
   }

   
   TestGChart38(TouchedPointUpdateOption option) {
     updateOption = option;
     setChartSize(200, 200);
     setPadding("10px");
//     setOptimizeForMemory(true);
     HoverUpdateable hoverWidget = new CurveEditingMenu();
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
