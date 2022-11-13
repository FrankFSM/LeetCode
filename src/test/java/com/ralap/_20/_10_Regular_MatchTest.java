package com.ralap._20;

import junit.framework.TestCase;

public class _10_Regular_MatchTest extends TestCase {

    public void testSolution() {
        _10_Regular_Match rm  = new _10_Regular_Match();
        System.out.println(rm.solution("aab", "c*a*b"));
    }
}