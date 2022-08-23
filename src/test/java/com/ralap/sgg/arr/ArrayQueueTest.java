package com.ralap.sgg.arr;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayQueueTest {
    private ArrayQueue queue = new ArrayQueue(10);
    private void init(){
        queue.push(9);
        queue.push(4);
        queue.push(8);
        queue.push(1);
        queue.push(3);
        queue.push(7);
    }

    @Test
    public void push() {
        init();
        queue.push(10);
        queue.show();
    }

    @Test
    public void pop() {
        init();
        int num = queue.pop();
        System.out.println("pop:" + num);
        queue.show();
    }
}