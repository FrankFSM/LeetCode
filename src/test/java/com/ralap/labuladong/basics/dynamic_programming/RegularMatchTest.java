package com.ralap.labuladong.basics.dynamic_programming;

import junit.framework.TestCase;

public class RegularMatchTest extends TestCase {

    public void testSolution() {
        RegularMatch rm = new RegularMatch();
        System.out.println(rm.solution("zaaab", ".a*b*"));
    }
}