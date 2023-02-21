package com.ralap._0080;

/**
 * 63. 不同路径 II
 * <p>
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 * <p>
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish”）。
 * <p>
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 * <p>
 * 网格中的障碍物和空位置分别用 1 和 0 来表示。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
 * 输出：2
 * 解释：3x3 网格的正中间有一个障碍物。
 * 从左上角到右下角一共有 2 条不同的路径：
 * 1. 向右 -> 向右 -> 向下 -> 向下
 * 2. 向下 -> 向下 -> 向右 -> 向右
 * 示例 2：
 * <p>
 * <p>
 * 输入：obstacleGrid = [[0,1],[0,0]]
 * 输出：1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/unique-paths-ii
 */
public class _63_UniquePaths2 {
    public int solution(int[][] obs) {
        int rows = obs.length;
        int cols = obs[0].length;
        int[][] nums = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            if (obs[i][0] == 1 || (i > 0 && nums[i - 1][0] == 0)) {
                nums[i][0] = 0;
            } else {
                nums[i][0] = 1;
            }
        }
        for (int i = 0; i < cols; i++) {
            if (obs[0][i] == 1 || (i > 0 && nums[0][i-1] == 0)) {
                nums[0][i] = 0;
            } else {
                nums[0][i] = 1;
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (obs[i][j] == 1) {
                    nums[i][j] = 0;
                }else {
                    nums[i][j] = nums[i][j - 1] + nums[i - 1][j];
                }
            }
        }
        return nums[rows - 1][cols - 1];
    }
}
