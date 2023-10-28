package org.example.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Array4Task {

    /**
     * Given an integer array nums, return true if any value appears at least twice in the array,
     * and return false if every element is distinct
     *
     * Example 1:
     *
     * Input: nums = [1,2,3,1]
     * Output: true
     *
     * Example 2:
     *
     * Input: nums = [1,2,3,4]
     * Output: false
     * Example 3:
     *
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> dublicate = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (dublicate.containsKey(nums[i])) {
                return true;
            } else {
                dublicate.put(nums[i], 1);
            }
        }
        return false;
    }


    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> dublicates = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (dublicates.contains(nums[i])) {
                return true;
            } else {
                dublicates.add(nums[i]);
            }
        }
        return false;
    }

}
