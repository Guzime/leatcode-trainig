package org.example.array;

public class Array3Task {
    /**
     * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
     *
     * Example 1:
     *
     * Input: nums = [1,2,3,4,5,6,7], k = 3
     * Output: [5,6,7,1,2,3,4]
     * Explanation:
     * rotate 1 steps to the right: [7,1,2,3,4,5,6]
     * rotate 2 steps to the right: [6,7,1,2,3,4,5]
     * rotate 3 steps to the right: [5,6,7,1,2,3,4]
     *
     * Example 2:
     *
     * Input: nums = [-1,-100,3,99], k = 2
     * Output: [3,99,-1,-100]
     * Explanation:
     * rotate 1 steps to the right: [99,-1,-100,3]
     * rotate 2 steps to the right: [3,99,-1,-100]
     *
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        if (nums.length > 1) {
            k = nums.length > k ? k : k % nums.length;
            int[] cutArray = new int[nums.length - k];
            int j = 0;
            for (int i = 0; i < nums.length - k; i++) {
                cutArray[i] = nums[i];
            }
            for (int i = nums.length - k; i < nums.length; i++, j++) {
                nums[j] = nums[i];
            }
            for (int i = 0; i < cutArray.length; i++, j++) {
                nums[j] = cutArray[i];
            }
        }
    }

    public void rotate2(int[] nums, int k) {
        if (nums.length > 1) {
            k = nums.length > k ? k : k % nums.length;
            if (nums.length % k != 0) {
                for (int i = 0, j = 0, save = nums[nums.length - k]; i < nums.length; i++) {
                    int buff = nums[j];
                    nums[j] = save;
                    j = (j + k) % nums.length;
                    save = buff;
                }
            } else {
                for (int i = 0, j = 0, start = k, save = nums[start]; i < nums.length; i++) {
                    int buff = nums[j];
                    nums[j] = save;
                    j = (j + k) % nums.length;
                    save = buff;
                    if (i != 0 && j == start) {
                        j = ++start;
                        save = nums[start];
                    }
                }
            }
        }
    }
}
