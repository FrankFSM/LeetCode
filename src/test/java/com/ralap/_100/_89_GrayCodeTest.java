package com.ralap._100;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

public class _89_GrayCodeTest extends TestCase {

    public void testSolution() {
        _89_GrayCode gc = new _89_GrayCode();
        PrintUtils.printListJoin(gc.solution(3), ",");
    }
}