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

    @Test
    public void checkInclusion() {
        SlidingWindow solution = new SlidingWindow();
        String window = "helloworld";
        String need = "oow";
        System.out.println(solution.checkInclusion(window, need));
    }

    @Test
    public void findAnagrams() {
        SlidingWindow solution = new SlidingWindow();
        String window = "cbaebabacd";
        String need = "abc";
        System.out.println(solution.findAnagrams(window, need));
    }

    @Test
    public void longSubstring() {
        SlidingWindow solution = new SlidingWindow();
        String window = "aabab";
        System.out.println(solution.longSubstring(window));
    }
}