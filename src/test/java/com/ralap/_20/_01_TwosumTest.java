package com.ralap._20;

import junit.framework.TestCase;

import java.util.Arrays;

public class _01_TwosumTest extends TestCase {

    public void testSolution() {
        _01_Twosum ts = new _01_Twosum();
        Arrays.stream(ts.solution(new int[]{3,3}, 6)).forEach(System.out::println);
    }
}