public class Point {
    //instance fields(data)
    private int x;
    private int y;

    //All constructors must initialize all data of a class!
    //default constructor
    public Point() {
        this(0, 0);
    }

    //constructor 2 with parameters
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //translates x coordinates by dX
    //translates y coordinates by dY
    public void translate(int dX, int dY){
        x += dX;
        y += dY;
    }

    public double distanceFrom(Point o){
        double width = o.x - x;
        double height = o.y - y;
        return Math.sqrt(width*width + height*height);
    }

    //@Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Object o) {                       // Good implementation
        if (o != null && getClass() == o.getClass()) {      // Checks for NULL and then uses getClass() to compare TYPE
            Point other = (Point) o;
            return x == other.x && y == other.y;
        } else {
            return false;
        }
    }
}