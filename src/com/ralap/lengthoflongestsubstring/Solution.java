package com.ralap.lengthoflongestsubstring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 2.无重复字符的最长子串
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("abcabcbb");

        System.out.println(result);

    }

    /**
     * 时间复杂度O(N^2)
     * 空间复杂度O(1)
     */
    public int lengthOfLongestSubstring(String s) {
        int head = 0 , tail = 0 , maxLength = 0;
        while (tail == s.length()){

        }
        return maxLength;



    }
}
