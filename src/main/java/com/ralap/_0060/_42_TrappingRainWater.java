package com.ralap._0060;

import java.util.Arrays;

/**
 * 42. 接雨水
 * <p>
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出：6
 * 解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
 * 示例 2：
 * <p>
 * 输入：height = [4,2,0,3,2,5]
 * 输出：9
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/trapping-rain-water
 */
public class _42_TrappingRainWater {

    public int solution(int[] height) {
        int[] water = new int[height.length];
        for (int i = 1; i < height.length - 1; i++) {
            int leftMax = 0, rightMax = 0;
            int left = i - 1, right = i + 1;
            while (left >= 0 || right < height.length) {
                if (left >= 0) {
                    leftMax = Math.max(leftMax, height[left]);
                    left--;
                }
                if (right < height.length) {
                    rightMax = Math.max(rightMax, height[right]);
                    right++;
                }
            }
            int minVal = Math.min(leftMax, rightMax);
            int val = (minVal - height[i]) < 0 ? 0 : minVal - height[i];
            water[i] = val;
        }
        return Arrays.stream(water).sum();
    }
}
