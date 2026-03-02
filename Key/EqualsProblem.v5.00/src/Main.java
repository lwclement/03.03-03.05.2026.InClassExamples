public class Main {
    public static void main(String[] args) {
        Point p1 = new Point3D(4,5, 0);
        Point p2 = new Point3D(4,5, 6);
        Point p3 = new Point(4,5);
        Point p4 = new Point(4,5);
        Point p5 = new Point3D(4,5, 6);

        System.out.println("p1 == p2 " + (p1 == p2));
        System.out.println("p1 == p3 " + (p1 == p3));
        System.out.println("p3 == p2 " + (p3 == p2));

        System.out.println("p1.equals(p2) " + (p1.equals(p2)));
        System.out.println("p1.equals(p3) " + (p1.equals(p3)));
        System.out.println("p3.equals(p2) " + (p3.equals(p2)));
        System.out.println("p2.equals(p3) " + (p2.equals(p3)));
        System.out.println("p2.equals(p3) " + (p3.equals(p4)));
        System.out.println("p2.equals(p3) " + (p5.equals(p2)));

        System.out.println("Other: " + p1.equals("Hello World!"));
    }
}
