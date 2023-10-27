package org.example.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Array1TaskTest {

    @Test
    public void test1() {
        Array1Task array1Task = new Array1Task();
        int[] result = {0, 1, 2, 3, 4};
        int[] inputArray = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, array1Task.removeDuplicates(inputArray));
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], inputArray[i]);
        }
    }
}