package com.ralap.easy_20_isvalid;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isValid() {
        Solution solution = new Solution();
        boolean result = solution.isValid("[]");
        System.out.println(result);
    }
}