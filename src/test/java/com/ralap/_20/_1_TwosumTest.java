package com.ralap._20;

import junit.framework.TestCase;
import org.junit.Before;

import java.util.Arrays;

public class _1_TwosumTest extends TestCase {

    public void testSolution() {
        _1_Twosum ts = new _1_Twosum();
        Arrays.stream(ts.solution(new int[]{3,3}, 6)).forEach(System.out::println);
    }
}