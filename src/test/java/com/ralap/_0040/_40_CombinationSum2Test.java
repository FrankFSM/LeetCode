package com.ralap._0040;

import junit.framework.TestCase;

import java.util.List;

public class _40_CombinationSum2Test extends TestCase {

    public void testSolution() {
        _40_CombinationSum2 cs = new _40_CombinationSum2();
//        List<List<Integer>> result = cs.solution(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 27);
        List<List<Integer>> result = cs.solution(new int[]{10,1,2,7,6,1,5}, 8);


        result.stream().forEach(item->{
            item.stream().forEach(System.out::println);
            System.out.println();
        });
    }
}