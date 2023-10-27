package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Array2TaskTest {

    @Test
    public void test1() {
        Array2Task array1Task = new Array2Task();
        int[] inputArray = {7, 1, 5, 3, 6, 4};
        assertEquals(7, array1Task.maxProfit(inputArray));
    }

    @Test
    public void test2() {
        Array2Task array1Task = new Array2Task();
        int[] inputArray = {1, 2, 3, 4, 5};
        assertEquals(4, array1Task.maxProfit(inputArray));
    }

    @Test
    public void test3() {
        Array2Task array1Task = new Array2Task();
        int[] inputArray = {7, 6, 4, 3, 1};
        assertEquals(0, array1Task.maxProfit(inputArray));
    }

    @Test
    public void test4() {
        Array2Task array1Task = new Array2Task();
        int[] inputArray = {7};
        assertEquals(0, array1Task.maxProfit(inputArray));
    }
}