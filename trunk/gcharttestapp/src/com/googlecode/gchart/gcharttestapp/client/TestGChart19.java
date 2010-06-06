package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

/* Chart to test GChart's stylename support, and setFontFamily and
 * related methods.
 *
 * Note that the CSS styles in:
 * C:\gcharttrunk\gcharttestapp\src\com\googlecode\gchart\gcharttestapp\public\gcharttestapp.css
 * (which are imported via a <stylename src="gcharttestapp.css"/> in the
 * gcharttestapp.gwt.xml GWT module definition file) are
 * an integral part of this test.
 *
 */
public class TestGChart19 extends GChart {
  private String[] footnotes = {
"Check: 1px black solid border; white background; Arial font",
"Check: 50px red dotted border; yellow background; monospace font",
"Check: 10px green solid border; red background; serif font",
"Check: 1px black solid border; white background; Arial font",
  };
    
   TestGChart19(int id) {
     super(150,150);
     setChartTitle(GChartTestApp.getTitle(this)+"(id="+id+")");
     setChartFootnotes(footnotes[id]);
     getYAxis().setTickLabelFormat("#.0");
     if (id == 1) {
       // switch to an alt stylename, and "unset" convenience methods
       setStyleName("gcharttestapp-TestGChart19");
       setBorderStyle("solid");
       setBorderColor("green");
       setBorderWidth("10px");
       setBackgroundColor("red");
       setBorderStyle(USE_CSS);   // these should ignore preceeding
       setBorderColor(USE_CSS);   // settings, so stylename kicks in.
       setBorderWidth(USE_CSS);
       setBackgroundColor(USE_CSS);
       getXAxis().setTickLabelFontFamily("monospace");
       getYAxis().setTickLabelFontFamily("monospace");
       getY2Axis().setTickLabelFontFamily("monospace");
       setLegendFontFamily("monospace");
       setFontFamily("monospace");
     }
     else if (id == 2) { // test using "CSS convenience methods"
       setBorderStyle("solid");
       setBorderColor("green");
       setBorderWidth("10px");
       setBackgroundColor("red");
       getXAxis().setTickLabelFontFamily("serif");
       getYAxis().setTickLabelFontFamily("serif");
       getY2Axis().setTickLabelFontFamily("serif");
       setLegendFontFamily("serif");
       setFontFamily("serif");
     }
     else if (id == 3) {
// test setting to a non-standard value, then setting back, should
// be the same as id == 0       
       setBorderStyle("solid");
       setBorderColor("green");
       setBorderWidth("10px");
       setBackgroundColor("red");
       getXAxis().setTickLabelFontFamily("monospace");
       getYAxis().setTickLabelFontFamily("monospace");
       getY2Axis().setTickLabelFontFamily("monospace");
       setLegendFontFamily("monospace");
       update();
       setBorderStyle(USE_CSS);
       setBorderColor(USE_CSS);
       setBorderWidth(USE_CSS);
       setBackgroundColor(USE_CSS);
       setFontFamily(USE_CSS);
       getXAxis().setTickLabelFontFamily(null);
       getYAxis().setTickLabelFontFamily(null);
       getY2Axis().setTickLabelFontFamily(null);
       setLegendFontFamily(null);
     }
/* else id==0; test with default stylename, "gchart-GChart" */
       addCurve();
       getCurve().addPoint(1, 1);
       getCurve().setLegendLabel("This is a test legend label");
       update();       
   }  
}
