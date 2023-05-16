package com.ralap._0120;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

import java.util.List;

public class _119_PascalsTriangleIiTest extends TestCase {

    public void testGetRow() {
       _119_PascalsTriangleIi solution = new _119_PascalsTriangleIi();
        List<Integer> generate = solution.getRow(3);
        PrintUtils.printListJoin(generate, ",");
    }
}