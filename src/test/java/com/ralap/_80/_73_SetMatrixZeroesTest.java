package com.ralap._80;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

public class _73_SetMatrixZeroesTest extends TestCase {

    public void testSolution() {
        _73_SetMatrixZeroes smz = new _73_SetMatrixZeroes();
        int[][] matrix = new int[][]{
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        smz.solution(matrix);
        PrintUtils.printTwoDimensionalArray(matrix, ",");
    }
}