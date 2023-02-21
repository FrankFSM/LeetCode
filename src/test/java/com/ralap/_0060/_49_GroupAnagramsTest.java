package com.ralap._0060;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

public class _49_GroupAnagramsTest extends TestCase {

    public void testSolution() {
        _49_GroupAnagrams ga = new _49_GroupAnagrams();

        PrintUtils.printTwoDimensionalListJoinString(ga.solution(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}),",");
    }
}