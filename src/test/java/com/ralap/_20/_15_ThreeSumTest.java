package com.ralap._20;

import junit.framework.TestCase;

import java.util.List;

public class _15_ThreeSumTest extends TestCase {

    public void testSolution() {
        _15_ThreeSum ts = new _15_ThreeSum();
        List<List<Integer>> result = ts.solution(new int[]{-1,0,1,2,-1,-4});
        result.forEach(l ->{
            l.forEach(System.out::println);
        });

    }
}