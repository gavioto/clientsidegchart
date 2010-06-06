package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

// Test all possible point annotation locations choices.
public class TestGChart07 extends GChart {
   TestGChart07(int xShift, int yShift, int fontSize, int nLines) {
     super(9*50,9*50); 
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes(
"Check: Each relative annotation location consistent with its label<br>" + 
                       " and xShift="+xShift + ", yShift=" +yShift +
                       ", fontSize="+fontSize + ", nLines="+nLines
                      );
          
     AnnotationLocation[] locations = {
             AnnotationLocation.CENTER,
             AnnotationLocation.EAST,
             AnnotationLocation.NORTH,
             AnnotationLocation.NORTHEAST,
             AnnotationLocation.NORTHWEST,
             AnnotationLocation.SOUTH,
             AnnotationLocation.SOUTHEAST,
             AnnotationLocation.SOUTHWEST,
             AnnotationLocation.WEST,
     };

     String[] locationNames = {
             "Center____",
             "East______",
             "Northg____",
             "Northeastg",
             "Northwestg",
             "South_____",
             "Southeast_",
             "Southwest_",
             "West______",
     };
     
     addCurve();
     getXAxis().setTickCount(5*locations.length+1);
     getXAxis().setTicksPerLabel(5);
     getXAxis().setHasGridlines(true);
     getYAxis().setTickCount(5*locations.length+1);
     getYAxis().setTicksPerLabel(5);
     getXAxis().setAxisMin(-1); 
     getYAxis().setAxisMin(-1);
     getYAxis().setHasGridlines(true);
     this.setGridColor("silver");
     for (int i = 0; i < locations.length; i++) {
       getCurve().addPoint(i,i); 
       getCurve().getPoint().setAnnotationLocation(locations[i]);
       if (nLines == 1)
          getCurve().getPoint(i).setAnnotationText(locationNames[i]);
       else { // test multi-line HTML
          String s = "<html>" + locationNames[i];
          for (int j = 1; j < Math.abs(nLines); j++)
             if (nLines > 0)
                s += "<br>" + locationNames[i];
             else
                s += locationNames[i];
          if (nLines > 0)
            getCurve().getPoint(i).setAnnotationText(s);
          else
             // deliberately arrange so things are not centered
             // longer s' (a width upperbound < actual width)
            getCurve().getPoint(i).setAnnotationText(
                  s, 10*fontSize, Math.abs(nLines)*fontSize);
       }
       getCurve().getPoint().setAnnotationFontSize(fontSize);
       getCurve().getPoint().setAnnotationXShift(xShift);
       getCurve().getPoint().setAnnotationYShift(yShift);
     }
     setLegendVisible(false);
   }
}
