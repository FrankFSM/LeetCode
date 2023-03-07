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
     * 移除节点
     * 1. 根节点为空： 返回false
     * 2. 找到目标节点
     * 3. 通过将左子树最大或者右子树最小替换
     *
     * @return
     */
    public TreeNode remove(TreeNode root, long value) {
        if (root == null) {
            return null;
        }
        long rootVal = root.val;
        if (rootVal == value) {
            if (root.left == null && root.right == null) {
                return null;
            }

            // 左子树为空，返回右子树，反之亦然
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // 找到右子树最小节点
            TreeNode rightMinNode = this.getMinNode(root.right);
            root.right = this.remove(root.right, rightMinNode.val);
            // 替换节点
            rightMinNode.left = root.left;
            rightMinNode.right = root.right;
            root = rightMinNode;
        } else if (rootVal > value) {
            // 向左找
            root.left = this.remove(root.left, value);
        }else {
            // 向右找
            root.right = this.remove(root.right, value);
        }
        return root;
    }

    /**
     * 找到最小的节点（最左节点）
     * @param root
     * @return
     */
    private TreeNode getMinNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
