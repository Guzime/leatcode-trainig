package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array9TaskTest {

    @Test
    public void test1() {
        Array9Task array9Task = new Array9Task();
        int[] inputArray = {2,7,11,15};
        int[] expected = {0, 1};
        int[] result = array9Task.twoSum(inputArray, 9);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test2() {
        Array9Task array9Task = new Array9Task();
        int[] inputArray = {3, 3};
        int[] expected = {0, 1};
        int[] result = array9Task.twoSum(inputArray, 6);
        assertArrayEquals(expected, result);
    }

}