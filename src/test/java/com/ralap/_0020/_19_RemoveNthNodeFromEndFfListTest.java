package com.ralap._0020;

import com.ralap.comm.ListNode;
import junit.framework.TestCase;

public class _19_RemoveNthNodeFromEndFfListTest extends TestCase {

    public void testRemoveNthFromEnd() {
        _19_RemoveNthNodeFromEndFfList rnnfeff = new _19_RemoveNthNodeFromEndFfList();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        System.out.println(rnnfeff.solution(l4, 1));

    }
}