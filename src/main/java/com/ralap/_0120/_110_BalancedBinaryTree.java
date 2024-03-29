package com.ralap._0120;
/**
 * 110. 平衡二叉树
 * <p>
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * 本题中，一棵高度平衡二叉树定义为：
 * <p>
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：true
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = [1,2,2,3,3,null,null,4,4]
 * 输出：false
 * <p>
 * 示例 3：
 * <p>
 * 输入：root = []
 * 输出：true
 * <p>
 * <p>
 * 提示：
 * <p>
 * 树中的节点数在范围 [0, 5000] 内
 * -104 <= Node.val <= 104
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/balanced-binary-tree
 */

import com.ralap.comm.TreeNode;

import javax.swing.tree.TreeModel;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class _110_BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (!isBalanced(root.left) || !isBalanced(root.right)) {
            return false;
        }

        int left = getDeep(root.left);
        int right = getDeep(root.right);
        return Math.abs(left - right) <= 1;

    }

    private int getDeep(TreeNode root){
        if (root == null) {
            return 0;
        }
        int left = getDeep(root.left) + 1;
        int right = getDeep(root.right) + 1;
        return Math.max(left , right);
    }

}

