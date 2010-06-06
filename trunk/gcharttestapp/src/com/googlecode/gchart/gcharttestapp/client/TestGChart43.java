package com.googlecode.gchart.gcharttestapp.client;
import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.HoverParameterInterpreter;
/**
 * Tests GChart's coordinate conversion methods: Axis.clientToModel,
 * modelToClient, pixelToModel, and modelToPixel
 */
public class TestGChart43 extends GChart {

   class CoordinateConversionTester implements
         HoverParameterInterpreter {
      public String getHoverParameter(String pName, Curve.Point p) {
         String result = null;
         if ("onY2".equals(pName))
            result = "" + p.getParent().onY2();
         else if ("xClient".equals(pName))
            result = getXAxis().formatAsTickLabel(
               getXAxis().modelToClient(p.getX()));   
         else if ("yClient".equals(pName)) {
            if (p.getParent().onY2())
              result = getY2Axis().formatAsTickLabel(
                 getY2Axis().modelToClient(p.getY()));   
            else
              result = getYAxis().formatAsTickLabel(
                 getYAxis().modelToClient(p.getY()));   
         }
         else if ("xPixel".equals(pName))
            result = getXAxis().formatAsTickLabel(
               getXAxis().modelToPixel(p.getX()));   
         else if ("yPixel".equals(pName)) {
            if (p.getParent().onY2())
              result = getY2Axis().formatAsTickLabel(
                 getY2Axis().modelToPixel(p.getY()));   
            else
              result = getYAxis().formatAsTickLabel(
                 getYAxis().modelToPixel(p.getY()));   
         }
         // useless round-trip conversions to exercise clientToModel
         else if ("xModelViaClient".equals(pName))
            result = getXAxis().formatAsTickLabel(
               getXAxis().clientToModel((int) Math.round(
                  getXAxis().modelToClient(p.getX()))));   
         else if ("yModelViaClient".equals(pName)) {
            if (p.getParent().onY2())
               result = getY2Axis().formatAsTickLabel(
                 getY2Axis().clientToModel((int) Math.round(
                 getY2Axis().modelToClient(p.getY()))));   
            else
               result = getYAxis().formatAsTickLabel(
                 getYAxis().clientToModel((int) Math.round(
                 getYAxis().modelToClient(p.getY()))));   
         }
         else if ("xModelViaPixel".equals(pName))
            result = getXAxis().formatAsTickLabel(
               getXAxis().pixelToModel((int) Math.round(
                  getXAxis().modelToPixel(p.getX()))));   
         else if ("yModelViaPixel".equals(pName)) {
            if (p.getParent().onY2())
               result = getY2Axis().formatAsTickLabel(
                 getY2Axis().pixelToModel((int) Math.round(
                 getY2Axis().modelToPixel(p.getY()))));   
            else
               result = getYAxis().formatAsTickLabel(
                 getYAxis().pixelToModel((int) Math.round(
                 getYAxis().modelToPixel(p.getY()))));   
         }
         else if ("xModelViaPlotAreaPixel".equals(pName))
            result = getXAxis().formatAsTickLabel(
               getXAxis().plotAreaPixelToModel((int) Math.round(
                  getXAxis().modelToPlotAreaPixel(p.getX()))));   
         else if ("yModelViaPlotAreaPixel".equals(pName)) {
            if (p.getParent().onY2())
               result = getY2Axis().formatAsTickLabel(
                 getY2Axis().plotAreaPixelToModel((int) Math.round(
                 getY2Axis().modelToPlotAreaPixel(p.getY()))));   
            else
               result = getYAxis().formatAsTickLabel(
                 getYAxis().plotAreaPixelToModel((int) Math.round(
                 getYAxis().modelToPlotAreaPixel(p.getY()))));   
         }
         return result;
      }

   }
   TestGChart43() {
      setHoverParameterInterpreter(new CoordinateConversionTester());
      String hoverTemplate = GChart.formatAsHovertext(
         "onY2=${onY2}<br>" +
         "xClient=${xClient}<br>" +
         "yClient=${yClient}<br>" +
         "xPixel=${xPixel}<br>" +
         "yPixel=${yPixel}<br>" +
         "xModelViaClient=${xModelViaClient}<br>" +
         "yModelViaClient=${yModelViaClient}<br>" +
         "xModelViaPixel=${xModelViaPixel}<br>" +
         "yModelViaPixel=${yModelViaPixel}<br>" +
         "xModelViaPlotAreaPixel=${xModelViaPlotAreaPixel}<br>" +
         "yModelViaPlotAreaPixel=${yModelViaPlotAreaPixel}");
     setChartFootnotes(
"Check: hover client,pixel x and y change by 100px point-to-point. <br>" + 
"All model units consistent with those of point/axis.");
     setChartSize(501, 501);
     addCurve();
     getCurve().getSymbol().setHovertextTemplate(hoverTemplate);
     getCurve().getSymbol().setHoverLocation(
         AnnotationLocation.SOUTHEAST);
     getCurve().setLegendLabel("On Y");
     for (int i = 0; i <= 100; i+=20) 
       getCurve().addPoint(i,i);
     addCurve();
     getCurve().setYAxis(Y2_AXIS);
     getCurve().getSymbol().setHovertextTemplate(hoverTemplate);
     getCurve().getSymbol().setHoverLocation(
        AnnotationLocation.SOUTHEAST);
     getCurve().setLegendLabel("On Y2");
     for (int i = 0; i <= 10; i+=2) 
        getCurve().addPoint(10*i,10-i);

     getXAxis().setTickCount(11);
     getYAxis().setTickCount(11);
     getY2Axis().setTickCount(11);
     getXAxis().setHasGridlines(true);
     getYAxis().setHasGridlines(true);
     // before first update, this should always return null
     if (getClosestBrushTouchingPoint(1,1) != null)
        throw new IllegalStateException("TestGChart43 exception 0.");
     update();
     // first point of first curve
     if (getClosestBrushTouchingPoint(1,499) != getCurve(0).getPoint(0))
        throw new IllegalStateException("TestGChart43 exception 1.");
     // last point of first curve
     if (getClosestBrushTouchingPoint(499,1) != getCurve(0).getPoint())
        throw new IllegalStateException("TestGChart43 exception 2.");
     // point not on any curve
     if (getClosestBrushTouchingPoint(0,480) != null)
        throw new IllegalStateException("TestGChart43 exception 3.");
     
  }
}
