package com.ralap._0060;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

import java.util.List;

public class _46_PermutationsTest extends TestCase {

    public void testSolution() {
        _46_Permutations pt = new _46_Permutations();
        List<List<Integer>> result = pt.solution(new int[]{1,2,3});
        PrintUtils.printTwoDimensionalListJoin(result, ",");
    }
}