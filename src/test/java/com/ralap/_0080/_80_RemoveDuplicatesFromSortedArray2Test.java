package com.ralap._0080;

import junit.framework.TestCase;

public class _80_RemoveDuplicatesFromSortedArray2Test extends TestCase {

    public void testSolution() {
        _80_RemoveDuplicatesFromSortedArray2 rdfsa = new _80_RemoveDuplicatesFromSortedArray2();
        System.out.println(rdfsa.solution(new int[]{1, 1, 1, 1, 2, 2, 2, 2, 2, 3}));
    }
}