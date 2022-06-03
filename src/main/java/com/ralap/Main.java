package com.ralap;

import com.ralap.easy_1_towsum.Solution;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] a = solution.twoSum(new int[]{1, 2, 3, 4, 7, 9, 11}, 13);
        int[] a = solution.twoSum(new int[]{1, 2, 3, 4, 7, 9, 11}, 13);

        Arrays.stream(a).forEach(System.out::println);
    }
}
