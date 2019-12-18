package ru.ssau.tk.cherrypie.varyawarm;

public class Point {
    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void main() {
        Point firstPoint = new Point(1.0, 0.1, 3);
        Point secondPoint = new Point(1.1, 0.2, 4);
    }

    public double length(Point point) {
        return Math.sqrt(point.x * point.x + point.y * point.y + point.z * point.z);
    }
}
