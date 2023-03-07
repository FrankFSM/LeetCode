package com.ralap._0100;

import com.ralap.comm.PrintUtils;
import junit.framework.TestCase;

public class _93_RestoreIpAddressesTest extends TestCase {

    public void testSolution() {
        _93_RestoreIpAddresses ria = new _93_RestoreIpAddresses();
//        PrintUtils.printTwoDimensionalListJoinString(ria.solution("25525511135"), ",");
//        PrintUtils.printTwoDimensionalListJoinString(ria.solution("0000"), ",");
        PrintUtils.printListJoin(ria.solution("101023"), ",");
//
//        PrintUtils.printTwoDimensionalListJoinString(ria.solution("0000"), ",");
//        PrintUtils.printTwoDimensionalListJoinString(ria.solution("0000"), ",");


    }
}