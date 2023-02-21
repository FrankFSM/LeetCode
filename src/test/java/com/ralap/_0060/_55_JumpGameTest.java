package com.ralap._0060;

import junit.framework.TestCase;

public class _55_JumpGameTest extends TestCase {

    public void testSolution() {
        _55_JumpGame jg = new _55_JumpGame();
        System.out.println(jg.solution(new int[]{0}));
        System.out.println(jg.solution(new int[]{2,3,1,1,4}));
        System.out.println(jg.solution(new int[]{3,2,1,0,4}));
        System.out.println(jg.solution(new int[]{2,0,0}));

    }

    public void testSolution2() {
        _55_JumpGame jg = new _55_JumpGame();
        System.out.println(jg.solution2(new int[]{0}));
        System.out.println(jg.solution2(new int[]{2,3,1,1,4}));
        System.out.println(jg.solution2(new int[]{3,2,1,0,4}));
        System.out.println(jg.solution2(new int[]{2,0,0}));
    }
}