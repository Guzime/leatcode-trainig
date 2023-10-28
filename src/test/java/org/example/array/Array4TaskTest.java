package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array4TaskTest {
    @Test
    public void test1() {
        Array4Task array4Task = new Array4Task();
        int[] inputArray = {1, 2, 3, 1};
        boolean result = array4Task.containsDuplicate(inputArray);
        assertTrue(result);
    }

    @Test
    public void test2() {
        Array4Task array4Task = new Array4Task();
        int[] inputArray = {1, 2, 3, 1};
        boolean result = array4Task.containsDuplicate2(inputArray);
        assertTrue(result);
    }

}