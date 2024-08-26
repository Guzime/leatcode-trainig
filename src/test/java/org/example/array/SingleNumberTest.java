package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    @Test
    public void test1() {
        SingleNumber singleNumber = new SingleNumber();
        int[] inputArray = {2, 2, 1};
        int result = singleNumber.singleNumber(inputArray);
        assertEquals(result, 1);
    }

}