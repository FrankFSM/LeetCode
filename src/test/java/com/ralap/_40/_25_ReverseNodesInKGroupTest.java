package com.ralap._40;

import com.ralap.comm.ListNode;
import junit.framework.TestCase;

import java.util.Arrays;

public class _25_ReverseNodesInKGroupTest extends TestCase {

    public void testSolution() {
        _25_ReverseNodesInKGroup rnikg = new _25_ReverseNodesInKGroup();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);

        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        System.out.println(rnikg.solution(l1,3));
    }

    public void testReverseNodes() {

        _25_ReverseNodesInKGroup rnikg = new _25_ReverseNodesInKGroup();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);

        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        System.out.println(rnikg.solution(l1, 2));
    }

    public void testReverseNodesHE() {
        _25_ReverseNodesInKGroup rnikg = new _25_ReverseNodesInKGroup();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);

        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        Arrays.stream(rnikg.reverseNodesHE(l1, 2)).forEach(System.out::println);
    }
}