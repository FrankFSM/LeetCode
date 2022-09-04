package com.ralap.labuladong.basics.double_pointer;

public class LeftAndRight {


    /**
     * 二分搜索-最右
     */
    public int rightBinarySearch(int[] array, int target) {
        if (array.length <= 0) {
            return -1;
        }
        int left = 0, right = array.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                left = mid + 1;
            } else if (array[mid] > target) {
                right = mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            }
        }
        return right - 1;
    }

    /**
     * 二分搜索-最左
     */
    public int leftBinarySearch(int[] array, int target) {
        if (array.length <= 0) {
            return -1;
        }
        int left = 0, right = array.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                right = mid;
            } else if (array[mid] > target) {
                right = mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            }
        }
//        return left;
        if (left == array.length) {
            return -1;
        }

        return array[left] == target ? left : -1;
    }

    /**
     * 二分搜索-最左
     * [left, right]
     */
    public int leftBound(int[] array, int target) {
        if (array.length <= 0) {
            return -1;
        }
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                // 右收缩
                right = mid - 1;
            } else if (target > array[mid]) {
                left = mid + 1;
            } else if (target < array[mid]) {
                right = mid - 1;
            }
        }
        // 已经到最最右,防止越界 ｜ 没有找到
        if (left == array.length || array[left] != target) {
            return -1;
        }
        return left;
    }

    /**
     * 二分搜索-最右
     */
    public int rightBound(int[] array, int target) {
        if (array.length <= 0) {
            return -1;
        }
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                left = mid + 1;
            } else if (target > array[mid]) {
                left = mid + 1;
            } else if (target < array[mid]) {
                right = mid - 1;
            }
        }
        // 已经到最最右,防止越界 ｜ 没有找到
        if (right < 0 || array[right] != target) {
            return -1;
        }
        return right;

    }

    /**
     * 二分搜索
     * [left, right]
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
