package com.ralap._0140;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 128. 最长连续序列
 * <p>
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [100,4,200,1,3,2]
 * 输出：4
 * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
 * 示例 2：
 * <p>
 * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
 * 输出：9
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-consecutive-sequence
 */
class _128_LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> dict = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());
        int max = 0;
        for (Integer num : dict) {
            // 如果包含前一个数据，不需要计算
            if (dict.contains(num)) {
                if (!dict.contains(num - 1)) {
                    int count = 0;
                    while (dict.contains(num)) {
                        count++;
                        num++;
                    }
                    max = Math.max(count, max);
                }
            }
        }
        return max;
    }
}

