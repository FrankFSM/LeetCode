package com.ralap.towsum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 俩数之和
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] resultHash = solution.twoSumHash(new int[]{1, 2, 3, 5, 7, 9, 11}, 13);
        int[] result = solution.twoSum(new int[]{1, 2, 3, 5, 7, 9, 11}, 13);

        Arrays.stream(resultHash).forEach(System.out::println);
        Arrays.stream(result).forEach(System.out::println);

    }

    /**
     * 暴力枚举
     * 时间复杂度O(N^2)
     * 空间复杂度O(1)
     */
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2)
            return new int[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // 不存在,返回null
        return null;
    }

    /**
     * Hash表
     * 时间复杂度O(N)
     * 空间复杂度O(N)
     */
    public int[] twoSumHash(int[] nums, int target) {
        // 非法参数校验
        if (nums == null || nums.length < 2)
            return null;
        // 以值为Map的键,下标为Map的值
        Map<Integer, Integer> map = new HashMap(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            if (map.containsKey(other)) {
                return new int[]{i, map.get(other)};
            }
            map.put(nums[i], i);
        }
        // 不存在,返回null
        return null;
    }
}
