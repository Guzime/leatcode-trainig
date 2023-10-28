package org.example.array;

import java.util.*;

public class Array6Task {
    /**
     * Given two integer arrays nums1 and nums2, return an array of their intersection.
     * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2,2]
     * <p>
     * <p>
     * Example 2:
     * <p>
     * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * Output: [4,9]
     * Explanation: [9,4] is also accepted.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums1.length, nums2.length <= 1000
     * 0 <= nums1[i], nums2[i] <= 1000
     * <p>
     * <p>
     * Follow up:
     * <p>
     * What if the given array is already sorted? How would you optimize your algorithm?
     * What if nums1's size is small compared to nums2's size? Which algorithm is better?
     * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> dublicate = new HashMap<>();
        List<Integer> intersectList = new LinkedList<>();
        int[] less = nums1.length < nums2.length ? nums1 : nums2;
        int[] more = nums1.length < nums2.length ? nums2 : nums1;

        for (int i = 0; i < more.length; i++) {
            if (dublicate.containsKey(more[i])) {
                dublicate.put(more[i], dublicate.get(more[i]) + 1);
            } else {
                dublicate.put(more[i], 1);
            }
        }
        for (int i = 0; i < less.length; i++) {
            if (dublicate.containsKey(less[i])) {
                intersectList.add(less[i]);
                if (dublicate.get(less[i]) == 1) {
                    dublicate.remove(less[i]);
                } else {
                    dublicate.put(less[i], dublicate.get(less[i]) - 1);
                }
            }
        }
        int[] result = new int[intersectList.size()];
        for (int i = 0; i < intersectList.size(); i++) {
            result[i] = intersectList.get(i);
        }
        return result;
    }

    public int[] intersect2(int[] nums1, int[] nums2) {
        Map<Integer, Integer> dublicate = new HashMap<>();
        int[] less = nums1.length < nums2.length ? nums1 : nums2;
        int[] more = nums1.length < nums2.length ? nums2 : nums1;
        int[] result = new int[less.length];

        for (int i = 0; i < more.length; i++) {
            if (dublicate.containsKey(more[i])) {
                dublicate.put(more[i], dublicate.get(more[i]) + 1);
            } else {
                dublicate.put(more[i], 1);
            }
        }
        int count = 0;
        for (int i = 0; i < less.length; i++) {
            if (dublicate.containsKey(less[i])) {
                result[count] = less[i];
                count++;
                if (dublicate.get(less[i]) == 1) {
                    dublicate.remove(less[i]);
                } else {
                    dublicate.put(less[i], dublicate.get(less[i]) - 1);
                }
            }
        }
        return Arrays.copyOfRange(result, 0, count);
    }
}
