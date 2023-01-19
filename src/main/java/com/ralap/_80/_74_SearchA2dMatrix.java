package com.ralap._80;

/**
 * 74. 搜索二维矩阵
 * <p>
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 * <p>
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * 输出：true
 * 示例 2：
 * <p>
 * <p>
 * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * 输出：false
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/search-a-2d-matrix
 */
public class _74_SearchA2dMatrix {

    public boolean solution(int[][] matrix, int target) {
        int rowCount = matrix.length, colCount = matrix[0].length;
        int row = -1;
        for (int i = rowCount - 1; i >= 0; i--) {
            if (matrix[i][0] <= target) {
                row = i;
                break;
            }
        }
        if (row == -1) {
            return false;
        }

        // 二分
        int left = 0, right = colCount - 1;
        while (right >= left) {
            int mid = (left + right) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
