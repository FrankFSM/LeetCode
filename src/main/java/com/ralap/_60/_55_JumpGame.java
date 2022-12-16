package com.ralap._60;

/**
 * 55. 跳跃游戏
 * <p>
 * 给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
 * <p>
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * <p>
 * 判断你是否能够到达最后一个下标。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,3,1,1,4]
 * 输出：true
 * 解释：可以先跳 1 步，从下标 0 到达下标 1, 然后再从下标 1 跳 3 步到达最后一个下标。
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,1,0,4]
 * 输出：false
 * 解释：无论怎样，总会到达下标为 3 的位置。但该下标的最大跳跃长度是 0 ， 所以永远不可能到达最后一个下标。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/jump-game
 */
public class _55_JumpGame {


    /**
     * 贪心
     * @param nums
     * @return
     */
    public boolean solution2(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            // 嫩不能跨过i
            if (pos >= i) {
                pos = Math.max(pos, i + nums[i]);
                if (pos >= nums.length-1) {
                    return true;
                }
            }
        }
        return false;
    }


    public boolean canJump;
    public boolean solution(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        canJump = false;
        this.backtracking(nums, 0, 0);
        return canJump;
    }
    /**
     * 回溯
     *
     * @param nums
     * @param pos
     * @param start
     */
    public void backtracking(int[] nums, int pos, int start) {
        if (pos >= nums.length - 1) {
            canJump = true;
            return;
        }

        for (int j = nums[pos]; j >= 1; j--) {
            if (canJump) {
                return;
            }
            pos += j;
            backtracking(nums, pos, start + 1);
            pos -= j;
        }
    }
}
