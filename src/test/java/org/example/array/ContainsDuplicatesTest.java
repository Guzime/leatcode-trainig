package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicatesTest {
    @Test
    public void test1() {
        ContainsDuplicates containsDuplicates = new ContainsDuplicates();
        int[] inputArray = {1, 2, 3, 1};
        boolean result = containsDuplicates.containsDuplicate(inputArray);
        assertTrue(result);
    }

    @Test
    public void test2() {
        ContainsDuplicates containsDuplicates = new ContainsDuplicates();
        int[] inputArray = {1, 2, 3, 1};
        boolean result = containsDuplicates.containsDuplicate2(inputArray);
        assertTrue(result);
    }

}