package com.ralap._0140;

import com.ralap.comm.TreeNode;
import com.ralap.zs.Solution;
import junit.framework.TestCase;

public class _124_BinaryTreeMaximumPathSumTest extends TestCase {

    public void testMaxPathSum() {
        _124_BinaryTreeMaximumPathSum solution = new _124_BinaryTreeMaximumPathSum();
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
        TreeNode root = new TreeNode(-10);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        root.left = node1;
        root.right = node2;
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        node2.left = node3;
        node2.right = node4;


        System.out.println(solution.maxPathSum(root));
    }
}