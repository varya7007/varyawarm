package ru.ssau.tk.cherrypie.varyawarm;

public class Points {
    public static Point sum(Point point1, Point point2) {
        Point sumPoint = new Point(point1.x + point2.x, point1.y + point2.y, point1.z + point2.z);
        return sumPoint;
    }

    public static Point subtract(Point point1, Point point2) {
        Point subtractPoint = new Point(point1.x - point2.x, point1.y - point2.y, point1.z - point2.z);
        return subtractPoint;
    }

    public static Point multiply(Point point1, Point point2) {
        Point multiplyPoint = new Point(point1.x * point2.x, point1.y * point2.y, point1.z * point2.z);
        return multiplyPoint;
    }

    public static Point divide(Point point1, Point point2) {
        Point dividePoint = new Point(point1.x / point2.x, point1.y / point2.y, point1.z / point2.z);
        return dividePoint;
    }

    public Point enlarge(Point point, double num) {
        Point enlargePoint = new Point(point.x * num, point.y * num, point.z * num);
        return enlargePoint;
    }

    public static double length(Point point) {
        return point.length(point);
    }

    private Points() {
    }
}
