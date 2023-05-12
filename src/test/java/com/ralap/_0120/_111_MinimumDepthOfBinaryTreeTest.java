package com.ralap._0120;

import com.ralap.comm.TreeNode;
import junit.framework.TestCase;

public class _111_MinimumDepthOfBinaryTreeTest extends TestCase {

    public void testMinDepth() {
        _111_MinimumDepthOfBinaryTree solution = new _111_MinimumDepthOfBinaryTree();

//        TreeNode root = new TreeNode(3);
//        TreeNode node1 = new TreeNode(9);
//        TreeNode node2 = new TreeNode(20);
//        TreeNode node3 = new TreeNode(15);
//        TreeNode node4 = new TreeNode(7);
//        root.left = node1;
//        node1.left = node2;
//        root.right = node2;
//        node2.left = node3;
//        node2.right = node4;


        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(7);
        root.right = node1;
        node1.right = node2;
        node2.right = node3;
        node3.right = node4;

        System.out.println(solution.minDepth(root));

    }
}