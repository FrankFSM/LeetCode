package com.ralap._80;

import com.ralap.comm.ListNode;

/**
 * 61. 旋转链表
 * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 * <p>
 *  
 * <p>
 * 示例 1：
 * 输入：head = [1,2,3,4,5], k = 2
 * 输出：[4,5,1,2,3]
 * <p>
 * 示例 2：
 * <p>
 * 输入：head = [0,1,2], k = 4
 * 输出：[2,0,1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/rotate-list
 */
public class _61_RotateList {

    public ListNode solution(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode curr;
        curr = head;

        int count = 1;
        while (curr.next != null) {
            count++;
            curr = curr.next;
        }
        int num = k % count;
        if (num == 0) {
            return head;
        }
        int last = count - num;
        curr.next = head;
        while (last > 0) {
            curr = curr.next;
            last --;
        }
        ListNode ret = curr.next;
        curr.next = null;
        return ret;


    }
}
