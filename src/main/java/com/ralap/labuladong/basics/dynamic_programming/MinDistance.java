package com.ralap.labuladong.basics.dynamic_programming;

enum Choice {
    NO, ADD, UPDATE, DELETE,
}

class Node {
    public int var;
    public Choice choice;

//    public Node(int var, enum choice) {
//        this.var = var;
//        this.choice = choice;
//    }
}


/**
 * 最小编辑距离
 */
public class MinDistance {

    private String str1;
    private String str2;

    private int[][] memo;

    public int solution(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        return this.helper(str1.length() - 1, str2.length() - 1);
    }

    public int helper(int str1Len, int str2Len) {
        // str1已到头,返回str2的剩余长度
        if (str1Len == -1) {
            return str2Len + 1;
        }
        // str2已到头，返回str1的剩余长度
        if (str2Len == -1) {
            return str1Len + 1;
        }

        // 字符相同,直接跳过
        if (str1.charAt(str1Len) == str2.charAt(str2Len)) {
            return helper(str1Len - 1, str2Len - 1);
        } else {
            // 删除str1
            int delete = helper(str1Len - 1, str2Len);
            // 替换str1
            int update = helper(str1Len - 1, str2Len - 1);
            // 添加str1
            int add = helper(str1Len, str2Len - 1);
            // 选中最少，然后加本次操作
            return Math.min(Math.min(delete, update), add) + 1;
        }
    }

    /**
     * 备忘录
     */
    public int memoSolution(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;

        this.memo = new int[str1.length()][str2.length()];

        return memoHelper(str1.length() - 1, str2.length() - 1);
    }

    private int memoHelper(int str1Len, int str2Len) {
        // base case
        if (str1Len == -1) {
            return str2Len + 1;
        }
        if (str2Len == -1) {
            return str1Len + 1;
        }
        // 先查备忘录
        if (this.memo[str1Len][str2Len] != 0) {
            return this.memo[str1Len][str2Len];
        }

        // 俩个字符相同，跳过
        if (this.str1.charAt(str1Len) == this.str2.charAt(str2Len)) {
            memo[str1Len][str2Len] = memoHelper(str1Len - 1, str2Len - 1);
        } else {
            // 删除
            int delete = memoHelper(str1Len - 1, str2Len);
            // 添加
            int add = memoHelper(str1Len, str2Len - 1);
            // 修改
            int update = memoHelper(str1Len - 1, str2Len - 1);
            // 使用其中最最小的情况
            memo[str1Len][str2Len] = Math.min(delete, Math.min(add, update)) + 1;
        }
        return memo[str1Len][str2Len];
    }

    /**
     * dp table
     */
    public int dpSolution(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        return this.dpHelper(str1.length(), str2.length());
    }

    private int dpHelper(int str1Len, int str2Len) {
        int[][] dp = new int[str1Len][str2Len];
        // base case
        for (int i = 0; i < str1Len; i++) {
            dp[i][0] = i + 1;
        }
        for (int i = 0; i < str2Len; i++) {
            dp[0][i] = i + 1;
        }
        for (int i = 1; i < str1Len; i++) {
            for (int j = 1; j < str2Len; j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int add = dp[i][j - 1];
                    int update = dp[i - 1][j - 1];
                    int delete = dp[i - 1][j];
                    dp[i][j] = Math.min(Math.min(add, update), delete) + 1;
                }
            }
        }
        return dp[str1Len - 1][str2Len - 1];
    }
}
