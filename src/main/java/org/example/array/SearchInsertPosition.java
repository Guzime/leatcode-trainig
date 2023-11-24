package org.example.array;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }

        return start;
    }

    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) nums[insertPos++] = num;
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    boolean isPalindrome(int[] nums) {
        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            if (nums[i] != nums[j]) {
                return false;
            }
        }
        return true;
    }

    boolean isAnnagram(int[] a, int[] b) {
        int digits[] = new int[10];
        for (int i = 0; i < a.length; i++)
            for (int j = i; j < a.length; j++) if (a[i] == a[j]) break;

        for (int i = 0; i < a.length; i++) a[i]++;

            for (int i = 0; i < b.length; i++) {
            digits[b[i]]--;
        }
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
