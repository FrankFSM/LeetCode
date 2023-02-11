package com.ralap._100;

import com.ralap.comm.ListNode;

/**
 * 82. 删除排序链表中的重复元素 II
 * <p>
 * 给定一个已排序的链表的头 head ， 删除原始链表中所有重复数字的节点，只留下不同的数字 。返回 已排序的链表 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,3,3,4,4,5]
 * 输出：[1,2,5]
 * 示例 2：
 * <p>
 * <p>
 * 输入：head = [1,1,1,2,3]
 * 输出：[2,3]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/remove-duplicates-from-sorted-list-ii
 */
public class _82_RemoveDuplicatesFromSortedList2 {

    public ListNode solution(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode preNode, first, second, curr;
        preNode = new ListNode(0, head);
        first = head;
        second = head.next;
        curr = preNode;
        boolean flag = true;
        while (second != null) {
            if (second.val == first.val) {
                second = second.next;
                flag = false;
            } else {
                if (flag) {
                    curr.next = first;
                    curr = curr.next;
                }
                first = second;
                second = second.next;
                flag = true;
            }
        }
        if (!flag) {
            curr.next = null;
        } else {
            curr.next = first;
        }
        return preNode.next;
    }
}
