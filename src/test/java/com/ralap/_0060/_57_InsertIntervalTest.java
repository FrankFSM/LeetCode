package com.ralap._0060;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

public class _57_InsertIntervalTest extends TestCase {

    public void testSolution() {
        _57_InsertInterval ii = new _57_InsertInterval();
//        PrintUtils.printTwoDimensionalArray(ii.solution(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5}), ",");
        PrintUtils.printTwoDimensionalArray(ii.solution(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4, 8}), ",");
//        PrintUtils.printTwoDimensionalArray(ii.solution(new int[][]{}, new int[]{4, 8}), ",");
//        PrintUtils.printTwoDimensionalArray(ii.solution(new int[][]{{1,5}}, new int[]{2, 3}), ",");
//        PrintUtils.printTwoDimensionalArray(ii.solution(new int[][]{{1,5}}, new int[]{2, 7}), ",");

//        PrintUtils.printTwoDimensionalArray(ii.solution(new int[][]{{1,5}}, new int[]{6, 8}), ",");




    }
}