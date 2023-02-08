package com.ralap._20;

/**
 * 4. 寻找两个正序数组的中位数
 * <p>
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 * <p>
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/median-of-two-sorted-arrays
 */
public class _04_FindMedianSortedArrays {

    public double solution(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0) {
            return 0;
        }
        int n1 = 0, n2 = 0, currCount= 0;
        int sumSize = nums1.length + nums2.length;
        // 中位数index
        int midIndex = sumSize / 2;
        // 合并后的数组
        int[] newNums = new int[midIndex + 1];
        // 只计算前midIndex
        while (currCount <= midIndex) {
            if (n1 >= nums1.length) {               // nums1已到最后
                newNums[currCount] = nums2[n2];
                n2++;
            } else if (n2 >= nums2.length) {        // nums2已到最后
                newNums[currCount] = nums1[n1];
                n1++;
            }else {
                // 选最小的放入数组
                if (nums1[n1] < nums2[n2]) {
                    newNums[currCount] = nums1[n1];
                    n1++;
                } else {
                    newNums[currCount] = nums2[n2];
                    n2++;
                }
            }
            currCount++;
        }

        // 区分奇偶
        if (sumSize % 2 == 0) {
            return (newNums[midIndex] + newNums[midIndex - 1]) / 2.0;
        } else {
            return newNums[midIndex];
        }
    }
}
