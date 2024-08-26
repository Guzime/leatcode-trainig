package org.example.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqCharTest {
    @Test
    public void test1() {
        FirstUniqChar firstUniqChar = new FirstUniqChar();
        int result = firstUniqChar.firstUniqChar("leetcode");
        assertEquals(0, result);
    }

}