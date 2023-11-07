package org.example.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    public void test1() {
        int [] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        System.out.println(QuickSort.arrayToString(array) + "\n");
        QuickSort.quickSort(array, 0, array.length - 1);
    }

}