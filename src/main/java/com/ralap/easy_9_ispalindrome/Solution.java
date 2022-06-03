package com.ralap.easy_9_ispalindrome;


/**
 * 9.回文数
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 例如，121 是回文，而 123 不是。
 */
public class Solution {

    /**
     * 时间复杂度O(logn)
     * 空间复杂度O(1)
     */
    public boolean isPalindrome(int x) {
//        超时
//        if(x<0)
//            return false;
//        // 负数直接返回
//        String str = Integer.toString(x);
//        int head = 0, tail = str.length()-1;
//        while (tail >= head) {
//            if (str.charAt(tail) != str.charAt(head)) {
//                return false;
//            }
//        }

        // 负数、10的倍数（除去0）
        // 直接返回 false
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        // 翻转的值
        int revertNumber = 0;

        // 中位数分割值对比
        while (x > revertNumber) {
            // 翻转值
            revertNumber = revertNumber * 10 + x % 10;
            // 正常值
            x /= 10;
        }
        // 偶数相等，基数去除中位数
        return x == revertNumber || revertNumber /10 == x;
    }
}
