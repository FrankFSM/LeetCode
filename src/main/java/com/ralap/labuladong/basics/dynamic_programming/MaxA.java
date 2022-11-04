package com.ralap.labuladong.basics.dynamic_programming;

/**
 * 最长A值
 * A
 * Ctrl + A
 * Ctrl + C
 * Ctrl + V
 */
public class MaxA {


    public int solution(int count){

        int[] dp = new int[count + 1];
        dp[0] = 0;
        for (int i = 1; i <= count; i++) {
            // 按A = 上次A的个数 + 1
            dp[i] = dp[i-1] + 1;
            // 穷举ctrl + v 情况
            for (int j = 2; j < i; j++) {
                dp[i] = Math.max(dp[i], dp[j - 2] * (i - j + 1));
            }

        }
        return dp[count];
    }


    /**
     * 普通解法
     */
    public int solution2(int count ){
        return this.dp(count, 0, 0);
    }

    public int dp(int count, int aCount, int copy){
        if (count <= 0) {
            return aCount;
        }
        // A
        int pressA = dp(count - 1, aCount +1, copy);
        // ctrl-A + ctrl + C
        int pressCtrlAC = dp(count - 2, aCount, aCount);
        // ctrl-V
        int pressCtrlV = dp(count - 1, aCount + copy, copy);

        return  Math.max(Math.max(pressA, pressCtrlAC), pressCtrlV);

    }




}
