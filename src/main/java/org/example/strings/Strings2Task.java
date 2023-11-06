package org.example.strings;

import java.util.LinkedList;
import java.util.List;

public class Strings2Task {
    /**
     * Given a signed 32-bit integer x, return x with its digits reversed.
     * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
     *
     * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
     *
     *
     *
     * Example 1:
     *
     * Input: x = 123
     * Output: 321
     * Example 2:
     *
     * Input: x = -123
     * Output: -321
     * Example 3:
     *
     * Input: x = 120
     * Output: 21
     *
     */
    public int reverse(int x) {
        Integer digit = 10;
        List<Integer> nums = new LinkedList<>();
        while (true) {
            if (x % digit != x) {
                nums.add(x % digit / (digit / 10));
                digit*=10;
            } else {
                nums.add(x % digit / (digit / 10));
                digit/=10;
                break;
            }
        }
        Integer result = 0;

        for (int i = 0; i < nums.size(); i++, digit/=10) {
            result += digit * nums.get(i);
        }

        return result;
    }

    public int reverse2(int x) {
        int result = 0;
        int digits = 1;
        int start = 0;
        String input = String.valueOf(x);
        if (x < 0) {
            start = 1;
            digits = -1;
        }
        for (; start < input.length(); start++, digits *= 10) {
            result += (input.charAt(start) - '0') * digits;
            if (Math.abs(digits) == 100000000
                    && start + 1 < input.length()
                    && (input.charAt(start + 1) - '0' > 2
                    || (input.charAt(start + 1) - '0' == 2 && Math.abs(result) > 147483647))) {
                return 0;
            }
        }
        return result;
    }

    public int reverse3(int x) {
        long result = 0;
        int digits = 1;
        int start = 0;
        String input = String.valueOf(x);
        if (x < 0) {
            start = 1;
            digits = -1;
        }
        for (; start < input.length(); start++, digits *= 10) {
            result += (long) (input.charAt(start) - '0') * digits;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)result;
    }

}
