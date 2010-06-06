package com.googlecode.gchart.gcharttestapp.client;


import com.googlecode.gchart.client.GChart;

/** Simple a chart with just one point on it, used for testing
 * methods for telling GChart to look for the blank gif in
 * the host page, rather than the module base, directory. */
public class TestGChart01 extends GChart {
   TestGChart01(int imageId, int targetArea) {
     super(500,200);
     setChartTitle(GChartTestApp.getTitle(this)+" imageId="+imageId+ " targetArea=" + targetArea);
// msg[targetArea][imageId]
     String[][] msg = {{"Check: all chart elements except labels red",
     "Check: missing image icon appears on points and plot area.",
     "Check: no missing image icon appears on chart area or points",
     "Check: missing image icons appear on points and plot area iff IP connection is down (otherwise, 3D pies)"},
     {"Check: all points red",
     "Check: missing image icon appears on all points",
     "Check: no missing image icon appears on chart",
     "Check: missing image icons appear on points iff IP connection is down (otherwise, 3D pies)."},
     {"Check: plot area red",
     "Check: missing image icon appears on plot area",
     "Check: no missing image icon appears on plot area",
     "Check: missing image icon appears on plot area iff IP connection is down (otherwise, 3D pies)."}};
     
     String[] imageURL = {
       "red.gif",
       "no-such-file.gif",
       "../com.googlecode.gchart.gcharttestapp.GChartTestApp/gchart.gif",
       "http://chart.apis.google.com/chart?cht=p3&chd=t:100&chs=500x200"
     };
     
     setChartFootnotes(msg[targetArea][imageId]);
     addCurve();
     if (targetArea==0)
        GChart.setBlankImageURL(imageURL[imageId]);
     else if (targetArea == 1)
       getCurve().getSymbol().setImageURL(imageURL[imageId]);
     else if (targetArea == 2)
       setPlotAreaImageURL(imageURL[imageId]);             
     if (targetArea==0)
        if (GChart.getBlankImageURL() !=
            imageURL[imageId]) throw new IllegalStateException("getBlankImageURL method failed.");
     else if (targetArea == 1)
        if (getCurve().getSymbol().getImageURL() !=
            imageURL[imageId]) throw new IllegalStateException("getImageURL method failed.");
     else if (targetArea == 2)
        if (getPlotAreaImageURL() !=
            imageURL[imageId]) throw new IllegalStateException("getPlotAreaImageURL method failed.");;

     getCurve().getSymbol().setModelHeight(1);
     getCurve().getSymbol().setModelWidth(1);
     getCurve().getSymbol().setBorderWidth(0);
     getCurve().addPoint(1, 1);
     getCurve().addPoint(2, 2);
     getCurve().addPoint(3, 3);
     getCurve().setLegendLabel("Curve 0");
     // restore default blank image URL for any future tests
     update(); 
     GChart.setBlankImageURL(GChart.DEFAULT_BLANK_IMAGE_URL);
   }
}
