package com.ralap._0100;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

public class _88_MergeSortedArrayTest extends TestCase {

    public void testSolution() {
        _88_MergeSortedArray msa = new _88_MergeSortedArray();
        int[] num1 = new int[]{1,2,3,0,0, 0};
        msa.solution(num1, 3, new int[]{2,5,6}, 3);
        PrintUtils.printArrayJoin(num1, ",");
    }
}