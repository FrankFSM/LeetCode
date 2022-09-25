package com.ralap.labuladong.basics.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibTest {

    @Test
    public void solution() {
        Fib fib = new Fib();
        System.out.println(fib.solution(40));
    }

    @Test
    public void dpTableSolution() {
        Fib fib = new Fib();
        System.out.println(fib.dpTableSolution(50));
    }


    @Test
    public void memorandumSolution() {
        Fib fib = new Fib();
        System.out.println(fib.memorandumSolution(50));
    }
}