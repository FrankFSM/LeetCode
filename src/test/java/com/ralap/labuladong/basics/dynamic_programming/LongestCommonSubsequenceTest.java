package com.ralap.labuladong.basics.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonSubsequenceTest {

    @Test
    public void solution() {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        System.out.println(lcs.solution("babcde", "acze"));
    }

    @Test
    public void solutionDpTable() {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        System.out.println(lcs.solutionDpTable("babcde", "acze"));
    }
}