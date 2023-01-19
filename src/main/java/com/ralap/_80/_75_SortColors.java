package com.ralap._80;

/**
 * 75. 颜色分类
 * <p>
 * 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * <p>
 * 我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * <p>
 * 必须在不使用库内置的 sort 函数的情况下解决这个问题。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,0,2,1,1,0]
 * 输出：[0,0,1,1,2,2]
 * 示例 2：
 * <p>
 * 输入：nums = [2,0,1]
 * 输出：[0,1,2]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/sort-colors
 */
public class _75_SortColors {
    public void solution(int[] matrix) {
        int rad = 0, white = 0;
        int rowCount = matrix.length;
        for (int i = 0; i < rowCount; i++) {
            switch (matrix[i]) {
                case 0:
                    rad++;
                    break;
                case 1:
                    white++;
                    break;
            }
        }
        for (int i = 0; i < rowCount; i++) {
            if (i < rad) {
                matrix[i] = 0;
            } else if (i < (rad + white)) {
                matrix[i] = 1;
            } else {
                matrix[i] = 2;
            }
        }
    }
}
