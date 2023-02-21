package com.ralap._0100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 90. 子集 II
 * <p>
 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 * <p>
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,2]
 * 输出：[[],[1],[1,2],[1,2,2],[2],[2,2]]
 * 示例 2：
 * <p>
 * 输入：nums = [0]
 * 输出：[[],[0]]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/subsets-ii
 */
public class _90_Subsets2 {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> solution(int[] nums) {
        Arrays.sort(nums);
        this.backtracking(nums, new LinkedList<>(), 0, false);
        return result;
    }

    public void backtracking(int[] nums, LinkedList<Integer> list, int count, boolean isChoose) {
        if (count == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        backtracking(nums, list, count + 1, false);
        if (!isChoose && count > 0 && nums[count] == nums[count - 1]){
            return;
        }
        list.add(nums[count]);
        backtracking(nums, list, count + 1, true);
        list.removeLast();
    }


}
