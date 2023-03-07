package com.ralap._0100;

import com.ralap.comm.PrintUtils;
import com.ralap.comm.TreeNode;
import junit.framework.TestCase;

public class _94_BinaryTreeInorderTraversalTest extends TestCase {

    public void testSolution() {
        _94_BinaryTreeInorderTraversal btit = new _94_BinaryTreeInorderTraversal();
        TreeNode root = new TreeNode(1);
//        TreeNode node1 = new TreeNode(2);
//        TreeNode node2 = new TreeNode(3);
//        root.right = node1;
//        node1.left = node2;
        PrintUtils.printListJoin(btit.solution(root), ",");
    }
}