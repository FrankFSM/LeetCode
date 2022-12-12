package com.ralap._40;

import javax.xml.stream.XMLInputFactory;

/**
 * 33. 搜索旋转排序数组
 * <p>
 * 整数数组 nums 按升序排列，数组中的值 互不相同 。
 * <p>
 * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。
 * <p>
 * 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
 * <p>
 * 你必须设计一个时间复杂度为 O(log n) 的算法解决此问题。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [4,5,6,7,0,1,2], target = 0
 * 输出：4
 * 示例 2：
 * <p>
 * 输入：nums = [4,5,6,7,0,1,2], target = 3
 * 输出：-1
 * 示例 3：
 * <p>
 * 输入：nums = [1], target = 0
 * 输出：-1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/search-in-rotated-sorted-array
 */
public class _33_SearchInRotatedSortedArray {

    public int solution(int[] array, int target) {
        int arrLen = array.length;
        if (arrLen == 1) {
            return target == array[0] ? 0 : -1;
        }
        int left = 0;
        int right = arrLen - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int midVal = array[mid];
            if (midVal == target) {
                return mid;
            }
            if (array[left] <= midVal) {
                if (array[left] <= target && array[mid] >= target){
                    right = mid - 1;
                } else {
                    left = mid  + 1 ;
                }
            }else {
                if (array[mid] <= target && array[right] >= target){
                    left = mid + 1;
                } else {
                    right = mid -1;
                }
            }
        }
        return -1;
    }
}