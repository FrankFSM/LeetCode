package com.ralap._0100;

import com.ralap.comm.ListNode;

/**
 * 86. 分隔链表
 * <p>
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 * <p>
 * 你应当 保留 两个分区中每个节点的初始相对位置。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,4,3,2,5,2], x = 3
 * 输出：[1,2,2,4,3,5]
 * 示例 2：
 * <p>
 * 输入：head = [2,1], x = 2
 * 输出：[1,2]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/partition-list
 */
public class _86_PartitionList {

    public ListNode solution(ListNode head, int target) {

        ListNode h1 = new ListNode(0);
        ListNode curr1 = h1;
        ListNode h2 = new ListNode(0);
        ListNode curr2 = h2;
        while (head != null) {
            if (head.val < target) {
                curr1.next = head;
                curr1 = curr1.next;
            } else {
                curr2.next = head;
                curr2 = curr2.next;
            }
            head = head.next;
        }

        curr2.next = null;
        curr1.next = h2.next;
        return h1.next;
    }
}
