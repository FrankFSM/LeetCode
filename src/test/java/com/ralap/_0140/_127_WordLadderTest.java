package com.ralap._0140;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;

public class _127_WordLadderTest extends TestCase {

    public void testLadderLength() {
        _127_WordLadder solution = new _127_WordLadder();
        System.out.println(
                solution.ladderLength("hit",
                        "cog",
                        Arrays.asList(new String[]{"hot", "dot", "dog", "lot", "log", "cog"})
                ));
    }
}