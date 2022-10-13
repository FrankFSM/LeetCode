package com.ralap.tree;

import com.ralap.comm.TreeNode;

/**
 * 二叉搜索树
 */
public class SearchTree {
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    /**
     * 插入
     *
     * @param value
     * @return
     */
    public boolean insert(int value) {
        TreeNode newNode = new TreeNode(value);
        // 跟节点
        if (this.root == null) {
            this.root = newNode;
            return true;
        }

        TreeNode parent = null;
        TreeNode curr = root;
        while (curr != null) {
            // 已经存在，不符合二叉搜索树的要求
            if (curr.val == value) {
                return false;
            } else if (value < curr.val) {
                parent = curr;
                curr = curr.left;
            } else {
                parent = curr;
                curr = curr.right;
            }
        }

        if (value < parent.val) {
            parent.left = newNode;
        }else {
            parent.right = newNode;
        }
        return true;
    }
}
