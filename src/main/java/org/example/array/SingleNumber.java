package org.example.array;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    /**
     * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
     * You must implement a solution with a linear runtime complexity and use only constant extra space
     *
     * Example 1:
     *
     * Input: nums = [2,2,1]
     * Output: 1
     *
     *
     * Example 2:
     *
     * Input: nums = [4,1,2,1,2]
     * Output: 4
     *
     *
     * Example 3:
     *
     * Input: nums = [1]
     * Output: 1
     *
     *
     * @param nums
     * @return
     */
    public int singleNumber2(int[] nums) {
        Set<Integer> singleNums = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (singleNums.contains(nums[i])) {
                singleNums.remove(nums[i]);
            } else {
                singleNums.add(nums[i]);
            }
        }
        return singleNums.stream().findFirst().get();
    }

    // Решение с XOR с литкода, кайф)
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) result ^= num;
        return result;
    }
}
