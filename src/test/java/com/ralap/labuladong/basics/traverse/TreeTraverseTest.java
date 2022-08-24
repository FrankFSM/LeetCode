package com.ralap.labuladong.basics.traverse;

import com.ralap.comm.TreeNode;
import org.junit.Before;
import org.junit.Test;

public class TreeTraverseTest {
    private TreeNode root;
    private TreeTraverse traverse;

    @Before
    public void setUp(){
        root = new TreeNode(5);
        root.left = new TreeNode(7);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(3);
        traverse = new TreeTraverse(root);

    }

    @Test
    public void preOrder() {
        this.traverse.preOrder();
    }

    @Test
    public void inOrder() {
        this.traverse.inOrder();
    }

    @Test
    public void postOrder() {
        this.traverse.postOrder();
    }
}