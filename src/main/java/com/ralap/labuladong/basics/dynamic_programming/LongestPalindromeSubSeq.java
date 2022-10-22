package com.ralap.labuladong.basics.dynamic_programming;

/**
 * 最长回文子序列
 */
public class LongestPalindromeSubSeq {

    public int solution(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int strLen = str.length();
        int dp[][] = new int[strLen][strLen];
        for (int i = 0; i < strLen; i++) {
            dp[i][i] = 1;
        }
        for (int i = strLen - 2; i >= 0; i--) {
            for (int j = i + 1; j < strLen; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][strLen-1];
    }

    /**
     * 最少插入次数
     * @return
     */
    public int minInsert(String str){
        if (str == null || str.length() == 0) {
            return 0;
        }
        int strLen = str.length();
        int[][] dp = new int[strLen][strLen];
        for (int i = strLen - 2; i >= 0; i--) {
            for (int j = i+1; j < strLen; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                }else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j - 1]) + 1;
                }
            }
        }
        return dp[0][strLen - 1];

    }

}
