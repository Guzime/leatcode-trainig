package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Array3TaskTest {

    @Test
    public void test1() {
        Array3Task array3Task = new Array3Task();
        int[] result = {5, 6, 7, 1, 2, 3, 4};
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        array3Task.rotate(inputArray, 3);
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], inputArray[i]);
        }
    }

    @Test
    public void test2() {
        Array3Task array3Task = new Array3Task();
        int[] result = {5, 6, 7, 1, 2, 3, 4};
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        array3Task.rotate2(inputArray, 3);
        assertArrayEquals(result, inputArray);
    }

    @Test
    public void test3() {
        Array3Task array3Task = new Array3Task();
        int[] inputArray = {-1, -100, 3, 99};
        int[] result = {3, 99, -1, -100};
        array3Task.rotate2(inputArray, 2);
        assertArrayEquals(result, inputArray);
    }

}