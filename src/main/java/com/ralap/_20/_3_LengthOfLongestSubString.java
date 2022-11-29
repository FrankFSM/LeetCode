package com.ralap._20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 2. 无重复字符的最长子串
 * <p>
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/longest-substring-without-repeating-characters/
 */
public class _3_LengthOfLongestSubString {

    /**
     * 滑动窗口
     */
    public int slidingSolution(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int right = 0;
        int max = 0;

        List<Character> window = new ArrayList();
        while (right < str.length()) {
            char currStr = str.charAt(right);
            right++;

            while (window.contains(currStr)) {
                int index = window.indexOf(currStr);
                window = window.subList(index + 1, window.size());
            }
            window.add(currStr);
            max = Math.max(max, window.size());
        }
        return max;
    }

    /**
     * 暴力破解
     */
    public int solution(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int start = 0, end = 0;
        int strLen = str.length();
        int max = 1;
        // 初始化只有第一个字符
        String currStr = str.charAt(0) + "";
        String maxStr = "";

        while (end < strLen) {
            if (start < end) {
                // 存在，开始位置后移
                if (currStr.contains(str.charAt(end) + "")) {
                    // 找到重复位置
                    int moveIndex = currStr.indexOf(str.charAt(end));
                    start += moveIndex + 1;
                } else {
                    // 不存在，后移
                    end++;
                }
            } else {
                end++;
            }
            currStr = str.substring(start, end);
            maxStr = currStr.length() > max ? currStr : maxStr;
            max = Math.max(max, currStr.length());
        }
        System.out.println("【" + maxStr + "】");
        return max;
    }
}
