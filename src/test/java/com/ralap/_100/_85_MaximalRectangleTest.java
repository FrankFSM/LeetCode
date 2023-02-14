package com.ralap._100;

import junit.framework.TestCase;

public class _85_MaximalRectangleTest extends TestCase {

    public void testSolution() {
        _85_MaximalRectangle mr = new _85_MaximalRectangle();
//        char[][] matrix = new char[][]{
//                {'1', '0', '1', '0', '0'},
//                {'1', '0', '1', '1', '1'},
//                {'1', '1', '1', '1', '1'},
//                {'1', '0', '0', '1', '0'}
//        };
        char[][] matrix = new char[][]{
                {'0','0'}
        };
        System.out.println(mr.solution(matrix));
    }
}