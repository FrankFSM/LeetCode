package com.ralap._0020;

import junit.framework.TestCase;

public class _11_ContainerWithMostWaterTest extends TestCase {

    public void testSolution() {
        _11_ContainerWithMostWater cwmw = new _11_ContainerWithMostWater();
        System.out.println(cwmw.solution(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    public void testDoublePointSolution() {
        _11_ContainerWithMostWater cwmw = new _11_ContainerWithMostWater();
        System.out.println(cwmw.doublePointSolution(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}