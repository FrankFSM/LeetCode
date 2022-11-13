package com.ralap._20;

/**
 * 9. 回文数
 * <p>
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * <p>
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 例如，121 是回文，而 123 不是。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/palindrome-number
 */

public class _9_IntegerPalindrome {

    public boolean solution(int x) {
        if (x < 0) {
            return false;
        }
        String str = x + "";
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            if (str.charAt(i) != str.charAt(strLen - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
