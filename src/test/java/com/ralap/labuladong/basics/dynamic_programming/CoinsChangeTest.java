package com.ralap.labuladong.basics.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinsChangeTest {

    @Test
    public void solution() {
        CoinsChange coinsChange = new CoinsChange();
        System.out.println(coinsChange.solution(new int[]{ 2, 4}, 11));
    }

    @Test
    public void memorandumSolution() {
        CoinsChange coinsChange = new CoinsChange();
        System.out.println(coinsChange.memorandumSolution(new int[]{1, 2, 5}, 11));
    }

    @Test
    public void dpTableSolution() {
        CoinsChange coinsChange = new CoinsChange();
        System.out.println(coinsChange.dpTableSolution(new int[]{1, 2, 5}, 10));
    }
}