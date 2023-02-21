package com.ralap._0060;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

public class _59_SpiralMatrix2Test extends TestCase {

    public void testSolution() {
        _59_SpiralMatrix2 sm = new _59_SpiralMatrix2();
        PrintUtils.printTwoDimensionalArray(sm.solution(3), ",");
        PrintUtils.printTwoDimensionalArray(sm.solution(1), ",");
        PrintUtils.printTwoDimensionalArray(sm.solution(0), ",");
        PrintUtils.printTwoDimensionalArray(sm.solution(4), ",");



    }
}