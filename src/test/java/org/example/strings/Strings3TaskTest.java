package org.example.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Strings3TaskTest {
    @Test
    public void test1() {
        Strings3Task strings3Task = new Strings3Task();
        int result = strings3Task.firstUniqChar("leetcode");
        assertEquals(0, result);
    }

}