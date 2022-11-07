package com.ralap._20;

import com.ralap.sgg.link.LinkNode;

/**
 * 2. 两数相加
 * <p>
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 * <p>
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/add-two-numbers
 */
public class _2_AddTwoNumbers {

    public LinkNode solution(LinkNode l1, LinkNode l2) {
        int carry = 0;
        LinkNode root = new LinkNode(0);
        LinkNode currLink = root;
        while (l1 != null && l2 != null) {
            int currSum = l1.val + l2.val + carry;
            int currVar = currSum % 10;
            carry = currSum / 10;
            currLink.next = new LinkNode(currVar);
            l1 = l1.next;
            l2 = l2.next;
            currLink = currLink.next;
        }
        LinkNode last = l1 == null ? l2 : l1;
        while (last != null) {
            int currSum = last.val + carry;
            int currVar = currSum % 10;
            carry = currSum / 10;
            currLink.next = new LinkNode(currVar);
            last = last.next;
            currLink = currLink.next;
        }
        if (carry != 0) {
            currLink.next = new LinkNode(carry);
        }
        return root.next;
    }
}
