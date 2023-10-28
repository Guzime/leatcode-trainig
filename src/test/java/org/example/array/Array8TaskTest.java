package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array8TaskTest {

    @Test
    public void test1() {
        Array8Task array8Task = new Array8Task();
        int[] inputArray = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        array8Task.moveZeroes(inputArray);
        assertArrayEquals(expected, inputArray);
    }

    @Test
    public void test2() {
        Array8Task array8Task = new Array8Task();
        int[] inputArray = {0, 0, 1};
        int[] expected = {1, 0, 0};
        array8Task.moveZeroes(inputArray);
        assertArrayEquals(expected, inputArray);
    }

    @Test
    public void test3() {
        Array8Task array8Task = new Array8Task();
        int[] inputArray = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        array8Task.moveZeroes2(inputArray);
        assertArrayEquals(expected, inputArray);
    }

    @Test
    public void test4() {
        Array8Task array8Task = new Array8Task();
        int[] inputArray = {0, 0, 1};
        int[] expected = {1, 0, 0};
        array8Task.moveZeroes2(inputArray);
        assertArrayEquals(expected, inputArray);
    }

}