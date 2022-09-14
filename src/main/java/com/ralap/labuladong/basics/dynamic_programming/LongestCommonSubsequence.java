package com.ralap.labuladong.basics.dynamic_programming;

public class LongestCommonSubsequence {

    public String str1 = "";
    public String str2 = "";

    public int solution(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        return dp(str1.length() - 1, str2.length() - 1);
    }

    public int solutionDpTable(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        int[][] dpTable = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j -1 )) {
                    dpTable[i][j] = dpTable[i - 1][j - 1] + 1;
                }else {
                    dpTable[i][j] = Math.max(dpTable[i - 1][j], dpTable[i][j - 1]);
                }
            }
        }
        return dpTable[m][n];
    }


    private int dp(int str1Len, int str2Len) {
        if (str1Len == -1 | str2Len == -1) {
            return 0;
        }
        if (str1.charAt(str1Len) == str2.charAt(str2Len)) {
            return dp(str1Len - 1, str2Len - 1) + 1;
        } else {
            return Math.max((dp(str1Len - 1, str2Len)), dp(str1Len, str2Len - 1));
        }
    }
}
