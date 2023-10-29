package org.example.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class String4TaskTest {

    @Test
    public void test1() {
        Strings4Task strings4Task = new Strings4Task();
        boolean anagram = strings4Task.isAnagram("rat", "car");
        assertFalse(anagram);
    }

    @Test
    public void test2() {
        Strings4Task strings4Task = new Strings4Task();
        boolean anagram = strings4Task.isAnagram("anagram", "nagaram");
        assertTrue(anagram);
    }

    @Test
    public void test3() {
        Strings4Task strings4Task = new Strings4Task();
        boolean anagram = strings4Task.isAnagram("a", "ab");
        assertFalse(anagram);
    }

    @Test
    public void test4() {
        Strings4Task strings4Task = new Strings4Task();
        boolean anagram = strings4Task.isAnagram2("rat", "car");
        assertFalse(anagram);
    }

    @Test
    public void test5() {
        Strings4Task strings4Task = new Strings4Task();
        boolean anagram = strings4Task.isAnagram2("anagram", "nagaram");
        assertTrue(anagram);
    }

    @Test
    public void test6() {
        Strings4Task strings4Task = new Strings4Task();
        boolean anagram = strings4Task.isAnagram2("a", "ab");
        assertFalse(anagram);
    }

    @Test
    public void test7() {
        Strings4Task strings4Task = new Strings4Task();
        boolean anagram = strings4Task.isAnagram2("ac", "bb");
        assertFalse(anagram);
    }
}