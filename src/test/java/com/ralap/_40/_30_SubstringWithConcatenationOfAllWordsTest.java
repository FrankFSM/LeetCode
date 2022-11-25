package com.ralap._40;

import junit.framework.TestCase;

public class _30_SubstringWithConcatenationOfAllWordsTest extends TestCase {

    public void testGetAllPC() {
        _30_SubstringWithConcatenationOfAllWords swcoaw = new _30_SubstringWithConcatenationOfAllWords();
        swcoaw.getAllPC(new String[]{"c","b","a","c","a","a","a","b","c"}).stream().forEach(System.out::println);
//        swcoaw.getAllPC(new String[]{"c","b","a","c", "a"}).stream().forEach(System.out::println);
    }

    public void testSolution() {
        _30_SubstringWithConcatenationOfAllWords swcoaw = new _30_SubstringWithConcatenationOfAllWords();
//        swcoaw.solution("bcabbcaabbccacacbabccacaababcbb", new String[]{"c","b","a","c","a","a","a","b","c"}).stream().forEach(System.out::println);
        swcoaw.solution("aaa", new String[]{"a","a"}).stream().forEach(System.out::println);
    }

    public void testMoveWinSolution() {
        _30_SubstringWithConcatenationOfAllWords swcoaw = new _30_SubstringWithConcatenationOfAllWords();
        swcoaw.moveWinSolution("bcabbcaabbccacacbabccacaababcbb", new String[]{"c","b","a","c","a","a","a","b","c"}).stream().forEach(System.out::println);
//        swcoaw.moveWinSolution("aaa", new String[]{"a","a"}).stream().forEach(System.out::println);
    }
}