package com.ralap.easy_9_ispalindrome;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPalindrome() {
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(123);
        System.out.println(result);
    }
}