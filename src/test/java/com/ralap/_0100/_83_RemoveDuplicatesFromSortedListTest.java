package com.ralap._0100;

import com.ralap.comm.ListNode;
import junit.framework.TestCase;

public class _83_RemoveDuplicatesFromSortedListTest extends TestCase {

    public void testSolution() {
        _83_RemoveDuplicatesFromSortedList rd = new _83_RemoveDuplicatesFromSortedList();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(5);
//        ListNode node8 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
//        node7.next = node8;
        ListNode solution = rd.solution(node1);
        System.out.println(solution);
    }
}