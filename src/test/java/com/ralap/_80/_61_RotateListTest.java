package com.ralap._80;

import com.ralap.comm.ListNode;
import junit.framework.TestCase;

public class _61_RotateListTest extends TestCase {

    public void testSolution() {
        _61_RotateList rl = new _61_RotateList();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        rl.solution(l1, 2);
    }
}