package org.example.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubStrTest {
    @Test
    public void test1() {
        SubStr subStr = new SubStr();
        int result = subStr.strStr("asdfffsad", "sad");
        assertEquals(6, result);
    }

    @Test
    public void test2() {
        SubStr subStr = new SubStr();
        int result = subStr.strStr("mississippi", "issip");
        assertEquals(4, result);
    }

    @Test
    public void test3() {
        SubStr subStr = new SubStr();
        int result = subStr.strStr("mississippi", "issipi");
        assertEquals(-1, result);
    }

}