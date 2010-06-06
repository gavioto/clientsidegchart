package com.googlecode.gchart.gcharttestapp.client;

import com.google.gwt.user.client.ui.HTML;
import com.googlecode.gchart.client.GChart;
import com.googlecode.gchart.client.GChartCanvasFactory;
import com.googlecode.gchart.client.GChartCanvasLite;

/**
 * Simple proof-of-concept performance test for preVG
 * 
 */
public class TestGChart60 extends GChart {
	final static int HEIGHT = 200;
	final static int WIDTH = 200;
	final static int MAX_POINTS = 100;

	static final class PreVG extends HTML implements GChartCanvasLite {

		PreVG() {
			super();
			setPixelSize(WIDTH, HEIGHT);
		}

		private String[] blank = {
				"+",
				" +",
				"  +",
				"   +",
				"    +",
				"     +",
				"      +",
				"       +",
				"        +",
				"         +",
				"          +",
				"           +",
				"            +",
				"             +",
				"              +",
				"               +",
				"                +",
				"                 +",
				"                  +",
				"                   +",
				"                    +",
				"                     +",
				"                      +",
				"                       +",
				"                        +",
				"                         +",
				"                          +",
				"                           +",
				"                            +",
				"                             +",
				"                              +",
				"                               +",
				"                                +",
				"                                 +",
				"                                  +",
				"                                   +",
				"                                    +",
				"                                     +",
				"                                      +",
				"                                       +",
				"                                        +",
				"                                         +",
				"                                          +",
				"                                           +",
				"                                            +",
				"                                             +",
				"                                              +",
				"                                               +",
				"                                                +",
				"                                                 +",
				"                                                  +",
				"                                                   +",
				"                                                    +",
				"                                                     +",
				"                                                      +",
				"                                                       +",
				"                                                        +",
				"                                                         +",
				"                                                          +",
				"                                                           +",
				"                                                            +",
				"                                                             +",
				"                                                              +",
				"                                                               +",
				"                                                                +",
				"                                                                 +",
				"                                                                  +",
				"                                                                   +",
				"                                                                    +",
				"                                                                     +",
				"                                                                      +",
				"                                                                       +",
				"                                                                        +",
				"                                                                         +",
				"                                                                          +",
				"                                                                           +",
				"                                                                            +",
				"                                                                             +",
				"                                                                              +",
				"                                                                               +",
				"                                                                                +",
				"                                                                                 +",
				"                                                                                  +",
				"                                                                                   +",
				"                                                                                    +",
				"                                                                                     +",
				"                                                                                      +",
				"                                                                                       +",
				"                                                                                        +",
				"                                                                                         +",
				"                                                                                          +",
				"                                                                                           +",
				"                                                                                            +",
				"                                                                                             +",
				"                                                                                              +",
				"                                                                                               +",
				"                                                                                                +",
				"                                                                                                 +",
				"                                                                                                  +",
				"                                                                                                   +",
				"                                                                                                    +",
				"                                                                                                     +",
				"                                                                                                      +",
				"                                                                                                       +",
				"                                                                                                        +",
				"                                                                                                         +",
				"                                                                                                          +",
				"                                                                                                           +",
				"                                                                                                            +",
				"                                                                                                             +",
				"                                                                                                              +",
				"                                                                                                               +",
				"                                                                                                                +",
				"                                                                                                                 +",
				"                                                                                                                  +",
				"                                                                                                                   +",
				"                                                                                                                    +",
				"                                                                                                                     +",
				"                                                                                                                      +",
				"                                                                                                                       +",
				"                                                                                                                        +",
				"                                                                                                                         +",
				"                                                                                                                          +",
				"                                                                                                                           +",
				"                                                                                                                            +",
				"                                                                                                                             +",
				"                                                                                                                              +",
				"                                                                                                                               +",
				"                                                                                                                                +",
				"                                                                                                                                 +",
				"                                                                                                                                  +",
				"                                                                                                                                   +",
				"                                                                                                                                    +",
				"                                                                                                                                     +",
				"                                                                                                                                      +",
				"                                                                                                                                       +",
				"                                                                                                                                        +",
				"                                                                                                                                         +",
				"                                                                                                                                          +",
				"                                                                                                                                           +",
				"                                                                                                                                            +",
				"                                                                                                                                             +",
				"                                                                                                                                              +",
				"                                                                                                                                               +",
				"                                                                                                                                                +",
				"                                                                                                                                                 +",
				"                                                                                                                                                  +",
				"                                                                                                                                                   +",
				"                                                                                                                                                    +",
				"                                                                                                                                                     +",
				"                                                                                                                                                      +",
				"                                                                                                                                                       +",
				"                                                                                                                                                        +",
				"                                                                                                                                                         +",
				"                                                                                                                                                          +",
				"                                                                                                                                                           +",
				"                                                                                                                                                            +",
				"                                                                                                                                                             +",
				"                                                                                                                                                              +",
				"                                                                                                                                                               +",
				"                                                                                                                                                                +",
				"                                                                                                                                                                 +",
				"                                                                                                                                                                  +",
				"                                                                                                                                                                   +",
				"                                                                                                                                                                    +",
				"                                                                                                                                                                     +",
				"                                                                                                                                                                      +",
				"                                                                                                                                                                       +",
				"                                                                                                                                                                        +",
				"                                                                                                                                                                         +",
				"                                                                                                                                                                          +",
				"                                                                                                                                                                           +",
				"                                                                                                                                                                            +",
				"                                                                                                                                                                             +",
				"                                                                                                                                                                              +",
				"                                                                                                                                                                               +",
				"                                                                                                                                                                                +",
				"                                                                                                                                                                                 +",
				"                                                                                                                                                                                  +",
				"                                                                                                                                                                                   +",
				"                                                                                                                                                                                    +",
				"                                                                                                                                                                                     +",
				"                                                                                                                                                                                      +",
				"                                                                                                                                                                                       +",
				"                                                                                                                                                                                        +",
				"                                                                                                                                                                                         +",
				"                                                                                                                                                                                          +",
				"                                                                                                                                                                                           +",
				"                                                                                                                                                                                            +",
				"                                                                                                                                                                                             +",
				"                                                                                                                                                                                              +",
				"                                                                                                                                                                                               +",
				"                                                                                                                                                                                                +",
				"                                                                                                                                                                                                 +",
				"                                                                                                                                                                                                  +",
				"                                                                                                                                                                                                   +",
				"                                                                                                                                                                                                    +",
				"                                                                                                                                                                                                     +",
				"                                                                                                                                                                                                      +",
				"                                                                                                                                                                                                       +",
				"                                                                                                                                                                                                        +",
				"                                                                                                                                                                                                         +",
				"                                                                                                                                                                                                          +",
				"                                                                                                                                                                                                           +",
				"                                                                                                                                                                                                            +",
				"                                                                                                                                                                                                             +",
				"                                                                                                                                                                                                              +",
				"                                                                                                                                                                                                               +",
				"                                                                                                                                                                                                                +",
				"                                                                                                                                                                                                                 +",
				"                                                                                                                                                                                                                  +",
				"                                                                                                                                                                                                                   +",
				"                                                                                                                                                                                                                    +",
				"                                                                                                                                                                                                                     +",
				"                                                                                                                                                                                                                      +", };
  	private static double[] x = new double[MAX_POINTS];
		private static double[] y = new double[MAX_POINTS];
		private static int nPts = 0; // number of points actually in buffer now

		private final static boolean pixels[][] = new boolean[2 * HEIGHT + 1][2 * WIDTH + 1];

		// remembers 'lineTo' points
		private void logPoint(double xIn, double yIn) {
			if (nPts < MAX_POINTS) { // not yet full buffer
				nPts++;
			} else {
				throw new IllegalStateException("Max allowed points "
						+ MAX_POINTS + " exceeded.");
			}
			x[nPts - 1] = xIn;
			y[nPts - 1] = yIn;
		}

		public void beginPath() {
			nPts = 0; // clears out rolling point buffer
		}

		public void closePath() {
		}

    static private int iPass = 0;
		public void stroke() {

      if (iPass == 0) {
			// clear out any previously drawn lines
			for (int i = 0; i <= WIDTH; i++)
				for (int j = 0; j <= HEIGHT; j++)
					pixels[i][j] = false;

			// draw lines into the pixel array
			int x0 = (int) x[0];
			int y0 = (int) y[0];
			for (int i = 1; i < nPts; i++) {
				int x1 = (int) x[i];
				int y1 = (int) y[i];
				if (x1 != x0 || y1 != y0) {
					int xsign = (x1 >= x0) ? 1 : -1;
					int ysign = (y1 >= y0) ? 1 : -1;
					if (xsign * (x1 - x0) > ysign * (y1 - y0)) {
						for (int ix = x0; ix != x1; ix += xsign) {
							int iy = (y0 * (x1 - ix) + y1 * (ix - x0))
									/ (x1 - x0);
							pixels[iy][ix] = true;
						}
					} else {
						for (int iy = y0; iy != y1; iy += ysign) {
							int ix = (x0 * (y1 - iy) + x1 * (iy - y0))
									/ (y1 - y0);
							pixels[iy][ix] = true;
						}
					}
				}
				x0 = x1;
				y0 = y1;
      }
      iPass++;
      }
			/*
			 * String s =
			 * "<pre style='font: 1px/1px monospace; letter-spacing:0px; color:rgb(255,0,0); '>"
			 * ; for (int i = 0; i <= HEIGHT+10; i++) { int iBlank = 0; for (int
			 * j = 0; j <= WIDTH; j++) { if (!pixels[i][j]) { iBlank++; } else {
			 * s += blank[iBlank]+"+"; iBlank = 0; } } // s += pixels[i][j] ?
			 * "+" : " "; s += "\n"; } s += "</pre>"; setHTML(s);
			 * 
			 * String s0 =
			 * "<pre style='font: 1px/1px monospace; letter-spacing:0px; color:rgb(255,0,0); '>"
			 * ; ArrayList<String> s = new ArrayList<String>(); s.add(s0); for
			 * (int i = 0; i <= HEIGHT+10; i++) { int iBlank = 0; for (int j =
			 * 0; j <= WIDTH; j++) { if (!pixels[i][j]) { iBlank++; } else {
			 * s.add(blank[iBlank]); s.add("+"); iBlank = 0; } } // s +=
			 * pixels[i][j] ? "+" : " "; s.add("\n"); } s.add("</pre>");
			 * setHTML(Arrays.toString(s.toArray())); String s0 =
			 * "<pre style='font: 1px/1px monospace; letter-spacing:0px; color:rgb(255,0,0); '>"
			 * ; char[] s0C = s0.toCharArray(); char[] s = new
			 * char[HEIGHT*WIDTH]; int iC = 0; for (; iC < s0C.length; iC++)
			 * s[iC] = s0C[iC];
			 * 
			 * for (int i = 0; i <= HEIGHT+10; i++) { int iBlank = 0; for (int j
			 * = 0; j <= WIDTH; j++) { if (!pixels[i][j]) { iBlank++; } else {
			 * for (int k = 0; k < iBlank; k++) s[iC++] = ' '; s[iC++]= '+';
			 * iBlank = 0; } } // s += pixels[i][j] ? "+" : " "; s[iC++] = '\n';
			 * } s[iC++]= '<'; s[iC++]= '/'; s[iC++]= 'p'; s[iC++]= 'r';
			 * s[iC++]= 'e'; s[iC++]= '>'; StringBuffer sb = new StringBuffer();
			 * sb.append(s); setHTML(sb.toString());
			 */
			// s.append(s0);

			final int CHUNKS = 1;
			for (int k = 0; k < CHUNKS; k++) {
				String s0 = "<pre style='font: 1px/0px monospace; letter-spacing:0px; color:rgb(255,0,0); '>";
				StringBuffer s = new StringBuffer();
				s.append(s0);
				for (int i = 0; i <= (HEIGHT + 10) / CHUNKS; i++) {
					int iBlank = 0;
					for (int j = 0; j <= WIDTH; j++) {
						if (!pixels[k * ((HEIGHT + 10) / CHUNKS) + i][j]) {
							iBlank++;
						} else {
							s.append(blank[iBlank]);
							// s.append("+");
							iBlank = 0;
						}
					}
					// s += pixels[i][j] ? "+" : " ";
					s.append("\n");
				}
				s.append("</pre>");
//				HTML h = new HTML();
//				h.setHTML(s.toString());
//				add(h, 0, k * ((HEIGHT + 10) / CHUNKS));
				setHTML(s.toString());
			}
		}

		public void fill() {
		}

		public void moveTo(double xIn, double yIn) {
			logPoint(xIn, yIn);
		}

		public void lineTo(double xIn, double yIn) {
			logPoint(xIn, yIn);
		}

		// GChartCanvasLite requires CSS/RGBA color strings, but
		// GWTCanvas uses its own Color class instead, so we wrap:
		public void setStrokeStyle(String cssColor) {
		}

		public void setFillStyle(String cssColor) {
		}

		public void arc(double x, double y, double radius, double startAngle,
				double endAngle, boolean antiClockwise) {
			// TODO Auto-generated method stub

		}

		public void clear() {
			// TODO Auto-generated method stub

		}

		public void resize(int width, int height) {
			// TODO Auto-generated method stub

		}

		public void setLineWidth(double width) {
			// TODO Auto-generated method stub

		}
	} // class PreVG

	static final class PreVGFactory implements GChartCanvasFactory {
		public GChartCanvasLite create() {
			GChartCanvasLite result = new PreVG();
			return result;
		}
	}

	TestGChart60() {
		final double PERIOD = 100.;
		final double NCURVES = 5;
//    GChart.setCanvasFactory(new GWTCanvasBasedCanvasFactory());
		GChart.setCanvasFactory(new PreVGFactory());
    setChartSize(HEIGHT, WIDTH);
    getXAxis().setTickCount(0);
    getYAxis().setTickCount(0);
    getXAxis().setAxisMax(MAX_POINTS);
		for (int iC = 0; iC < NCURVES; iC++) {
      addCurve();
			// solid, 2px thick connecting lines:
			getCurve().getSymbol().setSymbolType(SymbolType.LINE);
			getCurve().getSymbol().setWidth(0);
			getCurve().getSymbol().setFillThickness(1);
			getCurve().getSymbol().setFillSpacing(0);
			for (int i = 0; i < MAX_POINTS; i++)
				getCurve().addPoint(i,
						Math.sin(2 * Math.PI * (i / PERIOD + iC / NCURVES)));
		}
	}
}
