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
}