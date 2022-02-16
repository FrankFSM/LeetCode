package com.ralap.addtwonumbers;

import com.ralap.comm.ListNode;

import java.util.Arrays;


/**
 * 两数相加
 * 给你两个非空的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以0开头。
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] resultHash = solution.addTwoNumbers(new int[]{1, 2, 3, 5, 7, 9, 11}, 13);
        Arrays.stream(resultHash).forEach(System.out::println);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    }
}
