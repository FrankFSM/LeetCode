package com.ralap.labuladong.basics.dynamic_programming;

public class MaxSumSubArray {

    public int maxSumSubArray(int[] source) {
        if (source.length == 0) {
            return 0;
        }
        int dp = source[0];
        int result = dp;
        for (int i = 1; i < source.length; i++) {
            dp= Math.max(source[i], source[i] + dp);
            result = Math.max(result, dp);
        }
        return result;
    }

    /**
     * 无状态压缩
     * @param source
     * @return
     */
    public int maxSumSubArray1(int[] source) {
        if (source.length == 0) {
            return 0;
        }
        int[] dp = new int[source.length];
        // base case
        dp[0] = source[0];
        int result = Integer.MIN_VALUE;
        for (int i = 1; i < source.length; i++) {
            dp[i] = Math.max(source[i], dp[i - 1] + source[i]);
        }
        for (int i = 0; i < dp.length; i++) {
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}
