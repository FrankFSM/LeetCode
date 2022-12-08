package com.ralap._60;

import junit.framework.TestCase;

public class _44_WildcardMatchingTest extends TestCase {

    public void testSolution() {
        _44_WildcardMatching wm = new _44_WildcardMatching();
//        System.out.println(wm.solution("acdcb", "a*c?b"));
//        System.out.println(wm.solution("cb", "?b"));
//        System.out.println(wm.solution("adceb", "*a*b"));
        System.out.println(wm.solution("aa", "*"));
    }
}