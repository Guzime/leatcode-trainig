package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void test1() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] inputArray = {0, 1, 2, 3, 5};
        int result = searchInsertPosition.searchInsert(inputArray, 5);
        assertEquals(4, result);
    }

    @Test
    void test2() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] inputArray = {0, 1, 2, 3, 5};
        assertFalse(searchInsertPosition.isPalindrome(inputArray));
    }

    @Test
    void test3() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] inputArray = {0, 1, 2, 1, 0};
        assertTrue(searchInsertPosition.isPalindrome(inputArray));
    }

    @Test
    void test4() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] inputArray = {1, 1, 1, 1};
        assertTrue(searchInsertPosition.isPalindrome(inputArray));
    }

    @Test
    void test5() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] a = {1, 2, 3};
        int[] b = {3, 1, 2};
        assertTrue(searchInsertPosition.isAnnagram(a, b));
    }

    @Test
    void test6() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] a = {1, 3, 3, 4};
        int[] b = {4, 3, 1, 3};
        assertTrue(searchInsertPosition.isAnnagram(a, b));
    }

    @Test
    void test7() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] a = {1, 3, 3};
        int[] b = {0, 3, 1};
        assertFalse(searchInsertPosition.isAnnagram(a, b));
    }
}