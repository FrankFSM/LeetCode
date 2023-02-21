package com.ralap._0080;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

public class _77_CombinationsTest extends TestCase {

    public void testSolution() {
        _77_Combinations c = new _77_Combinations();
        PrintUtils.printTwoDimensionalListJoin(c.solution(4,2),",");
    }
}