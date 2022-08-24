package com.ralap.comm;

/**
 * 树节点
 */
public class TreeNode {
    public int val;        // 值
    public TreeNode left;  // 左子树
    public TreeNode right; // 右子树

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
