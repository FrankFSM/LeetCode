package com.ralap._60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 54. 螺旋矩阵
 * <p>
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 * 示例 2：
 * <p>
 * <p>
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/spiral-matrix
 */
public class _54_SpiralMatrix {

    public List<Integer> solution(int[][] martrix) {
        int rows = martrix.length;
        int cols = martrix[0].length;
        List<Integer> ret = new ArrayList<>();

        if(rows == 1){
            for (int i = 0; i < cols; i++) {
                ret.add(martrix[0][i]);
            }
            return ret;
        }
        if(cols == 1){
            for (int i = 0; i < rows; i++) {
                ret.add(martrix[i][0]);
            }
            return ret;
        }
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                ret.add(martrix[top][i]);
            }
            for (int i = top + 1; i <= bottom; i++) {
                ret.add(martrix[i][right]);
            }
            if (left < right && top < bottom) {
                for (int i = right - 1; i >= left; i--) {
                    ret.add(martrix[bottom][i]);
                }
                for (int i = bottom - 1; i > top; i--) {
                    ret.add(martrix[i][left]);
                }
            }

            top++;
            bottom--;
            left++;
            right--;
        }
        return ret;

    }

}
