package com.ralap.easy_21_mergetwolists;

import com.ralap.comm.ListNode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution;
    private ListNode l1, l2, result;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
        l1 = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5))));
        l2 = new ListNode(1, new ListNode(3));
    }

    @After
    public void tearDown() throws Exception {
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    @Test
    public void mergeTwoListRecursion() {
        result = solution.mergeTwoListRecursion(l1, l2);
    }

    @Test
    public void mergeTwoListsLoop() {
        result = solution.mergeTwoListsLoop(l1, l2);
    }

    @Test
    public void mergeTwoLists() {
        result = solution.mergeTwoLists(l1, l2);

    }
}