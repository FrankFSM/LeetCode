package com.ralap._40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 31. 下一个排列
 * <p>
 * 整数数组的一个 排列  就是将其所有成员以序列或线性顺序排列。
 * <p>
 * 例如，arr = [1,2,3] ，以下这些都可以视作 arr 的排列：[1,2,3]、[1,3,2]、[3,1,2]、[2,3,1] 。
 * 整数数组的 下一个排列 是指其整数的下一个字典序更大的排列。更正式地，如果数组的所有排列根据其字典顺序从小到大排列在一个容器中，那么数组的 下一个排列 就是在这个有序容器中排在它后面的那个排列。如果不存在下一个更大的排列，那么这个数组必须重排为字典序最小的排列（即，其元素按升序排列）。
 * <p>
 * 例如，arr = [1,2,3] 的下一个排列是 [1,3,2] 。
 * 类似地，arr = [2,3,1] 的下一个排列是 [3,1,2] 。
 * 而 arr = [3,2,1] 的下一个排列是 [1,2,3] ，因为 [3,2,1] 不存在一个字典序更大的排列。
 * 给你一个整数数组 nums ，找出 nums 的下一个排列。
 * <p>
 * 必须 原地 修改，只允许使用额外常数空间。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,3]
 * 输出：[1,3,2]
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,1]
 * 输出：[1,2,3]
 * 示例 3：
 * <p>
 * 输入：nums = [1,1,5]
 * 输出：[1,5,1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/next-permutation
 */
public class _31_NextPermutation {
    List<List<Integer>> result = new ArrayList<>();

    /**
     * 暴力回溯
     *
     * @param nums
     */
    public void solution(int[] nums) {
        if (nums.length == 0) {
            return;
        }
        int[] sourNums = Arrays.stream(nums).sorted().toArray();
        this.allPC(sourNums, new LinkedList<>(), new ArrayList<>());
        int index = -1;
        for (int i = 0; i < result.size(); i++) {
            if (Arrays.equals(result.get(i).stream().mapToInt(item -> item).toArray(), nums)) {
                index = i;
                break;
            }

        }
        int[] n;
        if (index == result.size() - 1) {
            n = result.get(0).stream().mapToInt(item -> item).toArray();
        } else {
            n = result.get(index + 1).stream().mapToInt(item -> item).toArray();
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = n[i];
        }
        Arrays.stream(nums).forEach(System.out::println);
    }

    private void allPC(int[] nums, LinkedList<Integer> res, List<Integer> use) {
        if (res.size() == nums.length) {
            if (!result.contains(res)) {
                result.add(new LinkedList<>(res));
            }
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (use.contains(i)) {
                continue;
            }
            res.add(nums[i]);
            use.add(i);
            this.allPC(nums, res, use);
            res.removeLast();
            use.remove(Integer.valueOf(i));
        }
    }

    /**
     * 技巧
     * @param nums
     */
    public void solution_v2(int[] nums) {
        if (nums.length == 0) {
            return;
        }
        // 找到最后出现的影响递增的数
        int first = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                first = i;
                break;
            }
        }
        // 找到右边大于first的值
        int second = nums.length - 1;
        for (int i = nums.length - 1; i > first; i--) {
            if (nums[i] > nums[first]) {
                second = i;
                break;
            }
        }
        this.swap(nums, first, second);
        this.sort(nums, first + 1);
        Arrays.stream(nums).forEach(System.out::println);
    }

    public void swap(int[] nums, int n1, int n2) {
        int tmp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = tmp;
    }

    public void sort(int[] nums, int start) {
        if (start >= nums.length - 1) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    this.swap(nums, i, j);
                }
            }
        }
    }
}
