package com.ralap._80;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

import java.util.List;

public class _78_SubsetsTest extends TestCase {

    public void testSolution() {
        _78_Subsets s = new _78_Subsets();
//        List<List<Integer>> solution = s.solution(new int[]{1, 2, 3});
        PrintUtils.printTwoDimensionalListJoin(s.solution(new int[]{1, 2, 3}), ",");

    }
}