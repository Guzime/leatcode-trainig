package org.example.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Strings4TaskTest {
    @Test
    public void test1() {
        Strings5Task string5Task = new Strings5Task();
        boolean palindrome = string5Task.isPalindrome("A man, a plan, a canal: Panama");
        assertTrue(palindrome);
    }

    @Test
    public void test2() {
        Strings5Task string5Task = new Strings5Task();
        boolean palindrome = string5Task.isPalindrome(".");
        assertTrue(palindrome);
    }

    @Test
    public void test3() {
        Strings5Task string5Task = new Strings5Task();
        boolean palindrome = string5Task.isPalindrome("0P");
        assertFalse(palindrome);
    }

    @Test
    public void test4() {
        Strings5Task string5Task = new Strings5Task();
        boolean palindrome = string5Task.isPalindrome2("A man, a plan, a canal: Panama");
        assertTrue(palindrome);
    }

    @Test
    public void test5() {
        Strings5Task string5Task = new Strings5Task();
        boolean palindrome = string5Task.isPalindrome2(".");
        assertTrue(palindrome);
    }

    @Test
    public void test6() {
        Strings5Task string5Task = new Strings5Task();
        boolean palindrome = string5Task.isPalindrome2("0P");
        assertFalse(palindrome);
    }

}