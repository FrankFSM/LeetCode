package com.ralap._60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 47. 全排列 II
 * <p>
 * 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,1,2]
 * 输出：
 * [[1,1,2],
 * [1,2,1],
 * [2,1,1]]
 * 示例 2：
 * <p>
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/permutations-ii
 */
public class _47_permutations2 {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> solution(int[] nums) {
        Arrays.sort(nums);
        this.backtracking(nums, new LinkedList<>(), new ArrayList<>());
        return res;
    }

    private void backtracking(int[] nums, LinkedList<Integer> list, List<Integer> used) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(used.contains(i)){
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !used.contains(i-1)) {
                continue;
            }
            used.add(i);
            list.add(nums[i]);
            backtracking(nums, list, used);
            list.removeLast();
            used.remove(Integer.valueOf(i));
        }
    }


}
