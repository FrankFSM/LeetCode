package com.ralap._80;

import junit.framework.TestCase;

public class _64_MinimumPathSumTest extends TestCase {

    public void testSolution() {
        _64_MinimumPathSum mps = new _64_MinimumPathSum();
        System.out.println(mps.solution(new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        }));
    }
}