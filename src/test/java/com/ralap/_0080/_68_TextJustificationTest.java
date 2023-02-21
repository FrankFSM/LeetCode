package com.ralap._0080;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

public class _68_TextJustificationTest extends TestCase {

    public void testSolution() {
        _68_TextJustification tj = new _68_TextJustification();
        PrintUtils.printListJoin(tj.solution(new String[]{"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"}, 16), "\n");
        System.out.println("====================");
        PrintUtils.printListJoin(tj.solution(new String[]{"What","must","be","acknowledgment","shall","be"}, 16), "\n");
    }
}