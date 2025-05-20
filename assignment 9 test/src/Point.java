
public class Point {

    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0,0); // constructs a new object instead of x = 0 or y = 0 (used Mr. Q's slideshow example)
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void displayCoordinate() {
        System.out.println("The x-coordinate is: " + x);
        System.out.println("The y-coordinate is: " + y);
    }

    public double distance(Point point) {
        double distX = x - point.getX();
        double distY = y - point.getY();
        return Math.sqrt(distX * distX + distY * distY);
    }

    public Point difference(Point point) {
        return new Point(x - point.getX(), y - point.getY());
    }

    public Point sum(Point point) {
        return new Point(x + point.getX(), y + point.getY());
    }

    public Point midpoint(Point point) {
        double midX = (x + point.getX()) / 2;
        double midY = (y + point.getY()) / 2;
        return new Point(midX, midY);
    }

    public double slope(Point point) {
        if (x == point.getX()) {
            throw new ArithmeticException("Undefined Slope (Vertical Line)");
        }
        return (y - point.getY()) / (x - point.getX());
    }

    public double yIntercept(Point point) {
        double m = slope(point);
        return y - m * x;
    }

    public void linearEquation(Point point) {
        double m = slope(point);
        double b = yIntercept(point);
        System.out.println("y = " + m + "x" + (b >= 0 ? " + " : " ") + b);
    }
}
