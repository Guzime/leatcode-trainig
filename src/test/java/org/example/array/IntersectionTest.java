package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionTest {

    @Test
    public void test1() {
        Intersection intersection = new Intersection();
        int[] inputArray1 = {1, 2, 2, 1};
        int[] inputArray2 = {2, 2};
        int[] result = intersection.intersect(inputArray1, inputArray2);
        assertArrayEquals(inputArray2, result);
    }


    @Test
    public void test2() {
        Intersection intersection = new Intersection();
        int[] inputArray1 = {1, 2};
        int[] inputArray2 = {1, 1};
        int[] expected = {1};
        int[] result = intersection.intersect(inputArray1, inputArray2);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test3() {
        Intersection intersection = new Intersection();
        int[] inputArray1 = {1, 2, 2, 1};
        int[] inputArray2 = {2, 2};
        int[] result = intersection.intersect2(inputArray1, inputArray2);
        assertArrayEquals(inputArray2, result);
    }


    @Test
    public void test4() {
        Intersection intersection = new Intersection();
        int[] inputArray1 = {1, 2};
        int[] inputArray2 = {1, 1};
        int[] expected = {1};
        int[] result = intersection.intersect2(inputArray1, inputArray2);
        assertArrayEquals(expected, result);
    }

}