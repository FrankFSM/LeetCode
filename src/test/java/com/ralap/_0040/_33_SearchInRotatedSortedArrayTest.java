package com.ralap._0040;

import junit.framework.TestCase;

public class _33_SearchInRotatedSortedArrayTest extends TestCase {

    public void testSolution() {
        _33_SearchInRotatedSortedArray sirsa = new _33_SearchInRotatedSortedArray();
        System.out.println(sirsa.solution(new int[]{4,5,6,7,0,1,2}, 3));
        System.out.println(sirsa.solution(new int[]{4,5,6,7,0,1,2}, 0));

        System.out.println(sirsa.solution(new int[]{3,1}, 3));
        System.out.println(sirsa.solution(new int[]{3,1}, 1));
        System.out.println(sirsa.solution(new int[]{1,3}, 3));
        System.out.println(sirsa.solution(new int[]{1,3}, 1));

    }
}