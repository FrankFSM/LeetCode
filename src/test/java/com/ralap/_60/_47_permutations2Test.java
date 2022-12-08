package com.ralap._60;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

public class _47_permutations2Test extends TestCase {

    public void testSolution() {
        _47_permutations2 p2 = new _47_permutations2();
        PrintUtils.printTwoDimensionalListJoin(p2.solution(new int[]{3,3,0,3}), ",");
    }
}