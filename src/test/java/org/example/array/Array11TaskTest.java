package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array11TaskTest {

    @Test
    public void test1() {
        Array11Task array11Task = new Array11Task();
        int[][] image = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] expected = {
                {7,4,1},
                {8,5,2},
                {9,6,3},
        };
        array11Task.rotate(image);
        assertArrayEquals(expected, image);
    }

}