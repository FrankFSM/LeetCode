package com.ralap._0120;

import com.ralap.comm.TreeNode;

/**
 * 101. 对称二叉树
 *
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [1,2,2,3,4,4,3]
 * 输出：true
 * 示例 2：
 *
 *
 * 输入：root = [1,2,2,null,3,null,3]
 * 输出：false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/symmetric-tree
 */
public class _101_SymmetricTree {
    public boolean solution(TreeNode root) {
        return this.isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        if (t1.val != t2.val) {
            return false;
        }
        boolean left = isSymmetric(t1.left, t2.right);
        boolean right = isSymmetric(t1.right, t2.left);
        if (!left || !right) {
            return false;
        }
        return true;
    }
}
