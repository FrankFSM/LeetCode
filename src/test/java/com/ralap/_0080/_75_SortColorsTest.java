package com.ralap._0080;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

public class _75_SortColorsTest extends TestCase {

    public void testSolution() {
        _75_SortColors sc = new _75_SortColors();
        int[] nums = new int[]{
                1,0,2,0
        };
        sc.solution(nums);
        PrintUtils.printArrayJoin(nums, ",");

    }
}