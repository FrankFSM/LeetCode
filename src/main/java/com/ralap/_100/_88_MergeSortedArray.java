package com.ralap._100;

import java.util.Arrays;

public class _88_MergeSortedArray {
    public void solution(int[] nums1, int m, int[] nums2, int n) {
        int curr = 0;
        while (curr < n) {
            nums1[m + curr] = nums2[curr];
            curr++;
        }
        Arrays.sort(nums1);
    }
}
