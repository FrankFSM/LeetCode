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
        // 初始化DP Table，记录以i结尾的最长子序列
        int[] dpTable = new int[nums.length];
        // 最差的情况就是自身
        Arrays.fill(dpTable, 1);
        for (int i = 0; i < nums.length; i++) {
            // 以自身为结尾，最长子序列
            for (int j = 0; j < i; j++) {
                // 所有子序列中，小于自身中最长的子序列
                if(nums[j] < nums[i]){
                    // 选择最长
                    dpTable[i] = Math.max(dpTable[i], dpTable[j] + 1);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        // 以每一个结尾中，最长的子序列
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(dpTable[i], max);
        }
        return max;
    }
}
