package com.ralap.labuladong.basics.dynamic_programming;

import java.util.Arrays;

/**
 * 最长递增子串
 */
public class LengthOfLIS {

    /**
     * @param array
     * @return
     */
    public int solution(int[] array) {
        int[] dp = new int[array.length];
        // 最少是1
        Arrays.fill(dp, 1);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                // 小于dp[i], 以dp[j]结尾的
                if (array[j] < array[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int result = 0;
        for (int len :
                dp) {
            result = Math.max(result, len);
        }
        return result;
    }

}
