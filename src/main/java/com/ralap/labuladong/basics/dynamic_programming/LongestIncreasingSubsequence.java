package com.ralap.labuladong.basics.dynamic_programming;

import java.util.Arrays;

/**
 * 最长递增子序列
 */
public class LongestIncreasingSubsequence {

    public int solution(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        // 初始化DP Table
        int[] dpTable = new int[nums.length];
        Arrays.fill(dpTable, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[j] < nums[i]){
                    // 选择最长
                    dpTable[i] = Math.max(dpTable[i], dpTable[j] + 1);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            max = Math.max(dpTable[i], max);
        }
        return max;
    }
}
