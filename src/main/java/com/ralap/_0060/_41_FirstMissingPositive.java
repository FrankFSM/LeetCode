package com.ralap._0060;

import java.util.HashSet;
import java.util.Set;

/**
 * 41. 缺失的第一个正数
 * <p>
 * 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
 * <p>
 * 请你实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案。
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,0]
 * 输出：3
 * 示例 2：
 * <p>
 * 输入：nums = [3,4,-1,1]
 * 输出：2
 * 示例 3：
 * <p>
 * 输入：nums = [7,8,9,11,12]
 * 输出：1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/first-missing-positive
 */
public class _41_FirstMissingPositive {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                set.add(nums[i]);
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return nums.length + 1;
    }

}
