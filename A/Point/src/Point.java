import java.awt.*;

public class Point {
    private int x;
    private int y;

    private static Point earthquakeEpicenter;
    private static int earthquakeImpactRadius;

    public Point(int initialX, int initialY) {
        x = initialX;
        y = initialY;
    }

    public Point() {
        this(0,0);
    }

    public Point(double r, int angleInDegrees) {
        this((int) (r * Math.cos(Math.toRadians(angleInDegrees))), (int) (r* Math.sin(Math.toRadians(angleInDegrees))));
    }

    public Point(double r, double angleInRadians) {
        this((int) (r * Math.cos(angleInRadians)), (int) (r* Math.sin(angleInRadians)));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public static void setEarthquakeEpicenter(Point p) {
        earthquakeEpicenter = p;
    }

    public static void setEarthquakeEpicenter(int x, int y) {
        earthquakeEpicenter = new Point(x,y);
    }

    public static void setEarthquakeImpactRadius(int radius) {
        earthquakeImpactRadius = radius;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void draw(Graphics g) {
        if (earthquakeEpicenter != null && distanceToEarthquakeEpicenter() < earthquakeImpactRadius)
            g.setColor(Color.RED);
        else
            g.setColor(Color.BLACK);

        g.fillOval(x,y,3,3);
        g.drawString(this.toString(), x+5, y-5);
    }

    public static void drawEarthquakeOriginAndImpactArea(Graphics g) {
        if (earthquakeEpicenter != null) {
            g.setColor(Color.RED);

            // draw the epicenter
            g.fillOval(earthquakeEpicenter.getX()-1, earthquakeEpicenter.getY()-1, 2, 2);

            int earthquakeCircleRadius = 5;

            while (earthquakeCircleRadius <= earthquakeImpactRadius) {
                g.drawOval(earthquakeEpicenter.getX() - earthquakeCircleRadius,
                        earthquakeEpicenter.getY() - earthquakeCircleRadius,
                        2*earthquakeCircleRadius, 2*earthquakeCircleRadius);
                earthquakeCircleRadius += 5;
            }

            g.drawString(earthquakeEpicenter.toString(), earthquakeEpicenter.getX() + 5, earthquakeEpicenter.getY() - 5);
        }
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x*x+y*y);
    }

    public double distanceTo(Point p) {
        return Math.sqrt(Math.pow(p.x-x,2)+Math.pow(p.y-y,2));
    }

    public double distanceToEarthquakeEpicenter() {
        if (earthquakeEpicenter == null) {
            throw new IllegalStateException("Earthquake epicenter has not been set.");
        }
        return distanceTo(earthquakeEpicenter);
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }
}