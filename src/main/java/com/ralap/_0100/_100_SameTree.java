package com.ralap._0100;

import com.ralap.comm.TreeNode;

/**
 * 100. 相同的树
 *
 * 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
 *
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：p = [1,2,3], q = [1,2,3]
 * 输出：true
 * 示例 2：
 *
 *
 * 输入：p = [1,2], q = [1,null,2]
 * 输出：false
 * 示例 3：
 *
 *
 * 输入：p = [1,2,1], q = [1,1,2]
 * 输出：false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/same-tree
 */
public class _100_SameTree {

    public boolean solution(TreeNode p, TreeNode q) {
        return this.qx(p, q);
    }

    public boolean qx(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(q.val != p.val){
            return false;
        }
        boolean left = qx(q.left, p.left);
        boolean right = qx(q.right, p.right);
        if (!left || !right) {
            return false;
        }
        return true;
    }
}
