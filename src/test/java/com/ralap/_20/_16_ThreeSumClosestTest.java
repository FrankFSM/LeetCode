package com.ralap._20;

import junit.framework.TestCase;

public class _16_ThreeSumClosestTest extends TestCase {

    public void testSolution() {
        _16_ThreeSumClosest tsc = new _16_ThreeSumClosest();
        System.out.println(tsc.solution(new int[]{0,0,0}, 1));
    }

    public void testDoublePoint() {
        _16_ThreeSumClosest tsc = new _16_ThreeSumClosest();
        System.out.println(tsc.doublePoint(new int[]{-1,2,1,-4}, 1));
    }
}