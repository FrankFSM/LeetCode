package com.ralap._0120;

import com.ralap.comm.PrintUtils;
import com.ralap.comm.TreeNode;
import junit.framework.TestCase;

public class _107_BinaryTreeLevelOrderTraversalIiTest extends TestCase {

    public void testLevelOrderBottom() {
        _107_BinaryTreeLevelOrderTraversalIi solution = new _107_BinaryTreeLevelOrderTraversalIi();


        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node2.left = node4;
        PrintUtils.printTwoDimensionalListJoin(solution.levelOrderBottom(root), ",");
    }
}