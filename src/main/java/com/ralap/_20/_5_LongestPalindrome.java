package com.ralap._20;

import java.util.Arrays;

/**
 * 5. 最长回文子串
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 * <p>
 * 示例 1：
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/longest-palindromic-substring
 */
public class _5_LongestPalindrome {

    public String solution(String str) {
        String maxSubStr = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String subStr = str.substring(i, j + 1);
                if (this.isPalindrome(subStr)) {
                    maxSubStr = subStr.length() > maxSubStr.length() ? subStr : maxSubStr;
                }
            }
        }
        return maxSubStr;
    }

    private boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2 + 1; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public String dpSolution(String str) {
        int strLen = str.length();
        String[][] dp = new String[strLen][strLen];

        for (int i = 1; i < strLen; i++) {
            for (int j = 0; j < i; j++) {
                dp[i][j] = "";
            }
        }
        // base case
        for (int i = 0; i < strLen; i++) {
            dp[i][i] = str.charAt(i) + "";
        }
        for (int i = strLen - 2; i >= 0; i--) {
            for (int j = i + 1; j < strLen; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    if (dp[i + 1][j - 1] == null) {
                        continue;
                    }
                    dp[i][j] = str.charAt(i) + dp[i + 1][j - 1] + str.charAt(i);
                }
            }
        }
        String max = "";
        for (int i = 0; i < strLen; i++) {
            for (int j = 0; j < strLen; j++) {
                if (dp[i][j] != null) {
                    max = max.length() < dp[i][j].length() ? dp[i][j] : max;

                }
            }
        }
        return max;
    }
}
