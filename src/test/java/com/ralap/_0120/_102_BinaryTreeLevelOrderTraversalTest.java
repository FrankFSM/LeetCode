package com.ralap._0120;

import com.ralap.comm.PrintUtils;
import com.ralap.comm.TreeNode;
import junit.framework.TestCase;

public class _102_BinaryTreeLevelOrderTraversalTest extends TestCase {

    public void testSolution() {
        _102_BinaryTreeLevelOrderTraversal btot = new _102_BinaryTreeLevelOrderTraversal();
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
//        TreeNode node5 = new TreeNode(6);
//        TreeNode node8 = new TreeNode(8);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node2.left = node4;
        PrintUtils.printTwoDimensionalListJoin(btot.solution(root), ",");

    }
}