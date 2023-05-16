package com.ralap._0120;

import javax.xml.transform.stax.StAXResult;
import java.util.*;

/**
 * 120. 三角形最小路径和
 * <p>
 * 给定一个三角形 triangle ，找出自顶向下的最小路径和。
 * 每一步只能移动到下一行中相邻的结点上。相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。也就是说，如果正位于当前行的下标 i ，那么下一步可以移动到下一行的下标 i 或 i + 1 。
 * <p>
 * 示例 1：
 * <p>
 * 输入：triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
 * 输出：11
 * 解释：如下面简图所示：
 * 2
 * 3 4
 * 6 5 7
 * 4 1 8 3
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 * <p>
 * 示例 2：
 * <p>
 * 输入：triangle = [[-10]]
 * 输出：-10
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= triangle.length <= 200
 * triangle[0].length == 1
 * triangle[i].length == triangle[i - 1].length + 1
 * -104 <= triangle[i][j] <= 104
 * <p>
 * <p>
 * 进阶：
 * <p>
 * 你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题吗？
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/triangle
 */
class _120_Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
//        return this.btMinimumTotal(triangle);
        return dp(triangle);

    }

    public int dp(List<List<Integer>> triangle) {
        int rowCount = triangle.size();
        int colCount = triangle.get(rowCount - 1).size();
        int[][] dp = new int[rowCount][colCount];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < rowCount; i++) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j < row.size(); j++) {
                int preLayer = 0;
                if (j == 0) {
                    preLayer = dp[i - 1][j];
                }else if (j == row.size() -1){
                    preLayer = dp[i - 1][j - 1];
                }else {
                    preLayer = Math.min(dp[i - 1][j], dp[i - 1][j - 1]);
                }
                dp[i][j] = preLayer + triangle.get(i).get(j);
            }
        }
         return Arrays.stream(dp[rowCount-1]).min().getAsInt();
    }


    /**
     * 回溯
     */
    List<List<Integer>> result = new ArrayList<>();

    private int btMinimumTotal(List<List<Integer>> triangle) {

        LinkedList<Integer> arr = new LinkedList<>();
        arr.add(triangle.get(0).get(0));
        this.getList(triangle, arr, 1, 0);
        return result.stream().mapToInt(subList -> subList.stream().mapToInt(Integer::intValue).sum()).min().getAsInt();
    }

    private void getList(List<List<Integer>> triangle, LinkedList<Integer> arr, int layer, int index) {
        if (arr.size() == triangle.size()) {
            result.add(new ArrayList<>(arr));
            return;
        }

        List<Integer> currLayerArr = triangle.get(layer);
        arr.add(currLayerArr.get(index));
        this.getList(triangle, arr, layer + 1, index);
        arr.removeLast();
        arr.add(currLayerArr.get(index + 1));
        this.getList(triangle, arr, layer + 1, index + 1);
        arr.removeLast();
    }
}

