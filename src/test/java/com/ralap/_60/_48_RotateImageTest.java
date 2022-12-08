package com.ralap._60;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

public class _48_RotateImageTest extends TestCase {

    public void testSolution() {
        _48_RotateImage ri = new _48_RotateImage();
        int[][] array = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        ri.solution(array);
        PrintUtils.printTwoDimensionalArray(array, ",");
    }

    public void testDoubleRevolveSolution() {
        _48_RotateImage ri = new _48_RotateImage();
        int[][] array = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        ri.doubleRevolveSolution(array);
        PrintUtils.printTwoDimensionalArray(array, ",");
    }
}