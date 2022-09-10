package com.ralap.labuladong.basics.dynamic_programming;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 最长递增子串
 */
public class LengthOfLIS {

    /**
     * 二维递增子序列信封切套问题
     */
    public int maxEnvelopes(int[][] envelopes) {
        // 宽生序、高降序
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o2[1] - o1[1]: o1[0] - o2[0];
            }
        });

        // 获取所有高度
        int[] heights = new int[envelopes.length];
        for (int i = 0; i < envelopes.length; i++) {
            heights[i] = envelopes[i][1];
        }
        return this.lengthOfLIS(heights);
    }


    /**
     * @param array
     * @return
     */
    public int lengthOfLIS(int[] array) {
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
