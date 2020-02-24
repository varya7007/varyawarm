package ru.ssau.tk.cherrypie.varyawarm.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTest {

    @Test
    public void testDiscriminant() {
        double[] array = Array.discriminant(0, 4, 2);
        double[] array1 = Array.discriminant(2, -1, -1);
        double[] array2 = Array.discriminant(1, 0, 2);
        double[] array3 = Array.discriminant(0.5, 2, 1);
        assertEquals(array[0], -0.5);
        assertEquals(array1[0], -0.5);
        assertEquals(array1[1], 1);
        assertEquals(array1.length, 2);
        assertEquals(array2.length, 0);
        assertEquals(array3.length, 1);
    }
}