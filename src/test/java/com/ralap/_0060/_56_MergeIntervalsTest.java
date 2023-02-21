package com.ralap._0060;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

public class _56_MergeIntervalsTest extends TestCase {

    public void testSolution() {
        _56_MergeIntervals mi = new _56_MergeIntervals();
//        PrintUtils.printTwoDimensionalArray(mi.solution(new int[][]{
//                {1, 3}, {2, 6}, {8, 10}, {15, 18}
//        }), ",");

//        PrintUtils.printTwoDimensionalArray(mi.solution(new int[][]{
//                {1, 4}, {4, 6}
//        }), ",");
//
//
//        PrintUtils.printTwoDimensionalArray(mi.solution(new int[][]{
//                {1, 4}, {0, 4}
//        }), ",");

//        PrintUtils.printTwoDimensionalArray(mi.solution(new int[][]{
//                {2, 3},
//                {4, 5},
//                {6, 7},
//                {8, 9},
//                {1, 10}
//        }), ",");

//        PrintUtils.printTwoDimensionalArray(mi.solution(new int[][]{
//                {1, 4},
//                {0, 0},
//        }), ",");

        PrintUtils.printTwoDimensionalArray(mi.solution(new int[][]{{2,3},
        {2,2},
            {3,3},
                {1,3},
                    {5,7},
                        {2,2},
                            {4,6}
        }), ",");
    }
}