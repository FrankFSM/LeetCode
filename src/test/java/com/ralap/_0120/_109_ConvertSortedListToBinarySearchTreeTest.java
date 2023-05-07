package com.ralap._0120;

import com.ralap.comm.ListNode;
import com.ralap.comm.TreeNode;
import junit.framework.TestCase;

public class _109_ConvertSortedListToBinarySearchTreeTest extends TestCase {

    public void testSortedListToBST() {
        _109_ConvertSortedListToBinarySearchTree solution = new _109_ConvertSortedListToBinarySearchTree();
        ListNode head = new ListNode(-10);
        head.next = new ListNode(-3);

        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(9);
        TreeNode treeNode = solution.sortedListToBST(head);
        System.out.println(treeNode);

    }
}