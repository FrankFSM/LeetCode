package com.ralap.sgg.link;

import org.junit.Test;

public class LinkListTest {

    @Test
    public void append() {
        LinkList list =  new LinkList();
        list.append(4);
        list.append(9);
        list.print();
    }

    @Test
    public void sortEnd() {
        LinkList list =  new LinkList();
        list.sortAdd(4);
        list.sortAdd(9);
        list.sortAdd(5);
        list.sortAdd(1);
        list.sortAdd(10);
        list.sortAdd(2);
        list.sortAdd(7);
        list.sortAdd(3);
        list.print();
    }

    @Test
    public void delete() {
        LinkList list =  new LinkList();
        list.sortAdd(4);
        list.sortAdd(9);
        list.sortAdd(5);
        list.sortAdd(1);
        list.sortAdd(10);
        list.sortAdd(2);
        list.sortAdd(7);
        list.sortAdd(3);
        list.print();
        System.out.println();
        list.delete(4);
        list.delete(7);
        list.print();
    }
    @Test
    public void update() {
        LinkList list =  new LinkList();
        list.sortAdd(4);
        list.sortAdd(9);
        list.sortAdd(5);
        list.sortAdd(1);
        list.sortAdd(10);
        list.sortAdd(2);
        list.sortAdd(7);
        list.sortAdd(3);
        list.print();
        System.out.println();
        list.delete(4);
        list.delete(7);
        list.update(5, 7);
        list.print();
    }

    @Test
    public void reveres(){
        LinkList list =  new LinkList();
        list.sortAdd(4);
        list.sortAdd(9);
        list.sortAdd(5);
        list.sortAdd(1);
        list.sortAdd(10);
        list.sortAdd(2);
        list.sortAdd(7);
        list.sortAdd(3);
        list.print();
        System.out.println();
        LinkNode reverse = list.reveres();
        LinkList.print(reverse);
    }
    @Test
    public void descPrint(){
        LinkList list =  new LinkList();
        list.append(4);
        list.append(9);
        list.append(5);
        list.append(1);
        list.print();
        System.out.println();
        list.descPrint();
    }
}