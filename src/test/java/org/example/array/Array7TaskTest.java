package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array7TaskTest {

    @Test
    public void test() {
        Array7Task array7Task = new Array7Task();
        int[] inputArray = {1, 2, 3, 1};
        int[] expected = {1, 2, 3, 2};
        int[] result = array7Task.plusOne(inputArray);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test2() {
        Array7Task array7Task = new Array7Task();
        int[] inputArray = {1, 2, 9, 9};
        int[] expected = {1, 3, 0, 0};
        int[] result = array7Task.plusOne(inputArray);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test3() {
        Array7Task array7Task = new Array7Task();
        int[] inputArray = {9, 9, 9, 9};
        int[] expected = {1, 0, 0, 0, 0};
        int[] result = array7Task.plusOne(inputArray);
        assertArrayEquals(expected, result);
    }

}