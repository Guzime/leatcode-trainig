package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void test1() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int search = binarySearch.search(nums, 9);
        assertEquals(4, search);
    }

    @Test
    void test2() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int search = binarySearch.search(nums, 2);
        assertEquals(-1, search);
    }

    @Test
    void test3() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {-2, 5};
        int search = binarySearch.search(nums, 5);
        assertEquals(1, search);
    }

}