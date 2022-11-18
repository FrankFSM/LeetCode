package com.ralap._20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 18. 四数之和
 * <p>
 * 给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[b], nums[c], nums[d]] （若两个四元组元素一一对应，则认为两个四元组重复）：
 * <p>
 * 0 <= a, b, c, d < n
 * a、b、c 和 d 互不相同
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * 你可以按 任意顺序 返回答案 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,0,-1,0,-2,2], target = 0
 * 输出：[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 * 示例 2：
 * <p>
 * 输入：nums = [2,2,2,2,2], target = 8
 * 输出：[[2,2,2,2]]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/4sum
 */
public class _18_FourSum {

    public List<List<Integer>> solution(int[] nums, int target) {
        List<List<Integer>> resultList = new ArrayList<>();

        if(nums.length < 4){
            return resultList;
        }
        Arrays.sort(nums);
        int numsLen = nums.length;
        if (((long) nums[0] + nums[1] + nums[2] + nums[3]) > target
                || ((long) nums[numsLen - 1] + nums[numsLen - 2] + nums[numsLen - 3] + nums[numsLen - 4]) < target) {
            return resultList;
        }
        for (int i = 0; i < numsLen; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < numsLen; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int left = j + 1;
                int right = numsLen - 1;

                while (left < right) {
                    if (left > j + 1 && nums[left] == nums[left - 1]) {
                        left++;
                        continue;
                    }
                    if (right < numsLen - 1 && nums[right] == nums[right + 1]) {
                        right--;
                        continue;
                    }
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        List<Integer> result = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
                        resultList.add(result);
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return resultList;
    }
}
