package com.ralap.labuladong.basics.dynamic_programming;

import junit.framework.TestCase;

public class LongestPalindromeSubSeqTest extends TestCase {

    public void testSolution() {
        LongestPalindromeSubSeq lps = new LongestPalindromeSubSeq();
        System.out.println(lps.solution("aecaacdea"));
    }

    public void testMinInsert() {
        LongestPalindromeSubSeq lps = new LongestPalindromeSubSeq();
        System.out.println(lps.minInsert("abced"));
    }
}