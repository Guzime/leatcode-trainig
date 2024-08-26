package org.example.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitReverseTest {
    @Test
    public void test1() {
        DigitReverse digitReverse = new DigitReverse();
        int reverse = digitReverse.reverse(54321);
        assertEquals(12345, reverse);
    }

    // Не работает, потому что Digit достигает максимального значения int
    @Test
    public void test2() {
        DigitReverse digitReverse = new DigitReverse();
        int reverse = digitReverse.reverse(1534236469);
        assertEquals(0, reverse);
    }

    @Test
    public void test3() {
        DigitReverse digitReverse = new DigitReverse();
        int reverse = digitReverse.reverse2(54321);
        assertEquals(12345, reverse);
    }

    @Test
    public void test4() {
        DigitReverse digitReverse = new DigitReverse();
        int reverse = digitReverse.reverse2(1534236469);
        assertEquals(0, reverse);
    }

    @Test
    public void test5() {
        DigitReverse digitReverse = new DigitReverse();
        int reverse = digitReverse.reverse2(-123);
        assertEquals(-321, reverse);
    }

    @Test
    public void test6() {
        DigitReverse digitReverse = new DigitReverse();
        int reverse = digitReverse.reverse2(-2147483412);
        assertEquals(-2143847412, reverse);
    }

    @Test
    public void test7() {
        DigitReverse digitReverse = new DigitReverse();
        int reverse = digitReverse.reverse2(1563847412);
        assertEquals(0, reverse);
    }

    @Test
    public void test8() {
        DigitReverse digitReverse = new DigitReverse();
        int reverse = digitReverse.reverse2(1137464807);
        assertEquals(0, reverse);
    }

}