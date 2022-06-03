package com.ralap.easy_13_romantoint;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void romanToInt() {
        Solution solution = new Solution();
        int result = solution.romanToInt("MCMXCIV");
        System.out.println(result);
    }
}