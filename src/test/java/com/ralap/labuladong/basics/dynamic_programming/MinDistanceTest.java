package com.ralap.labuladong.basics.dynamic_programming;

import org.junit.Test;

public class MinDistanceTest {

    @Test
    public void solution() {
        MinDistance md = new MinDistance();
        System.out.println(md.solution("rad", "apple"));
    }

    @Test
    public void memoSolution() {
        MinDistance md = new MinDistance();
        System.out.println(md.memoSolution("rad", "apple"));

    }

    @Test
    public void dpSolution() {
        MinDistance md = new MinDistance();
        System.out.println(md.dpSolution("rad", "apple"));
    }
}