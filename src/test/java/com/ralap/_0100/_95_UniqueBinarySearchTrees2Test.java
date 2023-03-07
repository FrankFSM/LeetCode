package com.ralap._0100;

import com.ralap.comm.TreeNode;
import junit.framework.TestCase;

import java.util.List;

public class _95_UniqueBinarySearchTrees2Test extends TestCase {

    public void testSolution() {
        _95_UniqueBinarySearchTrees2 ubst = new _95_UniqueBinarySearchTrees2();
        List<TreeNode> backtracking = ubst.solution(3);
        System.out.println(backtracking);
    }
}