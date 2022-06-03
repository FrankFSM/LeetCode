package com.ralap.easy_26_removeduplicates;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    private Solution solution;
    private int result;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(result);

    }

    @Test
    public void removeDuplicationsDoublePointer() {
        result = solution.removeDuplicationsDoublePointer(new int[]{0, 0, 1, 1, 2, 2, 3, 3, 3, 4, 4});

    }

    @Test
    public void removeDuplicates() {
        result = solution.removeDuplicates(new int[]{0, 0, 1, 1, 2, 2, 3, 3, 3, 4, 4});

    }
}