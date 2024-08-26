package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateMatrixTest {

    @Test
    public void test1() {
        RotateMatrix rotateMatrix = new RotateMatrix();
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
        rotateMatrix.rotate(image);
        assertArrayEquals(expected, image);
    }

}