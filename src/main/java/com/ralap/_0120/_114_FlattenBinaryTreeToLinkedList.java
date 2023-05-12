package com.ralap._0120;
/**
 * 114. 二叉树展开为链表
 * <p>
 * 给你二叉树的根结点 root ，请你将它展开为一个单链表：
 * <p>
 * 展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
 * 展开后的单链表应该与二叉树 先序遍历 顺序相同。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [1,2,5,3,4,null,6]
 * 输出：[1,null,2,null,3,null,4,null,5,null,6]
 * <p>
 * 示例 2：
 * <p>
 * 输入：root = []
 * 输出：[]
 * <p>
 * 示例 3：
 * <p>
 * 输入：root = [0]
 * 输出：[0]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 树中结点数在范围 [0, 2000] 内
 * -100 <= Node.val <= 100
 * <p>
 * <p>
 * 进阶：你可以使用原地算法（O(1) 额外空间）展开这棵树吗？
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list
 */

import com.ralap.comm.TreeNode;

class _114_FlattenBinaryTreeToLinkedList {
    TreeNode result = new TreeNode(0);
    TreeNode curr = result;

    public void flatten(TreeNode root) {
        if (root == null) {
            return ;
        }
        this.preorder(root);
        root.val = result.right.val;
        root.left = null;
        root.right = result.right.right;
        System.out.println(root);
    }

    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        curr.right = new TreeNode(root.val);
        curr = curr.right;
        if (root.left != null) {
            preorder(root.left);
        }
        if (root.right != null) {
            preorder(root.right);
        }
    }
}

