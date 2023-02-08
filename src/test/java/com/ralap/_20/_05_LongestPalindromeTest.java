package com.ralap._20;

import junit.framework.TestCase;

public class _05_LongestPalindromeTest extends TestCase {

    public void testSolution() {
        _05_LongestPalindrome lp = new _05_LongestPalindrome();
        System.out.println(lp.solution("babad"));
    }

    public void testDpSolution() {
        String str = "aacabdkacaa";
        String str1 = "cbbd";
        String str2 = "xaabacxcabaax";
        String str3 = "abacxcaba";

        _05_LongestPalindrome lp = new _05_LongestPalindrome();
        System.out.println(lp.dpSolution(str));
    }


    public void testCentreExpandSolution() {
        String str = "aacabdkacaa";
        String str1 = "cbbd";
        String str2 = "xaabacxcabaax";
        String str3 = "abacxcaba";
        String str4 = "axaabacxcabaax";
        String str5 = "bb";

        _05_LongestPalindrome lp = new _05_LongestPalindrome();
        System.out.println(lp.centreExpandSolution(str4));
    }
}