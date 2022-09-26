package com.ralap.labuladong.basics.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxEnvelopesTest {

    @Test
    public void solution() {
        MaxEnvelopes maxEnvelopes = new MaxEnvelopes();
        int[][] nums = new int[][]{{5, 4}, {1, 8}, {6, 7}, {5, 2}, {2, 3}, {6, 4}};
        System.out.println(maxEnvelopes.solution(nums));
    }

    @Test
    public void lis() {
        MaxEnvelopes maxEnvelopes = new MaxEnvelopes();
        System.out.println(maxEnvelopes.lis(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
}