package com.googlecode.gchart.gcharttestapp.client;
import com.googlecode.gchart.client.GChart;
/**
 *  Defines a line chart of 5*sin(x) & 5*cos(x) vs x that extends beyond
 *  both the plot area and the decorated chart along all four edges, so
 *  that we can test the new w 2.5 setClipToPlotArea and
 *  setClipToDecoratedChart methods with both canvas and HTML elements.
 *  <p>
 *
 *  This test requires reviewing the HTML elements in Firebug to verify
 *  that only the actually visible image elements (representing square
 *  point markers) are present in the DOM, and that the canvas rectangle
 *  is collapsed down to the clipped-to region. Note that without such
 *  Firebug checks, the "visibility: hidden" on the various parent
 *  panels could be simply hiding these elements (or excess canvas
 *  pixels) which would result in wasted time/space.
 *
 */
public class GChartExample23 extends GChart {
   GChartExample23(boolean clipToPlotArea,
                   boolean clipToDecoratedChart) {
     setChartTitle("<b>x<sup>2</sup> vs x</b>");
     setChartFootnotes("clipToPlotArea="
                       + clipToPlotArea 
                       + " and clipToDecoratedChart=" 
                       + clipToDecoratedChart);
     setChartSize(150, 150);
     getXAxis().setAxisMin(0);
     getXAxis().setAxisMax(2*Math.PI);
     getXAxis().setTickCount(11);
         
     getYAxis().setAxisMin(-1);
     getYAxis().setAxisMax(1);
     getYAxis().setTickCount(11);
     getY2Axis().setAxisMin(-1);
     getY2Axis().setAxisMax(1);
     getY2Axis().setTickCount(11);
     setClipToPlotArea(clipToPlotArea);
     setClipToDecoratedChart(clipToDecoratedChart);
     addCurve();
     getCurve().getSymbol().setFillThickness(3);
     getCurve().getSymbol().setSymbolType(SymbolType.LINE);
     getCurve().getSymbol().setHoverSelectionSymbolType(
        SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().getSymbol().setHoverSelectionFillSpacing(1);
     if (getCurve().getSymbol().getHoverSelectionFillSpacing()!=1)
        throw new IllegalStateException("GChartExample23 exception 1");
     getCurve().getSymbol().setHoverSelectionFillThickness(1);
     if (getCurve().getSymbol().getHoverSelectionFillThickness()!=1)
        throw new IllegalStateException("GChartExample23 exception 2");
      for (double theta = -2*Math.PI; theta < 4*Math.PI; theta+=Math.PI/10) 
        getCurve().addPoint(theta,5*Math.sin(theta));
     addCurve();
     getCurve().getSymbol().setFillThickness(3);
     getCurve().getSymbol().setSymbolType(SymbolType.LINE);
     getCurve().getSymbol().setHoverSelectionSymbolType(
        SymbolType.PIE_SLICE_OPTIMAL_SHADING);
     getCurve().setYAxis(Y2_AXIS);
     for (double theta = -2*Math.PI; theta < 4*Math.PI; theta+=Math.PI/10) 
        getCurve().addPoint(theta,5*Math.cos(theta));
  }
}
