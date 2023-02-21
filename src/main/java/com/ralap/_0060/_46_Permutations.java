package com.ralap._0060;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 46. 全排列
 *
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * 示例 2：
 *
 * 输入：nums = [0,1]
 * 输出：[[0,1],[1,0]]
 * 示例 3：
 *
 * 输入：nums = [1]
 * 输出：[[1]]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/permutations
 */
public class _46_Permutations {
    public List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> solution(int[] nums) {
        this.backtracking(nums, new LinkedList<>());
        return res;
    }

    private void backtracking(int[] nums, LinkedList<Integer> list) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            this.backtracking(nums, list);
            list.removeLast();
        }
    }
}
