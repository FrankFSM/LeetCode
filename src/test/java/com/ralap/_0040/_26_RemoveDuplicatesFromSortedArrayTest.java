package com.ralap._0040;

import junit.framework.TestCase;

public class _26_RemoveDuplicatesFromSortedArrayTest extends TestCase {

    public void testSolution() {
        _26_RemoveDuplicatesFromSortedArray rdfsa = new _26_RemoveDuplicatesFromSortedArray();
        System.out.println(rdfsa.solution(new int[]{1,2,2,3 }));
    }

    public void testDoublePointSolution() {
        _26_RemoveDuplicatesFromSortedArray rdfsa = new _26_RemoveDuplicatesFromSortedArray();
        System.out.println(rdfsa.doublePointSolution(new int[]{1,1,2,2,3 }));
    }
}