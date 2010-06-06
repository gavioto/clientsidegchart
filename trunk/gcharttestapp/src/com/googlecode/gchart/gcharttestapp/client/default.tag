	TAGS	UNSORTED
TestGChart61	TestGChart61.java	437	public class TestGChart61 extends GChart {
TestGChart61::HEIGHT	TestGChart61.java	485		final static int HEIGHT = 200;
TestGChart61::WIDTH	TestGChart61.java	517		final static int WIDTH = 1000;
TestGChart61::MAX_POINTS	TestGChart61.java	549		final static int MAX_POINTS = 100;
TestGChart61::PreVG	TestGChart61.java	588		static final class PreVG extends HTML implements GChartCanvasLite {
TestGChart61::PreVG::PreVG	TestGChart61.java	640			PreVG() {
TestGChart61::PreVG::pixels	TestGChart61.java	728			private final static char pixels[] = new char[(HEIGHT)*(WIDTH + 1)];
TestGChart61::PreVG::x	TestGChart61.java	799	    private static double[] x = new double[MAX_POINTS];
TestGChart61::PreVG::y	TestGChart61.java	855	    private static double[] y = new double[MAX_POINTS];
TestGChart61::PreVG::nPts	TestGChart61.java	906	    private static int nPts = 0; // number of points actually in buffer now
TestGChart61::PreVG::logPoint	TestGChart61.java	1010	    private void logPoint(double xIn, double yIn) {
TestGChart61::PreVG::iPass	TestGChart61.java	1342	    static int iPass = 0;
TestGChart61::PreVG::beginPath	TestGChart61.java	1369	    public void beginPath() {
TestGChart61::PreVG::beginPathX	TestGChart61.java	1644	    public void beginPathX() {
TestGChart61::PreVG::spixels	TestGChart61.java	1913	    final StringBuffer spixels = new StringBuffer();
TestGChart61::PreVG::closePath	TestGChart61.java	1959	    public void closePath() {}
TestGChart61::PreVG::rasterize	TestGChart61.java	1991	    private void rasterize(char c) {
TestGChart61::PreVG::stroke	TestGChart61.java	3135	    public void stroke() {
TestGChart61::PreVG::fill	TestGChart61.java	3628			public void fill() {
TestGChart61::PreVG::moveTo	TestGChart61.java	3656			public void moveTo(double xIn, double yIn) {
TestGChart61::PreVG::lineTo	TestGChart61.java	3708			public void lineTo(double xIn, double yIn) {
TestGChart61::PreVG::setStrokeStyle	TestGChart61.java	3903			public void setStrokeStyle(String cssColor) {
TestGChart61::PreVG::setFillStyle	TestGChart61.java	3956			public void setFillStyle(String cssColor) {
TestGChart61::PreVG::arc	TestGChart61.java	4007			public void arc(double x, double y, double radius, double startAngle,
TestGChart61::PreVG::clear	TestGChart61.java	4169			public void clear() {
TestGChart61::PreVG::resize	TestGChart61.java	4237			public void resize(int width, int height) {
TestGChart61::PreVG::setLineWidth	TestGChart61.java	4327			public void setLineWidth(double width) {
TestGChart61::PreVGFactory	TestGChart61.java	4438		static final class PreVGFactory implements GChartCanvasFactory {
TestGChart61::PreVGFactory::create	TestGChart61.java	4510			public GChartCanvasLite create() {
TestGChart61::TestGChart61	TestGChart61.java	4590		TestGChart61() {
GChart	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	4211	public class GChart extends Composite implements HasClickHandlers,
GChart::AnnotationLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	5912	  public static final class AnnotationLocation {
GChart::AnnotationLocation::AT_THE_MOUSE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	6046	    static final AnnotationLocation AT_THE_MOUSE =
GChart::AnnotationLocation::AT_THE_MOUSE_SNAP_TO_X	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	6135	    static final AnnotationLocation AT_THE_MOUSE_SNAP_TO_X =
GChart::AnnotationLocation::AT_THE_MOUSE_SNAP_TO_Y	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	6234	    static final AnnotationLocation AT_THE_MOUSE_SNAP_TO_Y =
GChart::AnnotationLocation::CENTER	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	6575	    public static final AnnotationLocation CENTER =
GChart::AnnotationLocation::north	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	6666	    private static final AnnotationLocation north =
GChart::AnnotationLocation::west	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	6757	    private static final AnnotationLocation west =
GChart::AnnotationLocation::south	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	6847	    private static final AnnotationLocation south =
GChart::AnnotationLocation::CLOSEST_TO_HORIZONTAL_BASELINE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	7677	    public static final AnnotationLocation CLOSEST_TO_HORIZONTAL_BASELINE = north;
GChart::AnnotationLocation::CLOSEST_TO_VERTICAL_BASELINE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	8523	    public static final AnnotationLocation CLOSEST_TO_VERTICAL_BASELINE = west;
GChart::AnnotationLocation::EAST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	8850	    public static final AnnotationLocation EAST =
GChart::AnnotationLocation::FARTHEST_FROM_HORIZONTAL_BASELINE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	9679	    public static final AnnotationLocation FARTHEST_FROM_HORIZONTAL_BASELINE = south;
GChart::AnnotationLocation::FARTHEST_FROM_VERTICAL_BASELINE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	10537	    public static final AnnotationLocation FARTHEST_FROM_VERTICAL_BASELINE = EAST;
GChart::AnnotationLocation::INSIDE_PIE_ARC	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	11425	    public static final AnnotationLocation INSIDE_PIE_ARC = north;
GChart::AnnotationLocation::NORTH	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	11753	    public static final AnnotationLocation NORTH = north;
GChart::AnnotationLocation::NORTHEAST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	12033	    public static final AnnotationLocation NORTHEAST =
GChart::AnnotationLocation::NORTHWEST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	12348	    public static final AnnotationLocation NORTHWEST =
GChart::AnnotationLocation::ON_PIE_ARC	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	13274	    public static final AnnotationLocation ON_PIE_ARC = CENTER;
GChart::AnnotationLocation::OUTSIDE_PIE_ARC	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	14206	    public static final AnnotationLocation OUTSIDE_PIE_ARC = south;
GChart::AnnotationLocation::SOUTH	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	14535	    public static final AnnotationLocation SOUTH = south;
GChart::AnnotationLocation::SOUTHEAST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	14837	    public static final AnnotationLocation SOUTHEAST =
GChart::AnnotationLocation::SOUTHWEST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	15172	    public static final AnnotationLocation SOUTHWEST =
GChart::AnnotationLocation::WEST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	15534	    public static final AnnotationLocation WEST = west;
GChart::AnnotationLocation::heightMultiplier	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	15806	    private int heightMultiplier;
GChart::AnnotationLocation::widthMultiplier	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	15840	    private int widthMultiplier;
GChart::AnnotationLocation::AnnotationLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	15870	    private AnnotationLocation(int widthMultiplier, int heightMultiplier) {
GChart::AnnotationLocation::getAnnotationLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	16192	    private static AnnotationLocation getAnnotationLocation(
GChart::AnnotationLocation::transform	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	16811	    static AnnotationLocation transform(AnnotationLocation a,
GChart::AnnotationLocation::getHorizontalAlignment	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	17517	    HasHorizontalAlignment.HorizontalAlignmentConstant getHorizontalAlignment() {
GChart::AnnotationLocation::getUpperLeftX	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	18303	    int getUpperLeftX(double x, double w, double symbolW) {
GChart::AnnotationLocation::getUpperLeftY	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	18552	    int getUpperLeftY(double y, double h, double symbolH) {
GChart::AnnotationLocation::getVerticalAlignment	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	18822	    HasVerticalAlignment.VerticalAlignmentConstant getVerticalAlignment() {
GChart::AnnotationLocation::decodePieLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	20649	    AnnotationLocation decodePieLocation(double thetaMid) {
GChart::LegendLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	21947	  public static class LegendLocation {
GChart::LegendLocation::symbolType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	22123	    private SymbolType symbolType;
GChart::LegendLocation::annotationLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	22166	    private AnnotationLocation annotationLocation;
GChart::LegendLocation::LegendLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	22199	    private LegendLocation(SymbolType symbolType,
GChart::LegendLocation::getSymbolType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	22396	    SymbolType getSymbolType() {
GChart::LegendLocation::getAnnotationLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	22469	    AnnotationLocation getAnnotationLocation() {
GChart::LegendLocation::getInitialXShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	22909	    int getInitialXShift(GChart g) {
GChart::LegendLocation::getInitialYShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	22969	    int getInitialYShift(GChart g) {
GChart::LegendLocation::getLeftThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	23729	    int getLeftThickness(GChart g) {
GChart::LegendLocation::getRightThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	23789	    int getRightThickness(GChart g) {
GChart::LegendLocation::RightLegendLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	23930	    private static final class RightLegendLocation extends LegendLocation {
GChart::LegendLocation::RightLegendLocation::RightLegendLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	23981	      RightLegendLocation() {
GChart::LegendLocation::RightLegendLocation::getInitialXShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	24106	      int getInitialXShift(GChart g) {
GChart::LegendLocation::RightLegendLocation::getRightThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	24444	      int getRightThickness(GChart g) {
GChart::LegendLocation::LeftLegendLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	24644	    private static final class LeftLegendLocation extends LegendLocation {
GChart::LegendLocation::LeftLegendLocation::LeftLegendLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	24694	      LeftLegendLocation() {
GChart::LegendLocation::LeftLegendLocation::getInitialXShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	24818	      int getInitialXShift(GChart g) {
GChart::LegendLocation::LeftLegendLocation::getLeftThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	25153	      int getLeftThickness(GChart g) {
GChart::LegendLocation::OUTSIDE_LEFT	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	25474	    public final static LegendLocation OUTSIDE_LEFT = new LeftLegendLocation();
GChart::LegendLocation::OUTSIDE_RIGHT	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	25727	    public final static LegendLocation OUTSIDE_RIGHT = new RightLegendLocation();
GChart::LegendLocation::INSIDE_UPPERLEFT	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	25963	    public final static LegendLocation INSIDE_UPPERLEFT = new LegendLocation(
GChart::LegendLocation::INSIDE_UPPERRIGHT	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	26264	    public final static LegendLocation INSIDE_UPPERRIGHT = new LegendLocation(
GChart::LegendLocation::INSIDE_LOWERLEFT	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	26565	    public final static LegendLocation INSIDE_LOWERLEFT = new LegendLocation(
GChart::LegendLocation::INSIDE_LOWERRIGHT	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	26866	    public final static LegendLocation INSIDE_LOWERRIGHT = new LegendLocation(
GChart::Axis	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	27364	  public abstract class Axis {
GChart::Axis::outOfBoundsMultiplier	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	27390	    private double outOfBoundsMultiplier = Double.NaN;
GChart::Axis::isHorizontalAxis	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	27479	    protected boolean isHorizontalAxis;
GChart::Axis::ticksId	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	27551	    protected int ticksId;
GChart::Axis::gridlinesId	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	27618	    protected int gridlinesId;
GChart::Axis::axisId	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	27689	    protected int axisId;
GChart::Axis::axisPosition	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	27747	    protected int axisPosition;
GChart::Axis::tickLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	27788	    protected TickLocation tickLocation = DEFAULT_TICK_LOCATION;
GChart::Axis::nCurvesVisibleOnAxis	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	27943	    private int nCurvesVisibleOnAxis = 0;
GChart::Axis::incrementCurves	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	27979	    void incrementCurves() {
GChart::Axis::decrementCurves	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	28045	    void decrementCurves() {
GChart::Axis::AxisLimits	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	28122	    protected class AxisLimits {
GChart::Axis::AxisLimits::min	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	28148	      double min;
GChart::Axis::AxisLimits::max	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	28166	      double max; // in user-defined model units
GChart::Axis::AxisLimits::AxisLimits	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	28209	      AxisLimits(double min, double max) {
GChart::Axis::AxisLimits::equals	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	28317	      boolean equals(AxisLimits al) {
GChart::Axis::currentLimits	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	28529	    private AxisLimits currentLimits = new AxisLimits(Double.MAX_VALUE,
GChart::Axis::previousLimits	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	28629	    private AxisLimits previousLimits = new AxisLimits(-Double.MAX_VALUE,
GChart::Axis::axisLabel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	28727	    private Widget axisLabel;
GChart::Axis::axisLabelThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	28756	    protected int axisLabelThickness = GChart.NAI;
GChart::Axis::hasGridlines	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	28809	    private boolean hasGridlines = false;
GChart::Axis::tickCount	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	28849	    protected int tickCount = DEFAULT_TICK_COUNT;
GChart::Axis::axisMax	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	28954	    protected double axisMax = Double.NaN;
GChart::Axis::axisMin	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	28997	    protected double axisMin = Double.NaN;
GChart::Axis::tickLabelFontColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	29101	    protected String tickLabelFontColor = DEFAULT_TICK_LABEL_FONT_COLOR;
GChart::Axis::tickLabelFontFamily	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	29174	    protected String tickLabelFontFamily = DEFAULT_FONT_FAMILY;
GChart::Axis::tickLabelFontSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	29487	    protected int tickLabelFontSize = DEFAULT_TICK_LABEL_FONTSIZE;
GChart::Axis::tickLabelFontStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	29557	    protected String tickLabelFontStyle = DEFAULT_TICK_LABEL_FONT_STYLE;
GChart::Axis::tickLabelFontWeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	29630	    protected String tickLabelFontWeight = DEFAULT_TICK_LABEL_FONT_WEIGHT;
GChart::Axis::tickLabelFormat	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	29706	    protected String tickLabelFormat = DEFAULT_TICK_LABEL_FORMAT;
GChart::Axis::tickLabelThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	29769	    protected int tickLabelThickness = GChart.NAI;
GChart::Axis::tickLabelPadding	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	29820	    protected int tickLabelPadding = 0;
GChart::Axis::ticksPerLabel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	29860	    protected int ticksPerLabel = 1;
GChart::Axis::ticksPerGridline	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	29897	    protected int ticksPerGridline = 1;
GChart::Axis::tickLength	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	29937	    protected int tickLength = DEFAULT_TICK_LENGTH;
GChart::Axis::tickThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	30053	    protected int tickThickness = DEFAULT_TICK_THICKNESS;
GChart::Axis::axisVisible	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	30174	    boolean axisVisible = true;
GChart::Axis::addTick	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	31843	    public void addTick(double tickPosition) {
GChart::Axis::addTickAsPoint	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	32033	    private void addTickAsPoint(double tickPosition, String tickLabel,
GChart::Axis::addTick	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	36425	    public void addTick(double tickPosition, String tickLabel,
GChart::Axis::addTick	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	37790	    public void addTick(double tickPosition, String tickLabel) {
GChart::Axis::addTick	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	40144	    public void addTick(double tickPosition, Widget tickWidget,
GChart::Axis::addTick	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	41317	    public void addTick(double tickPosition, Widget tickWidget) {
GChart::Axis::clearTicks	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	42085	    public void clearTicks() {
GChart::Axis::numberFormat	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	44604	    private NumberFormat numberFormat =
GChart::Axis::dateFormat	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	44705	    private DateTimeFormat dateFormat =
GChart::Axis::NUMBER_FORMAT_TYPE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	44789	    private final int NUMBER_FORMAT_TYPE = 0;
GChart::Axis::DATE_FORMAT_TYPE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	44835	    private final int DATE_FORMAT_TYPE = 1;
GChart::Axis::LOG10INVERSE_FORMAT_TYPE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	44879	    private final int LOG10INVERSE_FORMAT_TYPE = 2;
GChart::Axis::LOG2INVERSE_FORMAT_TYPE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	44931	    private final int LOG2INVERSE_FORMAT_TYPE = 3;
GChart::Axis::tickLabelFormatType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	44976	    private int tickLabelFormatType = NUMBER_FORMAT_TYPE;
GChart::Axis::formatAsTickLabel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	45319	    public String formatAsTickLabel(double value) {
GChart::Axis::formatNumberAsTickLabel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	46164	    public String formatNumberAsTickLabel(double value) {
GChart::Axis::getAxisLabel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	46464	    public Widget getAxisLabel() {
GChart::Axis::getAxisLabelThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	47052	    public int getAxisLabelThickness() {
GChart::Axis::getAxisMax	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	48939	    public double getAxisMax() {
GChart::Axis::getAxisMin	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	49724	    public double getAxisMin() {
GChart::Axis::getAxisVisible	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	50398	    public boolean getAxisVisible() {
GChart::Axis::getOutOfBoundsMultiplier	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	50756	    public double getOutOfBoundsMultiplier() {
GChart::Axis::getHasGridlines	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	52112	    public boolean getHasGridlines() {
GChart::Axis::getNCurvesVisibleOnAxis	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	55939	    public int getNCurvesVisibleOnAxis() {
GChart::Axis::getTickCount	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	56549	    public int getTickCount() {
GChart::Axis::getTickLabelFontWeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	57002	    public String getTickLabelFontWeight() {
GChart::Axis::getTickLabelFontColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	57504	    public String getTickLabelFontColor() {
GChart::Axis::getTickLabelFontFamily	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	57861	    public String getTickLabelFontFamily() {
GChart::Axis::getTickLabelFontSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	58161	    public int getTickLabelFontSize() {
GChart::Axis::getTickLabelFontStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	58558	    public String getTickLabelFontStyle() {
GChart::Axis::getTickLabelFormat	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	58860	    public String getTickLabelFormat() {
GChart::Axis::getTickLabelPadding	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	59209	    public int getTickLabelPadding() {
GChart::Axis::getTickLabelThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	59411	    int getTickLabelThickness(boolean needsPopulation) {
GChart::Axis::getTickLabelThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	60521	    public int getTickLabelThickness() {
GChart::Axis::getTicksPerGridline	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	60901	    public int getTicksPerGridline() {
GChart::Axis::getTicksPerLabel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	61187	    public int getTicksPerLabel() {
GChart::Axis::getTickLength	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	61439	    public int getTickLength() {
GChart::Axis::getActualTickLength	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	61628	    int getActualTickLength() {
GChart::Axis::getTickLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	62132	    public TickLocation getTickLocation() {
GChart::Axis::getTickSpace	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	62710	    public int getTickSpace() {
GChart::Axis::getTickThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	63271	    public int getTickThickness() {
GChart::Axis::setAxisLabel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	75439	    public void setAxisLabel(Widget axisLabel) {
GChart::Axis::setAxisLabel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	75807	    public void setAxisLabel(String html) {
GChart::Axis::setAxisLabelThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	77329	    public void setAxisLabelThickness(int thickness) {
GChart::Axis::setAxisMax	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	78739	    public void setAxisMax(double max) {
GChart::Axis::setAxisMin	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	79997	    public void setAxisMin(double min) {
GChart::Axis::setAxisVisible	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	80967	    public void setAxisVisible(boolean axisVisible) {
GChart::Axis::setOutOfBoundsMultiplier	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	84946	    public void setOutOfBoundsMultiplier(double outOfBoundsMultiplier) {
GChart::Axis::setHasGridlines	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	85671	    public void setHasGridlines(boolean hasGridlines) {
GChart::Axis::setTickCount	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	86905	    public void setTickCount(int tickCount) {
GChart::Axis::setTickLabelFontWeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	88073	    public void setTickLabelFontWeight(String cssWeight) {
GChart::Axis::setTickLabelFontColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	89525	    public void setTickLabelFontColor(String cssColor) {
GChart::Axis::setTickLabelFontFamily	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	90962	    public void setTickLabelFontFamily(String cssFontFamily) {
GChart::Axis::setTickLabelFontStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	92217	    public void setTickLabelFontStyle(String cssStyle) {
GChart::Axis::setTickLabelFontSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	93448	    public void setTickLabelFontSize(int tickLabelFontSize) {
GChart::Axis::setTickLabelFormat	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	99265	    public void setTickLabelFormat(String format) {
GChart::Axis::setTickLabelPadding	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	101129	    public void setTickLabelPadding(int tickLabelPadding) {
GChart::Axis::setTickLabelThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	102192	    public void setTickLabelThickness(int tickLabelThickness) {
GChart::Axis::setTicksPerGridline	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	103432	    public void setTicksPerGridline(int ticksPerGridline) {
GChart::Axis::setTicksPerLabel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	104843	    public void setTicksPerLabel(int ticksPerLabel) {
GChart::Axis::setTickLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	106159	    public void setTickLocation(TickLocation tickLocation) {
GChart::Axis::maybePopulateTicks	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	107115	    void maybePopulateTicks() {
GChart::Axis::populateTicks	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	107278	    private void populateTicks() {
GChart::Axis::populateGridlines	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	108732	    void populateGridlines() {
GChart::Axis::getAxisLimits	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	109187	    protected void getAxisLimits(AxisLimits result) {
GChart::Axis::getAxisLimits	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	110340	    AxisLimits getAxisLimits() {
GChart::Axis::rememberLimits	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	110438	    void rememberLimits() {
GChart::Axis::limitsChanged	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	110513	    boolean limitsChanged() {
GChart::Axis::getTickPosition	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	110705	    private double getTickPosition(Curve c, int iTick) {
GChart::Axis::getTickMax	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	111000	    private double getTickMax() {
GChart::Axis::getTickMin	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	111341	    private double getTickMin() {
GChart::Axis::maxIgnoreNaNAndMaxValue	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	111688	    protected double maxIgnoreNaNAndMaxValue(double x1, double x2) {
GChart::Axis::minIgnoreNaNAndMaxValue	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	112204	    protected double minIgnoreNaNAndMaxValue(double x1, double x2) {
GChart::Axis::invalidateDynamicAxisLimits	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	112775	    void invalidateDynamicAxisLimits() {
GChart::canvasFactory	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	113099	  private static GChartCanvasFactory canvasFactory = null;
GChart::setCanvasFactory	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	120861	  public static void setCanvasFactory(GChartCanvasFactory factory) {
GChart::getCanvasFactory	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	121217	  public static GChartCanvasFactory getCanvasFactory() {
GChart::Curve	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	121596	  public class Curve {
GChart::Curve::isVisible	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	121624	    private boolean isVisible = true;
GChart::Curve::curveData	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	121661	    private Object curveData = null;
GChart::Curve::clipToPlotArea	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	121699	    private Boolean clipToPlotArea = null;
GChart::Curve::legendHTML	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	121741	    private String legendHTML = null;
GChart::Curve::points	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	121789	    private ArrayList<Point> points = new ArrayList<Point>();
GChart::Curve::symbol	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	121905	    private Symbol symbol = new Symbol(this);
GChart::Curve::xShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	122023	    private int xShift = 0;
GChart::Curve::yShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	122051	    private int yShift = 0;
GChart::Curve::xOrYShiftChanged	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	122146	    boolean xOrYShiftChanged = false;
GChart::Curve::yAxisId	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	122192	    private YAxisId yAxisId = Y_AXIS;
GChart::Curve::isValidated	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	122231	    private boolean isValidated = false;
GChart::Curve::isValidated	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	122265	    boolean isValidated() {
GChart::Curve::indexOf	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	122719	    private int indexOf = GChart.NAI;
GChart::Curve::incrementIndex	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	122751	    void incrementIndex() {
GChart::Curve::decrementIndex	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	122803	    void decrementIndex() {
GChart::Curve::clearIndex	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	122855	    void clearIndex() {
GChart::Curve::getIndexOf	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	122913	    int getIndexOf() {
GChart::Curve::Curve	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	123501	    Curve(int indexOf) {
GChart::Curve::addPoint	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	125084	    public void addPoint(double x, double y) {
GChart::Curve::addPoint	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	125838	    public void addPoint(int iPoint, double x, double y) {
GChart::Curve::clearPoints	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	126297	    public void clearPoints() {
GChart::Curve::getBand	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	127120	    private int getBand(int iPoint, double bandThickness) {
GChart::Curve::EXTRA_BANDS	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	128569	    private int EXTRA_BANDS = 2; // far left, right (top, bottom) bands
GChart::Curve::getNBands	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	128642	    private int getNBands(double bandThickness) {
GChart::Curve::bandList	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	132611	    private int[] bandList = null; // index of first point in each
GChart::Curve::bandThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	132691	    private double bandThickness = Double.NaN;
GChart::Curve::clearBandList	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	132729	    void clearBandList() {
GChart::Curve::bandSeparatePoints	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	132786	    void bandSeparatePoints() {
GChart::Curve::getClosestTouchingPoint	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	134828	    int getClosestTouchingPoint(int xBrushIn, int yBrushIn) {
GChart::Curve::getClippedToPlotArea	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	140182	    public boolean getClippedToPlotArea() {
GChart::Curve::getClipToPlotArea	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	140819	    public Boolean getClipToPlotArea() {
GChart::Curve::getCurveData	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	141119	    public Object getCurveData() {
GChart::Curve::getHovertextTemplate	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	141558	    public String getHovertextTemplate() {
GChart::Curve::getLegendLabel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	141847	    public String getLegendLabel() {
GChart::Curve::getNPoints	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	142295	    public int getNPoints() {
GChart::Curve::getParent	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	142524	    public GChart getParent() {
GChart::Curve::getPoint	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	143406	    public Point getPoint() {
GChart::Curve::getPoint	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	144146	    public Point getPoint(int iPoint) {
GChart::Curve::getPointIndex	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	145189	    public int getPointIndex(Point point) {
GChart::Curve::getSymbol	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	146318	    public Symbol getSymbol() {
GChart::Curve::getXShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	146602	    public int getXShift() {
GChart::Curve::getYShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	146886	    public int getYShift() {
GChart::Curve::getYAxis	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	147303	    public YAxisId getYAxis() {
GChart::Curve::invalidateRendering	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	147754	    public void invalidateRendering() {
GChart::Curve::isVisible	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	148045	    public boolean isVisible() {
GChart::Curve::onY2	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	148303	    public boolean onY2() {
GChart::Curve::removePoint	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	148750	    public void removePoint(int iPoint) {
GChart::Curve::removePoint	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	149628	    public void removePoint(Point p) {
GChart::Curve::setClipToPlotArea	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	150710	    public void setClipToPlotArea(Boolean clipToPlotArea) {
GChart::Curve::setCurveData	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	152271	    public void setCurveData(Object curveData) {
GChart::Curve::setHovertextTemplate	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	152753	    public void setHovertextTemplate(String hovertextTemplate) {
GChart::Curve::setLegendLabel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	153693	    public void setLegendLabel(String legendHTML) {
GChart::Curve::setVisible	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	154434	    public void setVisible(boolean isVisible) {
GChart::Curve::setXShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	157471	    public void setXShift(int xShift) {
GChart::Curve::setYShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	158469	    public void setYShift(int yShift) {
GChart::Curve::setYAxis	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	158871	    public void setYAxis(YAxisId axisId) {
GChart::Curve::isSystemCurve	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	159666	    private boolean isSystemCurve() {
GChart::Curve::realizePoint	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	159945	    void realizePoint(PlotPanel pp, GraphicsRenderingPanel grp,
GChart::Curve::Point	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	161812	    public class Point {
GChart::Curve::Point::x	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	161957	      private double x;
GChart::Curve::Point::y	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	161981	      private double y;
GChart::Curve::Point::annotation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	162001	      Annotation annotation = null;
GChart::Curve::Point::iNextInBand	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	162169	      private int iNextInBand = GChart.NAI;
GChart::Curve::Point::getINextInBand	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	162206	      int getINextInBand() {
GChart::Curve::Point::setINextInBand	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	162273	      void setINextInBand(int iNext) {
GChart::Curve::Point::Point	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	162345	      Point(double x, double y) {
GChart::Curve::Point::getAnnotationFontWeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	162709	      public String getAnnotationFontWeight() {
GChart::Curve::Point::getAnnotationFontColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	163142	      public String getAnnotationFontColor() {
GChart::Curve::Point::getAnnotationFontFamily	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	163559	      public String getAnnotationFontFamily() {
GChart::Curve::Point::getAnnotationFontStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	164012	      public String getAnnotationFontStyle() {
GChart::Curve::Point::getAnnotationFontSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	164434	      public int getAnnotationFontSize() {
GChart::Curve::Point::getAnnotationLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	164961	      public AnnotationLocation getAnnotationLocation() {
GChart::Curve::Point::getAnnotationText	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	165615	      public String getAnnotationText() {
GChart::Curve::Point::getAnnotationWidget	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	166331	      public Widget getAnnotationWidget() {
GChart::Curve::Point::getAnnotationVisible	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	166793	      public boolean getAnnotationVisible() {
GChart::Curve::Point::getAnnotationXShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	167278	      public int getAnnotationXShift() {
GChart::Curve::Point::getAnnotationYShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	167761	      public int getAnnotationYShift() {
GChart::Curve::Point::getParent	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	168140	      public Curve getParent() {
GChart::Curve::Point::getX	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	168501	      public double getX() {
GChart::Curve::Point::getY	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	168848	      public double getY() {
GChart::Curve::Point::setAnnotationFontWeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	169705	      public void setAnnotationFontWeight(String cssWeight) {
GChart::Curve::Point::setAnnotationFontColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	170827	      public void setAnnotationFontColor(String cssColor) {
GChart::Curve::Point::setAnnotationFontFamily	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	172058	      public void setAnnotationFontFamily(String cssFontFamily) {
GChart::Curve::Point::setAnnotationFontStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	173002	      public void setAnnotationFontStyle(String cssStyle) {
GChart::Curve::Point::setAnnotationFontSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	173895	      public void setAnnotationFontSize(int fontSize) {
GChart::Curve::Point::setAnnotationLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	175129	      public void setAnnotationLocation(
GChart::Curve::Point::setAnnotationText	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	179843	      public void setAnnotationText(String annotationText,
GChart::Curve::Point::setAnnotationText	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	180743	      public void setAnnotationText(String annotationText) {
GChart::Curve::Point::setAnnotationWidget	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	184331	      public void setAnnotationWidget(Widget annotationWidget,
GChart::Curve::Point::setAnnotationWidget	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	185614	      public void setAnnotationWidget(Widget annotationWidget) {
GChart::Curve::Point::setAnnotationVisible	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	186579	      public void setAnnotationVisible(boolean isVisible) {
GChart::Curve::Point::setAnnotationXShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	188882	      public void setAnnotationXShift(int xShift) {
GChart::Curve::Point::setAnnotationYShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	191119	      public void setAnnotationYShift(int yShift) {
GChart::Curve::Point::setX	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	191940	      public void setX(double x) {
GChart::Curve::Point::setY	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	192651	      public void setY(double y) {
GChart::Curve::Point::getAnnotation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	192748	      Annotation getAnnotation() {
GChart::Curve::Point::getHovertext	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	194093	      public String getHovertext() {
GChart::Curve::invalidate	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	194592	    void invalidate() {
GChart::Curve::getContainingRectangle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	195724	    Rectangle getContainingRectangle(PlotPanel pp) {
GChart::Curve::wasCanvasRendered	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	203168	    private boolean wasCanvasRendered = false;
GChart::Curve::setWasCanvasRendered	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	203205	    void setWasCanvasRendered(boolean wasCanvasRendered) {
GChart::Curve::isCanvasRendered	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	203381	    boolean isCanvasRendered() {
GChart::HovertextChunk	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	203621	  static class HovertextChunk {
GChart::HovertextChunk::HOVERTEXT_PARAM_NONE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	203659	    final static int HOVERTEXT_PARAM_NONE = 0; // plain old text
GChart::HovertextChunk::HOVERTEXT_PARAM_X	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	203724	    final static int HOVERTEXT_PARAM_X = 1; // ${x}
GChart::HovertextChunk::HOVERTEXT_PARAM_Y	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	203776	    final static int HOVERTEXT_PARAM_Y = 2; // ${y}
GChart::HovertextChunk::HOVERTEXT_PARAM_PIESLICESIZE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	203828	    final static int HOVERTEXT_PARAM_PIESLICESIZE = 3; // ${pieSlicePercent}
GChart::HovertextChunk::HOVERTEXT_PARAM_USERDEFINED	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	203905	    final static int HOVERTEXT_PARAM_USERDEFINED = 4; // ${mySpecialParameter}
GChart::HovertextChunk::paramId	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	203971	    int paramId; // id of substitution
GChart::HovertextChunk::paramName	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	204030	    String paramName; // name of substitution
GChart::HovertextChunk::chunkText	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	204093	    String chunkText; // plain text that
GChart::HovertextChunk::HovertextChunk	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	204159	    HovertextChunk(int id, String name, String text) {
GChart::HovertextChunk::parseHovertextTemplate	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	204399	    static HovertextChunk[] parseHovertextTemplate(String htTemplate) {
GChart::HovertextChunk::getHovertext	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	206249	    static String getHovertext(HovertextChunk[] htc, Curve.Point p) {
GChart::Symbol	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	209525	  public class Symbol {
GChart::Symbol::annotation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	209558	    private Annotation annotation = null;
GChart::Symbol::backgroundColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	209596	    private String backgroundColor = DEFAULT_SYMBOL_BACKGROUND_COLOR;
GChart::Symbol::backgroundColorCSS	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	209751	    private String backgroundColorCSS = DEFAULT_SYMBOL_BACKGROUND_COLOR;
GChart::Symbol::baseline	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	209824	    private double baseline = Double.NaN;
GChart::Symbol::borderColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	209866	    private String borderColor = "black";
GChart::Symbol::borderColorCSS	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	209908	    private String borderColorCSS = "black";
GChart::Symbol::borderStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	209953	    private String borderStyle = DEFAULT_SYMBOL_BORDER_STYLE;
GChart::Symbol::borderWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	210012	    private int borderWidth = DEFAULT_SYMBOL_BORDER_WIDTH;
GChart::Symbol::brushHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	210071	    private int brushHeight = DEFAULT_BRUSH_HEIGHT;
GChart::Symbol::brushLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	210138	    private AnnotationLocation brushLocation = AnnotationLocation.CENTER;
GChart::Symbol::brushWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	210197	    private int brushWidth = DEFAULT_BRUSH_WIDTH;
GChart::Symbol::fillHasHovertext	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	210251	    private boolean fillHasHovertext = true;
GChart::Symbol::fillSpacing	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	210295	    private double fillSpacing = Double.NaN;
GChart::Symbol::fillThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	210337	    private int fillThickness = GChart.NAI;
GChart::Symbol::height	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	210381	    private int height = DEFAULT_SYMBOL_HEIGHT;
GChart::Symbol::hovertextTemplate	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	210432	    private String hovertextTemplate = null;
GChart::Symbol::hoverAnnotation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	210605	    private Annotation hoverAnnotation = null;
GChart::Symbol::hoverAnnotationEnabled	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	210649	    private boolean hoverAnnotationEnabled = true;
GChart::Symbol::hoverAnnotationSymbolType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	211044	    private SymbolType hoverAnnotationSymbolType = null;
GChart::Symbol::hoverSelectionBackgroundColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	211161	    private String hoverSelectionBackgroundColor = "transparent";
GChart::Symbol::hoverSelectionBorderColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	211227	    private String hoverSelectionBorderColor = "gray";
GChart::Symbol::hoverSelectionBorderStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	211282	    private String hoverSelectionBorderStyle = "solid";
GChart::Symbol::hoverSelectionBorderWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	211335	    private int hoverSelectionBorderWidth = -1;
GChart::Symbol::hoverSelectionEnabled	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	211387	    private boolean hoverSelectionEnabled = true;
GChart::Symbol::hoverSelectionFillSpacing	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	211436	    private double hoverSelectionFillSpacing = Double.NaN;
GChart::Symbol::hoverSelectionFillThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	211492	    private int hoverSelectionFillThickness = GChart.NAI;
GChart::Symbol::hoverSelectionHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	211550	    private int hoverSelectionHeight = GChart.NAI;
GChart::Symbol::hoverSelectionImageURL	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	211604	    private String hoverSelectionImageURL = null;
GChart::Symbol::hoverSelectionWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	211651	    private int hoverSelectionWidth = GChart.NAI;
GChart::Symbol::hoverSelectionSymbolType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	211708	    private SymbolType hoverSelectionSymbolType = null;
GChart::Symbol::hovertextChunks	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	211771	    private HovertextChunk[] hovertextChunks = null;
GChart::Symbol::imageURL	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	211814	    private String imageURL = null;
GChart::Symbol::parent	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	212164	    private Curve parent = null;
GChart::Symbol::modelHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	212267	    private double modelHeight = Double.NaN;
GChart::Symbol::modelWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	212312	    private double modelWidth = Double.NaN;
GChart::Symbol::pieSliceOrientation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	212499	    private double pieSliceOrientation = Double.NaN;
GChart::Symbol::defaultPieSliceOrientation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	212552	    private double defaultPieSliceOrientation = 0.0;
GChart::Symbol::pieSliceSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	212679	    private double pieSliceSize = 1;
GChart::Symbol::symbolType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	212721	    private SymbolType symbolType = DEFAULT_SYMBOL_TYPE;
GChart::Symbol::width	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	212772	    private int width = DEFAULT_SYMBOL_WIDTH;
GChart::Symbol::xScaleFactor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	212813	    double xScaleFactor = 1.0;
GChart::Symbol::yScaleFactor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	212844	    double yScaleFactor = 1.0;
GChart::Symbol::Symbol	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	212869	    Symbol(Curve parent) {
GChart::Symbol::getBackgroundColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	213322	    public String getBackgroundColor() {
GChart::Symbol::getBackgroundColorCSS	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	213393	    String getBackgroundColorCSS() {
GChart::Symbol::getBaseline	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	213730	    public double getBaseline() {
GChart::Symbol::getBorderColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	214133	    public String getBorderColor() {
GChart::Symbol::getBorderColorCSS	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	214196	    String getBorderColorCSS() {
GChart::Symbol::getBorderStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	214572	    public String getBorderStyle() {
GChart::Symbol::getBorderWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	214910	    public int getBorderWidth() {
GChart::Symbol::getBrushHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	215422	    public int getBrushHeight() {
GChart::Symbol::getBrushLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	215844	    public AnnotationLocation getBrushLocation() {
GChart::Symbol::getBrushWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	216367	    public int getBrushWidth() {
GChart::Symbol::getFillHasHovertext	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	216624	    public boolean getFillHasHovertext() {
GChart::Symbol::getFillSpacing	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	217152	    public double getFillSpacing() {
GChart::Symbol::getFillThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	217770	    public int getFillThickness() {
GChart::Symbol::getHoverAnnotation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	218097	    Annotation getHoverAnnotation() {
GChart::Symbol::getHoverAnnotationEnabled	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	218603	    public boolean getHoverAnnotationEnabled() {
GChart::Symbol::getHoverFontWeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	219091	    public String getHoverFontWeight() {
GChart::Symbol::getHoverFontColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	219524	    public String getHoverFontColor() {
GChart::Symbol::getHoverFontFamily	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	220010	    public String getHoverFontFamily() {
GChart::Symbol::getHoverFontStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	220553	    public String getHoverFontStyle() {
GChart::Symbol::getHoverFontSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	221059	    public int getHoverFontSize() {
GChart::Symbol::getHoverLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	221635	    public AnnotationLocation getHoverLocation() {
GChart::Symbol::getHoverAnnotationSymbolType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	222352	    public SymbolType getHoverAnnotationSymbolType() {
GChart::Symbol::getHoverSelectionBackgroundColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	222813	    public String getHoverSelectionBackgroundColor() {
GChart::Symbol::getHoverSelectionBorderColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	223266	    public String getHoverSelectionBorderColor() {
GChart::Symbol::getHoverSelectionBorderStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	223718	    public String getHoverSelectionBorderStyle() {
GChart::Symbol::getHoverSelectionBorderWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	224274	    public int getHoverSelectionBorderWidth() {
GChart::Symbol::getHoverSelectionEnabled	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	224732	    public boolean getHoverSelectionEnabled() {
GChart::Symbol::getHoverSelectionFillSpacing	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	225239	    public double getHoverSelectionFillSpacing() {
GChart::Symbol::getHoverSelectionFillThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	225761	    public int getHoverSelectionFillThickness() {
GChart::Symbol::getHoverSelectionHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	226329	    public int getHoverSelectionHeight() {
GChart::Symbol::getHoverSelectionImageURL	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	226791	    public String getHoverSelectionImageURL() {
GChart::Symbol::getHoverSelectionSymbolType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	227529	    public SymbolType getHoverSelectionSymbolType() {
GChart::Symbol::getHoverSelectionWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	228085	    public int getHoverSelectionWidth() {
GChart::Symbol::getHovertextTemplate	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	228393	    public String getHovertextTemplate() {
GChart::Symbol::getHoverWidget	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	229094	    public HoverUpdateable getHoverWidget() {
GChart::Symbol::getHoverXShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	229625	    public int getHoverXShift() {
GChart::Symbol::getHoverYShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	230166	    public int getHoverYShift() {
GChart::Symbol::getImageURL	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	230716	    public String getImageURL() {
GChart::Symbol::getHovertextChunks	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	230921	    HovertextChunk[] getHovertextChunks() {
GChart::Symbol::getParent	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	231352	    public Curve getParent() {
GChart::Symbol::getPieSliceOrientation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	232020	    public double getPieSliceOrientation() {
GChart::Symbol::getDecodedPieSliceOrientation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	232394	    double getDecodedPieSliceOrientation() {
GChart::Symbol::setDefaultPieSliceOrientation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	232609	    void setDefaultPieSliceOrientation(double defaultOrientation) {
GChart::Symbol::getDefaultPieSliceOrientation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	232741	    double getDefaultPieSliceOrientation() {
GChart::Symbol::getPieSliceSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	233437	    public double getPieSliceSize() {
GChart::Symbol::getPieSliceRadius	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	233611	    double getPieSliceRadius(PlotPanel pp, boolean onY2) {
GChart::Symbol::getPieSliceTheta0	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	234376	    double getPieSliceTheta0() {
GChart::Symbol::getPieSliceTheta1	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	234529	    double getPieSliceTheta1() {
GChart::Symbol::getHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	234846	    public int getHeight() {
GChart::Symbol::getModelHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	235243	    public double getModelHeight() {
GChart::Symbol::getModelWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	235645	    public double getModelWidth() {
GChart::Symbol::getSymbolType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	235865	    public SymbolType getSymbolType() {
GChart::Symbol::getWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	236461	    public int getWidth() {
GChart::Symbol::isHorizontallyBanded	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	236696	    boolean isHorizontallyBanded() {
GChart::Symbol::collapseRGBAToRGB	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	237376	    private String collapseRGBAToRGB(String rgba) {
GChart::Symbol::setBackgroundColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	243440	    public void setBackgroundColor(String backgroundColor) {
GChart::Symbol::setBaseline	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	245589	    public void setBaseline(double baseline) {
GChart::Symbol::setBorderColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	249019	    public void setBorderColor(String borderColor) {
GChart::Symbol::setBorderStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	249606	    public void setBorderStyle(String borderStyle) {
GChart::Symbol::setBorderWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	251577	    public void setBorderWidth(int borderWidth) {
GChart::Symbol::setBrushHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	258314	    public void setBrushHeight(int height) {
GChart::Symbol::setBrushLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	260384	    public void setBrushLocation(AnnotationLocation location) {
GChart::Symbol::setBrushSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	261262	    public void setBrushSize(int width, int height) {
GChart::Symbol::setBrushWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	262061	    public void setBrushWidth(int width) {
GChart::Symbol::setDistanceMetric	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	266732	    public void setDistanceMetric(double xScaleFactor, double yScaleFactor) {
GChart::Symbol::setFillHasHovertext	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	268407	    public void setFillHasHovertext(boolean fillHasHovertext) {
GChart::Symbol::setFillSpacing	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	280208	    public void setFillSpacing(double fillSpacing) {
GChart::Symbol::setFillThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	286067	    public void setFillThickness(int fillThickness) {
GChart::Symbol::setHoverAnnotationEnabled	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	287479	    public void setHoverAnnotationEnabled(boolean hoverAnnotationEnabled) {
GChart::Symbol::setHoverFontWeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	288346	    public void setHoverFontWeight(String cssWeight) {
GChart::Symbol::setHoverFontColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	289313	    public void setHoverFontColor(String cssColor) {
GChart::Symbol::setHoverFontFamily	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	290234	    public void setHoverFontFamily(String cssFontFamily) {
GChart::Symbol::setHoverFontStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	291038	    public void setHoverFontStyle(String cssStyle) {
GChart::Symbol::setHoverFontSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	291864	    public void setHoverFontSize(int fontSize) {
GChart::Symbol::setHoverLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	294740	    public void setHoverLocation(AnnotationLocation hoverLocation) {
GChart::Symbol::setHoverAnnotationSymbolType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	297766	    public void setHoverAnnotationSymbolType(
GChart::Symbol::setHoverSelectionBackgroundColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	299617	    public void setHoverSelectionBackgroundColor(
GChart::Symbol::setHoverSelectionBorderColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	301089	    public void setHoverSelectionBorderColor(
GChart::Symbol::setHoverSelectionBorderStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	302432	    public void setHoverSelectionBorderStyle(
GChart::Symbol::setHoverSelectionBorderWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	303930	    public void setHoverSelectionBorderWidth(int borderWidth) {
GChart::Symbol::setHoverSelectionEnabled	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	305302	    public void setHoverSelectionEnabled(boolean hoverSelectionEnabled) {
GChart::Symbol::setHoverSelectionFillSpacing	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	306039	    public void setHoverSelectionFillSpacing(double selectionFillSpacing) {
GChart::Symbol::setHoverSelectionFillThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	306795	    public void setHoverSelectionFillThickness(int selectionFillThickness) {
GChart::Symbol::setHoverSelectionHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	308040	    public void setHoverSelectionHeight(int selectionHeight) {
GChart::Symbol::setHoverSelectionImageURL	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	309683	    public void setHoverSelectionImageURL(String imageURL) {
GChart::Symbol::setHoverSelectionSymbolType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	312146	    public void setHoverSelectionSymbolType(
GChart::Symbol::setHoverSelectionWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	313469	    public void setHoverSelectionWidth(int selectionWidth) {
GChart::Symbol::setHovertextTemplate	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	317971	    public void setHovertextTemplate(String hovertextTemplate) {
GChart::Symbol::setHoverWidget	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	321110	    public void setHoverWidget(HoverUpdateable hoverWidget,
GChart::Symbol::setHoverWidget	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	322727	    public void setHoverWidget(HoverUpdateable annotationWidget) {
GChart::Symbol::setHoverXShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	323891	    public void setHoverXShift(int xShift) {
GChart::Symbol::setHoverYShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	325036	    public void setHoverYShift(int yShift) {
GChart::Symbol::setImageURL	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	328337	    public void setImageURL(String imageURL) {
GChart::Symbol::setHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	329088	    public void setHeight(int height) {
GChart::Symbol::setModelHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	330315	    public void setModelHeight(double modelHeight) {
GChart::Symbol::setModelWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	331511	    public void setModelWidth(double modelWidth) {
GChart::Symbol::setPieSliceOrientation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	333777	    public void setPieSliceOrientation(double pieSliceOrientation) {
GChart::Symbol::setPieSliceSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	335833	    public void setPieSliceSize(double pieSliceSize) {
GChart::Symbol::setSymbolType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	336913	    public void setSymbolType(SymbolType symbolType) {
GChart::Symbol::setWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	337989	    public void setWidth(int width) {
GChart::Symbol::copy	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	338477	    void copy(Symbol from) {
GChart::Symbol::getAnnotation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	340590	    Annotation getAnnotation() {
GChart::Symbol::getHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	340784	    double getHeight(PlotPanel pp, boolean onY2) {
GChart::Symbol::getWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	341114	    double getWidth(PlotPanel pp) {
GChart::Symbol::realizeSymbol	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	341769	    void realizeSymbol(PlotPanel pp, GraphicsRenderingPanel grp,
GChart::lastPieSliceOrientation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	342332	  private static double lastPieSliceOrientation;
GChart::getLastPieSliceOrientation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	342374	  static double getLastPieSliceOrientation() {
GChart::setLastPieSliceOrientation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	342460	  static void setLastPieSliceOrientation(double lastOrientation) {
GChart::initialPieSliceOrientation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	342588	  private double initialPieSliceOrientation;
GChart::setInitialPieSliceOrientation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	343513	  public void setInitialPieSliceOrientation(double orientation) {
GChart::getInitialPieSliceOrientation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	344158	  public double getInitialPieSliceOrientation() {
GChart::SymbolType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	346748	  public static class SymbolType {
GChart::SymbolType::isHorizontallyBanded	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	348056	    Boolean isHorizontallyBanded = null;
GChart::SymbolType::MIN_BAND_SIZE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	348227	    protected final int MIN_BAND_SIZE = 1;
GChart::SymbolType::getBandThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	348536	    protected double getBandThickness(PlotPanel pp, Symbol sym, boolean onY2) {
GChart::SymbolType::getBrushHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	348908	    protected int getBrushHeight(Symbol sym) {
GChart::SymbolType::getBrushLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	349080	    protected AnnotationLocation getBrushLocation(Symbol sym) {
GChart::SymbolType::getBrushWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	349285	    protected int getBrushWidth(Symbol sym) {
GChart::SymbolType::AnnotationAnchor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	350197	    private static class AnnotationAnchor extends SymbolType {
GChart::SymbolType::AnnotationAnchor::location	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	350260	      AnnotationLocation location;
GChart::SymbolType::AnnotationAnchor::AnnotationAnchor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	350277	      AnnotationAnchor(AnnotationLocation location) {
GChart::SymbolType::AnnotationAnchor::getAdjustedWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	350535	      public double getAdjustedWidth(double width, double x,
GChart::SymbolType::AnnotationAnchor::getAdjustedHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	350712	      public double getAdjustedHeight(double height, double y,
GChart::SymbolType::AnnotationAnchor::getUpperLeftX	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	351032	      double getUpperLeftX(double width, double x, double xPrev,
GChart::SymbolType::AnnotationAnchor::getUpperLeftY	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	352102	      double getUpperLeftY(double height, double y, double yPrev,
GChart::SymbolType::HBarBaseline	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	353189	    private static class HBarBaseline extends SymbolType {
GChart::SymbolType::HBarBaseline::HBarBaseline	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	353229	      HBarBaseline(int wm, int hm) {
GChart::SymbolType::HBarBaseline::defaultFillSpacing	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	353345	      protected double defaultFillSpacing() {
GChart::SymbolType::HBarBaseline::defaultHoverLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	353453	      protected AnnotationLocation defaultHoverLocation() {
GChart::SymbolType::HBarBaseline::getAdjustedWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	353560	      public double getAdjustedWidth(double width, double x,
GChart::SymbolType::HBarBaseline::getUpperLeftX	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	353737	      double getUpperLeftX(double width, double x, double xPrev,
GChart::SymbolType::HBarBaseline::getIconHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	353916	      int getIconHeight(int legendFontSize) {
GChart::SymbolType::HBarBaseline::getIconWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	354025	      int getIconWidth(int legendFontSize) {
GChart::SymbolType::HBarLeft	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	354161	    private static class HBarLeft extends SymbolType {
GChart::SymbolType::HBarLeft::HBarLeft	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	354197	      HBarLeft(int wm, int hm) {
GChart::SymbolType::HBarLeft::defaultFillSpacing	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	354313	      protected double defaultFillSpacing() {
GChart::SymbolType::HBarLeft::defaultHoverLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	354421	      protected AnnotationLocation defaultHoverLocation() {
GChart::SymbolType::HBarLeft::getAdjustedWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	354523	      public double getAdjustedWidth(double width, double x,
GChart::SymbolType::HBarLeft::getIconHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	354697	      int getIconHeight(int legendFontSize) {
GChart::SymbolType::HBarLeft::getIconWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	354806	      int getIconWidth(int legendFontSize) {
GChart::SymbolType::HBarRight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	354938	    private static class HBarRight extends SymbolType {
GChart::SymbolType::HBarRight::HBarRight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	354975	      HBarRight(int wm, int hm) {
GChart::SymbolType::HBarRight::defaultFillSpacing	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	355092	      protected double defaultFillSpacing() {
GChart::SymbolType::HBarRight::defaultHoverLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	355200	      protected AnnotationLocation defaultHoverLocation() {
GChart::SymbolType::HBarRight::getAdjustedWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	355303	      public double getAdjustedWidth(double width, double x,
GChart::SymbolType::HBarRight::getIconHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	355477	      int getIconHeight(int legendFontSize) {
GChart::SymbolType::HBarRight::getIconWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	355586	      int getIconWidth(int legendFontSize) {
GChart::SymbolType::LineSymbolType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	355783	    private static class LineSymbolType extends SymbolType {
GChart::SymbolType::LineSymbolType::LineSymbolType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	355825	      LineSymbolType() {
GChart::SymbolType::LineSymbolType::defaultFillSpacing	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	356159	      protected double defaultFillSpacing() {
GChart::SymbolType::LineSymbolType::defaultFillThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	356366	      protected int defaultFillThickness() {
GChart::SymbolType::LineSymbolType::getIconHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	356454	      int getIconHeight(int legendFontSize) {
GChart::SymbolType::LineSymbolType::getIconWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	356572	      int getIconWidth(int legendFontSize) {
GChart::SymbolType::LineSymbolType::realizeSymbol	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	357386	      void realizeSymbol(PlotPanel pp, GraphicsRenderingPanel grp,
GChart::SymbolType::PieSliceSymbolType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	365609	    private static class PieSliceSymbolType extends SymbolType {
GChart::SymbolType::PieSliceSymbolType::horizontallyShaded	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	365671	      private boolean horizontallyShaded;
GChart::SymbolType::PieSliceSymbolType::verticallyShaded	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	365713	      private boolean verticallyShaded;
GChart::SymbolType::PieSliceSymbolType::optimallyShaded	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	365753	      private boolean optimallyShaded;
GChart::SymbolType::PieSliceSymbolType::PieSliceSymbolType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	365777	      PieSliceSymbolType(boolean horizontallyShaded,
GChart::SymbolType::PieSliceSymbolType::defaultHoverLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	366399	      protected AnnotationLocation defaultHoverLocation() {
GChart::SymbolType::PieSliceSymbolType::getBandThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	366970	      protected double getBandThickness(PlotPanel pp, Symbol sym,
GChart::SymbolType::PieSliceSymbolType::getBrushHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	368606	      protected int getBrushHeight(Symbol sym) {
GChart::SymbolType::PieSliceSymbolType::getBrushLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	368852	      protected AnnotationLocation getBrushLocation(Symbol sym) {
GChart::SymbolType::PieSliceSymbolType::getBrushWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	369055	      protected int getBrushWidth(Symbol sym) {
GChart::SymbolType::PieSliceSymbolType::defaultFillSpacing	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	369225	      protected double defaultFillSpacing() {
GChart::SymbolType::PieSliceSymbolType::defaultFillThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	369324	      protected int defaultFillThickness() {
GChart::SymbolType::PieSliceSymbolType::defaultHovertextTemplate	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	369430	      protected String defaultHovertextTemplate() {
GChart::SymbolType::PieSliceSymbolType::SliceLimits	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	369614	      private static class SliceLimits {
GChart::SymbolType::PieSliceSymbolType::SliceLimits::xMin	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	369643	        double xMin;
GChart::SymbolType::PieSliceSymbolType::SliceLimits::xMax	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	369664	        double xMax;
GChart::SymbolType::PieSliceSymbolType::SliceLimits::yMin	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	369685	        double yMin;
GChart::SymbolType::PieSliceSymbolType::SliceLimits::yMax	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	369706	        double yMax;
GChart::SymbolType::PieSliceSymbolType::getSliceLimits	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	369810	      private SliceLimits getSliceLimits(double tMin, double tMax) {
GChart::SymbolType::PieSliceSymbolType::getEdgeLeft	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	371531	      protected double getEdgeLeft(PlotPanel pp, Symbol symbol, double x,
GChart::SymbolType::PieSliceSymbolType::getEdgeRight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	372024	      protected double getEdgeRight(PlotPanel pp, Symbol symbol,
GChart::SymbolType::PieSliceSymbolType::getEdgeTop	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	372518	      protected double getEdgeTop(PlotPanel pp, Symbol symbol, double y,
GChart::SymbolType::PieSliceSymbolType::getEdgeBottom	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	373012	      protected double getEdgeBottom(PlotPanel pp, Symbol symbol,
GChart::SymbolType::PieSliceSymbolType::yWherePieEdgeIntersectsVerticalLine	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	373630	      private static double yWherePieEdgeIntersectsVerticalLine(
GChart::SymbolType::PieSliceSymbolType::xWherePieEdgeIntersectsHorizontalLine	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	374676	      private static double xWherePieEdgeIntersectsHorizontalLine(
GChart::SymbolType::PieSliceSymbolType::angle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	376142	      private static double angle(double x, double y) {
GChart::SymbolType::PieSliceSymbolType::angleInRange	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	376789	      private static boolean angleInRange(double angle, double theta0,
GChart::SymbolType::PieSliceSymbolType::getCenterX	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	378086	      protected double getCenterX(PlotPanel pp, Symbol symbol, int iPoint) {
GChart::SymbolType::PieSliceSymbolType::getCenterY	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	378393	      protected double getCenterY(PlotPanel pp, Symbol symbol,
GChart::SymbolType::PieSliceSymbolType::isIntersecting	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	378986	      protected boolean isIntersecting(PlotPanel pp, Symbol symbol,
GChart::SymbolType::PieSliceSymbolType::realizeSymbol	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	381298	      void realizeSymbol(PlotPanel pp, GraphicsRenderingPanel grp,
GChart::SymbolType::VBarBottom	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	398418	    private static class VBarBottom extends SymbolType {
GChart::SymbolType::VBarBottom::VBarBottom	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	398456	      VBarBottom(int wm, int hm) {
GChart::SymbolType::VBarBottom::defaultFillSpacing	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	398575	      protected double defaultFillSpacing() {
GChart::SymbolType::VBarBottom::defaultHoverLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	398683	      protected AnnotationLocation defaultHoverLocation() {
GChart::SymbolType::VBarBottom::getAdjustedHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	398787	      public double getAdjustedHeight(double height, double y,
GChart::SymbolType::VBarBottom::getIconHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	398963	      int getIconHeight(int legendFontSize) {
GChart::SymbolType::VBarBottom::getIconWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	399049	      int getIconWidth(int legendFontSize) {
GChart::SymbolType::VBarBaseline	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	399205	    private static class VBarBaseline extends SymbolType {
GChart::SymbolType::VBarBaseline::VBarBaseline	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	399245	      VBarBaseline(int wm, int hm) {
GChart::SymbolType::VBarBaseline::defaultFillSpacing	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	399362	      protected double defaultFillSpacing() {
GChart::SymbolType::VBarBaseline::defaultHoverLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	399470	      protected AnnotationLocation defaultHoverLocation() {
GChart::SymbolType::VBarBaseline::getAdjustedHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	399577	      public double getAdjustedHeight(double height, double y,
GChart::SymbolType::VBarBaseline::getUpperLeftY	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	399756	      double getUpperLeftY(double height, double y, double yPrev,
GChart::SymbolType::VBarBaseline::getIconHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	399936	      int getIconHeight(int legendFontSize) {
GChart::SymbolType::VBarBaseline::getIconWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	400022	      int getIconWidth(int legendFontSize) {
GChart::SymbolType::VBarTop	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	400294	    private static class VBarTop extends SymbolType {
GChart::SymbolType::VBarTop::VBarTop	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	400329	      VBarTop(int wm, int hm) {
GChart::SymbolType::VBarTop::defaultFillSpacing	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	400445	      protected double defaultFillSpacing() {
GChart::SymbolType::VBarTop::defaultHoverLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	400553	      protected AnnotationLocation defaultHoverLocation() {
GChart::SymbolType::VBarTop::getAdjustedHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	400654	      public double getAdjustedHeight(double height, double y,
GChart::SymbolType::VBarTop::getIconHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	400830	      int getIconHeight(int legendFontSize) {
GChart::SymbolType::VBarTop::getIconWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	400916	      int getIconWidth(int legendFontSize) {
GChart::SymbolType::ANCHOR_CENTER	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	402497	    public static SymbolType ANCHOR_CENTER = new AnnotationAnchor(
GChart::SymbolType::ANCHOR_EAST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	403292	    public static SymbolType ANCHOR_EAST = new AnnotationAnchor(
GChart::SymbolType::ANCHOR_MOUSE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	404744	    public static SymbolType ANCHOR_MOUSE = new AnnotationAnchor(
GChart::SymbolType::ANCHOR_MOUSE_SNAP_TO_X	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	405186	    public static SymbolType ANCHOR_MOUSE_SNAP_TO_X = new AnnotationAnchor(
GChart::SymbolType::ANCHOR_MOUSE_SNAP_TO_Y	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	405647	    public static SymbolType ANCHOR_MOUSE_SNAP_TO_Y = new AnnotationAnchor(
GChart::SymbolType::ANCHOR_NORTH	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	406462	    public static SymbolType ANCHOR_NORTH = new AnnotationAnchor(
GChart::SymbolType::ANCHOR_NORTHEAST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	407235	    public static SymbolType ANCHOR_NORTHEAST = new AnnotationAnchor(
GChart::SymbolType::ANCHOR_NORTHWEST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	408015	    public static SymbolType ANCHOR_NORTHWEST = new AnnotationAnchor(
GChart::SymbolType::ANCHOR_SOUTH	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	408818	    public static SymbolType ANCHOR_SOUTH = new AnnotationAnchor(
GChart::SymbolType::ANCHOR_SOUTHEAST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	409592	    public static SymbolType ANCHOR_SOUTHEAST = new AnnotationAnchor(
GChart::SymbolType::ANCHOR_SOUTHWEST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	410372	    public static SymbolType ANCHOR_SOUTHWEST = new AnnotationAnchor(
GChart::SymbolType::ANCHOR_WEST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	411171	    public static SymbolType ANCHOR_WEST = new AnnotationAnchor(
GChart::SymbolType::BOX_CENTER	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	411380	    public static SymbolType BOX_CENTER = new SymbolType(0, 0, 0, 0, 0, 0);
GChart::SymbolType::BOX_EAST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	411575	    public static SymbolType BOX_EAST = new SymbolType(1, 0, 0.5, -0.5, 0,
GChart::SymbolType::BOX_NORTH	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	411773	    public static SymbolType BOX_NORTH = new SymbolType(0, -1, 0, 0, -0.5,
GChart::SymbolType::BOX_NORTHEAST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	411958	    public static SymbolType BOX_NORTHEAST = new SymbolType(1, -1, 0.5,
GChart::SymbolType::BOX_NORTHWEST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	412150	    public static SymbolType BOX_NORTHWEST = new SymbolType(-1, -1, -0.5,
GChart::SymbolType::BOX_SOUTH	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	412361	    public static SymbolType BOX_SOUTH = new SymbolType(0, 1, 0, 0, 0.5,
GChart::SymbolType::BOX_SOUTHEAST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	412545	    public static SymbolType BOX_SOUTHEAST = new SymbolType(1, 1, 0.5,
GChart::SymbolType::BOX_SOUTHWEST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	412737	    public static SymbolType BOX_SOUTHWEST = new SymbolType(-1, 1, -0.5,
GChart::SymbolType::BOX_WEST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	412954	    public static SymbolType BOX_WEST = new SymbolType(-1, 0, -0.5, 0.5, 0,
GChart::SymbolType::HBAR_BASELINE_CENTER	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	413691	    public static SymbolType HBAR_BASELINE_CENTER = new HBarBaseline(0, 0);
GChart::SymbolType::HBAR_BASELINE_NORTH	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	414417	    public static SymbolType HBAR_BASELINE_NORTH = new HBarBaseline(0, -1);
GChart::SymbolType::HBAR_BASELINE_SOUTH	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	415114	    public static SymbolType HBAR_BASELINE_SOUTH = new HBarBaseline(0, 1);
GChart::SymbolType::HBAR_EAST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	415348	    public static SymbolType HBAR_EAST = new HBarRight(1, 0);
GChart::SymbolType::line	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	415411	    private static SymbolType line = new LineSymbolType();
GChart::SymbolType::HBAR_NEXT	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	416470	    public static SymbolType HBAR_NEXT = line;
GChart::SymbolType::HBAR_NORTHEAST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	416675	    public static SymbolType HBAR_NORTHEAST = new HBarRight(1, -1);
GChart::SymbolType::HBAR_NORTHWEST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	416897	    public static SymbolType HBAR_NORTHWEST = new HBarLeft(-1, -1);
GChart::SymbolType::HBAR_PREV	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	417978	    public static SymbolType HBAR_PREV = line;
GChart::SymbolType::HBAR_SOUTHEAST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	418183	    public static SymbolType HBAR_SOUTHEAST = new HBarRight(1, 1);
GChart::SymbolType::HBAR_SOUTHWEST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	418407	    public static SymbolType HBAR_SOUTHWEST = new HBarLeft(-1, 1);
GChart::SymbolType::HBAR_WEST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	418633	    public static SymbolType HBAR_WEST = new HBarLeft(-1, 0);
GChart::SymbolType::LINE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	420047	    public static SymbolType LINE = line;
GChart::SymbolType::LINE_CANVAS	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	421753	    public static SymbolType LINE_CANVAS = line;
GChart::SymbolType::NONE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	423514	    public static SymbolType NONE = new SymbolType(0, 0, 0, 0, 0, 0) {
GChart::SymbolType::PIE_SLICE_HORIZONTAL_SHADING	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	425702	    public static SymbolType PIE_SLICE_HORIZONTAL_SHADING = new PieSliceSymbolType(
GChart::SymbolType::PIE_SLICE_VERTICAL_SHADING	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	427425	    public static SymbolType PIE_SLICE_VERTICAL_SHADING = new PieSliceSymbolType(
GChart::SymbolType::PIE_SLICE_HATCHED_SHADING	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	429242	    public static SymbolType PIE_SLICE_HATCHED_SHADING = new PieSliceSymbolType(
GChart::SymbolType::PIE_SLICE_OPTIMAL_SHADING	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	433776	    public static SymbolType PIE_SLICE_OPTIMAL_SHADING = new PieSliceSymbolType(
GChart::SymbolType::VBAR_BASELINE_CENTER	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	434548	    public static SymbolType VBAR_BASELINE_CENTER = new VBarBaseline(0, 0);
GChart::SymbolType::VBAR_BASELINE_WEST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	435271	    public static SymbolType VBAR_BASELINE_WEST = new VBarBaseline(-1, 0);
GChart::SymbolType::VBAR_BASELINE_EAST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	435966	    public static SymbolType VBAR_BASELINE_EAST = new VBarBaseline(1, 0);
GChart::SymbolType::VBAR_NEXT	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	438161	    public static SymbolType VBAR_NEXT = line;
GChart::SymbolType::VBAR_NORTH	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	438949	    public static SymbolType VBAR_NORTH = new VBarTop(0, -1);
GChart::SymbolType::VBAR_NORTHEAST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	439173	    public static SymbolType VBAR_NORTHEAST = new VBarTop(1, -1);
GChart::SymbolType::VBAR_NORTHWEST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	439401	    public static SymbolType VBAR_NORTHWEST = new VBarTop(-1, -1);
GChart::SymbolType::VBAR_PREV	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	440472	    public static SymbolType VBAR_PREV = line;
GChart::SymbolType::VBAR_SOUTH	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	441218	    public static SymbolType VBAR_SOUTH = new VBarBottom(0, 1);
GChart::SymbolType::VBAR_SOUTHEAST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	441439	    public static SymbolType VBAR_SOUTHEAST = new VBarBottom(1, 1);
GChart::SymbolType::VBAR_SOUTHWEST	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	441664	    public static SymbolType VBAR_SOUTHWEST = new VBarBottom(-1, 1);
GChart::SymbolType::XGRIDLINE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	441881	    public static SymbolType XGRIDLINE = new SymbolType(0, 0, 0, 0, 0.5,
GChart::SymbolType::YGRIDLINE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	442765	    public static SymbolType YGRIDLINE = new SymbolType(0, 0, 0.5, 0.5, 0,
GChart::SymbolType::Y2GRIDLINE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	443886	    public static SymbolType Y2GRIDLINE = YGRIDLINE;
GChart::SymbolType::heightMultiplier	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	443997	    protected int heightMultiplier;
GChart::SymbolType::widthMultiplier	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	444033	    protected int widthMultiplier;
GChart::SymbolType::pixelPadLeft	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	445249	    protected double pixelPadLeft;
GChart::SymbolType::pixelPadRight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	445284	    protected double pixelPadRight;
GChart::SymbolType::pixelPadTop	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	445320	    protected double pixelPadTop;
GChart::SymbolType::pixelPadBottom	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	445354	    protected double pixelPadBottom;
GChart::SymbolType::SymbolType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	445480	    private SymbolType(int widthMultiplier, int heightMultiplier,
GChart::SymbolType::SymbolType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	446063	    private SymbolType(int widthMultiplier, int heightMultiplier,
GChart::SymbolType::getAdjustedHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	446360	    double getAdjustedHeight(double height, double y, double yPrev,
GChart::SymbolType::getAdjustedWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	446519	    double getAdjustedWidth(double width, double x, double xPrev,
GChart::SymbolType::getCenterX	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	446997	    protected double getCenterX(PlotPanel pp, Symbol symbol, double prevX,
GChart::SymbolType::getCenterX	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	448210	    protected double getCenterX(PlotPanel pp, Symbol symbol, int iPoint) {
GChart::SymbolType::getCenterY	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	449017	    protected double getCenterY(PlotPanel pp, Symbol symbol, double prevY,
GChart::SymbolType::getCenterY	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	450478	    protected double getCenterY(PlotPanel pp, Symbol symbol, int iPoint,
GChart::SymbolType::getEdgeLeft	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	451198	    protected double getEdgeLeft(PlotPanel pp, Symbol symbol, double x,
GChart::SymbolType::getEdgeRight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	452369	    protected double getEdgeRight(PlotPanel pp, Symbol symbol, double x,
GChart::SymbolType::getEdgeTop	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	453555	    protected double getEdgeTop(PlotPanel pp, Symbol symbol, double y,
GChart::SymbolType::getEdgeBottom	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	454949	    protected double getEdgeBottom(PlotPanel pp, Symbol symbol, double y,
GChart::SymbolType::getEdgeOppositeHorizontally	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	456345	    protected double getEdgeOppositeHorizontally(PlotPanel pp,
GChart::SymbolType::getEdgeOppositeVertically	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	457615	    protected double getEdgeOppositeVertically(PlotPanel pp, Symbol symbol,
GChart::SymbolType::isIntersecting	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	459157	    private boolean isIntersecting(PlotPanel pp, Symbol symbol,
GChart::SymbolType::isIntersecting	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	462498	    protected boolean isIntersecting(PlotPanel pp, Symbol symbol,
GChart::SymbolType::getIconBorderWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	463833	    int getIconBorderWidth(int legendFontSize, double symBorderFraction) {
GChart::SymbolType::getIconHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	464166	    int getIconHeight(int legendFontSize) {
GChart::SymbolType::getIconWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	464271	    int getIconWidth(int legendFontSize) {
GChart::SymbolType::getUpperLeftX	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	464378	    double getUpperLeftX(double width, double x, double xPrev,
GChart::SymbolType::getUpperLeftY	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	464706	    double getUpperLeftY(double height, double y, double yPrev,
GChart::SymbolType::defaultAnnotationLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	465063	    protected AnnotationLocation defaultAnnotationLocation() {
GChart::SymbolType::defaultFillSpacing	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	465310	    protected double defaultFillSpacing() {
GChart::SymbolType::defaultFillThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	465479	    protected int defaultFillThickness() {
GChart::SymbolType::defaultHovertextTemplate	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	465630	    protected String defaultHovertextTemplate() {
GChart::SymbolType::defaultHoverLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	465803	    protected AnnotationLocation defaultHoverLocation() {
GChart::SymbolType::createImage	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	466088	    private Image createImage(Symbol symbol, double width, double height,
GChart::SymbolType::createIconImage	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	468507	    Image createIconImage(Symbol symbol, int legendFontSize,
GChart::SymbolType::areDisjointRanges	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	468931	    static private boolean areDisjointRanges(double x1, double x2,
GChart::SymbolType::intersects	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	469334	    static boolean intersects(double left1, double top1, double right1,
GChart::SymbolType::paddedIntersects	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	469908	    static boolean paddedIntersects(double rpf, double left1, double top1,
GChart::SymbolType::realizeOneImageOfSymbol	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	470479	    protected void realizeOneImageOfSymbol(PlotPanel pp,
GChart::SymbolType::distance	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	475974	    protected double distance(double x1, double y1, double x2, double y2) {
GChart::SymbolType::oppositeEdge	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	477196	    static double oppositeEdge = Double.NaN;
GChart::SymbolType::realizeSymbol	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	477233	    void realizeSymbol(PlotPanel pp, GraphicsRenderingPanel grp,
GChart::TickLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	489262	  public static final class TickLocation {
GChart::TickLocation::locationIndex	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	489473	    int locationIndex;
GChart::TickLocation::TickLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	489501	    private TickLocation(int locationIndex) {
GChart::TickLocation::OUTSIDE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	489755	    public static final TickLocation OUTSIDE = new TickLocation(-1);
GChart::TickLocation::CENTERED	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	489951	    public static final TickLocation CENTERED = new TickLocation(0);
GChart::TickLocation::INSIDE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	490153	    public static final TickLocation INSIDE = new TickLocation(1);
GChart::TickLocation::getXAxisSymbolType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	490391	    SymbolType getXAxisSymbolType(int axisPosition) {
GChart::TickLocation::getYAxisSymbolType	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	490853	    SymbolType getYAxisSymbolType(int axisPosition) {
GChart::TouchedPointUpdateOption	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	491376	  public static final class TouchedPointUpdateOption {
GChart::TouchedPointUpdateOption::TouchedPointUpdateOption	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	491415	    private TouchedPointUpdateOption() {
GChart::TouchedPointUpdateOption::TOUCHED_POINT_CLEARED	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	492144	    public static final TouchedPointUpdateOption TOUCHED_POINT_CLEARED = new TouchedPointUpdateOption();
GChart::TouchedPointUpdateOption::TOUCHED_POINT_LOCKED	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	493426	    public static final TouchedPointUpdateOption TOUCHED_POINT_LOCKED = new TouchedPointUpdateOption();
GChart::TouchedPointUpdateOption::TOUCHED_POINT_UPDATED	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	494303	    public static final TouchedPointUpdateOption TOUCHED_POINT_UPDATED = new TouchedPointUpdateOption();
GChart::XAxis	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	494462	  public class XAxis extends Axis {
GChart::XAxis::XAxis	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	494487	    XAxis() {
GChart::XAxis::clientToModel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	494816	    public double clientToModel(int clientCoordinate) {
GChart::XAxis::getAxisLabelThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	495055	    public int getAxisLabelThickness() {
GChart::XAxis::getDataMax	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	495867	    public double getDataMax() {
GChart::XAxis::getDataMin	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	496362	    public double getDataMin() {
GChart::XAxis::getMouseCoordinate	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	496855	    public double getMouseCoordinate() {
GChart::XAxis::getTickLabelThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	496992	    public int getTickLabelThickness(boolean needsPopulation) { // overrides
GChart::XAxis::modelToClient	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	497731	    public double modelToClient(double modelCoordinate) {
GChart::XAxis::modelToPixel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	497976	    public double modelToPixel(double modelCoordinate) {
GChart::XAxis::modelToPlotAreaPixel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	498125	    public double modelToPlotAreaPixel(double modelCoordinate) {
GChart::XAxis::pixelToModel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	498277	    public double pixelToModel(int pixelCoordinate) {
GChart::XAxis::plotAreaPixelToModel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	498424	    public double plotAreaPixelToModel(int pixelCoordinate) {
GChart::XAxis::setTickLength	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	498572	    public void setTickLength(int tickLength) {
GChart::XAxis::setTickThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	498788	    public void setTickThickness(int tickThickness) {
GChart::Y2Axis	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	499083	  public class Y2Axis extends Axis {
GChart::Y2Axis::Y2Axis	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	499109	    Y2Axis() {
GChart::Y2Axis::clientToModel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	499442	    public double clientToModel(int clientCoordinate) {
GChart::Y2Axis::getDataMax	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	499683	    public double getDataMax() {
GChart::Y2Axis::getDataMin	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	500237	    public double getDataMin() {
GChart::Y2Axis::getMouseCoordinate	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	500789	    public double getMouseCoordinate() {
GChart::Y2Axis::modelToClient	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	500930	    public double modelToClient(double modelCoordinate) {
GChart::Y2Axis::modelToPixel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	501179	    public double modelToPixel(double modelCoordinate) {
GChart::Y2Axis::modelToPlotAreaPixel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	501334	    public double modelToPlotAreaPixel(double modelCoordinate) {
GChart::Y2Axis::pixelToModel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	501492	    public double pixelToModel(int pixelCoordinate) {
GChart::Y2Axis::plotAreaPixelToModel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	501640	    public double plotAreaPixelToModel(int pixelCoordinate) {
GChart::Y2Axis::setTickLength	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	501789	    public void setTickLength(int tickLength) {
GChart::Y2Axis::setTickThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	501993	    public void setTickThickness(int tickThickness) {
GChart::YAxis	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	502285	  public class YAxis extends Axis {
GChart::YAxis::YAxis	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	502310	    YAxis() {
GChart::YAxis::clientToModel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	502640	    public double clientToModel(int clientCoordinate) {
GChart::YAxis::getDataMax	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	502880	    public double getDataMax() {
GChart::YAxis::getDataMin	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	503433	    public double getDataMin() {
GChart::YAxis::getMouseCoordinate	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	503984	    public double getMouseCoordinate() {
GChart::YAxis::modelToClient	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	504124	    public double modelToClient(double modelCoordinate) {
GChart::YAxis::modelToPixel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	504374	    public double modelToPixel(double modelCoordinate) {
GChart::YAxis::modelToPlotAreaPixel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	504530	    public double modelToPlotAreaPixel(double modelCoordinate) {
GChart::YAxis::pixelToModel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	504689	    public double pixelToModel(int pixelCoordinate) {
GChart::YAxis::plotAreaPixelToModel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	504836	    public double plotAreaPixelToModel(int pixelCoordinate) {
GChart::YAxis::setTickLength	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	504984	    public void setTickLength(int tickLength) {
GChart::YAxis::setTickThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	505188	    public void setTickThickness(int tickThickness) {
GChart::AlignedLabel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	505829	  private static class AlignedLabel extends Grid {
GChart::AlignedLabel::AlignedLabel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	505861	    AlignedLabel() {
GChart::PartitionedAbsolutePanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	507310	  static class PartitionedAbsolutePanel extends Composite {
GChart::PartitionedAbsolutePanel::WIDGETS_PER_PANEL	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	509735	    final int WIDGETS_PER_PANEL = 256;
GChart::PartitionedAbsolutePanel::root	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	509786	    private AbsolutePanel root = new AbsolutePanel();
GChart::PartitionedAbsolutePanel::subPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	509840	    private AbsolutePanel subPanel = null; // "selected"
GChart::PartitionedAbsolutePanel::iSubPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	509903	    private int iSubPanel = -1; // index of
GChart::PartitionedAbsolutePanel::nWidgets	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	509981	    private int nWidgets = 0; // total #
GChart::PartitionedAbsolutePanel::PartitionedAbsolutePanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	510045	    PartitionedAbsolutePanel() {
GChart::PartitionedAbsolutePanel::clear	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	510197	    public void clear() {
GChart::PartitionedAbsolutePanel::getWidgetCount	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	510314	    public int getWidgetCount() {
GChart::PartitionedAbsolutePanel::selectSubPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	510446	    private void selectSubPanel(int iWidget) {
GChart::PartitionedAbsolutePanel::add	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	510733	    public void add(Widget w) {
GChart::PartitionedAbsolutePanel::getWidget	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	511274	    public Widget getWidget(int iWidget) {
GChart::PartitionedAbsolutePanel::remove	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	511674	    public boolean remove(int iWidget) {
GChart::PartitionedAbsolutePanel::setWidgetPosition	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	512653	    public void setWidgetPosition(Widget w, int left, int top) {
GChart::Rectangle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	512818	  static class Rectangle { // a (pixel graphics coords) rectangle
GChart::Rectangle::x	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	512880	    double x; // x, y at upper left corner of rectangle
GChart::Rectangle::y	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	512936	    double y;
GChart::Rectangle::width	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	512950	    double width; // distance from x to right edge
GChart::Rectangle::height	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	513001	    double height; // distance from y to bottom edge
GChart::AnnotationRenderingPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	513174	  class AnnotationRenderingPanel extends PartitionedAbsolutePanel {
GChart::AnnotationRenderingPanel::labelIndex	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	513242	    int labelIndex = 0; // to-be-added-next label index
GChart::AnnotationRenderingPanel::lastVisibleLabel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	513306	    private int lastVisibleLabel = -1; // just before 1st valid index
GChart::AnnotationRenderingPanel::getFirstInnerAlignedLabel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	513507	    AlignedLabel getFirstInnerAlignedLabel() {
GChart::AnnotationRenderingPanel::NonoccludingReusuableAlignedLabel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	514413	    class NonoccludingReusuableAlignedLabel extends AlignedLabel {
GChart::AnnotationRenderingPanel::NonoccludingReusuableAlignedLabel::fontSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	514480	      int fontSize = GChart.NAI;
GChart::AnnotationRenderingPanel::NonoccludingReusuableAlignedLabel::fontFamily	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	514516	      String fontFamily = USE_CSS;
GChart::AnnotationRenderingPanel::NonoccludingReusuableAlignedLabel::fontStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	514551	      String fontStyle = USE_CSS;
GChart::AnnotationRenderingPanel::NonoccludingReusuableAlignedLabel::fontWeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	514585	      String fontWeight = USE_CSS;
GChart::AnnotationRenderingPanel::NonoccludingReusuableAlignedLabel::fontColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	514620	      String fontColor = USE_CSS;
GChart::AnnotationRenderingPanel::NonoccludingReusuableAlignedLabel::hAlign	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	514698	      HasHorizontalAlignment.HorizontalAlignmentConstant hAlign;
GChart::AnnotationRenderingPanel::NonoccludingReusuableAlignedLabel::vAlign	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	514759	      HasVerticalAlignment.VerticalAlignmentConstant vAlign;
GChart::AnnotationRenderingPanel::NonoccludingReusuableAlignedLabel::labelText	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	514780	      String labelText = null;
GChart::AnnotationRenderingPanel::NonoccludingReusuableAlignedLabel::isHTML	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	514812	      boolean isHTML = false;
GChart::AnnotationRenderingPanel::NonoccludingReusuableAlignedLabel::labelWidget	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	514841	      Widget labelWidget = null;
GChart::AnnotationRenderingPanel::NonoccludingReusuableAlignedLabel::innerGrid	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	514886	      final AlignedLabel innerGrid = new AlignedLabel();
GChart::AnnotationRenderingPanel::NonoccludingReusuableAlignedLabel::getInnerGrid	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	514938	      AlignedLabel getInnerGrid() {
GChart::AnnotationRenderingPanel::NonoccludingReusuableAlignedLabel::NonoccludingReusuableAlignedLabel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	514996	      NonoccludingReusuableAlignedLabel() {
GChart::AnnotationRenderingPanel::NonoccludingReusuableAlignedLabel::setReusableProperties	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	517976	      void setReusableProperties(int fontSize, String fontFamily,
GChart::AnnotationRenderingPanel::AnnotationRenderingPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	520699	    AnnotationRenderingPanel() {
GChart::AnnotationRenderingPanel::setLabelPosition	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	521210	    void setLabelPosition(NonoccludingReusuableAlignedLabel lbl, int x,
GChart::AnnotationRenderingPanel::beginRendering	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	521512	    void beginRendering() {
GChart::AnnotationRenderingPanel::endRendering	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	521569	    void endRendering() {
GChart::AnnotationRenderingPanel::getNextOrNewAlignedLabel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	522129	    NonoccludingReusuableAlignedLabel getNextOrNewAlignedLabel(
GChart::AnnotationRenderingPanel::renderAnnotation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	524127	    protected void renderAnnotation(Annotation annotation,
GChart::GraphicsRenderingPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	527456	  class GraphicsRenderingPanel extends AbsolutePanel {
GChart::GraphicsRenderingPanel::canvas	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	527532	    private GChartCanvasLite canvas = null;
GChart::GraphicsRenderingPanel::x0	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	527555	    int x0 = 0; // origin,
GChart::GraphicsRenderingPanel::y0	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	527657	    int y0 = 0; // corner
GChart::GraphicsRenderingPanel::canvasWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	527738	    int canvasWidth = 0; // width
GChart::GraphicsRenderingPanel::canvasHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	527837	    int canvasHeight = 0; // height
GChart::GraphicsRenderingPanel::canvasPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	527956	    private AbsolutePanel canvasPanel = new AbsolutePanel();
GChart::GraphicsRenderingPanel::imagePanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	528028	    private PartitionedAbsolutePanel imagePanel = new PartitionedAbsolutePanel();
GChart::GraphicsRenderingPanel::imageIndex	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	528081	    int imageIndex = 0;
GChart::GraphicsRenderingPanel::lastVisibleImage	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	528180	    private int lastVisibleImage = -1;
GChart::GraphicsRenderingPanel::setRenderingPosition	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	528213	    void setRenderingPosition(int xShift, int yShift) {
GChart::GraphicsRenderingPanel::maybeAddCanvas	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	528416	    void maybeAddCanvas() {
GChart::GraphicsRenderingPanel::ReusableImage	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	530724	    class ReusableImage extends Image {
GChart::GraphicsRenderingPanel::ReusableImage::backgroundColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	530775	      private String backgroundColor = USE_CSS;
GChart::GraphicsRenderingPanel::ReusableImage::borderColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	530823	      private String borderColor = USE_CSS;
GChart::GraphicsRenderingPanel::ReusableImage::borderStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	530867	      private String borderStyle = USE_CSS;
GChart::GraphicsRenderingPanel::ReusableImage::cappedBorderWidthX2	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	530981	      private int cappedBorderWidthX2 = GChart.NAI;
GChart::GraphicsRenderingPanel::ReusableImage::width	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	531033	      private int width = GChart.NAI;
GChart::GraphicsRenderingPanel::ReusableImage::height	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	531071	      private int height = GChart.NAI;
GChart::GraphicsRenderingPanel::ReusableImage::x	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	531102	      int x = GChart.NAI;
GChart::GraphicsRenderingPanel::ReusableImage::y	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	531128	      int y = GChart.NAI;
GChart::GraphicsRenderingPanel::ReusableImage::url	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	531157	      String url = null;
GChart::GraphicsRenderingPanel::ReusableImage::ReusableImage	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	531176	      ReusableImage() {
GChart::GraphicsRenderingPanel::ReusableImage::setReusableProperties	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	531256	      void setReusableProperties(String backgroundColor,
GChart::GraphicsRenderingPanel::GraphicsRenderingPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	538038	    GraphicsRenderingPanel() {
GChart::GraphicsRenderingPanel::getCanvas	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	538595	    GChartCanvasLite getCanvas() {
GChart::GraphicsRenderingPanel::setImagePosition	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	538646	    void setImagePosition(ReusableImage img, int x, int y) {
GChart::GraphicsRenderingPanel::beginRendering	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	539003	    void beginRendering(Rectangle canvasRegion) {
GChart::GraphicsRenderingPanel::endRendering	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	540245	    void endRendering() {
GChart::GraphicsRenderingPanel::addOrRevealImage	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	541005	    void addOrRevealImage(String backgroundColor, String borderColor,
GChart::GraphicsRenderingPanel::renderBorderedImage	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	544691	    public void renderBorderedImage(String backgroundColor,
GChart::InsertableAbsolutePanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	545630	  class InsertableAbsolutePanel extends AbsolutePanel {
GChart::InsertableAbsolutePanel::insert	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	545694	    public void insert(Widget child,
GChart::PlotPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	545896	  class PlotPanel extends AbsolutePanel {
GChart::PlotPanel::leftOfYWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	545946	    private int leftOfYWidth;
GChart::PlotPanel::rightOfY2Width	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	545976	    private int rightOfY2Width;
GChart::PlotPanel::topMargin	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546008	    private int topMargin;
GChart::PlotPanel::xAxisEnsembleHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546035	    private int xAxisEnsembleHeight;
GChart::PlotPanel::xChartSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546072	    private int xChartSize;
GChart::PlotPanel::xLB	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546103	    private double xLB = Double.NaN; // lower
GChart::PlotPanel::xUB	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546181	    private double xUB = Double.NaN; // upper
GChart::PlotPanel::xMax	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546259	    private double xMax = Double.NaN;
GChart::PlotPanel::xMin	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546297	    private double xMin = Double.NaN;
GChart::PlotPanel::y2AxisEnsembleWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546332	    private int y2AxisEnsembleWidth;
GChart::PlotPanel::y2LB	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546372	    private double y2LB = Double.NaN;
GChart::PlotPanel::y2UB	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546410	    private double y2UB = Double.NaN;
GChart::PlotPanel::y2Max	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546448	    private double y2Max = Double.NaN;
GChart::PlotPanel::y2Min	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546487	    private double y2Min = Double.NaN;
GChart::PlotPanel::yAxisEnsembleWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546523	    private int yAxisEnsembleWidth;
GChart::PlotPanel::chartLegendThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546559	    private int chartLegendThickness;
GChart::PlotPanel::chartFootnotesThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546597	    private int chartFootnotesThickness;
GChart::PlotPanel::yChartSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546638	    private int yChartSize;
GChart::PlotPanel::yLB	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546669	    private double yLB = Double.NaN;
GChart::PlotPanel::yUB	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546706	    private double yUB = Double.NaN;
GChart::PlotPanel::yMax	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546743	    private double yMax = Double.NaN;
GChart::PlotPanel::yMin	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546781	    private double yMin = Double.NaN;
GChart::PlotPanel::clientX	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546954	    private int clientX = GChart.NAI;
GChart::PlotPanel::clientY	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	546992	    private int clientY = GChart.NAI;
GChart::PlotPanel::xMouse	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	547166	    private int xMouse = GChart.NAI;
GChart::PlotPanel::yMouse	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	547203	    private int yMouse = GChart.NAI;
GChart::PlotPanel::DECORATIVE_RENDERING_PANEL_INDEX	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	547375	    final static int DECORATIVE_RENDERING_PANEL_INDEX = 0;
GChart::PlotPanel::graphicsPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	547449	    private InsertableAbsolutePanel graphicsPanel = new InsertableAbsolutePanel();
GChart::PlotPanel::annotationPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	547532	    private InsertableAbsolutePanel annotationPanel = new InsertableAbsolutePanel();
GChart::PlotPanel::outOfBoundsCheckingDisabled	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	547602	    private boolean outOfBoundsCheckingDisabled;
GChart::PlotPanel::addGraphicsRenderingPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	548177	    void addGraphicsRenderingPanel(int rpIndex) {
GChart::PlotPanel::addAnnotationRenderingPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	549131	    void addAnnotationRenderingPanel(int rpIndex) {
GChart::PlotPanel::removeGraphicsRenderingPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	549722	    void removeGraphicsRenderingPanel(int rpIndex) {
GChart::PlotPanel::removeAnnotationRenderingPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	549819	    void removeAnnotationRenderingPanel(int rpIndex) {
GChart::PlotPanel::getGraphicsRenderingPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	550070	    GraphicsRenderingPanel getGraphicsRenderingPanel(int rpIndex) {
GChart::PlotPanel::getAnnotationRenderingPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	550722	    AnnotationRenderingPanel getAnnotationRenderingPanel(int rpIndex) {
GChart::PlotPanel::getClientX	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	551235	    int getClientX() {
GChart::PlotPanel::setClientX	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	551288	    void setClientX(int clientX, boolean isClick) {
GChart::PlotPanel::getClientY	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	552986	    int getClientY() {
GChart::PlotPanel::setClientY	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	553098	    void setClientY(int clientY, boolean isClick) {
GChart::PlotPanel::repairBadClientX	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	554037	    private int repairBadClientX(int x) {
GChart::PlotPanel::repairBadClientY	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	554257	    private int repairBadClientY(int y) {
GChart::PlotPanel::getXMouse	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	554369	    int getXMouse() {
GChart::PlotPanel::getYMouse	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	554419	    int getYMouse() {
GChart::PlotPanel::getXMousePlotArea	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	554534	    int getXMousePlotArea() {
GChart::PlotPanel::getYMousePlotArea	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	554699	    int getYMousePlotArea() {
GChart::PlotPanel::PlotPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	554792	    PlotPanel() {
GChart::PlotPanel::getXAxisEnsembleHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	555702	    int getXAxisEnsembleHeight() {
GChart::PlotPanel::getXMax	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	555781	    double getXMax() {
GChart::PlotPanel::getXMin	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	555830	    double getXMin() {
GChart::PlotPanel::getY2AxisEnsembleWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	555876	    int getY2AxisEnsembleWidth() {
GChart::PlotPanel::getRightOfY2Width	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	555952	    int getRightOfY2Width() {
GChart::PlotPanel::getY2Max	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	556021	    double getY2Max() {
GChart::PlotPanel::getY2Min	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	556072	    double getY2Min() {
GChart::PlotPanel::getYAxisEnsembleWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	556120	    int getYAxisEnsembleWidth() {
GChart::PlotPanel::getLeftOfYWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	556194	    int getLeftOfYWidth() {
GChart::PlotPanel::isOutOfBounds	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	556324	    boolean isOutOfBounds(double x, double y, boolean onY2) {
GChart::PlotPanel::legendThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	556984	    int legendThickness() {
GChart::PlotPanel::chartFootnotesThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	557054	    int chartFootnotesThickness() {
GChart::PlotPanel::chartTitleThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	557135	    int chartTitleThickness() {
GChart::PlotPanel::getYMax	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	557201	    double getYMax() {
GChart::PlotPanel::getYMin	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	557250	    double getYMin() {
GChart::PlotPanel::reset	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	557297	    void reset(int xChartSize, int yChartSize, boolean hasYAxis,
GChart::PlotPanel::xToChartPixel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	560393	    double xToChartPixel(double x) {
GChart::PlotPanel::xToPixel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	560855	    double xToPixel(double x) {
GChart::PlotPanel::xChartPixelToX	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	561204	    double xChartPixelToX(int xPx) {
GChart::PlotPanel::xPixelToX	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	561454	    double xPixelToX(int xPx) {
GChart::PlotPanel::dxToPixel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	561670	    double dxToPixel(double dx) {
GChart::PlotPanel::yToChartPixel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	561863	    double yToChartPixel(double y, boolean isY2) {
GChart::PlotPanel::yToPixel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	562376	    double yToPixel(double y, boolean isY2) {
GChart::PlotPanel::yChartPixelToY	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	562811	    double yChartPixelToY(int yPx) {
GChart::PlotPanel::yPixelToY	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	563058	    double yPixelToY(int yPx) {
GChart::PlotPanel::yChartPixelToY2	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	563274	    double yChartPixelToY2(int yPx) {
GChart::PlotPanel::yPixelToY2	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	563525	    double yPixelToY2(int yPx) {
GChart::PlotPanel::dyToPixel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	563745	    double dyToPixel(double dy, boolean isY2) {
GChart::PlotPanel::touchedPoint	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	564094	    Curve.Point touchedPoint = null;
GChart::PlotPanel::touchedHoverWidget	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	564135	    HoverUpdateable touchedHoverWidget = null;
GChart::PlotPanel::getOpenedHoverContainer	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	564322	    AlignedLabel getOpenedHoverContainer() {
GChart::PlotPanel::getOpenedHoverElement	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	564851	    Element getOpenedHoverElement() {
GChart::PlotPanel::insideHoverUpdate	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	565153	    private boolean insideHoverUpdate = false;
GChart::PlotPanel::insideHoverCleanup	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	565269	    private boolean insideHoverCleanup = false;
GChart::PlotPanel::touch	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	566162	    private void touch(Curve.Point p) {
GChart::PlotPanel::isContainedIn	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	573072	    private boolean isContainedIn(Element container, EventTarget et) {
GChart::PlotPanel::isGeometricallyContainedIn	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	576361	    private boolean isGeometricallyContainedIn(Element container,
GChart::PlotPanel::touchObjectAtMousePosition	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	577792	    private boolean touchObjectAtMousePosition(boolean retouch) {
GChart::PlotPanel::touchObjectAtMousePosition	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	578219	    boolean touchObjectAtMousePosition() {
GChart::PlotPanel::retouchObjectAtMousePosition	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	578415	    void retouchObjectAtMousePosition() {
GChart::PlotPanel::isOverOpenedHoverAnnotation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	579131	    private boolean isOverOpenedHoverAnnotation(Event event) {
GChart::PlotPanel::takesUsCompletelyOutsideChart	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	580262	    private boolean takesUsCompletelyOutsideChart(Event event) {
GChart::PlotPanel::onBrowserEvent	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	583538	    public void onBrowserEvent(Event event) {
GChart::PlotPanel::isValidated	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	588772	    boolean isValidated() {
GChart::PlotPanel::getRenderingPanelCount	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	589190	    int getRenderingPanelCount() {
GChart::PlotPanel::getXChartSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	589304	    int getXChartSize() {
GChart::PlotPanel::getYChartSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	589362	    int getYChartSize() {
GChart::PlotPanel::getXChartSizeDecoratedQuickly	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	589495	    int getXChartSizeDecoratedQuickly() {
GChart::PlotPanel::getYChartSizeDecoratedQuickly	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	589703	    int getYChartSizeDecoratedQuickly() {
GChart::PlotPanel::setRenderingPosition	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	589875	    void setRenderingPosition(GraphicsRenderingPanel grp,
GChart::YAxisId	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	590277	  private static class YAxisId {
GChart::indexOfBr	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	590445	  private static int indexOfBr(String s, int iStart) {
GChart::indexOfBr	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	591769	  private static int indexOfBr(String s) {
GChart::htmlWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	592040	  private static int htmlWidth(String sIn) {
GChart::htmlHeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	592478	  private static int htmlHeight(String s) {
GChart::Annotation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	592927	  static class Annotation {
GChart::Annotation::fontColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	592951	    String fontColor = DEFAULT_FONT_COLOR;
GChart::Annotation::fontSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	592991	    int fontSize = DEFAULT_ANNOTATION_FONTSIZE;
GChart::Annotation::fontFamily	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	593042	    String fontFamily = DEFAULT_ANNOTATION_FONTFAMILY;
GChart::Annotation::fontStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	593097	    String fontStyle = "normal";
GChart::Annotation::fontWeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	593130	    String fontWeight = "normal";
GChart::Annotation::location	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	593176	    AnnotationLocation location = null;
GChart::Annotation::text	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	593204	    String text = null;
GChart::Annotation::widget	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	593228	    Widget widget = null; // may
GChart::Annotation::isVisible	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	593350	    boolean isVisible = true;
GChart::Annotation::xShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	593376	    int xShift = 0;
GChart::Annotation::yShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	593396	    int yShift = 0;
GChart::Annotation::isHTML	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	593420	    boolean isHTML = false; // no
GChart::Annotation::numberOfLinesHigh	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	593609	    int numberOfLinesHigh = 0;
GChart::Annotation::numberOfCharsWide	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	593640	    int numberOfCharsWide = 0;
GChart::Annotation::widthUpperBound	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	593671	    int widthUpperBound = GChart.NAI;
GChart::Annotation::heightUpperBound	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	593709	    int heightUpperBound = GChart.NAI;
GChart::Annotation::HTML_LEN	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	593761	    static final int HTML_LEN = "<html>".length();
GChart::Annotation::BR_LEN	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	593812	    static final int BR_LEN = "<br>".length();
GChart::Annotation::analyzeHTML	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	594056	    private String analyzeHTML(String s) {
GChart::Annotation::getNumberOfCharsWide	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	595066	    static int getNumberOfCharsWide(String s) {
GChart::Annotation::getFontColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	595280	    String getFontColor() {
GChart::Annotation::getFontSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	595336	    int getFontSize() {
GChart::Annotation::getLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	595405	    AnnotationLocation getLocation() {
GChart::Annotation::isHTML	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	595463	    boolean isHTML() {
GChart::Annotation::getText	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	595513	    String getText() {
GChart::Annotation::getVisible	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	595594	    boolean getVisible() {
GChart::Annotation::getXShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	595648	    int getXShift() {
GChart::Annotation::getYShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	595698	    int getYShift() {
GChart::Annotation::setFontColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	595749	    void setFontColor(String cssColor) {
GChart::Annotation::setFontSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	595830	    void setFontSize(int fontSize) {
GChart::Annotation::setFontWeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	595906	    void setFontWeight(String cssWeight) {
GChart::Annotation::setFontFamily	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	595991	    void setFontFamily(String cssFontFamily) {
GChart::Annotation::setFontStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	596084	    void setFontStyle(String cssStyle) {
GChart::Annotation::getFontWeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	596167	    String getFontWeight() {
GChart::Annotation::getFontFamily	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	596228	    String getFontFamily() {
GChart::Annotation::getFontStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	596289	    String getFontStyle() {
GChart::Annotation::setLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	596346	    void setLocation(AnnotationLocation location) {
GChart::Annotation::setText	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	596437	    void setText(String text, int widthUpperBound, int heightUpperBound) {
GChart::Annotation::setText	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	596676	    void setText(String text) {
GChart::Annotation::setVisible	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	596760	    void setVisible(boolean isVisible) {
GChart::Annotation::setWidget	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	596842	    void setWidget(Widget widget, int widthUpperBound, int heightUpperBound) {
GChart::Annotation::setWidget	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	597074	    void setWidget(Widget widget) {
GChart::Annotation::getWidget	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	597221	    Widget getWidget() {
GChart::Annotation::setXShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	597272	    void setXShift(int xShift) {
GChart::Annotation::setYShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	597340	    void setYShift(int yShift) {
GChart::Annotation::getHeightUpperBound	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	597407	    int getHeightUpperBound() {
GChart::Annotation::getWidthUpperBound	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	597699	    int getWidthUpperBound() {
GChart::DEFAULT_ANNOTATION_FONTFAMILY	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	598348	  public static final String DEFAULT_ANNOTATION_FONTFAMILY = "Arial Unicode MS, Arial, sans-serif";
GChart::DEFAULT_ANNOTATION_FONTSIZE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	598614	  public static final int DEFAULT_ANNOTATION_FONTSIZE = 12;
GChart::DEFAULT_BRUSH_HEIGHT	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	599023	  public static final int DEFAULT_BRUSH_HEIGHT = 1;
GChart::DEFAULT_BRUSH_WIDTH	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	599430	  public static final int DEFAULT_BRUSH_WIDTH = 1;
GChart::DEFAULT_LEGEND_BORDER_COLOR	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	599615	  public static final String DEFAULT_LEGEND_BORDER_COLOR = "black";
GChart::DEFAULT_LEGEND_BORDER_WIDTH	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	599810	  public static final int DEFAULT_LEGEND_BORDER_WIDTH = 1;
GChart::DEFAULT_LEGEND_BORDER_STYLE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	600002	  public static final String DEFAULT_LEGEND_BORDER_STYLE = "solid";
GChart::DEFAULT_LEGEND_BACKGROUND_COLOR	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	600209	  public static final String DEFAULT_LEGEND_BACKGROUND_COLOR = "transparent";
GChart::DEFAULT_FONT_COLOR	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	600587	  public final static String DEFAULT_FONT_COLOR = "black";
GChart::DEFAULT_FONT_FAMILY	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	600990	  public static final String DEFAULT_FONT_FAMILY = "Arial Unicode MS, Arial, sans-serif";
GChart::DEFAULT_FONT_STYLE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	601331	  public static final String DEFAULT_FONT_STYLE = "normal";
GChart::DEFAULT_FONT_WEIGHT	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	601650	  public static final String DEFAULT_FONT_WEIGHT = "normal";
GChart::DEFAULT_HOVERTEXT_TEMPLATE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	602071	  public static final String DEFAULT_HOVERTEXT_TEMPLATE = GChart
GChart::DEFAULT_HOVER_LOCATION	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	603036	  public static final AnnotationLocation DEFAULT_HOVER_LOCATION = AnnotationLocation.NORTHWEST;
GChart::DEFAULT_LEGEND_FONTSIZE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	603363	  public final static int DEFAULT_LEGEND_FONTSIZE = 12;
GChart::DEFAULT_PLOTAREA_BACKGROUND_COLOR	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	603604	  public final static String DEFAULT_PLOTAREA_BACKGROUND_COLOR = "transparent";
GChart::DEFAULT_PLOTAREA_BORDER_COLOR	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	603853	  public final static String DEFAULT_PLOTAREA_BORDER_COLOR = "black";
GChart::DEFAULT_PLOTAREA_BORDER_STYLE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	604097	  public final static String DEFAULT_PLOTAREA_BORDER_STYLE = "solid";
GChart::DEFAULT_PLOTAREA_BORDER_WIDTH	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	604338	  public final static int DEFAULT_PLOTAREA_BORDER_WIDTH = 0;
GChart::DEFAULT_SYMBOL_BACKGROUND_COLOR	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	604588	  public static final String DEFAULT_SYMBOL_BACKGROUND_COLOR = "transparent";
GChart::DEFAULT_SYMBOL_BORDER_COLORS	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	605072	  public static final String[] DEFAULT_SYMBOL_BORDER_COLORS = { "red",
GChart::defaultSymbolBorderColors	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	605251	  private static String[] defaultSymbolBorderColors = DEFAULT_SYMBOL_BORDER_COLORS;
GChart::DEFAULT_SYMBOL_BORDER_STYLE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	605549	  public static final String DEFAULT_SYMBOL_BORDER_STYLE = "solid";
GChart::DEFAULT_SYMBOL_BORDER_WIDTH	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	605824	  public static final int DEFAULT_SYMBOL_BORDER_WIDTH = 1;
GChart::DEFAULT_SYMBOL_FILL_SPACING	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	606428	  public static final double DEFAULT_SYMBOL_FILL_SPACING = 4;
GChart::DEFAULT_SYMBOL_FILL_THICKNESS	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	607719	  public static final int DEFAULT_SYMBOL_FILL_THICKNESS = 0;
GChart::DEFAULT_BAR_FILL_SPACING	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	608225	  public static final double DEFAULT_BAR_FILL_SPACING = 0;
GChart::DEFAULT_LINE_FILL_THICKNESS	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	608620	  public static final int DEFAULT_LINE_FILL_THICKNESS = 1;
GChart::DEFAULT_LINE_FILL_SPACING	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	609113	  public static final int DEFAULT_LINE_FILL_SPACING = 0;
GChart::DEFAULT_PIE_SLICE_FILL_SPACING	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	609621	  public static final double DEFAULT_PIE_SLICE_FILL_SPACING = 4;
GChart::DEFAULT_PIE_SLICE_FILL_THICKNESS	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	610215	  public static final int DEFAULT_PIE_SLICE_FILL_THICKNESS = 2;
GChart::DEFAULT_PIE_SLICE_HOVERTEXT_TEMPLATE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	610618	  public static final String DEFAULT_PIE_SLICE_HOVERTEXT_TEMPLATE = GChart
GChart::DEFAULT_PIE_SLICE_HOVER_LOCATION	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	611002	  public static final AnnotationLocation DEFAULT_PIE_SLICE_HOVER_LOCATION = AnnotationLocation.OUTSIDE_PIE_ARC;
GChart::DEFAULT_SYMBOL_HEIGHT	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	611399	  public static final int DEFAULT_SYMBOL_HEIGHT = 7;
GChart::DEFAULT_SYMBOL_TYPE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	611665	  public static final SymbolType DEFAULT_SYMBOL_TYPE = SymbolType.BOX_CENTER;
GChart::DEFAULT_SYMBOL_WIDTH	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	611966	  public static final int DEFAULT_SYMBOL_WIDTH = DEFAULT_SYMBOL_HEIGHT;
GChart::DEFAULT_TICK_COUNT	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	612156	  public static final int DEFAULT_TICK_COUNT = 10;
GChart::DEFAULT_TICK_LABEL_FONT_COLOR	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	612443	  public final static String DEFAULT_TICK_LABEL_FONT_COLOR = "black";
GChart::DEFAULT_TICK_LABEL_FONT_STYLE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	612735	  public final static String DEFAULT_TICK_LABEL_FONT_STYLE = "normal";
GChart::DEFAULT_TICK_LABEL_FONT_WEIGHT	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	613031	  public final static String DEFAULT_TICK_LABEL_FONT_WEIGHT = "normal";
GChart::DEFAULT_TICK_LABEL_FONTSIZE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	613318	  public final static int DEFAULT_TICK_LABEL_FONTSIZE = 12;
GChart::DEFAULT_TICK_LABEL_FORMAT	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	613700	  public final static String DEFAULT_TICK_LABEL_FORMAT = "#.##";
GChart::DEFAULT_TICK_LENGTH	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	613874	  public static final int DEFAULT_TICK_LENGTH = 6;
GChart::DEFAULT_TICK_LOCATION	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	614032	  public static final TickLocation DEFAULT_TICK_LOCATION = TickLocation.OUTSIDE;
GChart::DEFAULT_TICK_THICKNESS	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	614225	  public static final int DEFAULT_TICK_THICKNESS = 1; // pixel
GChart::DEFAULT_VBAR_BASELINE_HOVER_LOCATION	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	614607	  public static final AnnotationLocation DEFAULT_VBAR_BASELINE_HOVER_LOCATION = AnnotationLocation.FARTHEST_FROM_HORIZONTAL_BASELINE;
GChart::DEFAULT_VBARBOTTOM_HOVER_LOCATION	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	615040	  public static final AnnotationLocation DEFAULT_VBARBOTTOM_HOVER_LOCATION = AnnotationLocation.NORTH;
GChart::DEFAULT_VBARTOP_HOVER_LOCATION	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	615443	  public static final AnnotationLocation DEFAULT_VBARTOP_HOVER_LOCATION = AnnotationLocation.SOUTH;
GChart::DEFAULT_HBAR_BASELINE_HOVER_LOCATION	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	615847	  public static final AnnotationLocation DEFAULT_HBAR_BASELINE_HOVER_LOCATION = AnnotationLocation.FARTHEST_FROM_VERTICAL_BASELINE;
GChart::DEFAULT_HBARLEFT_HOVER_LOCATION	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	616279	  public static final AnnotationLocation DEFAULT_HBARLEFT_HOVER_LOCATION = AnnotationLocation.EAST;
GChart::DEFAULT_HBARRIGHT_HOVER_LOCATION	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	616679	  public static final AnnotationLocation DEFAULT_HBARRIGHT_HOVER_LOCATION = AnnotationLocation.WEST;
GChart::DEFAULT_MAX_CANVAS_PIXELS	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	616948	  public static final double DEFAULT_MAX_CANVAS_PIXELS = 4096 * 4096;
GChart::DEFAULT_WIDGET_WIDTH_UPPERBOUND	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	617325	  public static final int DEFAULT_WIDGET_WIDTH_UPPERBOUND = 400;
GChart::DEFAULT_WIDGET_HEIGHT_UPPERBOUND	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	617700	  public static final int DEFAULT_WIDGET_HEIGHT_UPPERBOUND = 400;
GChart::DEFAULT_X_CHARTSIZE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	617874	  public final static int DEFAULT_X_CHARTSIZE = 300; // pixels
GChart::DEFAULT_Y_CHARTSIZE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	618045	  public final static int DEFAULT_Y_CHARTSIZE = 300; // pixels
GChart::NAI	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	618324	  public static final int NAI = Integer.MIN_VALUE;
GChart::TRANSPARENT_BORDER_COLOR	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	621354	  public static final String TRANSPARENT_BORDER_COLOR = null;
GChart::USE_CSS	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	627403	  public final static String USE_CSS = "";
GChart::Y_AXIS	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	627644	  public static final YAxisId Y_AXIS = new YAxisId();
GChart::Y2_AXIS	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	627890	  public static final YAxisId Y2_AXIS = new YAxisId();
GChart::DEFAULT_BLANK_IMAGE_URL	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	628209	  public final static String DEFAULT_BLANK_IMAGE_URL = "gchart.gif";
GChart::DEFAULT_BLANK_IMAGE_URL_FULLPATH	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	628673	  public final static String DEFAULT_BLANK_IMAGE_URL_FULLPATH = GWT
GChart::DEFAULT_GRID_HEIGHT	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	628805	  private static final int DEFAULT_GRID_HEIGHT = DEFAULT_TICK_THICKNESS;
GChart::DEFAULT_GRID_WIDTH	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	628878	  private static final int DEFAULT_GRID_WIDTH = DEFAULT_TICK_THICKNESS;
GChart::GRID_BORDER_STYLE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	628953	  private static final String GRID_BORDER_STYLE = "solid";
GChart::GRID_BORDER_WIDTH	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	629009	  private static final int GRID_BORDER_WIDTH = 1;
GChart::DEFAULT_GRID_COLOR	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	629187	  public static final String DEFAULT_GRID_COLOR = "black";
GChart::DEFAULT_FOOTNOTES_THICKNESS	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	629629	  public static final int DEFAULT_FOOTNOTES_THICKNESS = 15;
GChart::DEFAULT_TITLE_THICKNESS	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	630067	  public static final int DEFAULT_TITLE_THICKNESS = 15;
GChart::TICK_CHARHEIGHT_TO_FONTSIZE_LOWERBOUND	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	630236	  private static final double TICK_CHARHEIGHT_TO_FONTSIZE_LOWERBOUND = 1.0;
GChart::TICK_CHARWIDTH_TO_FONTSIZE_LOWERBOUND	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	630357	  private static final double TICK_CHARWIDTH_TO_FONTSIZE_LOWERBOUND = 0.7;
GChart::CHARHEIGHT_TO_FONTSIZE_UPPERBOUND	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	630740	  private static final double CHARHEIGHT_TO_FONTSIZE_UPPERBOUND = 2 * 1.5;
GChart::CHARWIDTH_TO_FONTSIZE_UPPERBOUND	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	630815	  private static final double CHARWIDTH_TO_FONTSIZE_UPPERBOUND = 2 * 0.7;
GChart::TICK_BORDER_STYLE	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	630890	  private static final String TICK_BORDER_STYLE = GRID_BORDER_STYLE;
GChart::TICK_BORDER_WIDTH	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	630956	  private static final int TICK_BORDER_WIDTH = GRID_BORDER_WIDTH;
GChart::setBackgroundColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	631018	  private static void setBackgroundColor(UIObject uio, String cssColor) {
GChart::setBorderColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	631332	  private static void setBorderColor(UIObject uio, String cssColor) {
GChart::setBorderStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	631477	  private static void setBorderStyle(UIObject uio, String cssBorderStyle) {
GChart::setBorderWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	631634	  private static void setBorderWidth(UIObject uio, String cssBorderWidth) {
GChart::setBorderWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	631791	  private static void setBorderWidth(UIObject uio, int borderWidth) {
GChart::setFontFamily	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	631988	  private static void setFontFamily(UIObject uio, String cssFontFamily) {
GChart::setFontSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	632141	  private static void setFontSize(UIObject uio, int fontSize) {
GChart::setFontStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	632280	  private static void setFontStyle(UIObject uio, String fontStyle) {
GChart::setFontWeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	632423	  private static void setFontWeight(UIObject uio, String fontWeight) {
GChart::setColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	632570	  private static void setColor(UIObject uio, String cssColor) {
GChart::setPadding	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	633419	  private static void setPadding(UIObject uio, String cssPadding) {
GChart::setOverflow	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	633826	  private static void setOverflow(UIObject uio, String cssOverflow) {
GChart::sign	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	634364	  static int sign(double x) {
GChart::validateMultipliers	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	634661	  static void validateMultipliers(int widthMultiplier, int heightMultiplier) {
GChart::withinRange	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	635074	  static boolean withinRange(double x, double minLim, double maxLim) {
GChart::chartFootnotes	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	635296	  private Widget chartFootnotes;
GChart::chartFootnotesLeftJustified	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	635330	  private boolean chartFootnotesLeftJustified;
GChart::chartPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	635472	  private SimplePanel chartPanel = new SimplePanel();
GChart::borderWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	635522	  private String borderWidth = USE_CSS;
GChart::borderStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	635562	  private String borderStyle = USE_CSS;
GChart::borderColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	635602	  private String borderColor = USE_CSS;
GChart::backgroundColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	635642	  private String backgroundColor = USE_CSS;
GChart::blankImageURL	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	635693	  private static String blankImageURL = null;
GChart::canvasExpansionFactorX	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	635732	  private double canvasExpansionFactorX = 0;
GChart::canvasExpansionFactorY	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	635777	  private double canvasExpansionFactorY = 0;
GChart::chartDecorationsChanged	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	635815	  boolean chartDecorationsChanged = true;
GChart::chartTitle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	635864	  private Widget chartTitle;
GChart::curves	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	635957	  private ArrayList<Curve> curves = new ArrayList<Curve>();
GChart::fontFamily	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	636007	  private String fontFamily = USE_CSS;
GChart::footnotesThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	636043	  private int footnotesThickness = GChart.NAI;
GChart::legendBackgroundColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	636093	  private String legendBackgroundColor = DEFAULT_LEGEND_BACKGROUND_COLOR;
GChart::legendBorderColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	636167	  private String legendBorderColor = DEFAULT_LEGEND_BORDER_COLOR;
GChart::legendBorderWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	636230	  private int legendBorderWidth = DEFAULT_LEGEND_BORDER_WIDTH;
GChart::legendBorderStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	636296	  private String legendBorderStyle = DEFAULT_LEGEND_BORDER_STYLE;
GChart::legendThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	636359	  private int legendThickness = GChart.NAI;
GChart::isLegendVisible	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	636408	  private boolean isLegendVisible = true;
GChart::legendFontColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	636450	  private String legendFontColor = DEFAULT_FONT_COLOR;
GChart::legendFontFamily	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	636505	  private String legendFontFamily = DEFAULT_FONT_FAMILY;
GChart::legendFontSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	636559	  private int legendFontSize = DEFAULT_LEGEND_FONTSIZE;
GChart::legendFontStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	636618	  private String legendFontStyle = DEFAULT_FONT_STYLE;
GChart::legendFontWeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	636673	  private String legendFontWeight = DEFAULT_FONT_WEIGHT;
GChart::legend	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	636730	  private Widget legend = null; // developer-defined
GChart::legendLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	636803	  private LegendLocation legendLocation = LegendLocation.OUTSIDE_RIGHT;
GChart::legendXShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	636864	  private int legendXShift = 0;
GChart::legendYShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	636896	  private int legendYShift = 0;
GChart::maxCanvasPixels	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	636931	  private double maxCanvasPixels = DEFAULT_MAX_CANVAS_PIXELS;
GChart::plotPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	637245	  PlotPanel plotPanel = new PlotPanel();
GChart::padding	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	637291	  private String padding = USE_CSS;
GChart::optimizeForMemory	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	637328	  private boolean optimizeForMemory = false;
GChart::renderPaddingFactor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	637372	  private double renderPaddingFactor = 0.0;
GChart::clipToPlotArea	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	637417	  private boolean clipToPlotArea = false;
GChart::clipToDecoratedChart	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	637459	  private boolean clipToDecoratedChart = false;
GChart::titleThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	637503	  private int titleThickness = GChart.NAI;
GChart::xAxis	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	637548	  private Axis xAxis; // must
GChart::yAxis	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	637624	  private Axis yAxis; // because
GChart::y2Axis	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	637700	  private Axis y2Axis;
GChart::xChartSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	637723	  private int xChartSize; // pixel
GChart::yChartSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	637802	  private int yChartSize;
GChart::N_PRE_SYSTEM_CURVES	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	637909	  private static int N_PRE_SYSTEM_CURVES = 16;
GChart::N_POST_SYSTEM_CURVES	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	638027	  private static int N_POST_SYSTEM_CURVES = 2;
GChart::N_SYSTEM_CURVES	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	638074	  private static int N_SYSTEM_CURVES = N_PRE_SYSTEM_CURVES
GChart::PLOTAREA_ID	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	638307	  private final static int PLOTAREA_ID = 0 - N_SYSTEM_CURVES;
GChart::TITLE_ID	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	638369	  private final static int TITLE_ID = 1 - N_SYSTEM_CURVES;
GChart::YAXIS_ID	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	638428	  private final static int YAXIS_ID = 2 - N_SYSTEM_CURVES;
GChart::YTICKS_ID	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	638487	  private final static int YTICKS_ID = 3 - N_SYSTEM_CURVES;
GChart::YGRIDLINES_ID	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	638547	  private final static int YGRIDLINES_ID = 4 - N_SYSTEM_CURVES;
GChart::YLABEL_ID	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	638611	  private final static int YLABEL_ID = 5 - N_SYSTEM_CURVES;
GChart::Y2AXIS_ID	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	638671	  private final static int Y2AXIS_ID = 6 - N_SYSTEM_CURVES;
GChart::Y2TICKS_ID	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	638731	  private final static int Y2TICKS_ID = 7 - N_SYSTEM_CURVES;
GChart::Y2GRIDLINES_ID	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	638792	  private final static int Y2GRIDLINES_ID = 8 - N_SYSTEM_CURVES;
GChart::Y2LABEL_ID	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	638857	  private final static int Y2LABEL_ID = 9 - N_SYSTEM_CURVES;
GChart::LEGEND_ID	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	638918	  private final static int LEGEND_ID = 10 - N_SYSTEM_CURVES;
GChart::XAXIS_ID	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	638979	  private final static int XAXIS_ID = 11 - N_SYSTEM_CURVES;
GChart::XTICKS_ID	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	639039	  private final static int XTICKS_ID = 12 - N_SYSTEM_CURVES;
GChart::XGRIDLINES_ID	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	639100	  private final static int XGRIDLINES_ID = 13 - N_SYSTEM_CURVES;
GChart::XLABEL_ID	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	639165	  private final static int XLABEL_ID = 14 - N_SYSTEM_CURVES;
GChart::FOOTNOTES_ID	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	639226	  private final static int FOOTNOTES_ID = 15 - N_SYSTEM_CURVES;
GChart::HOVER_CURSOR_ID	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	639290	  private final static int HOVER_CURSOR_ID = 16 - N_SYSTEM_CURVES;
GChart::HOVER_ANNOTATION_ID	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	639357	  private final static int HOVER_ANNOTATION_ID = 17 - N_SYSTEM_CURVES;
GChart::addSystemCurves	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	639482	  private void addSystemCurves() {
GChart::updateDecorations	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	648799	  private void updateDecorations(int xChartSizeDecorated) {
GChart::GChart	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	653213	  public GChart(int xChartSize, int yChartSize) {
GChart::GChart	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	654537	  public GChart() {
GChart::addClickHandler	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	657211	  public HandlerRegistration addClickHandler(ClickHandler handler) {
GChart::addDoubleClickHandler	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	657771	  public HandlerRegistration addDoubleClickHandler(DoubleClickHandler handler) {
GChart::addMouseDownHandler	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	658345	  public HandlerRegistration addMouseDownHandler(MouseDownHandler handler) {
GChart::addMouseMoveHandler	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	658913	  public HandlerRegistration addMouseMoveHandler(MouseMoveHandler handler) {
GChart::addMouseOutHandler	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	659479	  public HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
GChart::addMouseOverHandler	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	660044	  public HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
GChart::addMouseUpHandler	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	660608	  public HandlerRegistration addMouseUpHandler(MouseUpHandler handler) {
GChart::addMouseWheelHandler	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	661172	  public HandlerRegistration addMouseWheelHandler(MouseWheelHandler handler) {
GChart::addCurve	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	661630	  public void addCurve() {
GChart::internalCurveIndex	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	662482	  int internalCurveIndex(int externalIndex) {
GChart::externalCurveIndex	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	663231	  int externalCurveIndex(int internalIndex) {
GChart::isSystemCurveIndex	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	663894	  private boolean isSystemCurveIndex(int externalIndex) {
GChart::addCurve	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	664416	  public void addCurve(int iCurve) {
GChart::clearCurves	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	665851	  public void clearCurves() {
GChart::formatAsHovertext	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	668348	  public static String formatAsHovertext(String plainTextLabel) {
GChart::getBackgroundColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	668876	  public String getBackgroundColor() {
GChart::getBorderColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	669193	  public String getBorderColor() {
GChart::getBorderWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	669533	  public String getBorderWidth() {
GChart::getBorderStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	669806	  public String getBorderStyle() {
GChart::getChartFootnotes	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	670198	  public Widget getChartFootnotes() {
GChart::getChartFootnotesLeftJustified	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	670740	  public boolean getChartFootnotesLeftJustified() {
GChart::getChartFootnotesThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	671907	  public int getChartFootnotesThickness() {
GChart::getChartTitle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	672795	  public Widget getChartTitle() {
GChart::getChartTitleThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	673467	  public int getChartTitleThickness() {
GChart::getClipToDecoratedChart	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	674429	  public boolean getClipToDecoratedChart() {
GChart::getClipToPlotArea	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	674790	  public boolean getClipToPlotArea() {
GChart::getClosestBrushTouchingPointNoCheck	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	674923	  Curve.Point getClosestBrushTouchingPointNoCheck(int x, int y) {
GChart::getClosestBrushTouchingPoint	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	678133	  public Curve.Point getClosestBrushTouchingPoint(int xPlotArea, int yPlotArea) {
GChart::getCurve	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	679401	  public Curve getCurve() {
GChart::getCurve	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	680214	  public Curve getCurve(int iCurve) {
GChart::getSystemCurve	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	680703	  Curve getSystemCurve(int iCurve) {
GChart::getCurveIndex	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	681564	  public int getCurveIndex(Curve curve) {
GChart::getInternalCurveIndex	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	681719	  int getInternalCurveIndex(Curve curve) {
GChart::getRenderingPanelIndex	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	681889	  int getRenderingPanelIndex(int internalCurveIndex) {
GChart::getCurveFromRenderingPanelIndex	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	682102	  Curve getCurveFromRenderingPanelIndex(int rpi) {
GChart::getFontFamily	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	682471	  public String getFontFamily() {
GChart::getGridColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	682791	  public String getGridColor() {
GChart::getLegendBackgroundColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	683207	  public String getLegendBackgroundColor() {
GChart::getLegendBorderColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	683676	  public String getLegendBorderColor() {
GChart::getLegendBorderWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	683939	  public int getLegendBorderWidth() {
GChart::getLegendBorderStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	684197	  public String getLegendBorderStyle() {
GChart::getLegendFontColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	684506	  public String getLegendFontColor() {
GChart::getLegendFontSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	684829	  public int getLegendFontSize() {
GChart::getLegendFontFamily	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	685085	  public String getLegendFontFamily() {
GChart::getLegendFontStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	685375	  public String getLegendFontStyle() {
GChart::getLegendFontWeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	685677	  public String getLegendFontWeight() {
GChart::getLegendThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	686376	  public int getLegendThickness() {
GChart::getLegend	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	686976	  public Widget getLegend() {
GChart::getLegendXShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	687251	  public int getLegendXShift() {
GChart::getLegendYShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	687538	  public int getLegendYShift() {
GChart::getMaxCanvasPixels	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	687847	  public double getMaxCanvasPixels() {
GChart::getNCurves	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	688208	  public int getNCurves() {
GChart::getPadding	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	688590	  public String getPadding() {
GChart::getPlotAreaBackgroundColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	688926	  public String getPlotAreaBackgroundColor() {
GChart::getPlotAreaBorderColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	689367	  public String getPlotAreaBorderColor() {
GChart::getPlotAreaBorderWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	689800	  public int getPlotAreaBorderWidth() {
GChart::getPlotAreaBorderStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	690251	  public String getPlotAreaBorderStyle() {
GChart::getPlotAreaImageURL	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	690793	  public String getPlotAreaImageURL() {
GChart::getOptimizeForMemory	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	691302	  public boolean getOptimizeForMemory() {
GChart::getRenderPaddingFactor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	691565	  public double getRenderPaddingFactor() {
GChart::getShowOffChartPoints	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	691839	  public boolean getShowOffChartPoints() {
GChart::getShowOffDecoratedChartGlyphs	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	692136	  public boolean getShowOffDecoratedChartGlyphs() {
GChart::getBlankImageURL	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	692595	  public static String getBlankImageURL() {
GChart::currentCurveData	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	692738	  private static Object currentCurveData = null;
GChart::getCurrentCurveData	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	695638	  public static Object getCurrentCurveData() {
GChart::hoverParameterInterpreter	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	695732	  private HoverParameterInterpreter hoverParameterInterpreter = null;
GChart::getHoverParameterInterpreter	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	696062	  public HoverParameterInterpreter getHoverParameterInterpreter() {
GChart::hoverTouchingEnabled	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	696156	  private boolean hoverTouchingEnabled = true;
GChart::getHoverTouchingEnabled	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	696573	  public boolean getHoverTouchingEnabled() {
GChart::getXAxis	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	696984	  public Axis getXAxis() {
GChart::getXChartSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	697268	  public int getXChartSize() {
GChart::getXChartSizeDecorated	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	698422	  public int getXChartSizeDecorated() {
GChart::getY2Axis	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	699296	  public Axis getY2Axis() {
GChart::getYAxis	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	699686	  public Axis getYAxis() {
GChart::getYChartSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	699970	  public int getYChartSize() {
GChart::getYChartSizeDecorated	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	701188	  public int getYChartSizeDecorated() {
GChart::hasY2Axis	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	701801	  public boolean hasY2Axis() {
GChart::hasYAxis	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	702219	  public boolean hasYAxis() {
GChart::isLegendVisible	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	702528	  public boolean isLegendVisible() {
GChart::isUpdateNeeded	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	703538	  public boolean isUpdateNeeded() {
GChart::removeCurve	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	704044	  public void removeCurve(int iCurve) {
GChart::removeCurve	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	706049	  public void removeCurve(Curve curve) {
GChart::setBackgroundColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	707033	  public void setBackgroundColor(String cssColor) {
GChart::setBlankImageURL	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	710566	  public static void setBlankImageURL(String blankImageURL) {
GChart::setBorderColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	712199	  public void setBorderColor(String cssColor) {
GChart::setBorderStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	713451	  public void setBorderStyle(String borderStyle) {
GChart::setBorderWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	714458	  public void setBorderWidth(String cssWidth) {
GChart::setCanvasExpansionFactors	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	716350	  public void setCanvasExpansionFactors(double widthExpansionFactor,
GChart::setChartFootnotes	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	716849	  public void setChartFootnotes(String html) {
GChart::setChartFootnotes	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	717785	  public void setChartFootnotes(Widget chartFootnotes) {
GChart::setChartFootnotesLeftJustified	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	718696	  public void setChartFootnotesLeftJustified(boolean footnotesLeftJustified) {
GChart::setChartFootnotesThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	720361	  public void setChartFootnotesThickness(int thickness) {
GChart::setChartSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	720905	  public void setChartSize(int xChartSize, int yChartSize) {
GChart::setChartTitle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	721265	  public void setChartTitle(String html) {
GChart::setChartTitle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	721732	  public void setChartTitle(Widget chartTitle) {
GChart::setChartTitleThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	722897	  public void setChartTitleThickness(int thickness) {
GChart::setClipToDecoratedChart	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	724744	  public void setClipToDecoratedChart(boolean clipToDecoratedChart) {
GChart::setClipToPlotArea	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	725674	  public void setClipToPlotArea(boolean clipToPlotArea) {
GChart::setDefaultSymbolBorderColors	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	728444	  static public void setDefaultSymbolBorderColors(String[] defaultBorderColors) {
GChart::setFontFamily	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	730386	  public void setFontFamily(String fontFamily) {
GChart::setGridColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	731038	  public void setGridColor(String cssColor) {
GChart::setHoverParameterInterpreter	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	733091	  public void setHoverParameterInterpreter(HoverParameterInterpreter hpi) {
GChart::setHoverTouchingEnabled	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	735984	  public void setHoverTouchingEnabled(boolean hoverTouchingEnabled) {
GChart::setLegendBackgroundColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	736627	  public void setLegendBackgroundColor(String cssColor) {
GChart::setLegendBorderColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	737438	  public void setLegendBorderColor(String cssColor) {
GChart::setLegendBorderWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	737837	  public void setLegendBorderWidth(int width) {
GChart::setLegendBorderStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	738407	  public void setLegendBorderStyle(String borderStyle) {
GChart::setLegendFontColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	739038	  public void setLegendFontColor(String cssColor) {
GChart::setLegendFontSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	739638	  public void setLegendFontSize(int legendFontSize) {
GChart::setLegendFontFamily	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	740240	  public void setLegendFontFamily(String cssFontFamily) {
GChart::setLegendFontStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	740740	  public void setLegendFontStyle(String cssStyle) {
GChart::setLegendFontWeight	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	741251	  public void setLegendFontWeight(String cssWeight) {
GChart::setLegendLocation	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	742103	  public void setLegendLocation(LegendLocation legendLocation) {
GChart::setLegend	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	742738	  public void setLegend(Widget legend) {
GChart::setLegendXShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	743346	  public void setLegendXShift(int xShift) {
GChart::setLegendYShift	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	743998	  public void setLegendYShift(int yShift) {
GChart::setLegendThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	745125	  public void setLegendThickness(int legendThickness) {
GChart::setLegendVisible	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	745663	  public void setLegendVisible(boolean isLegendVisible) {
GChart::setMaxCanvasPixels	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	747002	  public void setMaxCanvasPixels(double maxCanvasPixels) {
GChart::setOptimizeForMemory	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	749429	  public void setOptimizeForMemory(boolean optimizeForMemory) {
GChart::setPadding	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	750206	  public void setPadding(String cssPadding) {
GChart::setPlotAreaBackgroundColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	750804	  public void setPlotAreaBackgroundColor(String cssColor) {
GChart::setPlotAreaBorderColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	751448	  public void setPlotAreaBorderColor(String cssColor) {
GChart::setPlotAreaBorderWidth	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	751895	  public void setPlotAreaBorderWidth(int width) {
GChart::setPlotAreaBorderStyle	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	752481	  public void setPlotAreaBorderStyle(String borderStyle) {
GChart::setPlotAreaImageURL	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	754403	  public void setPlotAreaImageURL(String imageURL) {
GChart::setRenderPaddingFactor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	755897	  public void setRenderPaddingFactor(double renderPaddingFactor) {
GChart::setShowOffChartPoints	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	756922	  public void setShowOffChartPoints(boolean showOffChartPoints) {
GChart::setShowOffDecoratedChartGlyphs	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	757266	  public void setShowOffDecoratedChartGlyphs(
GChart::getTouchedCurve	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	758202	  public Curve getTouchedCurve() {
GChart::getTouchedPoint	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	760531	  public Curve.Point getTouchedPoint() {
GChart::setXChartSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	761317	  public void setXChartSize(int xChartSize) {
GChart::setYChartSize	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	762234	  public void setYChartSize(int yChartSize) {
GChart::touch	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	765245	  public void touch(Curve.Point pointToTouch) {
GChart::update	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	768382	  public void update(TouchedPointUpdateOption option) {
GChart::update	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	770234	  public void update() {
GChart::assembleChart	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	770500	  private void assembleChart() {
GChart::createLegend	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	773494	  private Grid createLegend(PlotPanel pp) {
GChart::getDefaultLegendThickness	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	776166	  private int getDefaultLegendThickness() {
GChart::getNVisibleCurvesOnLegend	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	776670	  private int getNVisibleCurvesOnLegend() {
GChart::setDefaultBorderColor	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	777020	  private void setDefaultBorderColor(Curve curve, int index) {
GChart::isMouseAnchored	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	777337	  private boolean isMouseAnchored(SymbolType symbolType) {
GChart::realizeCurve	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	777672	  private void realizeCurve(Curve c) {
GChart::invalidateEveryCurve	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	780704	  private void invalidateEveryCurve() {
GChart::invalidateAccessibleCurves	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	780900	  private void invalidateAccessibleCurves() {
GChart::invalidateAllSlices	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	781114	  void invalidateAllSlices() {
GChart::invalidateDependentSlices	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	781482	  void invalidateDependentSlices(int iFirstCurve) {
GChart::setDefaultPieSliceOrientations	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	782090	  private void setDefaultPieSliceOrientations() {
GChart::realizePlotPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	782778	  private void realizePlotPanel() {
GChart::isHoverFeedbackRenderingPanel	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	783609	  boolean isHoverFeedbackRenderingPanel(int rpIndex) {
GChart::wasUnloaded	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	784511	  private boolean wasUnloaded = false;
GChart::onUnload	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	784562	  protected void onUnload() {
GChart::onLoad	c:\gcharttrunk\gchart\src\com\googlecode\gchart\client\GChart.java	784655	  protected void onLoad() {
SigniflowMonitor	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	210	public class SigniflowMonitor {
SigniflowMonitor::Mode	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	252	  static public class Mode {
SigniflowMonitor::Mode::Mode	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	271	    private Mode() {};
SigniflowMonitor::Mode::DETECT_ONLY	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	665	    public static Mode DETECT_ONLY = new Mode();
SigniflowMonitor::Mode::TRAIN_AND_DETECT	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	1070	    public static Mode TRAIN_AND_DETECT = new Mode();
SigniflowMonitor::mode	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	1122	  private Mode mode = Mode.TRAIN_AND_DETECT;
SigniflowMonitor::iSamples	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	1167	  private int iSamples;     // actual samples stored in reference distribution.
SigniflowMonitor::nSamples	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	1247	  private int nSamples;     // samples in a completed reference distribution.
SigniflowMonitor::totalSamples	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	1325	  private int totalSamples; // number of samples seen since last reset
SigniflowMonitor::updatesPerSample	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	1396	  private int updatesPerSample;    // number of updates per computed sample/maxima.
SigniflowMonitor::sample	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	1485	  private double[] sample;  // circular buffer of reference distribution samples
SigniflowMonitor::order	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	1563	  private int[] order;      // ascending sorted ref distr. samples (via their indexes)
SigniflowMonitor::laggingSample	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	1653	  private double[] laggingSample; // holds most recent samples (not yet in ref distr)
SigniflowMonitor::localMaxima	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	1737	  private double localMaxima = - Double.MAX_VALUE; // max over current sampling interval
SigniflowMonitor::localCount	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	1823	  private int localCount = 0;                      // samples behind current local maxima
SigniflowMonitor::iNext	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	1913	  private int iNext = 0;                           // next position in ref distribution
SigniflowMonitor::nAlarms	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	2001	  private int nAlarms = 0;   // number of alarms over full ref distr.
SigniflowMonitor::monitoredStat	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	2066	  double monitoredStat = Double.NaN; // most recent monitored statistic
SigniflowMonitor::iLaggingSamples	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	2143	  private int iLaggingSamples;     // current number of lagging samples
SigniflowMonitor::nLaggingSamples	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	2215	  private int nLaggingSamples;     // size of lagging buffer (max allowed lagging samples)
SigniflowMonitor::iLagNext	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	2306	  private int iLagNext;            // position where next lagged sample will be stored
SigniflowMonitor::SigniflowMonitor	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	2833	  public SigniflowMonitor(int nSamples,
SigniflowMonitor::getISamples	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	3485	  public int getISamples() { return iSamples;}
SigniflowMonitor::getTotalSamples	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	3851	  public int getTotalSamples() { return totalSamples;}
SigniflowMonitor::getNSamples	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	4101	  public int getNSamples() {return nSamples;}
SigniflowMonitor::getNLaggingSamples	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	4901	  public int getNLaggingSamples() {return nLaggingSamples;}
SigniflowMonitor::getUpdatesPerSample	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	5456	  public int getUpdatesPerSample() {return updatesPerSample;}
SigniflowMonitor::setMode	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	5866	  public void setMode(Mode mode) {
SigniflowMonitor::getMode	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	6144	  public Mode getMode() { return mode; }
SigniflowMonitor::replace	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	6547	  private void replace(int iValue, double newValue) {
SigniflowMonitor::update	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	8667	  public void update(double monitoredStat) {
SigniflowMonitor::reset	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	10285	  public void reset() {
SigniflowMonitor::forgetRecentData	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	11742	  public void forgetRecentData() {
SigniflowMonitor::setNAlarms	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	12797	  public void setNAlarms(int nAlarms) {
SigniflowMonitor::getNAlarms	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	13242	  public int getNAlarms() { return nAlarms; }
SigniflowMonitor::getAlarmLimit	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	14274	  public double getAlarmLimit(int nAlarms) {
SigniflowMonitor::getAlarmLimit	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	15030	  public double getAlarmLimit() {
SigniflowMonitor::isAboveAlarmLimit	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	15709	  public boolean isAboveAlarmLimit() {
SigniflowMonitor::getOrder	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowMonitor.java	15863	  public double getOrder(int iOrder) {
SigniflowGChart	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	498	public class SigniflowGChart extends GChart {
SigniflowGChart::N_POINTS	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	546	    final int N_POINTS = 101;
SigniflowGChart::MONITORED_STATISTIC	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	576	    final int MONITORED_STATISTIC = 0; // index of monitored statistic curve
SigniflowGChart::ALARM_LIMIT	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	653	    final int ALARM_LIMIT = 1; // index of alarm region curve
SigniflowGChart::PROGRESS_CURVE	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	715	    final int PROGRESS_CURVE = 2;
SigniflowGChart::REFERENCE_DISTRIBUTION	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	749	    final int REFERENCE_DISTRIBUTION = 3;
SigniflowGChart::nSamplesSelector	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	815	    final ObjectSelectorDropdown nSamplesSelector = new ObjectSelectorDropdown(
SigniflowGChart::updatesPerSampleSelector	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	1194	    final ObjectSelectorDropdown updatesPerSampleSelector = new ObjectSelectorDropdown(
SigniflowGChart::nLaggingSamplesSelector	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	1581	    final ObjectSelectorDropdown nLaggingSamplesSelector = new ObjectSelectorDropdown(
SigniflowGChart::alarmsSelector	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	1952	    final ObjectSelectorDropdown alarmsSelector = new ObjectSelectorDropdown(
SigniflowGChart::modeSelector	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	2568	    final ObjectSelectorDropdown modeSelector = new ObjectSelectorDropdown(
SigniflowGChart::forgetButton	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	2831	    final Button forgetButton = new Button("Forget");
SigniflowGChart::resetButton	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	2885	    final Button resetButton = new Button("Reset");
SigniflowGChart::signiflowConfig	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	2944	    final WidgetHolder signiflowConfig = new WidgetHolder(new Widget[] {
SigniflowGChart::startStopButton	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	3439	    final Button startStopButton = new Button("Start");
SigniflowGChart::speedSelector	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	3512	    final ObjectSelectorDropdown speedSelector = new ObjectSelectorDropdown(
SigniflowGChart::noiseSizeSelector	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	3872	    final ObjectSelectorDropdown noiseSizeSelector = new ObjectSelectorDropdown(
SigniflowGChart::noiseFrequencySelector	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	4162	    final ObjectSelectorDropdown noiseFrequencySelector = new ObjectSelectorDropdown(
SigniflowGChart::biasSelector	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	4390	    final ObjectSelectorDropdown biasSelector = new ObjectSelectorDropdown(
SigniflowGChart::statisticGenerator	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	4682	    final StatisticGenerator statisticGenerator = new StatisticGenerator();
SigniflowGChart::signiflowMonitor	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	4750	    SigniflowMonitor signiflowMonitor = null;
SigniflowGChart::PollingLoop	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	4792	    final class PollingLoop extends Timer {
SigniflowGChart::PollingLoop::run	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	4859	        public void run() {
SigniflowGChart::pollingLoop	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	6737	    final PollingLoop pollingLoop = new PollingLoop();
SigniflowGChart::simConfig	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	6794	    final WidgetHolder simConfig = new WidgetHolder(new Widget[] {
SigniflowGChart::AlarmCountHoverParameterInterpreter	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	7166	    class AlarmCountHoverParameterInterpreter
SigniflowGChart::AlarmCountHoverParameterInterpreter::getHoverParameter	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	7286	              public String getHoverParameter(String paramName,
SigniflowGChart::SigniflowGChart	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\SigniflowGChart.java	7803	    SigniflowGChart() {
ObjectSelectorDropdown	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\ObjectSelectorDropdown.java	1655	public class ObjectSelectorDropdown extends ListBox {
ObjectSelectorDropdown::LABEL_COL	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\ObjectSelectorDropdown.java	1717	    static final int LABEL_COL = 0;  
ObjectSelectorDropdown::OBJECT_COL	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\ObjectSelectorDropdown.java	1755	    static final int OBJECT_COL = 1; 
ObjectSelectorDropdown::N_COLS	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\ObjectSelectorDropdown.java	1793	    static final int N_COLS = 2;     
ObjectSelectorDropdown::labelObjectPairs	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\ObjectSelectorDropdown.java	1834		      final Object[][] labelObjectPairs;
ObjectSelectorDropdown::ObjectSelectorDropdown	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\ObjectSelectorDropdown.java	1874		      public ObjectSelectorDropdown(Object[][] labelObjectPairs, String selected) {
ObjectSelectorDropdown::getObject	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\ObjectSelectorDropdown.java	2436		      public Object getObject(int index) {
ObjectSelectorDropdown::getSelectedObject	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\ObjectSelectorDropdown.java	2658		      public Object getSelectedObject() {
ObjectSelectorDropdown::setSelectedObject	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\ObjectSelectorDropdown.java	2866		      public void setSelectedObject(Object selectedObject) {
ObjectSelectorDropdown::getNObjects	c:\Users\jcg\Documents\signiflow\signiflowsim\src\com\ashland\signiflowsim\client\ObjectSelectorDropdown.java	3333		      public int getNObjects() {
