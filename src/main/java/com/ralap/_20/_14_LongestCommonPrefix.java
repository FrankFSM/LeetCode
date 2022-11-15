package com.ralap._20;

/**
 * 14. 最长公共前缀
 * <p>
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 * <p>
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/longest-common-prefix
 */
public class _14_LongestCommonPrefix {

    public String solution(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String firstStr = strs[0];
        int currIndex = 0;
        boolean flag = true;
        while(flag){
            for (int i = 1; i < strs.length; i++) {
                if (currIndex >= strs[i].length()
                        || currIndex >= firstStr.length()
                        || firstStr.charAt(currIndex) != strs[i].charAt(currIndex))
                {
                    flag = false;
                    break;
                }
            }
            currIndex++;
        }
        return firstStr.substring(0, currIndex -1);
    }
}
