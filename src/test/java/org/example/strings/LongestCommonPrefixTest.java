package org.example.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    public void test1() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] input = {"flower", "flow", "flight"};
        String s = longestCommonPrefix.longestCommonPrefix(input);
        assertEquals("fl", s);
    }

    @Test
    public void test2() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] input = {"aflower", "sflow", "dflight"};
        String s = longestCommonPrefix.longestCommonPrefix(input);
        assertEquals("", s);
    }

    @Test
    public void test3() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] input = {"flower", "fl", "flight"};
        String s = longestCommonPrefix.longestCommonPrefix(input);
        assertEquals("fl", s);
    }

    @Test
    public void test4() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] input = {"a"};
        String s = longestCommonPrefix.longestCommonPrefix(input);
        assertEquals("a", s);
    }

    @Test
    public void test5() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] input = {"flower", "flower", "flower"};
        String s = longestCommonPrefix.longestCommonPrefix(input);
        assertEquals("flower", s);
    }

}