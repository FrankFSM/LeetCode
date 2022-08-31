package com.ralap.labuladong.basics.traverse;

import com.ralap.comm.TreeNode;

public class Tree_124 {
    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode node) {
        maxPath(node);
        return max;
    }

    private int maxPath(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = Math.max(0, this.maxPath(node.left));
        int right = Math.max(0, this.maxPath(node.right));
        max = Math.max(max, (left + right + node.val));
        return Math.max(left, right) + node.val;
    }
}
