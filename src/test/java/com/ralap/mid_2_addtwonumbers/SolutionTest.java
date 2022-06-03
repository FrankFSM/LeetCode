package com.ralap.mid_2_addtwonumbers;

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
        l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        l2 = new ListNode(9, new ListNode(9));
    }

    @After
    public void tearDown() throws Exception {
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    @Test
    public void addTwoNumbers() {
        result = solution.addTwoNumbers(l1, l2);
    }
}