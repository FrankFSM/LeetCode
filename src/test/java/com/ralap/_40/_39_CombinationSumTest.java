package com.ralap._40;

import junit.framework.TestCase;

import java.util.List;

public class _39_CombinationSumTest extends TestCase {

    public void testSolution() {
        _39_CombinationSum cs = new _39_CombinationSum();
        List<List<Integer>> result = cs.solution(new int[]{7,3,2}, 18);
        result.stream().forEach(item->{
            item.stream().forEach(System.out::println);
            System.out.println();
        });
    }
}