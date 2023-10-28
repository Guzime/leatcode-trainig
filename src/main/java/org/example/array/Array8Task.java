package org.example.array;

import java.util.LinkedList;
import java.util.List;

public class Array8Task {

    /**
     * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     * <p>
     * Note that you must do this in-place without making a copy of the array.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     * Example 2:
     * <p>
     * Input: nums = [0]
     * Output: [0]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 104
     * -231 <= nums[i] <= 231 - 1
     * <p>
     * <p>
     * Follow up: Could you minimize the total number of operations done?
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int countZero = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                countZero++;
                for (int j = i; j < nums.length - countZero; j++) {
                    int right = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = right;
                }
            }
        }
    }

    public void moveZeroes2(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
    }
}
