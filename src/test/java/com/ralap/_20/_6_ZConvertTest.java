package com.ralap._20;

import junit.framework.TestCase;

public class _6_ZConvertTest extends TestCase {

    public void testSolution() {
        _6_ZConvert zc = new _6_ZConvert();
        String result = zc.solution("PAYPALISHIRING", 3);
        assertEquals(result, "PAHNAPLSIIGYIR");
        System.out.println(result);
        String result1 = zc.solution("PAYPALISHIRING", 4);
        assertEquals(result1, "PINALSIGYAHRPI");
        System.out.println(result1);

        System.out.println(zc.solution("A", 1));
    }
}