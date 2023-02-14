package com.ralap._100;

import junit.framework.TestCase;

public class _84_LargestRectangleInHistogramTest extends TestCase {

    public void testSolution() {
        _84_LargestRectangleInHistogram lrih = new _84_LargestRectangleInHistogram();
//        System.out.println(lrih.solution(new int[]{2, 1, 5, 6, 2, 3}));
        System.out.println(lrih.solution(new int[]{2, 1, 2}));

    }

    public void testStackSolution() {
        _84_LargestRectangleInHistogram lrih = new _84_LargestRectangleInHistogram();
        System.out.println(lrih.stackSolution(new int[]{2, 1, 5, 6, 2, 3}));

    }
}