import java.awt.Graphics;

public class PointClient {

    public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(300,300);
		Graphics g = panel.getGraphics();

		Point.setEarthquakeOrigin(new Point(25,25));
		Point.setEarthquakeImpactRadius(50);

	    Point p1 = new Point(50,65);
	    Point p2 = new Point(104,83);
	    Point p3 = new Point(154.0, 75);

	    System.out.println("p1: " + p1);
	    System.out.println("p2: " + p2);
		System.out.println("p3: " + p3);

		Point.drawEarthquakeOrigin(g);
		p1.draw(g);
		p2.draw(g);
		p3.draw(g);

		System.out.println("P1 is " + p1.distanceFromEarthquakeOrigin() + " from the earthquake origin.");
		System.out.println("P2 is " + p2.distanceFromEarthquakeOrigin() + " from the earthquake origin.");
		System.out.println("P3 is " + p3.distanceFromEarthquakeOrigin() + " from the earthquake origin.");
    }
}