package com.ralap.mergetwolists;

import com.ralap.comm.ListNode;

/**
 * 21. 合并俩个有序列表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5))));
        ListNode l2 = new ListNode(1, new ListNode(3));
//        ListNode result = solution.mergeTwoLists(l1, l2);
//        ListNode result = solution.mergeTwoListRecursion(l1, l2);
        ListNode result = solution.mergeTwoListsLoop(l1, l2);


        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    /**
     * 递归
     * 时间复杂度： O(N+M)
     * 空间复杂度： O(N+M)
     */
    public ListNode mergeTwoListRecursion(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoListRecursion(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoListRecursion(l1, l2.next);
            return l2;
        }

    }

    /**
     * 循环
     * 时间复杂度：O(N+M)
     * 空间复杂度：O(1)
     */
    public ListNode mergeTwoListsLoop(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode(-1);
        ListNode tail = newList;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        tail.next = l1 == null ? l2 : l1;
        return newList.next;
    }

    /**
     * 暴力
     * 时间复杂度O(N)
     * 空间复杂度O(N+M)
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = null, tail = null, next;
        while (list1 != null || list2 != null) {
            //  如果只剩单个列表，直接复制
            if (list1 == null) {
                if (newList == null) {
                    newList = list2;
                    break;
                }
                tail.next = list2;
                break;
            }
            if (list2 == null) {
                if (newList == null) {
                    newList = list1;
                    break;
                }
                tail.next = list1;
                break;
            }
            if (list1.val <= list2.val) {
                // 列表一中的数据 <= 列表二中的
                if (newList == null) {
                    // 首次创建
                    newList = tail = new ListNode(list1.val);
                } else {
                    next = new ListNode(list1.val);
                    // 加入新节点
                    tail.next = next;
                    // 未节点后移
                    tail = tail.next;
                }
                // 遍历后移
                list1 = list1.next;
            } else {
                if (newList == null) {
                    newList = tail = new ListNode(list2.val);
                } else {
                    next = new ListNode(list2.val);
                    tail.next = next;
                    tail = tail.next;
                }
                list2 = list2.next;
            }
        }
        return newList;
    }
}
