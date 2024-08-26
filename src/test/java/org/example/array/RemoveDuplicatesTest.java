package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesTest {

    @Test
    public void test1() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] result = {0, 1, 2, 3, 4};
        int[] inputArray = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, removeDuplicates.removeDuplicates(inputArray));
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], inputArray[i]);
        }
    }

    @Test
    public void test2() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] result = {0, 1, 2, 3, 4};
        int[] inputArray = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, removeDuplicates.removeDuplicates2(inputArray));
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], inputArray[i]);
        }
    }
}