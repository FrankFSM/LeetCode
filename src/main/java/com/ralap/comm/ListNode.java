package com.ralap.comm;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        ListNode curr = this;
        while (curr != null){
           sb.append("ListNode{" +
                    "val=" + curr.val + "}");
           curr = curr.next;
        }
        return sb.toString();
    }
}
