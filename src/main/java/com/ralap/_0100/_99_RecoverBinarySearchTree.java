package com.ralap._0100;

import com.ralap.comm.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 99. 恢复二叉搜索树
 * <p>
 * 给你二叉搜索树的根节点 root ，该树中的 恰好 两个节点的值被错误地交换。请在不改变其结构的情况下，恢复这棵树 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [1,3,null,null,2]
 * 输出：[3,1,null,null,2]
 * 解释：3 不能是 1 的左孩子，因为 3 > 1 。交换 1 和 3 使二叉搜索树有效。
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = [3,1,4,null,null,2]
 * 输出：[2,1,4,null,null,3]
 * 解释：2 不能在 3 的右子树中，因为 2 < 3 。交换 2 和 3 使二叉搜索树有效。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/recover-binary-search-tree
 */
public class _99_RecoverBinarySearchTree {
    List<TreeNode> list = new ArrayList<>();
    public void solution(TreeNode root) {
        // 中序遍历
        this.zx(root);
        List<TreeNode> errList = new ArrayList<>();
        int count = 0;
        TreeNode next = null;
        for (int i = 0; i < list.size() -1; i++) {
            // 找到不符合顺序的节点
            if (list.get(i).val > list.get(i+1).val) {
                // 两种情况
                // 有俩个不符合: i,j+1
                // 一个不符合: 与相邻的互换
                if(count == 0){
                    errList.add(list.get(i));
                    next = list.get(i +1);
                }else {
                    errList.add(list.get(i + 1));
                }
                count++;
            }
        }
        int tmp = errList.get(0).val;
        if (count == 1) {
            errList.get(0).val = next.val;
            next.val = tmp;
        }else {
            errList.get(0).val = errList.get(1).val;
            errList.get(1).val = tmp;
        }
    }

    public void zx(TreeNode curr) {
        if (curr == null) {
            return;
        }
        this.zx(curr.left);
        list.add(curr);
        this.zx(curr.right);
    }
}
