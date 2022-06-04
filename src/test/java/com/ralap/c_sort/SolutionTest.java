package com.ralap.c_sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution;
    private int[] result, params;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
        params = new int[]{4, 7, 2, 5, 3, 2, 4};

    }

    @After
    public void tearDown() throws Exception {
        if (result != null) {
            Arrays.stream(result).forEach(System.out::println);

        }
    }

    @Test
    public void bubbleSort() {
        result = solution.bubbleSort(params);

    }

    @Test
    public void selectSort() {
        result = solution.selectSort(params);
    }

    @Test
    public void insertSort() {
        result = solution.insertSort(params);
    }
}