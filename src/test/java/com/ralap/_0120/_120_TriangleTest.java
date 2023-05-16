package com.ralap._0120;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _120_TriangleTest extends TestCase {

    public void testMinimumTotal() {
        _120_Triangle solution = new _120_Triangle();
        List<List<Integer>> data = new ArrayList<>();
//        data.add(Arrays.asList(2));
//        data.add(Arrays.asList(3,4));
//        data.add(Arrays.asList(6,5,7));
//        data.add(Arrays.asList(4,1,8,3));

        data.add(Arrays.asList(-1));
        data.add(Arrays.asList(2,3));
        data.add(Arrays.asList(1,-1,-3));
        System.out.println(solution.minimumTotal(data));
    }
}