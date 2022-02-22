package com.ralap.longestcommonprefix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = new String[]{"flower", "flow", "flight"};
        String result = solution.longestCommonPrefix(strs);

        System.out.println(result);

    }

    /**
     * 暴力枚举
     * 时间复杂度O(N^2)
     * 空间复杂度O(1)
     */
    public String longestCommonPrefix(String[] strs) {
        int minLen = 0, maxPrefix = 0;
        for (int i = 0; i < strs.length; i++) {
            minLen = Math.min(minLen, strs[0].length());
        }
        while (minLen>0){
            for (int i = 0; i < minLen; i++) {
                
            }

            minLen--;
        }

    }
}
