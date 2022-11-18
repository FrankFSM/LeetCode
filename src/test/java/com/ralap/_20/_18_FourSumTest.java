package com.ralap._20;

import junit.framework.TestCase;

import java.util.List;

public class _18_FourSumTest extends TestCase {

    public void testSolution() {
        _18_FourSum fs = new _18_FourSum();
//        1,0,-1,0,-2,2
//        2,2,2,2,2,
        List<List<Integer>> result = fs.solution(new int[]{2,1,0,-1},2);
        result.forEach(System.out::println);
    }
}