package com.ralap.tree;

import com.ralap.comm.TreeNode;

/**
 * 平衡二叉树
 */
public class AvlTree {
//    public TreeNode root;

    /**
     * 搜索
     */
    public TreeNode search(TreeNode root, int value) {
        if (root == null || root.val == value) {
            return root;
        }
        if (root.val > value) {
            return this.search(root.left, value);
        } else {
            return this.search(root.right, value);
        }
    }


    /**
     * 左旋
     */
    private TreeNode leftRotate(TreeNode root) {
        TreeNode right = root.right;
        TreeNode childLeft = right.left;
        // 左旋
        right.left = root;
        root.right = childLeft;
        return right;
    }
}
