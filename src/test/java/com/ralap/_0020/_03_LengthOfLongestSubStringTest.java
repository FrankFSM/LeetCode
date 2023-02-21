package com.ralap._0020;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _03_LengthOfLongestSubStringTest extends TestCase {

    public void testSolution() {
        _03_LengthOfLongestSubString lolss = new _03_LengthOfLongestSubString();
        String[] testStr = {" ", "", "aaa", "aab", "bba", "abcdadefcb"};
        String[] testStr1 = {"aab"};

        Arrays.stream(testStr).forEach(item->{
            System.out.println(lolss.solution(item));
        });

    }

    public void testSlidingSolution() {
        _03_LengthOfLongestSubString lolss = new _03_LengthOfLongestSubString();
        String[] testStr = {" ", "", "aaa", "aab", "abb", "abcdadefcb"};
        String[] testStr1 = {"aab"};

        Arrays.stream(testStr).forEach(item->{
            System.out.println(lolss.slidingSolution(item));
        });
    }

    public void testMain(){
//        List<Character> window = new ArrayList();
//        window.add('a');
//        window.add('b');
//        window.add('c');
//        window.add('d');
//        window.add('e');
//        window = window.subList(1, window.size());
//        window.stream().forEach(System.out::println);
        IntStream.range(1, 4).forEach(System.out::println);
    }
}