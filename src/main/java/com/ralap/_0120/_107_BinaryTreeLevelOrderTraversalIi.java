package com.ralap._0120;
/**
 * 107. 二叉树的层序遍历 II
 * <p>
 * 给你二叉树的根节点 root ，返回其节点值 自底向上的层序遍历 。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：[[15,7],[9,20],[3]]
 * <p>
 * 示例 2：
 * <p>
 * 输入：root = [1]
 * 输出：[[1]]
 * <p>
 * 示例 3：
 * <p>
 * 输入：root = []
 * 输出：[]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 树中节点数目在范围 [0, 2000] 内
 * -1000 <= Node.val <= 1000
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii
 */

import com.ralap.comm.TreeNode;

import java.util.*;
import java.util.stream.Collectors;


class _107_BinaryTreeLevelOrderTraversalIi {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            List<TreeNode> layer = new ArrayList<>();
            while (!queue.isEmpty()) {
                layer.add(queue.poll());
            }
            List<Integer> array = layer.stream().map(node -> (node.val)).collect(Collectors.toList());
            result.add(array);

            layer.forEach(node -> {
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            });
        }
        Collections.reverse(result);
        return result;
    }
}

