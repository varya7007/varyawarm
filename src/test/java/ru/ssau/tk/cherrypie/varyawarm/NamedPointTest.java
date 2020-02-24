package ru.ssau.tk.cherrypie.varyawarm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {
    NamedPoint firstPoint = new NamedPoint();
    NamedPoint secondPoint = new NamedPoint(1,2,1);
    NamedPoint thirdPoint = new NamedPoint(3,1,2.2,"Point 3");

    @Test
    public void testGetName() {
        firstPoint.setName("Second");
        assertEquals(firstPoint.getName(),"Second");
    }

    @Test
    public void testSetName() {
        assertEquals(firstPoint.getName(),"Origin");
        assertNull(secondPoint.getName());
        assertEquals(thirdPoint.getName(),"Point 3");
    }
}