package com.ralap.labuladong.basics.dynamic_programming;

import java.util.Arrays;

/**
 * 最大信封切套
 */
public class MaxEnvelopes {

    public int solution(int[][] nums) {
        // 根据宽排序
        Arrays.sort(nums, (o1, o2) -> {
            // 宽度相同，高度倒序
            if (o1[0] == o2[0]) {
                return o2[1] - o1[1];
            }
            return o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0];
        });
        // 高度最长递增子序列
        int[] heights = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            heights[i] = nums[i][1];
        }
        return this.lis(heights);
    }

    /**
     * 最长递增子序列
     */
    public int lis(int[] num) {
        if (num == null || num.length == 0) {
            return 0;
        }
        int[] dpTable = new int[num.length];
        Arrays.fill(dpTable, 1);
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < i; j++) {
                if (num[i] > num[j]) {
                    dpTable[i] = Math.max(dpTable[i], dpTable[j] + 1);
                }
            }
        }
        int maxLength = 0;
        for (int i = 0; i < dpTable.length; i++) {
            maxLength = Math.max(maxLength, dpTable[i]);
        }
        return maxLength;
    }
}
