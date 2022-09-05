package com.ralap.labuladong.basics.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLISTest {

    @Test
    public void solution() {
        LengthOfLIS solution = new LengthOfLIS();
        System.out.println(solution.solution(new int[]{1, 4, 3, 4, 2, 3}));
    }
}