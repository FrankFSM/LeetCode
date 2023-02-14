package com.ralap.weekly_race;

import java.util.Arrays;

public class _332 {

    public long solution(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        long sum = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            int first = nums[i];
            int last = nums[nums.length - 1 - i];
            int digit = 1;
            int tmp = last;
            while (tmp >= 10) {
                tmp /= 10;
                digit++;
            }
            sum += (long) (first * (Math.pow(10, digit)) + last);

        }
        if (nums.length % 2 != 0) {
            sum += nums[nums.length / 2];
        }
        return sum;
    }

    public long solution2(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;
        // 找到边界
        for (int i = 0; i < nums.length - 1; i++) {
            int start = lower - nums[i];
            int end = upper - nums[i];
            int startIndex = this.lower(nums, start, i + 1);
            int endIndex = this.upper(nums, end, i + 1);
            count += (endIndex - startIndex + 1);
        }
        return count;
    }

    /**
     * 下限
     *
     * @param nums
     * @return
     */
    private int lower(int[] nums, int tag, int start) {
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if ( nums[mid] < tag) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }


    /**
     * 下限
     *
     * @param nums
     * @return
     */
    private int upper(int[] nums, int tag, int start) {
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > tag) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

}
