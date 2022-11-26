package com.ralap._40;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 * <p>
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 * <p>
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * <p>
 * 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 * 示例 2：
 * <p>
 * 输入：nums = [5,7,7,8,8,10], target = 6
 * 输出：[-1,-1]
 * 示例 3：
 * <p>
 * 输入：nums = [], target = 0
 * 输出：[-1,-1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array
 */
public class _34_FindFirstAndLastPositionOfElementInSortedArray {

    public int[] solution(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int start = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                start = mid;
                break;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (start == -1) {
            return new int[]{-1, -1};
        }
        int first = start, second = start;
        while (first > 0 || second < nums.length - 1) {

            if (second == nums.length - 1 || (nums[second + 1] != target)
                    && (first == 0 || nums[first - 1] != target)) {
                break;
            }
            if (first > 0 && nums[first - 1] == target) {
                first--;
            }

            if (second < nums.length - 1 && nums[second + 1] == target) {
                second++;
            }
        }
        return new int[]{first, second};

    }
}
