package com.ralap.labuladong.basics.dynamic_programming;

import com.ralap.comm.TreeNode;

/**
 * 124. 二叉树中最大路径和
 *
 * @Describtion 路径 被定义为一条从树中任意节点出发，沿父节点-子节点连接，达到任意节点的序列。同一个节点在一条路径序列中 至多出现一次 。该路径 至少包含一个 节点，且不一定经过根节点。
 * <p>
 * 路径和 是路径中各节点值的总和。
 */
public class MaxPathSum {

    public int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root){
        this.getMax(root);
        return max;
    }

    public int getMax(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 左子树-小于0的不计算在内
        int left = Math.max(0, getMax(root.left));
        // 右子树-小于0的不计算在内
        int right = Math.max(0, getMax(root.right));
        // 计算当前节点的值，与最大值比较，然后更新
        max = Math.max(max, left + right + root.val);
        // 返回当前节点的最大值
        return Math.max(left, right) + root.val;
    }
}
