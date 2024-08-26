package org.example.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyAtoiTest {

    @Test
    public void test1() {
        MyAtoi myAtoi = new MyAtoi();
        int result = myAtoi.myAtoi("4193 with words");
        assertEquals(4193, result);
    }

    @Test
    public void test2() {
        MyAtoi myAtoi = new MyAtoi();
        int result = myAtoi.myAtoi("-4193 with words");
        assertEquals(-4193, result);
    }

    @Test
    public void test3() {
        MyAtoi myAtoi = new MyAtoi();
        int result = myAtoi.myAtoi("words and 987");
        assertEquals(0, result);
    }

    @Test
    public void test4() {
        MyAtoi myAtoi = new MyAtoi();
        int result = myAtoi.myAtoi("987");
        assertEquals(987, result);
    }

    @Test
    public void test5() {
        MyAtoi myAtoi = new MyAtoi();
        int result = myAtoi.myAtoi("    -42");
        assertEquals(-42, result);
    }

    @Test
    public void test6() {
        MyAtoi myAtoi = new MyAtoi();
        int result = myAtoi.myAtoi("-91283472332");
        assertEquals(-2147483648, result);
    }
    @Test
    public void test7() {
        MyAtoi myAtoi = new MyAtoi();
        int result = myAtoi.myAtoi("+-12");
        assertEquals(0, result);
    }
    @Test
    public void test8() {
        MyAtoi myAtoi = new MyAtoi();
        int result = myAtoi.myAtoi("+");
        assertEquals(0, result);
    }

    @Test
    public void test9() {
        MyAtoi myAtoi = new MyAtoi();
        int result = myAtoi.myAtoi("");
        assertEquals(0, result);
    }

    @Test
    public void test10() {
        MyAtoi myAtoi = new MyAtoi();
        int result = myAtoi.myAtoi("21474836460");
        assertEquals(2147483647, result);
    }

    @Test
    public void test11() {
        MyAtoi myAtoi = new MyAtoi();
        int result = myAtoi.myAtoi("  0000000000012345678");
        assertEquals(12345678, result);
    }

    @Test
    public void test12() {
        MyAtoi myAtoi = new MyAtoi();
        int result = myAtoi.myAtoi("00000-42a1234");
        assertEquals(0, result);
    }

    @Test
    public void test13() {
        MyAtoi myAtoi = new MyAtoi();
        int result = myAtoi.myAtoi("-000000000000001");
        assertEquals(-1, result);
    }

    @Test
    public void test14() {
        MyAtoi myAtoi = new MyAtoi();
        int result = myAtoi.myAtoi("   +0 123");
        assertEquals(0, result);
    }

    @Test
    public void test15() {
        MyAtoi myAtoi = new MyAtoi();
        int result = myAtoi.myAtoi("2147483648");
        assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    public void test16() {
        MyAtoi myAtoi = new MyAtoi();
        int result = myAtoi.myAtoi("0   123");
        assertEquals(0, result);
    }

    @Test
    public void test17() {
        MyAtoi myAtoi = new MyAtoi();
        int result = myAtoi.myAtoi("      -11919730356x");
        assertEquals(Integer.MIN_VALUE, result);
    }


}