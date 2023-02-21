package com.ralap._0020;

import junit.framework.TestCase;

public class _06_ZConvertTest extends TestCase {

    public void testSolution() {
        _06_ZConvert zc = new _06_ZConvert();
        String result = zc.solution("PAYPALISHIRING", 3);
        assertEquals(result, "PAHNAPLSIIGYIR");
        System.out.println(result);
        String result1 = zc.solution("PAYPALISHIRING", 4);
        assertEquals(result1, "PINALSIGYAHRPI");
        System.out.println(result1);

        System.out.println(zc.solution("A", 1));
    }
}