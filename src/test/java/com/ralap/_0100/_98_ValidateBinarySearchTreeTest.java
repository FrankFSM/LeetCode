package com.ralap._0100;

import com.ralap.comm.TreeNode;
import junit.framework.TestCase;

public class _98_ValidateBinarySearchTreeTest extends TestCase {

    public void testSolution() {
        _98_ValidateBinarySearchTree vbst = new _98_ValidateBinarySearchTree();
        TreeNode root = new TreeNode(5);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node4 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node6 = new TreeNode(6);
        TreeNode node8 = new TreeNode(8);
        root.left = node2;
        root.right = node7;
        node2.left = node1;
        node2.right = node4;
        node7.left = node6;
        node7.right = node8;
        System.out.println(vbst.solution(root));

    }

    public void testSolution2() {
        _98_ValidateBinarySearchTree vbst = new _98_ValidateBinarySearchTree();
        TreeNode root = new TreeNode(5);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node4 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node6 = new TreeNode(6);
        TreeNode node8 = new TreeNode(8);
        root.left = node2;
        root.right = node7;
        node2.left = node1;
        node2.right = node4;
        node7.left = node6;
        node7.right = node8;
        System.out.println(vbst.solution2(root));
    }
}