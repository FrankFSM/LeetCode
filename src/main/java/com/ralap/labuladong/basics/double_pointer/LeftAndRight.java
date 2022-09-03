package com.ralap.labuladong.basics.double_pointer;

public class LeftAndRight {

    /**
     * 二分搜索
     */
    public int binarySearch(int[] array, int target) {
        if (array.length <= 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + right;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 俩数之和
     *
     * @param arr 有序数组
     */
    public int[] towSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left += 1;
            } else {
                right -= 1;
            }

        }
        return null;
    }

    /**
     * 数组反转
     */
    public void reverse(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
