import java.awt.Graphics;
import java.awt.Color;

public class Point {
    private int x;
    private int y;

    // use static to define earthquakeOrigin because it is a function of the earthquake and not the point
    private static Point earthquakeOrigin;

    // use static to define earthquakeImpactDistance because it should be a function of the earthquake and not the point (i.e., magnitude)
    private static int earthquakeImpactRadius = 50;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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

    // use
    public static void setEarthquakeOrigin(Point p) {
        earthquakeOrigin  = p;
    }

    public static void setEarthquakeImpactRadius(int d) {
        earthquakeImpactRadius = d;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void draw(Graphics g) {
        if (earthquakeOrigin != null && distanceFromEarthquakeOrigin() < earthquakeImpactRadius)
            g.setColor(Color.red);
        else g.setColor(Color.black);

        g.fillOval(x,y,3,3);
        g.drawString(this.toString(), x+5, y-5);
    }

    public static void drawEarthquakeOrigin(Graphics g) {
        if (earthquakeOrigin != null) {
            g.setColor(Color.red);

            // draw point defining earthquake epicenter
            g.fillOval(earthquakeOrigin.x, earthquakeOrigin.y, 3,3);

            int earthquakeCircleRadius = 5;

            while (earthquakeCircleRadius <= earthquakeImpactRadius) {
                g.drawOval(earthquakeOrigin.x - earthquakeCircleRadius, earthquakeOrigin.y - earthquakeCircleRadius, 2*earthquakeCircleRadius,2*earthquakeCircleRadius);
                earthquakeCircleRadius += 5;
            }

            g.drawString(earthquakeOrigin.toString(), earthquakeOrigin.x + 5, earthquakeOrigin.y + 5);
        }
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x*x+y*y);
    }

    public double distanceTo(Point p) {
        return Math.sqrt(Math.pow(p.x-x,2)+Math.pow(p.y-y,2));
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public double distanceFromEarthquakeOrigin() {
        return distanceTo(earthquakeOrigin);
    }
}