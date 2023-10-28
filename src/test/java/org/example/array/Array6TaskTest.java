package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array6TaskTest {

    @Test
    public void test1() {
        Array6Task array6Task = new Array6Task();
        int[] inputArray1 = {1, 2, 2, 1};
        int[] inputArray2 = {2, 2};
        int[] result = array6Task.intersect(inputArray1, inputArray2);
        assertArrayEquals(inputArray2, result);
    }


    @Test
    public void test2() {
        Array6Task array6Task = new Array6Task();
        int[] inputArray1 = {1, 2};
        int[] inputArray2 = {1, 1};
        int[] expected = {1};
        int[] result = array6Task.intersect(inputArray1, inputArray2);
        assertArrayEquals(expected, result);
    }

}