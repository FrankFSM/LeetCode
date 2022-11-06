package com.ralap._20;

import com.ralap.sgg.link.LinkNode;
import junit.framework.TestCase;

import javax.sound.sampled.Line;

public class _2_AddTwoNumbersTest extends TestCase {

    public void testSolution() {
        _2_AddTwoNumbers atn = new _2_AddTwoNumbers();
        LinkNode l1 = new LinkNode(9);
        l1.next = new LinkNode(9);
        l1.next.next = new LinkNode(9);
        l1.next.next.next = new LinkNode(9);
        l1.next.next.next.next = new LinkNode(9);
        l1.next.next.next.next.next = new LinkNode(9);
        l1.next.next.next.next.next.next = new LinkNode(9);
        LinkNode l2 = new LinkNode(9);
        l2.next = new LinkNode(9);
        l2.next.next = new LinkNode(9);
        l2.next.next.next = new LinkNode(9);
        LinkNode sum = atn.solution(l1, l2);
        sum.print();

    }
}