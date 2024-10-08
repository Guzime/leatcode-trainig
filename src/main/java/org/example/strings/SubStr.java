package org.example.strings;

public class SubStr {

    /**
     * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
     * or -1 if needle is not part of haystack.
     *
     *
     *
     * Example 1:
     *
     * Input: haystack = "sadbutsad", needle = "sad"
     * Output: 0
     * Explanation: "sad" occurs at index 0 and 6.
     * The first occurrence is at index 0, so we return 0.
     * Example 2:
     *
     * Input: haystack = "leetcode", needle = "leeto"
     * Output: -1
     * Explanation: "leeto" did not occur in "leetcode", so we return -1.
     *
     *
     * Constraints:
     *
     * 1 <= haystack.length, needle.length <= 104
     * haystack and needle consist of only lowercase English characters
     *
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (needle.charAt(0) == haystack.charAt(i)) {
                for (int j = 0, k = i; j < needle.length() && k < haystack.length(); j++, k++) {
                    if (needle.charAt(j) != haystack.charAt(k)) {
                        break;
                    }
                    if (j == needle.length() - 1) {
                        return k - j;
                    }
                }
            }
        }
        return -1;
    }
}
