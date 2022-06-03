package com.ralap.easy_27_removeelement;

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
    public void removeElement() {
        result = solution.removeElement(new int[]{1, 2, 3, 5, 7, 9, 5}, 5);

    }

    @Test
    public void removeElementOptional() {
        result = solution.removeElementOptional(new int[]{1, 2, 3, 5, 7, 9, 5}, 5);

    }
}