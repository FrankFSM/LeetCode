package com.ralap._20;

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
public class _05_LongestPalindrome {

    /**
     * 暴力
     *
     * @param str
     * @return
     */
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

    /**
     * 动态规划
     *
     * @param str
     * @return
     */
    public String dpSolution(String str) {
        int strLen = str.length();
        String[][] dp = new String[strLen][strLen];

        // base case
        for (int i = 1; i < strLen; i++) {
            for (int j = 0; j < i; j++) {
                dp[i][j] = "";
            }
        }
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

    /**
     * 中心扩展
     *
     * @return
     */
    public String centreExpandSolution(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        String maxStr = str.charAt(0) + "";
        for (int i = 1; i < str.length() ; i++) {
            int left = i - 1;
            int right = i + 1;
            String currStr = this.centreExpand(str, left, right);
            maxStr = maxStr.length() < currStr.length() ? currStr: maxStr;

            int left_2 = i - 1;
            int right_2 = i;
            // 以i,i-1为中心
            currStr = this.centreExpand(str, left_2, right_2);
            maxStr = maxStr.length() < currStr.length() ? currStr: maxStr;
        }
        return maxStr;
    }

    private String centreExpand(String str, int left, int right) {
        String maxStr = "";
        // 以i为中心
        while (left >= 0 && right < str.length()) {
            if(str.charAt(left) == str.charAt(right)){
                String currStr = str.substring(left, right +1);
                maxStr = maxStr.length() < currStr.length() ? currStr: maxStr;
                left--;
                right++;
            }else {
                break;
            }
        }
        return maxStr;
    }

}
