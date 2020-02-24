package ru.ssau.tk.cherrypie.varyawarm.string;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PartStringTest {
    private String string = "символы символы";

    @Test
    public void testTask1() {
        PartString.Task1(string);
    }
}