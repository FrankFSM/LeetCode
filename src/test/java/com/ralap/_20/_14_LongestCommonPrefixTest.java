package com.ralap._20;

import junit.framework.TestCase;

public class _14_LongestCommonPrefixTest extends TestCase {

    public void testSolution() {
        _14_LongestCommonPrefix lcp = new _14_LongestCommonPrefix();
        System.out.println(lcp.solution(new String[]{"a","ab"}));
    }

    public void testDivideAndConquerSolution() {
        _14_LongestCommonPrefix lcp = new _14_LongestCommonPrefix();
        System.out.println(lcp.divideAndConquerSolution(new String[]{"aaa",""}));
    }
}