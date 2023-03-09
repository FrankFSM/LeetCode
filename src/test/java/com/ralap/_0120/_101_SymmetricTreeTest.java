package com.ralap._0120;

import com.ralap.comm.TreeNode;
import junit.framework.TestCase;

public class _101_SymmetricTreeTest extends TestCase {

    public void testSolution() {
        _101_SymmetricTree st = new _101_SymmetricTree();
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(3);
//        TreeNode node5 = new TreeNode(6);
//        TreeNode node8 = new TreeNode(8);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node2.left = node4;
        System.out.println(st.solution(root));
    }
}