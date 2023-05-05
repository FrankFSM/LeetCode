package com.ralap._0120;

import com.ralap.comm.TreeNode;
import junit.framework.TestCase;

public class _106_ConstructBinaryTreeFromInorderAndPostorderTraversalTest extends TestCase {

    public void testBuildTree() {
        _106_ConstructBinaryTreeFromInorderAndPostorderTraversal solution = new _106_ConstructBinaryTreeFromInorderAndPostorderTraversal();
        TreeNode root = solution.buildTree( new int[]{9,3,15,20,7},new int[]{9,15,7,20,3});
//        TreeNode root = solution.buildTree(new int[]{1,2}, new int[]{1,2});

        System.out.println(root);
    }
}