package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    public void test1() {
        String s = "()";
        ValidParentheses validParentheses = new ValidParentheses();
        assertTrue(validParentheses.isValid(s));
    }

    @Test
    public void test2() {
        String s = "()[]{}";
        ValidParentheses validParentheses = new ValidParentheses();
        assertTrue(validParentheses.isValid(s));
    }

}