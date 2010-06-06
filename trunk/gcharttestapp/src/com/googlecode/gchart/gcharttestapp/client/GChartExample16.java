package com.googlecode.gchart.gcharttestapp.client;
import com.googlecode.gchart.client.GChart;
/**
 * Creates a Spark-line-like line chart without any annotations on it
 */
public class GChartExample16 extends GChart {
   GChartExample16() {
      super(100, 20);
      double yData[] =
        {1., 2., 1.5, 1.0, 10, 2.0, 1.5, 1.6, 15, 1.0, 1.5}; 
     addCurve();
     getCurve().getSymbol().setSymbolType(SymbolType.LINE);
     getCurve().getSymbol().setHeight(0);
     getCurve().getSymbol().setWidth(0);
     for (int i = 0; i < yData.length; i++) 
        getCurve().addPoint(i,yData[i]);

     getXAxis().setTickLabelThickness(0);
     getXAxis().setTickLength(0);
     getXAxis().setAxisVisible(false);
     getXAxis().setTickCount(0);
     getYAxis().setTickLabelThickness(0);
     getYAxis().setTickLength(0);
     getYAxis().setAxisVisible(false);
     getYAxis().setTickCount(0);
     getY2Axis().setTickLabelThickness(0);
     getY2Axis().setTickLength(0);
     getY2Axis().setAxisVisible(false);
     getY2Axis().setTickCount(0);     
  }
}
