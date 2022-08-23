package com.ralap.sgg.arr;

import java.security.InvalidParameterException;

public class ArrayQueue {
    private int maxSize = 10;
    private int front = 0;
    private int rear = 0;
    private int[] arr;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new int[this.maxSize];
    }

    /**
     * 队列是否满
     */
    public boolean isFull() {
        return rear + 1 % maxSize == front;
    }

    /**
     * 队列是否空
     */
    public boolean isEmpty() {
        return rear == front;
    }

    /**
     * 入队
     */
    public void push(int number) {
        if (isFull()) {
            throw new InvalidParameterException("队列已满");
        }
        arr[rear] = number;
        rear = (rear + 1) % maxSize;
    }

    /**
     * 出队
     */
    public int pop() {
        if (isEmpty()) {
            throw new InvalidParameterException("队列已空");
        }

        int n = this.arr[front];
        front = (front + 1) % maxSize;
        return n;
    }

    /**
     * 队列有效数据个数
     */
    public int queueSize() {
        return (rear + maxSize - front) % maxSize;
    }

    /**
     * 获取队首元素
     */
    public int get() {
        if (isEmpty()) {
            throw new InvalidParameterException("队列已空");
        }
        return arr[front];
    }

    /**
     * 打印队列元素
     */
    public void show() {
        for (int i = front; i < front + queueSize(); i++) {
            System.out.print(arr[i%maxSize] + "\t");
        }
    }
}
