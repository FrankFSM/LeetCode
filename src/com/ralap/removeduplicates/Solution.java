package com.ralap.removeduplicates;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 26. 删除有序数组中的重复项
 * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
 * 由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，那么 nums 的前 k 个元素应该保存最终结果。
 * 将最终结果插入 nums 的前 k 个位置后返回 k 。
 * 不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int result = solution.removeDuplicates(new int[]{0, 0, 1, 1, 2, 2, 3, 3, 3, 4, 4});
        int result = solution.removeDuplicationsDoublePointer(new int[]{0, 0, 1, 1, 2, 2, 3, 3, 3, 4, 4});
        System.out.println(result);

    }

    /**
     * 快慢指针
     * 时间复杂度O(N)
     * 空间复杂度O(1)
     */
    public int removeDuplicationsDoublePointer(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        }
        // 快：遍历，慢：赋值
        int fast = 1, slow = 1;
        while (fast < nums.length) {
            // 与上一个比较
            if (nums[fast] != nums[fast - 1]) {
                // 不相等，赋值，慢指针后移
                nums[slow] = nums[fast];
                slow++;
            }
            // 快指针后移
            fast++;
        }
        return slow;
    }

    /**
     * 通过计算移动位数
     * 时间复杂度O(N)
     * 空间复杂度O(1)
     */
    public int removeDuplicates(int[] nums) {
        int needMoveCounts = 0;
        int currNumber = -1;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                currNumber = nums[0];
                continue;
            }

            // 如果与上一个数相同
            if (nums[i] == currNumber) {
                needMoveCounts++;
                continue;
            }
            nums[i - needMoveCounts] = nums[i];
            currNumber = nums[i];
        }
        return nums.length - needMoveCounts;
    }
}
