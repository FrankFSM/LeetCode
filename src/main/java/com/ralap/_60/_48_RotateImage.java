package com.ralap._60;

/**
 * 48. 旋转图像
 * <p>
 * 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 * <p>
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 * <p>
 *  
 * <p>
 * 示例 1：
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[[7,4,1],[8,5,2],[9,6,3]]
 * <p>
 * 示例 2：
 * 输入：matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 * 输出：[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/rotate-image
 */
public class _48_RotateImage {

    /**
     * 辅助数组
     *
     * @param matrix
     */
    public void solution(int[][] matrix) {
        int len = matrix.length;
        int[][] newMatrix = new int[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                newMatrix[j][len - 1 - i] = matrix[i][j];
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                matrix[i][j] = newMatrix[i][j];
            }
        }
    }

    /**
     * 双旋转
     */
    public void doubleRevolveSolution(int[][] matrix) {
        int len = matrix.length;
        // 上下旋转
        for (int i = 0; i < len / 2; i++) {
            for (int j = 0; j < len; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[len - 1 - i][j];
                matrix[len - 1 - i][j] = tmp;
            }
        }
        // 对焦旋转
        for (int i = 0; i < len ; i++) {
            for (int j = i; j < len; j++) {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }
}
