package com.ralap._0100;

import com.ralap.comm.TreeNode;
import junit.framework.TestCase;

public class _99_RecoverBinarySearchTreeTest extends TestCase {

    public void testSolution() {
        _99_RecoverBinarySearchTree rbst = new _99_RecoverBinarySearchTree();
        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(1);
//        TreeNode node4 = new TreeNode(4);
//        TreeNode node7 = new TreeNode(7);
//        TreeNode node6 = new TreeNode(6);
//        TreeNode node8 = new TreeNode(8);
        root.left = node1;
        root.right = node2;
//        node2.left = node1;
//        node2.right = node4;
//        node7.left = node6;
//        node7.right = node8;
        rbst.solution(root);
        System.out.println(root);
    }
}