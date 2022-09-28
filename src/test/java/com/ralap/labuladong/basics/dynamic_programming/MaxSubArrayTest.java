package com.ralap.labuladong.basics.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSubArrayTest {

    @Test
    public void solution() {
        MaxSubArray maxSubArray = new MaxSubArray();
        System.out.println(maxSubArray.solution(new int[]{-3, 1, 3, -1, 2, - 4, 2}));
    }

    @Test
    public void solutionCompress() {
        MaxSubArray maxSubArray = new MaxSubArray();
        System.out.println(maxSubArray.solutionCompress(new int[]{-3, 1, 3, -1, 2, -4, 2}));
    }
}