package com.googlecode.gchart.gcharttestapp.client;


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.googlecode.gchart.client.GChart;

/** A series of single slices at random orientations (throw some
 * random slices at GWTCanvas to see if it can take it)*/
public class TestGChart14d extends GChart {
   final int N_SLICES = 16;
   final int N_PIES = 10;
   final Button updateButton = new Button(
"Check: 10, 16-equal-sliced, pies at random orientations that change when you click.");
   void randomizePieOrientations() {
      for (int j = 0; j < N_PIES; j+=N_SLICES) {
         getCurve(j).getSymbol().setPieSliceOrientation(
            GChartTestApp.rnd());
         update();
      }
   }
   TestGChart14d() {
      this.setChartSize(750, 200);
      setChartTitle(GChartTestApp.getTitle(this));
      setChartFootnotes(updateButton);
      updateButton.addClickHandler(new ClickHandler() {
         public void onClick(ClickEvent event) {
            randomizePieOrientations();
         }
      });
      
      setLegendVisible(false);

      getXAxis().setAxisMin(0);
      getXAxis().setAxisVisible(false);
      getXAxis().setTickCount(0);
      getYAxis().setAxisMin(-1);
      getYAxis().setAxisMax(1);
      getYAxis().setAxisVisible(false);
      getYAxis().setTickCount(0);

      for (int j = 0; j < N_PIES; j++) {
         for (int i=0; i < N_SLICES; i++) {
            addCurve();
            getCurve().addPoint(0.5+j,0);
            getCurve().getSymbol().setBorderWidth(1);
            getCurve().getSymbol().setSymbolType(
               SymbolType.PIE_SLICE_OPTIMAL_SHADING);
            getCurve().getSymbol().setModelWidth(1);
            getCurve().getSymbol().setHeight(0);
            getCurve().getSymbol().setFillSpacing(0);
            getCurve().getSymbol().setPieSliceSize(1./N_SLICES);
            getCurve().getSymbol().setBackgroundColor(
               getCurve().getSymbol().getBorderColor());
            getCurve().getPoint().setAnnotationText(i+"");
            getCurve().getPoint().setAnnotationFontSize(8);
            getCurve().getPoint().setAnnotationLocation(
               AnnotationLocation.INSIDE_PIE_ARC);
            getCurve().getSymbol().setBrushSize(5,5);
         }
      }
      randomizePieOrientations();
   }
}
