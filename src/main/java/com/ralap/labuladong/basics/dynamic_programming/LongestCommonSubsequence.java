package com.ralap.labuladong.basics.dynamic_programming;

/**
 * 最长公共子窜
 * 1. 明确DP数组含义
 * 2. 定义base case
 * 3. 状态转移方程式
 * 4.
 */
public class LongestCommonSubsequence {
    private String str1;
    private String str2;

    public int solution(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return 0;
        }
        this.str1 = str1;
        this.str2 = str2;
        return this.helper(str1.length() - 1, str2.length() - 1);
    }

    private int helper(int str1Len, int str2Len) {

        if (str1Len == -1 || str2Len == -1) {
            return 0;
        }
        // 如果当前字符相等，就是上一个最长子窜 + 1
        if (this.str1.charAt(str1Len) == this.str2.charAt(str2Len)) {
            return helper(str1Len - 1, str2Len - 1) + 1;
        } else {
            // 如果不等，这里选上一个最大的
            return Math.max(helper(str1Len - 1, str2Len), helper(str1Len, str2Len - 1));
        }
    }
}
