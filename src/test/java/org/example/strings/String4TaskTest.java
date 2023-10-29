package org.example.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class String4TaskTest {

    @Test
    public void test1() {
        String4Task string4Task = new String4Task();
        boolean anagram = string4Task.isAnagram("rat", "car");
        assertFalse(anagram);
    }

    @Test
    public void test2() {
        String4Task string4Task = new String4Task();
        boolean anagram = string4Task.isAnagram("anagram", "nagaram");
        assertTrue(anagram);
    }

    @Test
    public void test3() {
        String4Task string4Task = new String4Task();
        boolean anagram = string4Task.isAnagram("a", "ab");
        assertFalse(anagram);
    }

    @Test
    public void test4() {
        String4Task string4Task = new String4Task();
        boolean anagram = string4Task.isAnagram2("rat", "car");
        assertFalse(anagram);
    }

    @Test
    public void test5() {
        String4Task string4Task = new String4Task();
        boolean anagram = string4Task.isAnagram2("anagram", "nagaram");
        assertTrue(anagram);
    }

    @Test
    public void test6() {
        String4Task string4Task = new String4Task();
        boolean anagram = string4Task.isAnagram2("a", "ab");
        assertFalse(anagram);
    }

    @Test
    public void test7() {
        String4Task string4Task = new String4Task();
        boolean anagram = string4Task.isAnagram2("ac", "bb");
        assertFalse(anagram);
    }
}