package com.ralap._0120;
/**
 * 113. 路径总和 II
 * <p>
 * 给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
 * 叶子节点 是指没有子节点的节点。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
 * 输出：[[5,4,11,2],[5,8,4,5]]
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = [1,2,3], targetSum = 5
 * 输出：[]
 * <p>
 * 示例 3：
 * <p>
 * 输入：root = [1,2], targetSum = 0
 * 输出：[]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 树中节点总数在范围 [0, 5000] 内
 * -1000 <= Node.val <= 1000
 * -1000 <= targetSum <= 1000
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/path-sum-ii
 */

import com.ralap.comm.TreeNode;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class _113_PathSumIi {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return result;
        }
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(root.val);
        this.has(root, targetSum, integers);

        return result;
    }

    public void has(TreeNode root, int targetSum, LinkedList<Integer> arr) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (root.val == targetSum) {
                result.add(new ArrayList<>(arr));
            }
            return;
        }
        if (root.left != null) {
            arr.add(root.left.val);
            has(root.left, targetSum - root.val, arr);
            arr.removeLast();
        }
        if (root.right != null) {
            arr.add(root.right.val);

            has(root.right, targetSum - root.val, arr);
            arr.removeLast();

        }
    }
}

