package org.example.strings;

public class Strings1Task {
    /**
     * Write a function that reverses a string. The input string is given as an array of characters s.
     *
     * You must do this by modifying the input array in-place with O(1) extra memory.
     *
     *
     *
     * Example 1:
     *
     * Input: s = ["h","e","l","l","o"]
     * Output: ["o","l","l","e","h"]
     * Example 2:
     *
     * Input: s = ["H","a","n","n","a","h"]
     * Output: ["h","a","n","n","a","H"]
     *
     *
     * Constraints:
     *
     * 1 <= s.length <= 105
     * s[i] is a printable ascii character.
     *
     * @param s
     */
    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char buff = s[i];
            s[i] = s[j];
            s[j] = buff;
        }
    }
    public void reverseString2(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            s[i] = (char) (s[i] + s[j]);
            s[j] = (char) (s[i] - s[j]);
            s[i] = (char) (s[i] - s[j]);
        }
    }

    public void reverseString3(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            s[i] = (char) (s[i] + s[s.length - 1 - i]);
            s[s.length - 1 - i] = (char) (s[i] - s[s.length - 1 - i]);
            s[s.length - 1 - i] = (char) (s[i] - s[s.length - 1 - i]);
        }
    }

}
