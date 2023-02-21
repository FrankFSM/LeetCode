package com.ralap._0060;

/**
 * 59. 螺旋矩阵 II
 * <p>
 * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：n = 3
 * 输出：[[1,2,3],[8,9,4],[7,6,5]]
 * 示例 2：
 * <p>
 * 输入：n = 1
 * 输出：[[1]]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/spiral-matrix-ii
 */
public class _59_SpiralMatrix2 {

    public int[][] solution(int n) {
        int[][] ret = new int[n][n];
        if (n <= 0) {
            return ret;
        }
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int pos = 1;
        while (pos <= n * n) {
            // 左到右
            for (int i = left; i <= right; i++) {
                ret[top][i] = pos++;
            }
            // 上到下
            for (int i = top + 1; i <= bottom; i++) {
                ret[i][right] = pos++;
            }
            // 右到左
            for (int i = right - 1; i >= left; i--) {
                ret[bottom][i] = pos++;
            }
            // 下到上
            for (int i = bottom - 1; i > top; i--) {
                ret[i][left] = pos++;
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        return ret;
    }
}
