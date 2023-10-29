package org.example.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Strings2TaskTest {
    @Test
    public void test1() {
        Strings2Task strings2Task = new Strings2Task();
        int reverse = strings2Task.reverse(54321);
        assertEquals(12345, reverse);
    }

    // Не работает, потому что Digit достигает максимального значения int
    @Test
    public void test2() {
        Strings2Task strings2Task = new Strings2Task();
        int reverse = strings2Task.reverse(1534236469);
        assertEquals(0, reverse);
    }

    @Test
    public void test3() {
        Strings2Task strings2Task = new Strings2Task();
        int reverse = strings2Task.reverse2(54321);
        assertEquals(12345, reverse);
    }

    @Test
    public void test4() {
        Strings2Task strings2Task = new Strings2Task();
        int reverse = strings2Task.reverse2(1534236469);
        assertEquals(0, reverse);
    }

    @Test
    public void test5() {
        Strings2Task strings2Task = new Strings2Task();
        int reverse = strings2Task.reverse2(-123);
        assertEquals(-321, reverse);
    }

    @Test
    public void test6() {
        Strings2Task strings2Task = new Strings2Task();
        int reverse = strings2Task.reverse2(-2147483412);
        assertEquals(-2143847412, reverse);
    }

    @Test
    public void test7() {
        Strings2Task strings2Task = new Strings2Task();
        int reverse = strings2Task.reverse2(1563847412);
        assertEquals(0, reverse);
    }

    @Test
    public void test8() {
        Strings2Task strings2Task = new Strings2Task();
        int reverse = strings2Task.reverse2(1137464807);
        assertEquals(0, reverse);
    }

}