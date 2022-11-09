package com.ralap._20;

import junit.framework.TestCase;

public class _5_LongestPalindromeTest extends TestCase {

    public void testSolution() {
        _5_LongestPalindrome lp = new _5_LongestPalindrome();
        System.out.println(lp.solution("babad"));
    }

    public void testDpSolution() {
        String str = "aacabdkacaa";
        String str1 = "cbbd";
        String str2 = "xaabacxcabaax";
        String str3 = "abacxcaba";

        _5_LongestPalindrome lp = new _5_LongestPalindrome();
        System.out.println(lp.dpSolution(str));
    }
}