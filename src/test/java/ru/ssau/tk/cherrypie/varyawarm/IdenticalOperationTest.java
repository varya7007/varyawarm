package ru.ssau.tk.cherrypie.varyawarm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdenticalOperationTest {
    IdenticalOperation identicalOperation = new IdenticalOperation();

    @Test
    public void testApply() {
        assertEquals(identicalOperation.apply(3), 3);
        assertEquals(identicalOperation.apply(0), 0);
        assertEquals(identicalOperation.apply(Double.NaN),Double.NaN);
        assertEquals(identicalOperation.apply(Double.POSITIVE_INFINITY),Double.POSITIVE_INFINITY);
        assertEquals(identicalOperation.apply(Double.NEGATIVE_INFINITY),Double.NEGATIVE_INFINITY);


    }

    @Test
    public void testApplyTriple() {
        assertEquals(identicalOperation.applyTriple(0), 0);
        assertEquals(identicalOperation.applyTriple(-2), -2);
        assertEquals(identicalOperation.applyTriple(Double.NaN),Double.NaN);
        assertEquals(identicalOperation.applyTriple(Double.POSITIVE_INFINITY),Double.POSITIVE_INFINITY);
        assertEquals(identicalOperation.applyTriple(Double.NEGATIVE_INFINITY),Double.NEGATIVE_INFINITY);
    }
}