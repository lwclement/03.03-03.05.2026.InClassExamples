public class Point3D extends Point{
    private int z;
    public Point3D(int x, int y, int z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
