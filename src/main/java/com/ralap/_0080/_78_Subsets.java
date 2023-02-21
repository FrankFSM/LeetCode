package com.ralap._0080;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 78. 子集
 *
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3]
 * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * 示例 2：
 *
 * 输入：nums = [0]
 * 输出：[[],[0]]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/subsets
 */
public class _78_Subsets {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> solution(int[] nums) {
        this.backtracking(nums, new LinkedList<>(), 0);
        return result;
    }

    private void backtracking(int[] nums, LinkedList<Integer> list, int count) {
        if (nums.length == count) {
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[count]);
        backtracking(nums, list, count + 1);
        list.removeLast();
        backtracking(nums, list, count + 1);
    }


}
