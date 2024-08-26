package org.example.array;

public class RotateArray {
    /**
     * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,2,3,4,5,6,7], k = 3
     * Output: [5,6,7,1,2,3,4]
     * Explanation:
     * rotate 1 steps to the right: [7,1,2,3,4,5,6]
     * rotate 2 steps to the right: [6,7,1,2,3,4,5]
     * rotate 3 steps to the right: [5,6,7,1,2,3,4]
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [-1,-100,3,99], k = 2
     * Output: [3,99,-1,-100]
     * Explanation:
     * rotate 1 steps to the right: [99,-1,-100,3]
     * rotate 2 steps to the right: [3,99,-1,-100]
     *
     * @param nums
     * @param k
     */
    public void rotate1(int[] nums, int k) {
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
        if (nums.length > 1 && k > 0 && k != nums.length) {
            k = nums.length > k ? k : k % nums.length;
            for (int i = 0, j = 0, start = nums.length - k, save = nums[start]; i < nums.length; i++) {
                int nextIndex = (j + k) % nums.length;
                int buff = nums[j];
                nums[j] = save;
                save = buff;
                if (nextIndex == start && i + 1 != nums.length - 1) {
                    j = nextIndex;
                    nums[j] = save;
                    start++;
                    j++;
                    save = nums[start];
                } else {
                    j = nextIndex;
                }
            }
        }
    }

    // Взял с литкода 0 ms + 55.8
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
