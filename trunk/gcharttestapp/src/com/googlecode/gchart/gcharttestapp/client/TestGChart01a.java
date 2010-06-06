package com.googlecode.gchart.gcharttestapp.client;


import com.googlecode.gchart.client.GChart;

/** Simple a chart with just one point on it, and with modified
 * border styles */
public class TestGChart01a extends GChart {
   TestGChart01a() {
     super(150,150);
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes("Check: 1 pt at (1,1) with x,y axes from 1 to 10.<br>" +
"10 px dotted red borders on chart, plotArea and legend");
     setBorderStyle("dotted");
     setBorderColor("red");
     if (!getBorderStyle().equals("dotted"))
       throw new IllegalStateException(
          "getBorderStyle.equals(dotted) failed");
     setBorderWidth("10px");
     setPlotAreaBorderStyle("dotted");
     setPlotAreaBorderColor("red");
     if (!getPlotAreaBorderStyle().equals("dotted"))
       throw new IllegalStateException(
         "getPlotAreaBorderStyle.equals(dotted) failed");
     setPlotAreaBorderWidth(10);
     setPlotAreaBorderColor("red");
     setLegendBorderStyle("dotted");
     setLegendBorderColor("red");
     if (!getLegendBorderStyle().equals("dotted"))
       throw new IllegalStateException(
         "getLegendBorderStyle().equals(dotted) failed");
     setLegendBorderWidth(10);

     addCurve();
     getCurve().addPoint(1, 1);
     getCurve().setLegendLabel("Curve 0");
   }
}
