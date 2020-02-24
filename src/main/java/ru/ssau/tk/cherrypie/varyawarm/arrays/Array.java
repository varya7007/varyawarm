package ru.ssau.tk.cherrypie.varyawarm.arrays;

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

}

