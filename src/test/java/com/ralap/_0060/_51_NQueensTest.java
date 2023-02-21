package com.ralap._0060;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

public class _51_NQueensTest extends TestCase {

    public void testSolution() {
        _51_NQueens nq = new _51_NQueens();
        PrintUtils.printTwoDimensionalListJoinString(nq.solution(4), ",");
    }
}