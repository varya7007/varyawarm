package ru.ssau.tk.cherrypie.varyawarm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SqrtOperationTest {
    SqrtOperation sqrtOperation = new SqrtOperation();

    @Test
    public void testApply() {
        assertEquals(sqrtOperation.apply(4), Math.sqrt(4));
        assertEquals(sqrtOperation.apply(121.0), Math.sqrt(121));
        assertEquals(sqrtOperation.apply(Double.NaN),Math.sqrt(Double.NaN));
        assertEquals(sqrtOperation.apply(Double.POSITIVE_INFINITY),Math.sqrt(Double.POSITIVE_INFINITY));
        assertEquals(sqrtOperation.apply(Double.NEGATIVE_INFINITY),Math.sqrt(Double.NEGATIVE_INFINITY));
    }

    @Test
    public void testApplyTriple() {
        assertEquals(sqrtOperation.applyTriple(0), Math.sqrt(0),0.01);
        assertEquals(sqrtOperation.applyTriple(Double.NaN),(Math.sqrt(Double.NaN)));
        assertEquals(sqrtOperation.applyTriple(Double.POSITIVE_INFINITY),Math.sqrt(Double.POSITIVE_INFINITY));
        assertEquals(sqrtOperation.applyTriple(Double.NEGATIVE_INFINITY),Math.sqrt(Double.NEGATIVE_INFINITY));
    }
}