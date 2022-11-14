package com.ralap._20;

/**
 * 11. 盛最多水的容器
 * <p>
 * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 * <p>
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 返回容器可以储存的最大水量。
 * <p>
 * 说明：你不能倾斜容器。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _11_ContainerWithMostWater {

    /**
     * 暴力解决
     * @param height
     * @return
     */
    public int solution(int[] height) {
        if (height.length <= 1) {
            return 0;
        }

        int maxWater = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int minVal = Math.min(height[i], height[j]);
                maxWater = Math.max(maxWater, minVal * (j - i));
            }
        }
        return maxWater;
    }

    /**
     * 双指针
     * @param height
     * @return
     */
    public int doublePointSolution(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (right > left) {
            int val = (right - left) * (Math.min(height[left], height[right]));
            max = Math.max(max, val);
            // 小的往回收缩
            if (height[left] <= height[right]) {
                left++;
            }else {
                right--;
            }
        }
        return max;
    }
}
