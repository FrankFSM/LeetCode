package com.ralap._0120;

import com.ralap.comm.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * 102. 二叉树的层序遍历
 *
 * 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：[[3],[9,20],[15,7]]
 * 示例 2：
 *
 * 输入：root = [1]
 * 输出：[[1]]
 * 示例 3：
 *
 * 输入：root = []
 * 输出：[]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/binary-tree-level-order-traversal
 */
public class _102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> solution(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
             return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            List<TreeNode> layerNode = new ArrayList<>();
            while (!queue.isEmpty()){
                layerNode.add(queue.poll());
            }
            List<Integer> layer = layerNode.stream().map(item->(item.val)).collect(Collectors.toList());
            result.add(layer);
            layerNode.forEach(item->{
                if(item.left != null){
                    queue.add(item.left);

                }
                if(item.right != null){
                    queue.add(item.right);
                }
            });
        }
        return result;
    }
}
