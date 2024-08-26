package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    @Test
    public void test1() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] inputArray = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        moveZeroes.moveZeroes(inputArray);
        assertArrayEquals(expected, inputArray);
    }

    @Test
    public void test2() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] inputArray = {0, 0, 1};
        int[] expected = {1, 0, 0};
        moveZeroes.moveZeroes(inputArray);
        assertArrayEquals(expected, inputArray);
    }

    @Test
    public void test3() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] inputArray = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        moveZeroes.moveZeroes2(inputArray);
        assertArrayEquals(expected, inputArray);
    }

    @Test
    public void test4() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] inputArray = {0, 0, 1};
        int[] expected = {1, 0, 0};
        moveZeroes.moveZeroes2(inputArray);
        assertArrayEquals(expected, inputArray);
    }

}