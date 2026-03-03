import java.awt.*;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void translate(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    public double distance(Point other){
        int dx = this.x - other.getX();
        int dy = this.y - other.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    public void draw(Graphics g){
        g.fillOval(x, y, 3, 3);
        g.drawString("(" + x + ", " + y + ")", x+5, y-5);
    }
}