package com.ralap.labuladong.basics.sliding_window;

import org.junit.Test;

import static org.junit.Assert.*;

public class SlidingWindowTest {

    @Test
    public void minWindow() {
        SlidingWindow solution = new SlidingWindow();
        String window = "ADBECFEBANC";
        String need = "ABC";
        System.out.println(solution.minWindow(window, need));
    }
}