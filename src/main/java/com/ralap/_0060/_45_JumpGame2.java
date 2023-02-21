package com.ralap._0060;

/**
 * 45. 跳跃游戏 II
 * <p>
 * 给你一个非负整数数组 nums ，你最初位于数组的第一个位置。
 * <p>
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * <p>
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 * <p>
 * 假设你总是可以到达数组的最后一个位置。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [2,3,1,1,4]
 * 输出: 2
 * 解释: 跳到最后一个位置的最小跳跃数是 2。
 *      从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
 * 示例 2:
 * <p>
 * 输入: nums = [2,3,0,1,4]
 * 输出: 2
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/jump-game-ii
 */
public class _45_JumpGame2 {
    public int solution(int[] nums) {
        int[] memory = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            memory[i] = nums.length;
        }
        return dp(nums, 0, memory);
    }

    /**
     * 动态规划
     *
     * @return
     */
    private int dp(int[] nums, int currIndex, int[] memory) {
        // 最后一步
        if (currIndex >= nums.length - 1) {
            return 0;
        }
        if (memory[currIndex] != nums.length) {
            return memory[currIndex];
        }

        for (int i = 1; i <= nums[currIndex]; i++) {
            int subProblem = dp(nums, currIndex + i, memory);
            memory[currIndex] = Math.min(memory[currIndex], subProblem + 1);
        }
        return memory[currIndex];
    }

    public int greedy(int[] nums) {
        int end = 0, farthest = 0, junps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(i + nums[i], farthest);
            if (end == i) {
                junps++;
                end = farthest;
            }
        }
        return junps;
    }

}
