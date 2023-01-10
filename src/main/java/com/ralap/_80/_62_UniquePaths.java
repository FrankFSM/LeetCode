package com.ralap._80;

/**
 * 62. 不同路径
 * <p>
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 * <p>
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 * <p>
 * 问总共有多少条不同的路径？
 * <p>
 * 示例 1：
 * 输入：m = 3, n = 7
 * 输出：28
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/unique-paths
 */
public class _62_UniquePaths {

    private int count = 0;

    /**
     * 回溯
     */
    public int solution(int m, int n) {
        this.trackingBack(m, n, 1, 1);
        return count;
    }

    private void trackingBack(int rows, int cols, int row, int col) {
        if (row > rows || col > cols) {
            return;
        }
        if (row == rows && col == cols) {
            count++;
            return;
        }

        trackingBack(rows, cols, ++row, col);
        row--;
        trackingBack(rows, cols, row, ++col);
        col--;
    }

    /**
     * 动态规划
     */
    public int solution2(int m, int n) {
        int[][] nums = new int[m][n];
        for (int i = 0; i < nums[0].length; i++) {
            nums[0][i] = 1;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i][0] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j < nums[0].length; j++) {
                nums[i][j] = nums[i][j - 1] + nums[i - 1][j];
            }
        }
        return nums[m - 1][n - 1];
    }
}
