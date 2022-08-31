package com.ralap.labuladong.basics.dynamic_programming;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibTest {
    private long startTime;

    @Before
    public void setUp() {
        startTime = System.currentTimeMillis();
    }

    @After
    public void sutdown() {
        System.out.println("耗时: " + (System.currentTimeMillis() - startTime) + " ms");
    }

    @Test
    public void fib() {
        Fib fib = new Fib();
        System.out.println(fib.fib(40));
    }

    @Test
    public void fibPb() {
        Fib fib = new Fib();
        System.out.println(fib.fibPb(40));
    }

    @Test
    public void opt() {
        Fib fib = new Fib();
        System.out.println(fib.opt(40));
    }
}