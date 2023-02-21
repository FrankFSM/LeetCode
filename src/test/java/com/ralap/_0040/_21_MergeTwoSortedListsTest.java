package com.ralap._0040;

import com.ralap.comm.ListNode;
import junit.framework.TestCase;

public class _21_MergeTwoSortedListsTest extends TestCase {

    public void testSolution() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(7);
        ListNode l4 = new ListNode(10);
        ListNode l5 = new ListNode(21);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;


        ListNode l6 = new ListNode(3);
        ListNode l7 = new ListNode(7);
        ListNode l8 = new ListNode(9);
        ListNode l9 = new ListNode(20);
        ListNode l10 = new ListNode(29);
        l6.next = l7;
        l7.next = l8;
        l8.next = l9;
        l9.next = l10;


        _21_MergeTwoSortedLists mtsl = new _21_MergeTwoSortedLists();
        System.out.println(mtsl.solution(l1, l6));
    }
}