package com.ralap._0100;

import com.ralap.comm.ListNode;
import junit.framework.TestCase;

public class _86_PartitionListTest extends TestCase {

    public void testSolution() {
        _86_PartitionList pl = new _86_PartitionList();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        ListNode solution = pl.solution(node1, 3);
        System.out.println(solution);
    }
}