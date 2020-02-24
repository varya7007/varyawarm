package ru.ssau.tk.cherrypie.varyawarm.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTest {
    private int legth = 5;
    @Test
    public void testArray() {
        double[] array = Array.array(legth);
        assertEquals(array.length,legth);
    }
}