package com.ralap._0080;

import junit.framework.TestCase;

public class _79_WordSearchTest extends TestCase {

    public void testSolution() {
        _79_WordSearch ws = new _79_WordSearch();
        System.out.println(ws.solution(new char[][]{
                {'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}
        }, "ABCCED"));
        System.out.println(ws.solution(new char[][]{
                {'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}
        }, "SEE"));
        System.out.println(ws.solution(new char[][]{
                {'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}
        }, "ABCB"));


        System.out.println(ws.solution(new char[][]{
                {'A', 'B', 'C', 'E'}, {'S', 'F', 'E', 'S'}, {'A', 'D', 'E', 'E'}
        }, "ABCEFSADEESE"));
    }
}