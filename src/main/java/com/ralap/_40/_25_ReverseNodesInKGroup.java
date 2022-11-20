package com.ralap._40;

import com.ralap.comm.ListNode;

/**
 * 25. K 个一组翻转链表
 * <p>
 * 给你链表的头节点 head ，每k个节点一组进行翻转，请你返回修改后的链表。
 * <p>
 * k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是k的整数倍，那么请将最后剩余的节点保持原有顺序。
 * <p>
 * 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,3,4,5], k = 2
 * 输出：[2,1,4,3,5]
 * 示例 2：
 * <p>
 * <p>
 * <p>
 * 输入：head = [1,2,3,4,5], k = 3
 * 输出：[3,2,1,4,5]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/reverse-nodes-in-k-group
 */
public class _25_ReverseNodesInKGroup {
    ListNode root;

    public ListNode solution(ListNode head, int group) {
        return this.reverseNodes(head, group);
    }


    public ListNode reverseNodes(ListNode head, int group) {
        ListNode rootNode = new ListNode();
        rootNode.next = head;
        ListNode curr = rootNode;
        ListNode start;
        ListNode pre;
        while (curr != null) {
            pre = curr;
            start = curr.next;
            for (int i = 0; i < group; i++) {
                if(curr.next == null){
                    return rootNode.next;
                }
                curr = curr.next;
            }
            ListNode[] reverseNode = reverseNodesHE(start, group);
            ListNode newStart = reverseNode[0];
            pre.next = newStart;
            curr = start;

        }
        return rootNode.next;
    }


    public ListNode[] reverseNodesHE(ListNode head, int end) {
        ListNode newHead = reverseNodes(head, 1, end);
        return new ListNode[]{root, newHead};
    }

    public ListNode reverseNodes(ListNode head, int pos, int end) {
        if (head.next == null || pos >= end) {
            root = head;
            return head;
        }
        ListNode last = reverseNodes(head.next, pos + 1, end);
        head.next = last.next;
        last.next = head;
        return head;
    }

}
