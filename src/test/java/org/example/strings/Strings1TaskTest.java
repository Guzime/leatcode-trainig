package org.example.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Strings1TaskTest {
    @Test
    public void test1() {
        Strings1Task strings1Task = new Strings1Task();
        char[] string = {'h','e','l','l','o'};
        char[] expected = {'o','l','l','e','h'};
        strings1Task.reverseString(string);
        assertArrayEquals(expected, string);
    }

    @Test
    public void test2() {
        Strings1Task strings1Task = new Strings1Task();
        char[] string = {'h','e','l','l','o'};
        char[] expected = {'o','l','l','e','h'};
        strings1Task.reverseString2(string);
        assertArrayEquals(expected, string);
    }

    @Test
    public void test3() {
        Strings1Task strings1Task = new Strings1Task();
        char[] string = {'h','e','l','l','o'};
        char[] expected = {'o','l','l','e','h'};
        strings1Task.reverseString3(string);
        assertArrayEquals(expected, string);
    }

}