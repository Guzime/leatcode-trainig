package org.example.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Strings6TaskTest {

    @Test
    public void test1() {
        Strings6Task strings6Task = new Strings6Task();
        int result = strings6Task.myAtoi("4193 with words");
        assertEquals(4193, result);
    }

    @Test
    public void test2() {
        Strings6Task strings6Task = new Strings6Task();
        int result = strings6Task.myAtoi("-4193 with words");
        assertEquals(-4193, result);
    }

    @Test
    public void test3() {
        Strings6Task strings6Task = new Strings6Task();
        int result = strings6Task.myAtoi("words and 987");
        assertEquals(0, result);
    }

    @Test
    public void test4() {
        Strings6Task strings6Task = new Strings6Task();
        int result = strings6Task.myAtoi("987");
        assertEquals(987, result);
    }

    @Test
    public void test5() {
        Strings6Task strings6Task = new Strings6Task();
        int result = strings6Task.myAtoi("    -42");
        assertEquals(-42, result);
    }

    @Test
    public void test6() {
        Strings6Task strings6Task = new Strings6Task();
        int result = strings6Task.myAtoi("-91283472332");
        assertEquals(-2147483648, result);
    }
    @Test
    public void test7() {
        Strings6Task strings6Task = new Strings6Task();
        int result = strings6Task.myAtoi("+-12");
        assertEquals(0, result);
    }
    @Test
    public void test8() {
        Strings6Task strings6Task = new Strings6Task();
        int result = strings6Task.myAtoi("+");
        assertEquals(0, result);
    }

    @Test
    public void test9() {
        Strings6Task strings6Task = new Strings6Task();
        int result = strings6Task.myAtoi("");
        assertEquals(0, result);
    }

    @Test
    public void test10() {
        Strings6Task strings6Task = new Strings6Task();
        int result = strings6Task.myAtoi("21474836460");
        assertEquals(2147483647, result);
    }

    @Test
    public void test11() {
        Strings6Task strings6Task = new Strings6Task();
        int result = strings6Task.myAtoi("  0000000000012345678");
        assertEquals(12345678, result);
    }

    @Test
    public void test12() {
        Strings6Task strings6Task = new Strings6Task();
        int result = strings6Task.myAtoi("00000-42a1234");
        assertEquals(0, result);
    }

    @Test
    public void test13() {
        Strings6Task strings6Task = new Strings6Task();
        int result = strings6Task.myAtoi("-000000000000001");
        assertEquals(-1, result);
    }

    @Test
    public void test14() {
        Strings6Task strings6Task = new Strings6Task();
        int result = strings6Task.myAtoi("   +0 123");
        assertEquals(0, result);
    }

    @Test
    public void test15() {
        Strings6Task strings6Task = new Strings6Task();
        int result = strings6Task.myAtoi("2147483648");
        assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    public void test16() {
        Strings6Task strings6Task = new Strings6Task();
        int result = strings6Task.myAtoi("0   123");
        assertEquals(0, result);
    }

    @Test
    public void test17() {
        Strings6Task strings6Task = new Strings6Task();
        int result = strings6Task.myAtoi("      -11919730356x");
        assertEquals(Integer.MIN_VALUE, result);
    }


}