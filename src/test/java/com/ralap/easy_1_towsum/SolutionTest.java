package com.ralap.easy_1_towsum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void twoSum() {
        int[] result = solution.twoSum(new int[]{1, 2, 3, 5, 7, 9, 11}, 13);
        Arrays.stream(result).forEach(System.out::println);
    }

    @Test
    public void twoSumHash() {
        int[] resultHash = solution.twoSumHash(new int[]{1, 2, 3, 5, 7, 9, 11}, 13);
        Arrays.stream(resultHash).forEach(System.out::println);

    }
}