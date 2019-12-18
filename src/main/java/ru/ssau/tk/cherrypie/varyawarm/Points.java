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

    public static Point opposite(Point point) {
        Point oppositePoint = new Point(-point.x, -point.y, -point.z);
        return oppositePoint;
    }

    public static Point inverse(Point point) {
        Point inversePoint = new Point(1 / point.x, 1 / point.y, 1 / point.z);
        return inversePoint;
    }

    public double scalarProduct(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint) { /* считаем, что нужно найти произведения радиус-векторов*/
        Point firstVectorCoordinate = new Point(secondPoint.x - firstPoint.x, secondPoint.y - firstPoint.y, secondPoint.z - firstPoint.z);
        Point secondVectorCoordinate = new Point(fourthPoint.x - thirdPoint.x, fourthPoint.y - thirdPoint.y, fourthPoint.z - thirdPoint.z);
        double scalarProd = firstVectorCoordinate.x * secondVectorCoordinate.x + firstVectorCoordinate.y * secondVectorCoordinate.y + firstVectorCoordinate.z * secondVectorCoordinate.z;
        return scalarProd;
    }

    public Point vectorProduct(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint) {
        Point firstVectorCoordinate = new Point(secondPoint.x - firstPoint.x, secondPoint.y - firstPoint.y, secondPoint.z - firstPoint.z);
        Point secondVectorCoordinate = new Point(fourthPoint.x - thirdPoint.x, fourthPoint.y - thirdPoint.y, fourthPoint.z - thirdPoint.z);
        Point vectorProd = new Point(firstVectorCoordinate.y * secondVectorCoordinate.z - firstVectorCoordinate.z * secondVectorCoordinate.y, firstVectorCoordinate.z * secondVectorCoordinate.x - firstVectorCoordinate.x * secondVectorCoordinate.z, firstVectorCoordinate.x * secondVectorCoordinate.y - firstVectorCoordinate.y * secondVectorCoordinate.x);
        return vectorProd;
    }

    private Points() {
    }
}
