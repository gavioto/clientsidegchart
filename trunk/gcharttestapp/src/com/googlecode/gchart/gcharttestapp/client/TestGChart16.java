package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

/** Tests the HBAR_BASELINE_* and VBAR_BASELINE_* symbol types*/
public class TestGChart16 extends GChart {
   TestGChart16(int id, int borderWidth) {
     super(600,400); 
     GChart.SymbolType[] symbolTypes = {
       GChart.SymbolType.HBAR_BASELINE_NORTH,
       GChart.SymbolType.HBAR_BASELINE_CENTER,
       GChart.SymbolType.HBAR_BASELINE_SOUTH,
       GChart.SymbolType.VBAR_BASELINE_WEST,
       GChart.SymbolType.VBAR_BASELINE_CENTER,
       GChart.SymbolType.VBAR_BASELINE_EAST,
     };

     AnnotationLocation[] locations =  {
       AnnotationLocation.CENTER,
       AnnotationLocation.CLOSEST_TO_VERTICAL_BASELINE,
       AnnotationLocation.FARTHEST_FROM_VERTICAL_BASELINE,
       AnnotationLocation.CENTER,
       AnnotationLocation.CLOSEST_TO_HORIZONTAL_BASELINE,
       AnnotationLocation.FARTHEST_FROM_HORIZONTAL_BASELINE,
     };

     String[] locationStr =  {
    	       "center",
    	       "closest",
    	       "farthest",
    	       "center",
    	       "closest",
    	       "farthest",
     };
           

     String[] checks = {
       "HBAR_BASELINE_NORTH",
       "HBAR_BASELINE_CENTER",
       "HBAR_BASELINE_SOUTH",
       "VBAR_BASELINE_WEST",
       "VBAR_BASELINE_CENTER",
       "VBAR_BASELINE_EAST",
     };
     setChartTitle("<h2><br>GChart 16, id="+id+", borderWidth="+borderWidth+"</h2>");
     setChartFootnotes("Check: baseline="+id+" with "+checks[id]);
     getXAxis().setHasGridlines(true);
     getXAxis().setTickCount(11);
     getYAxis().setHasGridlines(true);
     getYAxis().setTickCount(11);
     getY2Axis().setHasGridlines(true);
     getY2Axis().setTickCount(11);

     for (int i = 0; i < 2; i++) {
       addCurve();
       if (i == 1) getCurve().setYAxis(Y2_AXIS);
       getCurve().getSymbol().setSymbolType(symbolTypes[id]);
       getCurve().getSymbol().setModelWidth(1./(i+1.));
       getCurve().getSymbol().setModelHeight(1./(i+1.));
       // use the default midpoint with id=5
       if (id!=5) getCurve().getSymbol().setBaseline(id);
       getCurve().getSymbol().setBackgroundColor((i<1)?"red":"blue");
       getCurve().getSymbol().setBorderColor("gray");
       getCurve().getSymbol().setBorderWidth(borderWidth);
       getCurve().setLegendLabel("Id=" + id);
       for (int j = 0; j < 11; j++) {
         getCurve().addPoint(j, j);
         getCurve().getPoint().setAnnotationText(locationStr[id]);
         getCurve().getPoint().setAnnotationLocation(locations[id]);
       }
     }
   }
}
