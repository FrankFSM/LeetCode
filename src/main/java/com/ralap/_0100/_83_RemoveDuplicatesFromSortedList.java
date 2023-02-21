package com.ralap._0100;

import com.ralap.comm.ListNode;

/**
 * 83. 删除排序链表中的重复元素
 * 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,1,2]
 * 输出：[1,2]
 * 示例 2：
 * <p>
 * <p>
 * 输入：head = [1,1,2,3,3]
 * 输出：[1,2,3]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/remove-duplicates-from-sorted-list
 */
public class _83_RemoveDuplicatesFromSortedList {

    public ListNode solution(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode next, currNode;
        currNode = head;
        next = head.next;
        while (next != null) {
            if (currNode.val == next.val) {
                next = next.next;
            } else {
                currNode.next = next;
                next = next.next;
                currNode = currNode.next;
            }
        }
        currNode.next = null;
        return head;
    }
}
