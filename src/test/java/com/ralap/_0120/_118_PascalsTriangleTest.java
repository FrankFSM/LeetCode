package com.ralap._0120;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

import java.util.List;

public class _118_PascalsTriangleTest extends TestCase {

    public void testGenerate() {
        _118_PascalsTriangle solution = new _118_PascalsTriangle();
        List<List<Integer>> generate = solution.generate(3);
        PrintUtils.printTwoDimensionalListJoin(generate, ",");

    }
}