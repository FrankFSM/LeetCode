package com.ralap._0080;

import junit.framework.TestCase;

public class _76_MinimumWindowSubstringTest extends TestCase {

    public void testSolution() {
        _76_MinimumWindowSubstring mws = new _76_MinimumWindowSubstring();
        System.out.println(mws.solution("ADOBECODEBANC", "ABC"));
        System.out.println(mws.solution("a", "aa"));

    }
}