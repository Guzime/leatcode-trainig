package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RotateArrayTest {

    @Test
    public void test1() {
        RotateArray rotateArray = new RotateArray();
        int[] result = {5, 6, 7, 1, 2, 3, 4};
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate(inputArray, 3);
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], inputArray[i]);
        }
    }

    @Test
    public void test2() {
        RotateArray rotateArray = new RotateArray();
        int[] result = {5, 6, 7, 1, 2, 3, 4};
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate2(inputArray, 3);
        assertArrayEquals(result, inputArray);
    }

    @Test
    public void test3() {
        RotateArray rotateArray = new RotateArray();
        int[] inputArray = {-1, -100, 3, 99};
        int[] result = {3, 99, -1, -100};
        rotateArray.rotate2(inputArray, 2);
        assertArrayEquals(result, inputArray);
    }

    @Test
    public void test4() {
        RotateArray rotateArray = new RotateArray();
        int[] inputArray = {1, 2, 3};
        int[] result = {3, 1, 2};
        rotateArray.rotate2(inputArray, 1);
        assertArrayEquals(result, inputArray);
    }

    @Test
    public void test5() {
        RotateArray rotateArray = new RotateArray();
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        int[] result = {5, 6, 1, 2, 3, 4};
        rotateArray.rotate2(inputArray, 2);
        assertArrayEquals(result, inputArray);
    }

    @Test
    public void test6() {
        RotateArray rotateArray = new RotateArray();
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        int[] result = {3, 4, 5, 6, 1, 2};
        rotateArray.rotate2(inputArray, 4);
        assertArrayEquals(result, inputArray);
    }

    @Test
    public void test7() {
        RotateArray rotateArray = new RotateArray();
        int[] inputArray = {1};
        int[] result = {1};
        rotateArray.rotate2(inputArray, 0);
        assertArrayEquals(result, inputArray);
    }

}