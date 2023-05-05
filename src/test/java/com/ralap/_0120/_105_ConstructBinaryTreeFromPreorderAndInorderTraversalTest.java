package com.ralap._0120;

import com.ralap.comm.TreeNode;
import junit.framework.TestCase;

public class _105_ConstructBinaryTreeFromPreorderAndInorderTraversalTest extends TestCase {

    public void testBuildTree() {
        _105_ConstructBinaryTreeFromPreorderAndInorderTraversal solution = new _105_ConstructBinaryTreeFromPreorderAndInorderTraversal();
//        TreeNode root = solution.buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7});
        TreeNode root = solution.buildTree(new int[]{1,2}, new int[]{1,2});

        System.out.println(root);
    }
}