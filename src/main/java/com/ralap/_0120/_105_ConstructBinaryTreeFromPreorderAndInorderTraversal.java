package com.ralap._0120;

import com.ralap.comm.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 * <p>
 * 给定两个整数数组 preorder 和 inorder ，其中 preorder 是二叉树的先序遍历， inorder 是同一棵树的中序遍历，请构造二叉树并返回其根节点。
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * 输入: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 * 输出: [3,9,20,null,null,15,7]
 * <p>
 * 示例 2:
 * <p>
 * 输入: preorder = [-1], inorder = [-1]
 * 输出: [-1]
 * <p>
 * <p>
 * 提示:
 * <p>
 * 1 <= preorder.length <= 3000
 * inorder.length == preorder.length
 * -3000 <= preorder[i], inorder[i] <= 3000
 * preorder 和 inorder 均 无重复 元素
 * inorder 均出现在 preorder
 * preorder 保证 为二叉树的前序遍历序列
 * inorder 保证 为二叉树的中序遍历序列
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal
 */
class _105_ConstructBinaryTreeFromPreorderAndInorderTraversal {

    /**
     * 1. 确定跟节点：先序遍历的第一个为根节点
     * 2. 通过根节点将中序遍历分为左右子树
     * 3. 通过左右子树的个数，再先序遍历中确认左右子树
     * 4. 递归上述步骤
     *
     * @param preorder 先序
     * @param inorder  中序
     * @return 原树
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return recursion(preorder, inorder);
    }

    private TreeNode recursion(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        int rootNumber = preorder[0];
        TreeNode root = new TreeNode(rootNumber);

        if (preorder.length == 1) {
            return root;
        }

        int rootIndex = findIndex(inorder,rootNumber);
        int[] leftPre = Arrays.copyOfRange(preorder, 1, rootIndex  + 1);
        int[] rightPre = Arrays.copyOfRange(preorder, rootIndex + 1, preorder.length);
        int[] leftIn = Arrays.copyOfRange(inorder, 0, rootIndex);
        int[] rightIn = Arrays.copyOfRange(inorder, rootIndex + 1, inorder.length);
        TreeNode left = recursion(leftPre, leftIn);
        root.left = left;
        TreeNode right = recursion(rightPre, rightIn);
        root.right = right;
        return root;
    }


    private int findIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

