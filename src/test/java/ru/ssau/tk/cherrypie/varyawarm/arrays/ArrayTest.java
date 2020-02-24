package ru.ssau.tk.cherrypie.varyawarm.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTest {
    private int length = 5;

    @Test
    public void testArray() {
        double[] array = Array.array(length);
        assertEquals(array.length, length);
    }


    @Test
    public void testEArray() {
        int[] array = Array.eArray(length);
        assertEquals(array[0], 2);
        assertEquals(array[length - 1], 2);
        for (int i = 1; i < length - 2; i++) {
            assertEquals(array[i], 1);
        }
    }

    @Test
    public void testOddArray() {
        int[] array = Array.oddArray(length);
        assertEquals(array[0], 1);
        for (int i = 1; i < length - 1; i++) {
        assertEquals(array[i],array[i-1]+2);

        }
    }
}