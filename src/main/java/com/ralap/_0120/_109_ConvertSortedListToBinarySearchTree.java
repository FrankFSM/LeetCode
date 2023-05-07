package com.ralap._0120;
/**
 * 109. 有序链表转换二叉搜索树
 * <p>
 * 给定一个单链表的头节点  head ，其中的元素 按升序排序 ，将其转换为高度平衡的二叉搜索树。
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差不超过 1。
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * 输入: head = [-10,-3,0,5,9]
 * 输出: [0,-3,9,-10,null,5]
 * 解释: 一个可能的答案是[0，-3,9，-10,null,5]，它表示所示的高度平衡的二叉搜索树。
 * <p>
 * 示例 2:
 * <p>
 * 输入: head = []
 * 输出: []
 * <p>
 * <p>
 * 提示:
 * <p>
 * head 中的节点数在[0, 2 * 104] 范围内
 * -105 <= Node.val <= 105
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-sorted-list-to-binary-search-tree
 */


import com.ralap.comm.ListNode;
import com.ralap.comm.TreeNode;

class _109_ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {

        if (head == null) {
            return null;
        }
        TreeNode root = new TreeNode(head.val);
        if (head.next == null) {
            return root;
        }
        ListNode first, second, pre = null;
        first = second = head;
        // 找到中间位置，快慢指针
        while (second != null && second.next != null ) {
            pre= first;
            first = first.next;
            second = second.next.next;
        }
        root = new TreeNode(first.val);
        if (pre != null) {
            pre.next = null;
            TreeNode left = sortedListToBST(head);
            root.left = left;
        }
        if (first.next != null) {
            TreeNode right = sortedListToBST(first.next);
            root.right = right;
        }
        return root;




    }

}

