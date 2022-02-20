package com.ralap.lengthoflongestsubstring;

import java.util.*;

/**
 * 2.无重复字符的最长子串
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("abcdabcbb");
        System.out.println(result);

    }

    /**
     * 滑动窗口
     * 时间复杂度O(N)
     * 空间复杂度O(|Σ|) Σ所有字符集
     */
    public int lengthOfLongestSubstring(String s) {
        int tail = -1, maxLength = 0;
        int sLen = s.length();
        Set<Character> str = new HashSet<>(sLen);

        for (int i = 0; i < sLen; i++) {
            if (i != 0) {
                // 移除第一个重复的元素
                str.remove(s.charAt(i - 1));
            }
            // 判断是否存在重复的元素
            while (tail < sLen - 1 && !str.contains(s.charAt(tail +1))) {
                // 无重复，加入集合
                str.add(s.charAt(tail + 1));
                // 指针后移
                ++tail;
            }
            maxLength = Math.max(maxLength, str.size());
        }
        return maxLength;
    }
}
