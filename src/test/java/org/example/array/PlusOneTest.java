package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @Test
    public void test() {
        PlusOne plusOne = new PlusOne();
        int[] inputArray = {1, 2, 3, 1};
        int[] expected = {1, 2, 3, 2};
        int[] result = plusOne.plusOne(inputArray);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test2() {
        PlusOne plusOne = new PlusOne();
        int[] inputArray = {1, 2, 9, 9};
        int[] expected = {1, 3, 0, 0};
        int[] result = plusOne.plusOne(inputArray);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test3() {
        PlusOne plusOne = new PlusOne();
        int[] inputArray = {9, 9, 9, 9};
        int[] expected = {1, 0, 0, 0, 0};
        int[] result = plusOne.plusOne(inputArray);
        assertArrayEquals(expected, result);
    }

}