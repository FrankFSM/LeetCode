package com.ralap._80;

import junit.framework.TestCase;

public class _63_UniquePaths2Test extends TestCase {

    public void testSolution() {
        _63_UniquePaths2 up2 = new _63_UniquePaths2();
        System.out.println(up2.solution(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        }));
    }
}