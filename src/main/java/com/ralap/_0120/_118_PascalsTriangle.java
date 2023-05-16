package com.ralap._0120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 118. 杨辉三角
 * <p>
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: numRows = 5
 * 输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * <p>
 * 示例 2:
 * <p>
 * 输入: numRows = 1
 * 输出: [[1]]
 * <p>
 * <p>
 * 提示:
 * <p>
 * 1 <= numRows <= 30
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pascals-triangle
 */
class _118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));
        if (numRows == 1) {
            return result;
        }

        result.add(Arrays.asList(1, 1));
        if (numRows == 2) {
            return result;
        }
        for (int i = 3; i <= numRows; i++) {
            List arr = new ArrayList();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    arr.add(1);
                } else {
                    arr.add(result.get(i - 2).get(j - 1) + result.get(i - 2).get(j));
                }
            }
            result.add(arr);
        }
        return result;

    }
}

