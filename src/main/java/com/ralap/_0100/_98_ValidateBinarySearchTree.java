package com.ralap._0100;

import com.ralap.comm.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 98. 验证二叉搜索树
 *
 * 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
 *
 * 有效 二叉搜索树定义如下：
 *
 * 节点的左子树只包含 小于 当前节点的数。
 * 节点的右子树只包含 大于 当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [2,1,3]
 * 输出：true
 * 示例 2：
 *
 *
 * 输入：root = [5,1,4,null,null,3,6]
 * 输出：false
 * 解释：根节点的值是 5 ，但是右子节点的值是 4 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/validate-binary-search-tree
 */
public class _98_ValidateBinarySearchTree {
    public boolean solution(TreeNode root) {
        return this.isValidate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidate(TreeNode root, long low, long up){
        if (root == null) {
            return true;
        }

        if (low >= root.val || up <= root.val) {
            return false;
        }


        boolean leftValidate = isValidate(root.left, low, root.val);
        boolean rightValidate = isValidate(root.right, root.val, up);
        if (!leftValidate || !rightValidate) {
            return false;
        }
        return true;
    }

    List<Long> result = new ArrayList<>();
    public boolean solution2(TreeNode root) {
        this.zx(root);
        long pre = result.get(0);
        for (int i = 1; i < result.size(); i++) {
            if (result.get(i) <= pre) {
                return false;
            }
            pre = result.get(i);
        }
        return true;
    }

    private void zx(TreeNode root) {
        if (root == null) {
            return ;
        }
        zx(root.left);
        result.add((long) root.val);
        zx(root.right);
    }
}
