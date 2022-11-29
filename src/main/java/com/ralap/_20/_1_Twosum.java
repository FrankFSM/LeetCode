package com.ralap._20;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 俩数之和
 * <p>
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/two-sum
 */
public class _1_Twosum {

    /**
     * 通过HashMap
     */
    public int[] solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            if (map.get(another) != null) {
                return new int[]{i, map.get(another)};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
