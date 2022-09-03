package com.ralap.labuladong.basics.double_pointer;

import com.ralap.comm.ListNode;

public class FastAndSlow {

    /**
     * 链表是否有环
     *
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast, slow;
        fast = slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    /**
     * 环起始位置
     *
     * @param head
     * @return
     */
    public ListNode cycleFirstNode(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode fast, slow;
        fast = slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        fast = head;
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    /**
     * 无环链表中点
     */
    public ListNode midPoint(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow, fast;
        slow = fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    /**
     * 链表倒数第K个节点
     */
    public ListNode lastKNode(ListNode head, int k) {
        if (head == null || k == 0) {
            return null;
        }
        ListNode fast, slow;
        fast = slow = head;
        int i = k;
        while (i-- != 0) {
            if (fast == null) {
                System.out.println("倒数第" + k + "个节点不存在, 共" + (k-1) + "个节点");
                return null;
            }
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}
