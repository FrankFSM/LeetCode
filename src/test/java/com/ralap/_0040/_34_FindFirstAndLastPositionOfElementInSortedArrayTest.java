package com.ralap._0040;

import junit.framework.TestCase;

import java.util.Arrays;

public class _34_FindFirstAndLastPositionOfElementInSortedArrayTest extends TestCase {

    public void testSolution() {
        _34_FindFirstAndLastPositionOfElementInSortedArray ffapoeisa = new _34_FindFirstAndLastPositionOfElementInSortedArray();
        Arrays.stream(ffapoeisa.solution(new int[] {5,7,7,8,8,10}, 8)).forEach(System.out::println);
        System.out.println();
        Arrays.stream(ffapoeisa.solution(new int[] {5,7,7,8,8,10}, 7)).forEach(System.out::println);
        System.out.println();
        Arrays.stream(ffapoeisa.solution(new int[] {5,7,7,8,8,10}, 5)).forEach(System.out::println);
        System.out.println();
        Arrays.stream(ffapoeisa.solution(new int[] {5,7,7,8,8,10}, 10)).forEach(System.out::println);
        System.out.println();
        Arrays.stream(ffapoeisa.solution(new int[] {5,7,7,8,8,10}, 0)).forEach(System.out::println);
        System.out.println();
        Arrays.stream(ffapoeisa.solution(new int[] {5,7,7,8,8,10}, 6)).forEach(System.out::println);
        System.out.println();
        Arrays.stream(ffapoeisa.solution(new int[] {5,7,7,8,8,10}, 11)).forEach(System.out::println);
        System.out.println();
        Arrays.stream(ffapoeisa.solution(new int[] {2,2}, 2)).forEach(System.out::println);
        System.out.println();




    }
}