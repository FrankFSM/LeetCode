package com.ralap._0100;

import com.ralap.comm.ListNode;

/**
 * 92. 反转链表 II
 * <p>
 * 给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,3,4,5], left = 2, right = 4
 * 输出：[1,4,3,2,5]
 * 示例 2：
 * <p>
 * 输入：head = [5], left = 1, right = 1
 * 输出：[5]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/reverse-linked-list-ii
 */
public class _92_ReverseLinkedList2 {

    public ListNode solution(ListNode head, int left, int right) {
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode pre = newHead;
        ListNode curr = head;

        ListNode next, next2 = null;
        for (int i = 0; i < left - 1; i++) {
            pre = curr;
            curr = curr.next;
        }
        ListNode end = curr;
        next = curr.next;
        if(next != null){
            next2 = next.next;

        }
        for (int i = 0; i < right - left; i++) {
            if (i == 0) {
                curr.next = null;
            }
            next.next = curr;

            curr= next;
            next = next2;
            if(next != null){
                next2 = next.next;
            }
        }
        pre.next = curr;
        end.next = next;
        return newHead.next;
    }
}
