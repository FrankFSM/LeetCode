package com.ralap._40;

import junit.framework.TestCase;

import java.util.Arrays;

public class _27_RemoveElementTest extends TestCase {

    public void testSolution() {
        _27_RemoveElement re = new _27_RemoveElement();
        int[] nums = new int[]{3, 2, 3, 2, 3,1,2};
        int count = re.solution(nums, 3);
        System.out.println(count);
       Arrays.stream(nums).forEach(System.out::println);
    }
}