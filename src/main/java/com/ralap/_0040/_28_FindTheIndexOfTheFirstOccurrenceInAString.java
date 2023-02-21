package com.ralap._0040;

/**
 * 28. 找出字符串中第一个匹配项的下标
 * <p>
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。如果 needle 不是 haystack 的一部分，则返回  -1 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：haystack = "sadbutsad", needle = "sad"
 * 输出：0
 * 解释："sad" 在下标 0 和 6 处匹配。
 * 第一个匹配项的下标是 0 ，所以返回 0 。
 * 示例 2：
 * <p>
 * 输入：haystack = "leetcode", needle = "leeto"
 * 输出：-1
 * 解释："leeto" 没有在 "leetcode" 中出现，所以返回 -1 。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/find-the-index-of-the-first-occurrence-in-a-string
 */
public class _28_FindTheIndexOfTheFirstOccurrenceInAString {

    /**
     * 暴力：双指针
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int solution(String haystack, String needle) {
        int first = 0, second = 0;
        while (first < haystack.length()) {
            if (haystack.charAt(first) == needle.charAt(second)) {
                second++;
            } else {
                // 指针回调
                first = first - second;
                // 重置
                second = 0;
            }
            first++;
            if (second == needle.length()) {
                return first - needle.length();
            }
        }
        return -1;
    }

    /**
     * KMPfd
     */
    public int kmpSolution(String haystack, String needle) {

        int[] next = this.genNext(needle);
        int first = 0, second = 0;
        while(first < haystack.length()){
            if (haystack.charAt(first) == needle.charAt(second)) {
                second++;
            } else {
                first = first - (second - next[second]);
                second = 0;
            }
            first++;
            if (second == needle.length()) {
                return first - needle.length();
            }
        }
        return -1;
    }

    /**
     *  部分匹配表
     * @param str
     * @return
     */
    public int[] genNext(String str) {
        int[] next = new int[str.length()];
        for (int i = 1; i <= str.length(); i++) {
            int maxLen = 0;
            int j = 1;
            while (j < i) {
                if (str.substring(0, j).equals(str.substring(i - j, i))) {
                    maxLen = j;
                }
                j++;
            }
            next[i-1] = maxLen;
        }
        return next;
    }

}
