package com.ralap._20;

import junit.framework.TestCase;

public class _13_RomanToIntegerTest extends TestCase {

    public void testSolution() {
        _13_RomanToInteger rt = new _13_RomanToInteger();
        System.out.println(rt.solution("MCMXCIV"));
    }

    public void testSolution_2() {
        _13_RomanToInteger rt = new _13_RomanToInteger();
        System.out.println(rt.solution_2("MCMXCIV"));
    }
}