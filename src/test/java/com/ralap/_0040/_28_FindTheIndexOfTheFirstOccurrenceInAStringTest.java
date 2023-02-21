package com.ralap._0040;

import junit.framework.TestCase;

import java.util.Arrays;

public class _28_FindTheIndexOfTheFirstOccurrenceInAStringTest extends TestCase {

    public void testSolution() {
        _28_FindTheIndexOfTheFirstOccurrenceInAString fti = new _28_FindTheIndexOfTheFirstOccurrenceInAString();
        System.out.println(fti.solution("mississippi", "issip"));
    }

    public void testGenNext() {
        _28_FindTheIndexOfTheFirstOccurrenceInAString fti = new _28_FindTheIndexOfTheFirstOccurrenceInAString();
        Arrays.stream(fti.genNext("abab")).forEach(System.out::println);
    }

    public void testKmpSolution() {
        _28_FindTheIndexOfTheFirstOccurrenceInAString fti = new _28_FindTheIndexOfTheFirstOccurrenceInAString();
        System.out.println(fti.kmpSolution("mississippi", "issip"));
    }
}