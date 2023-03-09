package com.ralap._0100;

import com.ralap.comm.TreeNode;
import junit.framework.TestCase;

public class _100_SameTreeTest extends TestCase {

    public void testSolution() {
        _100_SameTree st = new _100_SameTree();
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

        TreeNode root2 = new TreeNode(2);
        TreeNode node12 = new TreeNode(31);
        TreeNode node22 = new TreeNode(1);
//        TreeNode node4 = new TreeNode(4);
//        TreeNode node7 = new TreeNode(7);
//        TreeNode node6 = new TreeNode(6);
//        TreeNode node8 = new TreeNode(8);
        root2.left = node12;
        root2.right = node22;
        System.out.println(st.solution(root, root2));
    }
}