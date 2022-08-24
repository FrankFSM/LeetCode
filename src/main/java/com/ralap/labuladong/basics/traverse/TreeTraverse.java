package com.ralap.labuladong.basics.traverse;

import com.ralap.comm.TreeNode;

/**
 * 树的相关遍历
 */
public class TreeTraverse {
    private TreeNode root;


    public TreeTraverse(TreeNode root) {
        this.root = root;
    }

    /**
     * 后序遍历
     */
    public void postOrder() {
        this.doPostOrder(root);
    }

    private void doPostOrder(TreeNode node) {
        if (node == null)
            return;
        this.doPostOrder(node.left);
        this.doPostOrder(node.right);
        System.out.println(node.val);
    }

    /**
     * 中序遍历
     */
    public void inOrder() {
        this.doInorder(this.root);
    }

    private void doInorder(TreeNode node) {
        if (node == null) {
            return;
        }
        this.doInorder(node.left);
        System.out.println(node.val);
        this.doInorder(node.right);
    }

    /**
     * 先序遍历
     */
    public void preOrder() {
        this.doPreOrder(root);
    }

    /**
     * 先序遍历
     */
    private void doPreOrder(TreeNode node) {
        if (node == null)
            return;
        System.out.println(node.val);
        doPreOrder(node.left);
        doPreOrder(node.right);
    }


    //
    //
    // 广度优先遍历
    // 深度优先遍历


}
