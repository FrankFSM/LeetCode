package com.ralap.sgg.link;

public class LinkNode {
    public int val;
    public LinkNode next;

    public LinkNode() {
    }

    public LinkNode(int val) {
        this.val = val;
    }

    public LinkNode(int val, LinkNode next) {
        this.val = val;
        this.next = next;
    }

    public void print() {
        LinkNode curr = this;
        while (curr != null){
            System.out.print(curr.val +  ",");
            curr = curr.next;
        }
        System.out.println();
    }
}
