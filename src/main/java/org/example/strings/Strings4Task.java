package org.example.strings;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Strings4Task {

    /**
     *
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     *
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     * typically using all the original letters exactly once.
     *
     *
     *
     * Example 1:
     *
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     * Example 2:
     *
     * Input: s = "rat", t = "car"
     * Output: false
     *
     *
     * Constraints:
     *
     * 1 <= s.length, t.length <= 5 * 104
     * s and t consist of lowercase English letters.
     *
     *
     * Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
     *
     *
     * @param s
     * @param t
     * @return
     */
    //todo получилось очень медленно((
    //21 ms
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> rightMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (rightMap.containsKey(t.charAt(i))) {
                rightMap.put(t.charAt(i), rightMap.get(t.charAt(i)) + 1);
            } else {
                rightMap.put(t.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (rightMap.containsKey(s.charAt(i))) {
                if (rightMap.get(s.charAt(i)) == 1) {
                    rightMap.remove(s.charAt(i));
                } else {
                    rightMap.put(s.charAt(i), rightMap.get(s.charAt(i)) - 1);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    //10 ms
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int left = 0;
        int right = 0;

        for (int i = 0; i < s.length(); i++) {
            left += s.charAt(i);
            right += t.charAt(i);
        }

        if (left != right) {
            return false;
        }

        Map<Character, Integer> rightMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (rightMap.containsKey(t.charAt(i))) {
                rightMap.put(t.charAt(i), rightMap.get(t.charAt(i)) + 1);
            } else {
                rightMap.put(t.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (rightMap.containsKey(s.charAt(i))) {
                if (rightMap.get(s.charAt(i)) == 1) {
                    rightMap.remove(s.charAt(i));
                } else {
                    rightMap.put(s.charAt(i), rightMap.get(s.charAt(i)) - 1);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
