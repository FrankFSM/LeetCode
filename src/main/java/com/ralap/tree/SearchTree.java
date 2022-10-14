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
        } else {
            parent.right = newNode;
        }
        return true;
    }

    /**
     * 删除
     * 1. 根节点为空： 返回false
     * 2. 找到目标节点
     * 3. 通过将左子树最大或者右子树最小替换
     *
     * @return
     */
    public TreeNode delete(TreeNode root, int value) {
        if (this.root == null) {
            return null;
        }
        // 找目标节点

        if (root.val == value) {
            // 目标节点就是叶子节点
            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            TreeNode minNode = this.getMinNode(root);
            root.right = delete(root.right,minNode.val);
            minNode.left = root.left;
            minNode.right = root.right;
            root = minNode;
        } else if (root.val > value) {
            root.left = this.delete(root.left, value);
        } else {
            root.right = this.delete(root.right, value);
        }
        return root;


    }

    private TreeNode getMinNode(TreeNode root) {
        if (root == null) {
            return root;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
