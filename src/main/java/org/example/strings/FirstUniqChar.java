package org.example.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {

    /**
     * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
     *
     *
     *
     * Example 1:
     *
     * Input: s = "leetcode"
     * Output: 0
     * Example 2:
     *
     * Input: s = "loveleetcode"
     * Output: 2
     * Example 3:
     *
     * Input: s = "aabb"
     * Output: -1
     *
     *
     * Constraints:
     *
     * 1 <= s.length <= 105
     * s consists of only lowercase English letters.
     *
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (charMap.containsKey(s.charAt(i))) {
                charMap.put(s.charAt(i), 2);
            } else {
                charMap.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (charMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
