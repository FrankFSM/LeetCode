package com.ralap._0120;

import com.ralap.comm.TreeNode;
import junit.framework.TestCase;

public class _110_BalancedBinaryTreeTest extends TestCase {

    public void testIsBalanced() {
        _110_BalancedBinaryTree solution = new _110_BalancedBinaryTree();
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
//        TreeNode node5 = new TreeNode(6);
//        TreeNode node8 = new TreeNode(8);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        System.out.println(solution.isBalanced(root));
    }
}