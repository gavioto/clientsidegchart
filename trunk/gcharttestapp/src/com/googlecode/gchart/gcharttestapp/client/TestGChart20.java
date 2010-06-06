package com.googlecode.gchart.gcharttestapp.client;

import com.googlecode.gchart.client.GChart;

/* Chart to test "capped border"--what happens when border is
 * larger than specified symbol size.
 *
 * Also tests that a negative hover border width (used as hover
 * feedback in this test) surrounds the symbol in the expected way.
 *
 */
public class TestGChart20 extends GChart {
    
   TestGChart20() {
     super(500,300);
     setChartTitle(GChartTestApp.getTitle(this));
     setChartFootnotes(
"Check: Sequence of 0, 1, 2, ... 20 pixel-sided pure red squares.<br>" +
"When you hover over each, it expands in place to within 1px of size of largest square.");
     for (int i=0; i < 21; i+=1) {
       addCurve();
       getCurve().addPoint(i, i);
       // none of the green should show through
       getCurve().getSymbol().setBackgroundColor("green");
       getCurve().getSymbol().setBorderColor("red");
// border is bigger than specified width/height for first 9 curves
// so the "capped border" code needs to kick in...
       getCurve().getSymbol().setBorderWidth(10);
       getCurve().getSymbol().setHoverSelectionBorderWidth(-10+i/2);
       getCurve().getSymbol().setHoverSelectionBorderColor("red");
       getCurve().getSymbol().setWidth(i);
       getCurve().getSymbol().setHeight(i);
     }
   }  
}
