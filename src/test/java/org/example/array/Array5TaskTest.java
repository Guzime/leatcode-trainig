package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array5TaskTest {

    @Test
    public void test1() {
        Array5Task array5Task = new Array5Task();
        int[] inputArray = {2, 2, 1};
        int result = array5Task.singleNumber(inputArray);
        assertEquals(result, 1);
    }

}