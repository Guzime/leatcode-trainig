package org.example.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Strings7TaskTest {
    @Test
    public void test1() {
        Strings7Task strings7Task = new Strings7Task();
        int result = strings7Task.strStr("asdfffsad", "sad");
        assertEquals(6, result);
    }

    @Test
    public void test2() {
        Strings7Task strings7Task = new Strings7Task();
        int result = strings7Task.strStr("mississippi", "issip");
        assertEquals(4, result);
    }

    @Test
    public void test3() {
        Strings7Task strings7Task = new Strings7Task();
        int result = strings7Task.strStr("mississippi", "issipi");
        assertEquals(-1, result);
    }

}