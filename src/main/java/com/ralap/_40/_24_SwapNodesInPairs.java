package com.ralap._40;

import com.ralap.comm.ListNode;

/**
 * 24. 两两交换链表中的节点
 *
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,2,3,4]
 * 输出：[2,1,4,3]
 * 示例 2：
 *
 * 输入：head = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：head = [1]
 * 输出：[1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/swap-nodes-in-pairs
 */
public class _24_SwapNodesInPairs {

    public ListNode solution(ListNode head) {
        if(head == null  || head.next == null){
            return head;
        }
        ListNode root = new ListNode();
        root.next = head;


        while (root != null) {
            if(root.next == null || root.next.next == null){
                break;
            }
            ListNode first = root.next;
            ListNode second = first.next;
            first.next = second.next;
            second.next = first;
            root.next = second;
            if(head == first){
                head = root.next;
            }
            root = root.next.next;

        }
        return head;

    }
}
