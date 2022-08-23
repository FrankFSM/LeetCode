package com.ralap.sgg.link;

import java.util.Stack;

public class LinkList {
    private LinkNode head = new LinkNode(-1, null);

    /**
     * 追加到最后
     */
    public LinkNode append(int num) {
        LinkNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new LinkNode(num);
        return head;
    }


    /**
     * 按顺序添加
     */
    public LinkNode sortAdd(int num) {
        LinkNode temp = head;

        while (temp.next != null) {
            LinkNode next = temp.next;
            if(num<next.val){
                temp.next = new LinkNode(num, next);
                return head;
            }else if (num==next.val){
                throw new RuntimeException("编号已存在： " + num);
            }
            temp = temp.next;
        }
        temp.next = new LinkNode(num);
        return head;
    }

    /**
     * 删除
     */
    public void delete(int num) {
        LinkNode temp  = head;
        while (temp.next != null){
            LinkNode next = temp.next;
            if (next.val == num) {
                temp.next = next.next;
                break;
            }
            temp = temp.next;
        }
    }

    /**
     * 反转
     * @return
     */
    public LinkNode reveres(){
        LinkNode reveres = new LinkNode(-1);
        LinkNode temp  = head;
        while (temp.next !=null){
            LinkNode next = reveres.next;
            LinkNode curr = new LinkNode(temp.next.val);
            reveres.next = curr;
            curr.next = next;
            temp = temp.next;
        }
        return reveres;
    }
    /**
     * 倒序打印
     */
    public void descPrint(){
        if (head.next == null) {
            System.out.println("空链表");
            return;
        }
        LinkNode temp  = head.next;
        Stack<LinkNode> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        while (stack.size() >0){
            System.out.print(stack.pop().val + "\t");
        }

    }
    public void update(int sourceNum, int targetNum) {
       delete(sourceNum);
       sortAdd(targetNum);
    }

    public void print(){
        LinkNode temp = head.next;
        while (temp != null){
            System.out.print(temp.val + "\t");
            temp = temp.next;
        }
    }
    public static void print(LinkNode head){
        LinkNode temp = head.next;
        while (temp != null){
            System.out.print(temp.val + "\t");
            temp = temp.next;
        }
    }
}
