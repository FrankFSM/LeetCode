package com.ralap.weekly_race;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _6359 {
    public int solution(int num) {
        String str = String.valueOf(num);
        StringBuffer sb = new StringBuffer(str);
        char n = sb.charAt(0);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == n) {
                sb.setCharAt(i, '0');
            }
        }
        int min = Integer.valueOf(sb.toString());

        StringBuffer sb1 = new StringBuffer(str);

        char n1 = sb1.charAt(0);
        for (int i = 0; i < sb1.length(); i++) {
            if (sb1.charAt(i) != '9') {
                n1 = sb1.charAt(i);
                break;
            }
        }
        for (int i = 0; i < sb1.length(); i++) {
            if (sb1.charAt(i) == n1) {
                sb1.setCharAt(i, '9');
            }
        }
        int max = Integer.valueOf(sb1.toString());
        return max - min;

    }


    public int solution1(int[] nums) {
        Arrays.sort(nums);
        if (nums.length <= 2) {
            return 0;
        }

        int max1 = nums[nums.length - 1] - nums[2];
        int max2 = nums[nums.length - 3] - nums[0];
        int max3 = nums[nums.length - 2] - nums[1];

        return Math.min(Math.min(max1, max2), max3);
    }

    public int solution2(int[] nums) {
        Arrays.sort(nums);
        if (nums.length <= 2) {
            return 0;
        }

        int max1 = nums[nums.length - 1] - nums[2];
        int max2 = nums[nums.length - 3] - nums[0];
        int max3 = nums[nums.length - 2] - nums[1];

        return Math.min(Math.min(max1, max2), max3);
    }

    List<List<Integer>> result = new ArrayList<>();



        public int solution3(int[] nums) {
                Arrays.sort(nums);
                int maxExprVal = 0;
                for (int num : nums) {
                    if (num > maxExprVal + 1) {
                        break;
                    }
                    maxExprVal |= num;
                }
                return maxExprVal + 1;
            }



    public long[] handleQuery(int[] nums1, int[] nums2, int[][] queries) {
        int n = nums1.length;
        int m = queries.length;
        long[] ans = new long[m];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums2[i];
        }
        for (int i = 0; i < m; i++) {
            int[] query = queries[i];
            int op = query[0];
            int l = query[1];
            int r = query[2];
            if (op == 1) {
                for (int j = l; j <= r; j++) {
                    nums1[j] ^= 1;
                    if (nums1[j] == 1) {
                        sum++;
                    } else {
                        sum--;
                    }
                }
            } else if (op == 2) {
                for (int j = 0; j < n; j++) {
                    if (nums1[j] == 1) {
                        nums2[j] += l;
                        sum += l;
                    }
                }
            } else {
                ans[i] = sum;
            }
        }
        return ans;
    }
}
