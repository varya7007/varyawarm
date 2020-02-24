package ru.ssau.tk.cherrypie.varyawarm.string;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PartStringTest {
    private String string = "символы symbols";

    @Test
    public void testTask1() {
        PartString.Task1(string);
    }

    @Test
    public void testTask2() {
        PartString.Task2(string);
    }

    @Test
    public void testTask3() {
        PartString.Task3();
    }

    @Test
    public void testTask4() {
        assertTrue(PartString.Task4("jrj"));
        assertFalse(PartString.Task4("sfdf"));
    }

    @Test
    public void testTask7() {
        assertEquals(PartString.Task7("abcd", "bc"), 1);
        assertEquals(PartString.Task7("abcd", "cd"), 2);
        assertEquals(PartString.Task7("abcd", "fff"), -1);
    }

    @Test
    public void testTask8() {
        assertEquals(PartString.Task8("abcdef", "de"), 3);
        assertEquals(PartString.Task8("abcd", "cd"), 2);
        assertEquals(PartString.Task8("abcd", "ab"), -1);
    }

    @Test
    public void testTask9() {
        assertEquals(PartString.Task9("decdef", "de"), 3);
        assertEquals(PartString.Task9("abcd", "cd"), 2);
        assertEquals(PartString.Task9("abcd", "ff"), -1);
    }

    @Test
    public void testTask10() {
        String[] strings = new String[]{
                "abcdefg",
                "abcdefg",
                "ibcdllg",
                "abcdefj"
        };
        String pref = "a";
        String post = "fg";
        assertEquals(PartString.Task10(strings,pref,post),2);
    }
}
