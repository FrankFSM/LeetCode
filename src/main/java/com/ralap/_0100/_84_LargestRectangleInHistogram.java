package com.ralap._0100;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 84. 柱状图中最大的矩形
 * <p>
 * 给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。
 * <p>
 * 求在该柱状图中，能够勾勒出来的矩形的最大面积。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * <p>
 * 输入：heights = [2,1,5,6,2,3]
 * 输出：10
 * 解释：最大的矩形为图中红色区域，面积为 10
 * 示例 2：
 * <p>
 * <p>
 * <p>
 * 输入： heights = [2,4]
 * 输出： 4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/largest-rectangle-in-histogram
 */
public class _84_LargestRectangleInHistogram {


    /**
     * 暴力破解,时间复杂度O(n^2)
     * <p>
     * 注意：超出时间限制
     *
     * @param heights
     * @return
     */
    public int solution(int[] heights) {
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int left = i;
            int right = i;
            // 找到最左不小于height
            while (left - 1 >= 0 && heights[left - 1] >= height) {
                left--;
            }
            // 找到最右不小于height
            while (right + 1 < heights.length && heights[right + 1] >= height) {
                right++;
            }
            // 这个高度的最大面积
            max = Math.max(max, height * (right - left + 1));
        }
        return max;
    }

    /**
     * 单调栈
     *
     * @param heights
     * @return
     */
    public int stackSolution(int[] heights) {
        int max = 0;
        int[] tmpHeights = new int[heights.length + 2];
        System.arraycopy(heights, 0, tmpHeights, 1, heights.length);


        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < tmpHeights.length; i++) {
            while (!deque.isEmpty() && tmpHeights[deque.peek()] > tmpHeights[i]) {
                int index = tmpHeights[deque.pop()];
                max = Math.max(max, (i - deque.peek() - 1) * index);
            }
            deque.push(i);
        }
        return max;
    }
}
