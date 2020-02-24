package ru.ssau.tk.cherrypie.varyawarm.Arrays;

public class Array {

    public static double[] array(int length) {
        return new double[length];
    }

    public static int[] eArray(int length) {
        int[] array = new int[length];
        array[0] = 2;
        for (int i = 1; i < length - 2; i++) {
            array[i] = 1;
        }
        array[length - 1] = 2;
        return array;
    }

    public static int[] oddArray(int length) {
        int[] array = new int[length];
        array[0] = 1;
        for (int i = 1; i < length - 1; i++) {
            array[i] = array[i - 1] + 2;
        }
        return array;
    }

    public static double[] discriminant(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        double[] x = new double[0];
        if (a == 0) {
            x[0] = -c / b;
            return x;
        }
        if (d > 0) {
            int count = 2;
            x[0] = (-b + Math.sqrt(d)) / (2 * a);
            x[1] = (-b - Math.sqrt(d)) / (2 * a);
            if (x[0] > x[1]) {
                double variable = x[0];
                x[0] = x[1];
                x[1] = variable;
                return x;
            }
            return x;
        }
        if (d == 0) {
            x[0] = (-b + Math.sqrt(d)) / (2 * a);
            return x;
        } else return new double[0];
    }
}
