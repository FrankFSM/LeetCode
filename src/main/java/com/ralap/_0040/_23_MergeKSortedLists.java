package com.ralap._0040;

import com.ralap.comm.ListNode;

/**
 * 23. 合并K个升序链表
 * <p>
 * 给你一个链表数组，每个链表都已经按升序排列。
 * <p>
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：lists = [[1,4,5],[1,3,4],[2,6]]
 * 输出：[1,1,2,3,4,4,5,6]
 * 解释：链表数组如下：
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * 将它们合并到一个有序链表中得到。
 * 1->1->2->3->4->4->5->6
 * 示例 2：
 * <p>
 * 输入：lists = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：lists = [[]]
 * 输出：[]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/merge-k-sorted-lists
 */
public class _23_MergeKSortedLists {

    public ListNode solution(ListNode[] list) {
        if (list == null | list.length <= 0) {
            return null;
        }
        return this.divideAndConquer(list, 0, list.length - 1);
    }

    private ListNode divideAndConquer(ListNode[] list, int start, int end) {
        if (start == end) {
            return list[start];
        }
        int mid = (start + end) / 2;
        ListNode left = divideAndConquer(list, start, mid);
        ListNode right = divideAndConquer(list, mid + 1, end);
        return merge(left, right);
    }


    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode curr = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if(l1 != null){
            curr.next = l1;
        }
        if (l2 != null) {
            curr.next = l2;
        }
        return head.next;
    }

}
