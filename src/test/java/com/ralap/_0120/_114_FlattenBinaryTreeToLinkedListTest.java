package com.ralap._0120;

import com.ralap.comm.TreeNode;
import junit.framework.TestCase;

public class _114_FlattenBinaryTreeToLinkedListTest extends TestCase {

    public void testFlatten() {
        _114_FlattenBinaryTreeToLinkedList solution = new _114_FlattenBinaryTreeToLinkedList();
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);

        root.left = node1;
        node1.right = node4;
        node1.left = node2;
        node2.left = node3;
        node4.right = node5;
        solution.flatten(root);
        System.out.println(root);
    }
}