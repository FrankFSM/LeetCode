package com.ralap._20;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3_LengthOfLongestSubStringTest extends TestCase {

    public void testSolution() {
        _3_LengthOfLongestSubString lolss = new _3_LengthOfLongestSubString();
        String[] testStr = {" ", "", "aaa", "aab", "bba", "abcdadefcb"};
        String[] testStr1 = {"aab"};

        Arrays.stream(testStr).forEach(item->{
            System.out.println(lolss.solution(item));
        });

    }

    public void testSlidingSolution() {
        _3_LengthOfLongestSubString lolss = new _3_LengthOfLongestSubString();
        String[] testStr = {" ", "", "aaa", "aab", "abb", "abcdadefcb"};
        String[] testStr1 = {"aab"};

        Arrays.stream(testStr).forEach(item->{
            System.out.println(lolss.slidingSolution(item));
        });
    }

    public void testMain(){
        List<Character> window = new ArrayList();
        window.add('a');
        window.add('b');
        window.add('c');
        window.add('d');
        window.add('e');
        window = window.subList(1, window.size());
        window.stream().forEach(System.out::println);
    }
}