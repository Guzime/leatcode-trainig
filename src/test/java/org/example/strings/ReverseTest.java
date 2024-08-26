package org.example.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
    @Test
    public void test1() {
        Reverse reverse = new Reverse();
        char[] string = {'h','e','l','l','o'};
        char[] expected = {'o','l','l','e','h'};
        reverse.reverseString(string);
        assertArrayEquals(expected, string);
    }

    @Test
    public void test2() {
        Reverse reverse = new Reverse();
        char[] string = {'h','e','l','l','o'};
        char[] expected = {'o','l','l','e','h'};
        reverse.reverseString2(string);
        assertArrayEquals(expected, string);
    }

    @Test
    public void test3() {
        Reverse reverse = new Reverse();
        char[] string = {'h','e','l','l','o'};
        char[] expected = {'o','l','l','e','h'};
        reverse.reverseString3(string);
        assertArrayEquals(expected, string);
    }

}