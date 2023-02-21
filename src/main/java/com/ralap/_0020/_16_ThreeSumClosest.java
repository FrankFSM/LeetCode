package com.ralap._0020;

import java.util.Arrays;

/**
 * 16. 最接近的三数之和
 * <p>
 * 给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。
 * <p>
 * 返回这三个数的和。
 * <p>
 * 假定每组输入只存在恰好一个解。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 * 示例 2：
 * <p>
 * 输入：nums = [0,0,0], target = 1
 * 输出：0
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/3sum-closest
 */
public class _16_ThreeSumClosest {

    /**
     * 暴力解
     *
     * @param nums
     * @param target
     * @return
     */
    public int solution(int[] nums, int target) {
        int numSize = nums.length;
        if (numSize < 2) {
            return 0;
        }
        int colsest = Integer.MAX_VALUE;
        for (int i = 0; i < numSize - 2; i++) {
            for (int j = i + 1; j < numSize - 1; j++) {
                for (int k = j + 1; k < numSize; k++) {
                    int s = target - nums[i] - nums[j] - nums[k];
                    colsest = Math.abs(colsest) > Math.abs(s) ? s : colsest;
                }
            }
        }
        return target - colsest;
    }

    /**
     * 排序 + 双指针
     * @param nums
     * @param target
     * @return
     */
    public int doublePoint(int[] nums, int target) {
        int numSize = nums.length;
        if (numSize < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int min = nums[0] + nums[1] + nums[2];
        for (int first = 0; first < numSize; first++) {
            int left = first + 1;
            int right = numSize - 1;
            while (right > left) {
                int sum = nums[first] + nums[left] + nums[right];
                //  取距离小的
                min = Math.abs(target - sum) < Math.abs(target - min) ? sum : min;
                if(target > sum){
                    // 总和小于target， 让sum增大
                    left++;
                } else {
                    // 总和大于等于target， 让sum减小
                    right--;
                }
            }
        }
        return min;
    }
}
