package com.ralap.easy_14_longestcommonprefix;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestCommonPrefix() {
        Solution solution = new Solution();
        String[] strs = new String[]{"flower", "flow", "flight"};
        String result = solution.longestCommonPrefix(strs);

        System.out.println(result);
    }
}