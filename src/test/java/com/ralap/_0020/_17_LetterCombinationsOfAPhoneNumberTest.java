package com.ralap._0020;

import junit.framework.TestCase;

public class _17_LetterCombinationsOfAPhoneNumberTest extends TestCase {

    public void testSolution() {
        _17_LetterCombinationsOfAPhoneNumber lcoapn = new _17_LetterCombinationsOfAPhoneNumber();
        lcoapn.solution("234").forEach(System.out::println);
    }

    public void testSolution_v2() {
        _17_LetterCombinationsOfAPhoneNumber lcoapn = new _17_LetterCombinationsOfAPhoneNumber();
        lcoapn.solution_v2("234").forEach(System.out::println);
    }
}