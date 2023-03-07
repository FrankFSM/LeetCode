package com.ralap._0100;

import com.ralap.comm.ListNode;
import junit.framework.TestCase;

public class _92_ReverseLinkedList2Test extends TestCase {

    public void testSolution() {
        _92_ReverseLinkedList2 rl = new _92_ReverseLinkedList2();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        ListNode solution = rl.solution(node1, 2, 4);
//        ListNode solution = rl.solution(node1, 1, 2);

        System.out.println(solution);
    }
}