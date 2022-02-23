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
     * 纵向扫描
     * 时间复杂度O(N*M)
     * 空间复杂度O(1)
     */
    public String longestCommonPrefix(String[] strs) {
        int minLen = strs[0].length(), maxPrefix = 0;
        for (int i = 0; i < strs.length; i++) {
            minLen = Math.min(minLen, strs[i].length());
        }
        for (int i = 0; i < minLen; i++) {
            Character str  = strs[0].charAt(i);
            int sameCount = 1;
            for (int j = 1; j < strs.length; j++) {
                if (str.equals(strs[j].charAt(i))) {
                    sameCount++;
                }else{
                    break;
                }
            }
            if (sameCount == strs.length) {
                maxPrefix++;
            }else{
                break;
            }
        }
        return strs[0].substring(0,maxPrefix);

//        if (strs.length == 0) return "";
//        int rows = strs.length;
//        int cols = strs[0].length();
//        for (int i = 0; i < cols; i++) {
//            char firstChar = strs[0].charAt(i);
//            for (int j = 1; j < rows; j++) {
//                // 比较的列数已经与比较的字符串长度一致，说明比较到了最后
//                if (strs[j].length() == i || strs[j].charAt(i) != firstChar) {
//                    return strs[0].substring(0, i);
//                }
//            }
//        }
//        return strs[0];

    }
}
