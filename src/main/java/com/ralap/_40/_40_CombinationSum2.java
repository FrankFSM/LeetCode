package com.ralap._40;

import java.util.*;

/**
 * 39. 组合总和
 * <p>
 * 给你一个 无重复元素 的整数数组 candidates 和一个目标整数 target ，找出 candidates 中可以使数字和为目标数 target 的 所有 不同组合 ，并以列表形式返回。你可以按 任意顺序 返回这些组合。
 * <p>
 * candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。 
 * <p>
 * 对于给定的输入，保证和为 target 的不同组合数少于 150 个。
 * <p>
 * 示例 1：
 * <p>
 * 输入：candidates = [2,3,6,7], target = 7
 * 输出：[[2,2,3],[7]]
 * 解释：
 * 2 和 3 可以形成一组候选，2 + 2 + 3 = 7 。注意 2 可以使用多次。
 * 7 也是一个候选， 7 = 7 。
 * 仅有这两种组合。
 * 示例 2：
 * <p>
 * 输入: candidates = [2,3,5], target = 8
 * 输出: [[2,2,2,2],[2,3,3],[3,5]]
 * 示例 3：
 * <p>
 * 输入: candidates = [2], target = 1
 * 输出: []
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/combination-sum
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
