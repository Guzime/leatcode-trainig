package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxProfitTest {

    @Test
    public void test1() {
        MaxProfit array1Task = new MaxProfit();
        int[] inputArray = {7, 1, 5, 3, 6, 4};
        assertEquals(7, array1Task.maxProfit(inputArray));
    }

    @Test
    public void test2() {
        MaxProfit array1Task = new MaxProfit();
        int[] inputArray = {1, 2, 3, 4, 5};
        assertEquals(4, array1Task.maxProfit(inputArray));
    }

    @Test
    public void test3() {
        MaxProfit array1Task = new MaxProfit();
        int[] inputArray = {7, 6, 4, 3, 1};
        assertEquals(0, array1Task.maxProfit(inputArray));
    }

    @Test
    public void test4() {
        MaxProfit array1Task = new MaxProfit();
        int[] inputArray = {7};
        assertEquals(0, array1Task.maxProfit(inputArray));
    }
}