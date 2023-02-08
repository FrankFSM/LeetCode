package com.ralap._80;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 77. 组合
 *
 * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
 *
 * 你可以按 任何顺序 返回答案。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 4, k = 2
 * 输出：
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 * 示例 2：
 *
 * 输入：n = 1, k = 1
 * 输出：[[1]]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/combinations
 */
public class _77_Combinations {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> solution(int n, int k) {
        LinkedList nums = new LinkedList();
        this.backtracking(nums, n, k);
        return result;
    }

    private void backtracking(LinkedList<Integer> nums, int n, int k) {
        if (nums.size() == k) {
            result.add(new ArrayList<>(nums));
            return;
        }
        for (int i = nums.size() + 1; i <= n; i++) {
            if(nums.contains(i) || (nums.size()>0 && i < nums.getLast())){
                continue;
            }
            nums.addLast(i);
            backtracking(nums, n, k);
            nums.removeLast();
        }
    }

}
