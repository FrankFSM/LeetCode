package com.ralap.labuladong.basics.dynamic_programming;

import org.junit.Test;

public class LengthOfLISTest {

    @Test
    public void solution() {
        LengthOfLIS solution = new LengthOfLIS();
        System.out.println(solution.lengthOfLIS(new int[]{1, 4, 3, 4, 2, 3}));
    }

    @Test
    public void maxEnvelopes() {
        int[][] envelopes = new int[][]{
                {5, 4},
                {6,4},
                {6,7},
                {2,3},
                {1,8},
                {5,2}
        };
        LengthOfLIS solution = new LengthOfLIS();
        System.out.println(solution.maxEnvelopes(envelopes));
    }
}