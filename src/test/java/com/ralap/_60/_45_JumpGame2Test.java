package com.ralap._60;

import junit.framework.TestCase;

public class _45_JumpGame2Test extends TestCase {

    public void testSolution() {
        _45_JumpGame2 jg = new _45_JumpGame2();
        System.out.println(jg.solution(new int[]{2,3,0,1,4}));
    }

    public void testGreedy() {
        _45_JumpGame2 jg = new _45_JumpGame2();
        System.out.println(jg.greedy(new int[]{2,3,1,1,4}));
    }
}