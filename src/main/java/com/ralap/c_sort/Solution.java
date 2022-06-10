package com.ralap.c_sort;

/**
 * 排序
 */
public class Solution {

    /**
     * 冒泡排序
     * 稳定性: 是
     * 时间复杂读: O(N^2)
     * 空间复杂度: O(1)
     */
    public int[] bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSort = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSort = false;
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
            if (isSort) {
                break;
            }
        }
        return arr;
    }

    /**
     * 选择排序
     * 稳定性： 否
     * 时间复杂度：O(N^2)
     * 空间复杂度：O(1)
     */
    public int[] selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[min]) {
                    min = j + 1;
                }
            }
            if (i != min) {
                arr[i] = arr[min] ^ arr[i];
                arr[min] = arr[min] ^ arr[i];
                arr[i] = arr[min] ^ arr[i];
            }
        }
        return arr;
    }

    /**
     * 插入排序
     * 稳定性： 否
     * 时间复杂度：O(N^2)
     * 空间复杂度：O(1)
     */
    public int[] insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        for (int i = 1; i < arr.length; i++) {
            int index = 0;
            int tmp = arr[i];
            for (int j = i; j >= 1; j--) {
                if (arr[j - 1] > tmp) {
                    arr[j] = arr[j - 1];
                } else {
                    index = j;
                    break;
                }
            }
            if (i != index) {
                arr[index] = tmp;
            }
        }
        return arr;
    }

    /**
     * 归并排序
     */
    public int[] mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        int mid = arr.length >> 1;
        int[] left = arr.
    }

}
