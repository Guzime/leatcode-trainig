package org.example.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Strings8TaskTest {

    @Test
    public void test1() {
        Strings8Task strings8Task = new Strings8Task();
        String[] input = {"flower", "flow", "flight"};
        String s = strings8Task.longestCommonPrefix(input);
        assertEquals("fl", s);
    }

    @Test
    public void test2() {
        Strings8Task strings8Task = new Strings8Task();
        String[] input = {"aflower", "sflow", "dflight"};
        String s = strings8Task.longestCommonPrefix(input);
        assertEquals("", s);
    }

    @Test
    public void test3() {
        Strings8Task strings8Task = new Strings8Task();
        String[] input = {"flower", "fl", "flight"};
        String s = strings8Task.longestCommonPrefix(input);
        assertEquals("fl", s);
    }

    @Test
    public void test4() {
        Strings8Task strings8Task = new Strings8Task();
        String[] input = {"a"};
        String s = strings8Task.longestCommonPrefix(input);
        assertEquals("a", s);
    }

    @Test
    public void test5() {
        Strings8Task strings8Task = new Strings8Task();
        String[] input = {"flower", "flower", "flower"};
        String s = strings8Task.longestCommonPrefix(input);
        assertEquals("flower", s);
    }

}