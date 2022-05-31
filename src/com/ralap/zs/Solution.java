package com.ralap.zs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1.获取只有一个出现奇数的数
 * 2.获取俩个出现奇数的数
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.js(new int[]{7,7,7,8,8,9,9});
        solution.js2(new int[]{7,7,7,8,8,8,9,9});
        System.out.println(result);
    }

    public int js(int[] nums) {
        return Arrays.stream(nums).reduce(0, (a, b) -> a ^ b);
    }

    public void js2(int[] nums) {
         int eor = Arrays.stream(nums).reduce(0, (a, b) -> a ^ b);
         int right = eor * (eor -1);
         int z = Arrays.stream(nums).filter(item -> ((item & right) == 0)).reduce(0,(a,b) -> a ^ b);
        System.out.println("a: " + z  + ", b: " + (eor ^ z));
    }
}
