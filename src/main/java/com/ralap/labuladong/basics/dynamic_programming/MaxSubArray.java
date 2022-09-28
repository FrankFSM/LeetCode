package com.ralap.labuladong.basics.dynamic_programming;

import java.util.Arrays;

/**
 * 最大子数组和
 */
public class MaxSubArray {

    public int solution(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        // dp数组定义: 以dp[i]结尾的，最大和
        int[] dp = new int[array.length];
        dp[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            // 选择: 自成一派，与之前相邻的组合
            dp[i] = Math.max(array[i], array[i] + dp[i - 1]);
        }
        // 获取最大
        return Arrays.stream(dp).max().getAsInt();
    }


    /**
     * 增加状态压缩
     * @param array
     * @return
     */
    public int solutionCompress(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int result = Integer.MIN_VALUE;
        int dpPre = array[0];
        int dpCurr;
        for (int i = 1; i < array.length; i++) {
            dpCurr = array[i];
            // 选择: 自成一派，与之前相邻的组合
            dpPre = Math.max(dpCurr, dpCurr + dpPre);
            // 直接对比最大值
            result = Math.max(result, dpPre);
        }
        return result;
    }


}
