package ru.ssau.tk.cherrypie.varyawarm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TangentOperationTest {
    TangentOperation tangentOperation = new TangentOperation();

    @Test
    public void testApply() {
        assertEquals(tangentOperation.apply(90), Math.tan(90));
        assertEquals(tangentOperation.apply(Double.NaN), Math.tan(Double.NaN));
        assertEquals(tangentOperation.apply(Double.NEGATIVE_INFINITY), Math.tan(Double.NEGATIVE_INFINITY));
        assertEquals(tangentOperation.apply(Double.POSITIVE_INFINITY), Math.tan(Double.POSITIVE_INFINITY));
    }

    @Test
    public void testApplyTriple() {
        assertEquals(tangentOperation.applyTriple(0), Math.tan(0));
        assertEquals(tangentOperation.applyTriple(Double.NaN), Math.tan(Double.NaN));
        assertEquals(tangentOperation.applyTriple(Double.NEGATIVE_INFINITY), Math.tan(Double.NEGATIVE_INFINITY));
        assertEquals(tangentOperation.applyTriple(Double.POSITIVE_INFINITY), Math.tan(Double.POSITIVE_INFINITY));
    }
}