package com.ralap._0040;

import junit.framework.TestCase;

public class _31_NextPermutationTest extends TestCase {

    public void testSolution() {
        _31_NextPermutation np = new _31_NextPermutation();
        np.solution(new int[]{2,2,7,5,4,3,2,2});
    }

    public void testSolution_v2() {
        _31_NextPermutation np = new _31_NextPermutation();
        np.solution_v2(new int[]{3,2,1});
    }
}