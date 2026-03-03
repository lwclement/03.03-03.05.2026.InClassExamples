//import java.awt.*;

import java.awt.*;

// A client using the Java Point class contained in the java.awt package
public class PointClient {

    public static void main(String[] args) {
        Point p3 = new Point();
        p3.setLocation(35, 40);

        Point p1 = new Point(100,100);
//        Point p2 = new Point(20, 100);

//        p1.x = 100;
//        p1.y = 100;

        System.out.println("p1 is " + p1);

        Point p2 = new Point(200, 250);

//        p2.x = 200;
//        p2.y = 250;

        System.out.println(p1.getX() + ", " + p1.getY());
        System.out.println(p2.getX() + ", " + p2.getY());

        p2.setX(p2.getX() + 2);
        p2.setY(p2.getY() + 2);

        System.out.println(p2.getX() + ", " + p2.getY());


//        System.out.println("Point 1 is " + p1);
//        System.out.println("Point 2 is " + p2);

//        p2.translate(-3, 6);    // moves p2 left 3 and down 6
//        System.out.println("Point 2 is " + p2);

//        System.out.println("Point 2 is " + p2.distance(0,0) + " pixels from the origin (0,0)");

//        int sum = p2.x + p2.y;
//        System.out.println("Sum of coordinates of p2 = " + sum);

//        p1.x = 5;
//        System.out.println(p1);

        DrawingPanel panel = new DrawingPanel(300, 300);
        Graphics g = panel.getGraphics();

//        The Java version of the Point class does not know how to draw itself - we will have to implement our own to do this
        p1.draw(g);
        p2.draw(g);
        p3.draw(g);
    }


}