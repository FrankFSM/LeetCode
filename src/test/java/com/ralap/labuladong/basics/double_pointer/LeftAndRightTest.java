package com.ralap.labuladong.basics.double_pointer;

import com.ralap.comm.PrintUtils;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LeftAndRightTest {

    @Test
    public void binarySearch() {
        LeftAndRight solution  = new LeftAndRight();
        int[] array = new int[]{1,2,3,5,6,7,8};
        System.out.println(solution.binarySearch(array, 10));
    }

    @Test
    public void towSum() {
        LeftAndRight solution  = new LeftAndRight();
        int[] array = new int[]{2,7,11,15};
        int[] result = solution.towSum(array, 29);
        if (result == null) {
            System.out.println("不存在");
            return;
        }
        Arrays.stream(result).forEach(System.out::println);
    }

    @Test
    public void reverse() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        PrintUtils.printArrayJoin(arr, " , ");
        LeftAndRight solution  = new LeftAndRight();
        solution.reverse(arr);
        PrintUtils.printArrayJoin(arr, " | ");
    }
}