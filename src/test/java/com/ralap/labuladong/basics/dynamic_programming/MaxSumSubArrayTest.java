package com.ralap.labuladong.basics.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSumSubArrayTest {

    @Test
    public void maxSumSubArray() {
        int[] source = new int[]{-3, 4, -1, 2, -6, 1, 4, -11, 9};
        MaxSumSubArray solution = new MaxSumSubArray();
        System.out.println(solution.maxSumSubArray(source));
    }

    @Test
    public void maxSumSubArray1() {
        int[] source = new int[]{-3, 4, -1, 2, -6, 1, 4, -11, 9};
        MaxSumSubArray solution = new MaxSumSubArray();
        System.out.println(solution.maxSumSubArray1(source));
    }
}