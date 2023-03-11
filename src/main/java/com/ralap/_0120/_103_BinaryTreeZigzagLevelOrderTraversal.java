package com.ralap._0120;

import com.ralap.comm.TreeNode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 103. 二叉树的锯齿形层序遍历
 *
 * 给你二叉树的根节点 root ，返回其节点值的 锯齿形层序遍历 。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：[[3],[20,9],[15,7]]
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
 * 链接：https://leetcode.cn/problems/binary-tree-zigzag-level-order-traversal
 */
public class _103_BinaryTreeZigzagLevelOrderTraversal {

    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> solution(TreeNode root) {
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int flag = 0;
        while (!queue.isEmpty()) {
            List<TreeNode> listNode = new ArrayList<>();
            while (!queue.isEmpty()) {
                listNode.add(queue.poll());
            }
            List<Integer> layer = listNode.stream().map(item->(item.val)).collect(Collectors.toList());
            if(flag % 2 == 1){
                Collections.reverse(layer);
            }
            flag++;
            result.add(layer);
            listNode.forEach(item->{
                if (item.left != null) {
                    queue.add(item.left);
                }
                if (item.right != null) {
                    queue.add(item.right);
                }
            });
        }
        return result;
    }
}
