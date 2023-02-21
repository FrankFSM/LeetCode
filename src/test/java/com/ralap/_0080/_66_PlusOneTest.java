package com.ralap._0080;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

public class _66_PlusOneTest extends TestCase {

    public void testSolution() {
        _66_PlusOne po = new _66_PlusOne();
        PrintUtils.printArray(po.solution(new int[]{9, 1 ,1 ,9 }), ",");
    }
}