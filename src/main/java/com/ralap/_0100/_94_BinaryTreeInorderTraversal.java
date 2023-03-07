package com.ralap._0100;

import com.ralap.comm.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 * <p>
 * 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [1,null,2,3]
 * 输出：[1,3,2]
 * 示例 2：
 * <p>
 * 输入：root = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：root = [1]
 * 输出：[1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/binary-tree-inorder-traversal
 */
public class _94_BinaryTreeInorderTraversal {
    List<Integer> result = new ArrayList<>();

    public List<Integer> solution(TreeNode root) {
        if (root == null) {
            return result;
        }
        this.inorderTraversal(root);
        return result;
    }

    public void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left);
        result.add(node.val);
        inorderTraversal(node.right);
    }
}
