package com.ralap.easy_28_strstr;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution;
    private int result;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(result);

    }

    @Test
    public void strStr() {
        result = solution.strStr("hello", "ll");
    }
}