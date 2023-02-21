package com.ralap._0060;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

public class _54_SpiralMatrixTest extends TestCase {

    public void testSolution() {
        _54_SpiralMatrix sm = new _54_SpiralMatrix();
        int[][] martrix  = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
//        int[][] martrix = new int[][]{
//                {2, 5, 8}, {4, 0, -1}
//        };
        PrintUtils.printListJoin(sm.solution(martrix), ",");
    }
}