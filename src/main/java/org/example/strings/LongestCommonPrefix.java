package org.example.strings;

public class LongestCommonPrefix {

    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
     *
     * If there is no common prefix, return an empty string "".
     *
     *
     *
     * Example 1:
     *
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     * Example 2:
     *
     * Input: strs = ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     *
     *
     * Constraints:
     *
     * 1 <= strs.length <= 200
     * 0 <= strs[i].length <= 200
     * strs[i] consists of only lowercase English letters.
     *
     *
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        for (int j = 0; j < strs[0].length(); j++) {
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() == j || strs[i].charAt(j) != strs[0].charAt(j)) {
                    return strs[0].substring(0, j);
                }
            }
            if (j == strs[0].length() - 1) {
                return strs[0];
            }
        }
        return "";
    }
}
