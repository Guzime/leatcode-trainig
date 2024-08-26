package org.example.array;

public class RotateMatrix {

    /**
     *
     * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
     *
     * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
     *
     *
     *
     * Example 1:
     *
     *
     * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
     * Output: [[7,4,1],[8,5,2],[9,6,3]]
     * Example 2:
     *
     *
     * Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
     * Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
     *
     *
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        for (int start = 0, end = matrix.length - 1; start < end; start++ , end--) {
            int[] put = new int[end - start];
            int[] save = new int[end - start];
            for (int j = start, i = 0; j < end; j++, i++) {
                put[i] = matrix[start][j];
            }
            for (int j = start, i = 0; j < end; j++, i++) {
                save[i] = matrix[j][end];
                matrix[j][end] = put[i];
            }
            for (int j = end, i = 0; j > start; j--, i++) {
                put[i] = matrix[end][j];
                matrix[end][j] = save[i];
            }
            for (int j = end, i = 0; j > start; j--, i++) {
                save[i] = matrix[j][start];
                matrix[j][start] = put[i];
            }
            for (int j = start, i = 0; j < end; j++, i++) {
                matrix[start][j] = save[i];
            }
        }
    }
}
