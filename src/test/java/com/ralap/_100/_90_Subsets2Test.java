package com.ralap._100;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

public class _90_Subsets2Test extends TestCase {

    public void testSolution() {
        _90_Subsets2 s = new _90_Subsets2();
        PrintUtils.printTwoDimensionalListJoin(s.solution(new int[]{1, 2, 2}), ",");
    }
}