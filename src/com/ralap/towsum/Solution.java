package com.ralap.towsum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

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
        return new int[0];
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
        Map<Integer, Integer> map = new HashMap(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int other= target - nums[i];
            if (map.containsKey(other)) {
                return new int[]{i,map.get(other)};
            }
            map.put(nums[i],i);
        }
        // 不存在
        return null;
    }
}
