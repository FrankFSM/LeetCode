package com.ralap._0120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 119. 杨辉三角 II
 * <p>
 * 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
在「杨辉三角」中，每个数是它左上方和右上方的数的和。

 
示例 1:

输入: rowIndex = 3
输出: [1,3,3,1]

示例 2:

输入: rowIndex = 0
输出: [1]

示例 3:

输入: rowIndex = 1
输出: [1,1]

 
提示:

0 <= rowIndex <= 33

 
进阶：
你可以优化你的算法到 O(rowIndex) 空间复杂度吗？

 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pascals-triangle-ii
 */
class _119_PascalsTriangleIi {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));
        result.add(Arrays.asList(1, 1));
        for (int i = 2; i <= rowIndex; i++) {
            List arr = new ArrayList();
            for (int j = 0; j <=  i; j++) {
                if (j == 0 || j == i ) {
                    arr.add(1);
                } else {
                    arr.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(arr);
        }
        return result.get(rowIndex);

    }
}

