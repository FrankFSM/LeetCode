package com.ralap._20;

import com.ralap.comm.ListNode;

/**
 * 19. 删除链表的倒数第 N 个结点
 * <p>
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 示例 2：
 * <p>
 * 输入：head = [1], n = 1
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：head = [1,2], n = 1
 * 输出：[1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/remove-nth-node-from-end-of-list
 */
public class _19_RemoveNthNodeFromEndFfList {

    public ListNode solution(ListNode head, int n) {
        ListNode root = new ListNode();
        root.next = head;
        ListNode first, second;
        first = second = root;
        while (second.next != null){
            if(n <= 0){
                first = first.next;
            }
            n--;
            second = second.next;
        }
        first.next = first.next.next;
        return root.next;
    }

}
