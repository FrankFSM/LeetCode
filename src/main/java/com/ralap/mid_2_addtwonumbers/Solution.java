package com.ralap.mid_2_addtwonumbers;

import com.ralap.comm.ListNode;


/**
 * 2. 两数相加
 * 给你两个非空的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以0开头。
 */
public class Solution {

    /**
     * 时间复杂度:O(max(N,M))
     * 空间复杂度O(1),返回值不计入空间复杂度
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        // 进位
        int carry = 0;
        // 链表全部为空,结束
        while (l1 != null || l2 != null) {
            int var1 = l1 == null ? 0 : l1.val;
            int var2 = l2 == null ? 0 : l2.val;
            int sum = var1 + var2 + carry;
            if (head == null) {
                // 首次初始化节点
                head = tail = new ListNode(sum % 10);
            } else {
                // 赋值并后移
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            // 后移指针
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        // 最高位是否有进位
        if (carry != 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }
}
