package com.ralap._0100;

/**
 * 85. 最大矩形
 * <p>
 * 给定一个仅包含 0 和 1 、大小为 rows x cols 的二维二进制矩阵，找出只包含 1 的最大矩形，并返回其面积。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
 * 输出：6
 * 解释：最大矩形如上图所示。
 * 示例 2：
 * <p>
 * 输入：matrix = []
 * 输出：0
 * 示例 3：
 * <p>
 * 输入：matrix = [["0"]]
 * 输出：0
 * 示例 4：
 * <p>
 * 输入：matrix = [["1"]]
 * 输出：1
 * 示例 5：
 * <p>
 * 输入：matrix = [["0","0"]]
 * 输出：0
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/maximal-rectangle
 */
public class _85_MaximalRectangle {
    public int solution(char[][] matrix) {
        if(matrix.length == 0){
            return 0;
        }

        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int[][] newMatrix = new int[rowCount][colCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (matrix[i][j] == '1') {
                    if (j == 0) {
                        newMatrix[i][j] = 1;
                    } else {
                        newMatrix[i][j] = newMatrix[i][j - 1] + 1;
                    }
                }
            }
        }
        int max = 0;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (newMatrix[i][j] == 0) {
                    continue;
                }
                int min = newMatrix[i][j];
                for (int k = i; k >= 0; k--) {
                    if (newMatrix[k][j] == 0) {
                        break;
                    }
                    min = Math.min(min, newMatrix[k][j]);
                    max = Math.max(max, (min * (i - k + 1)));
                }
            }
        }
        return max;
    }

}
