package com.ralap._0040;

import java.util.*;

/**
 * 40. 组合总和 II
 * 给定一个候选人编号的集合 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的每个数字在每个组合中只能使用 一次 。
 *
 * 注意：解集不能包含重复的组合。 
 *
 *  
 *
 * 示例 1:
 *
 * 输入: candidates = [10,1,2,7,6,1,5], target = 8,
 * 输出:
 * [
 * [1,1,6],
 * [1,2,5],
 * [1,7],
 * [2,6]
 * ]
 * 示例 2:
 *
 * 输入: candidates = [2,5,2,1,2], target = 5,
 * 输出:
 * [
 * [1,2,2],
 * [5]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/combination-sum-ii
 */
public class _40_CombinationSum2 {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> solution(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.backtracking(candidates, new LinkedList<>(), target, 0, candidates.length - 1);
        return result;
    }

    public void backtracking(int[] nums, LinkedList<Integer> res, int target, int start, int end) {
        int sum = this.listSum(res);
        if (sum > target) {
            return;
        }
        if (sum == target) {
            result.add(new ArrayList<>(res));
            return;
        }
        for (int i = start; i <= end; i++) {
            if (sum + nums[i] > target) {
                break;
            }
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            res.add(nums[i]);
            // 去除上层已经选择过的，剪枝
            backtracking(nums, res, target, i + 1, end);
            res.removeLast();
        }
    }

    public int listSum(LinkedList<Integer> list) {
        return list.stream().reduce(0, Integer::sum);
    }

}
