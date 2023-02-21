package com.ralap._0040;

import com.ralap.comm.ListNode;
import junit.framework.TestCase;

public class _23_MergeKSortedListsTest extends TestCase {

    public void testSolution() {
        _23_MergeKSortedLists msl = new _23_MergeKSortedLists();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;


        ListNode l6 = new ListNode(1);
        ListNode l7 = new ListNode(3);
        ListNode l8 = new ListNode(4);
        l6.next = l7;
        l7.next = l8;

        ListNode l10 = new ListNode(2);
        ListNode l11 = new ListNode(6);
        l10.next = l11;

        System.out.println(msl.solution(new ListNode[]{}));
    }
}