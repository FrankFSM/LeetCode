package com.ralap.comm;

import org.junit.Test;

public class TreeNodeTest {

    @Test
    public void generator() {
        TreeNode root = TreeNode.generator(10);
        System.out.println("先序：");
        TreeNode.preTraversal(root);
        System.out.println("中序：");
        TreeNode.midTraversal(root);
        System.out.println("后序：");
        TreeNode.postTraversal(root);
    }
}