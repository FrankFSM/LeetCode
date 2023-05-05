package com.ralap._0120;
/**
 * 106. 从中序与后序遍历序列构造二叉树
 * <p>
 * 给定两个整数数组 inorder 和 postorder ，其中 inorder 是二叉树的中序遍历， postorder 是同一棵树的后序遍历，请你构造并返回这颗 二叉树 。
 
示例 1:


输入：inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
输出：[3,9,20,null,null,15,7]

示例 2:

输入：inorder = [-1], postorder = [-1]
输出：[-1]

 
提示:

1 <= inorder.length <= 3000
postorder.length == inorder.length
-3000 <= inorder[i], postorder[i] <= 3000
inorder 和 postorder 都由 不同 的值组成
postorder 中每一个值都在 inorder 中
inorder 保证是树的中序遍历
postorder 保证是树的后序遍历


 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal
 */

import com.ralap.comm.TreeNode;

import java.util.Arrays;

class _106_ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        return recursion(inorder, postorder);
    }

    private TreeNode recursion(int[] inorder, int[] postorder) {
        if (postorder.length == 0) {
            return null;
        }
        int rootNumber = postorder[postorder.length -1];
        TreeNode root = new TreeNode(rootNumber);
        if (postorder.length == 1) {
            return root;
        }

        int rootIndex = findIndex(inorder,rootNumber);
        int[] leftPost = Arrays.copyOfRange(postorder, 0, rootIndex);
        int[] rightPost = Arrays.copyOfRange(postorder, rootIndex, postorder.length - 1);
        int[] leftIn = Arrays.copyOfRange(inorder, 0, rootIndex);
        int[] rightIn = Arrays.copyOfRange(inorder, rootIndex + 1, inorder.length);
        TreeNode left = recursion( leftIn,leftPost);
        root.left = left;
        TreeNode right = recursion( rightIn,rightPost);
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

