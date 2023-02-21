package com.ralap._0080;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 76. 最小覆盖子串
 *
 * 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
 *
 *  
 *
 * 注意：
 *
 * 对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。
 * 如果 s 中存在这样的子串，我们保证它是唯一的答案。
 *  
 *
 * 示例 1：
 *
 * 输入：s = "ADOBECODEBANC", t = "ABC"
 * 输出："BANC"
 * 解释：最小覆盖子串 "BANC" 包含来自字符串 t 的 'A'、'B' 和 'C'。
 * 示例 2：
 *
 * 输入：s = "a", t = "a"
 * 输出："a"
 * 解释：整个字符串 s 是最小覆盖子串。
 * 示例 3:
 *
 * 输入: s = "a", t = "aa"
 * 输出: ""
 * 解释: t 中两个字符 'a' 均应包含在 s 的子串中，
 * 因此没有符合条件的子字符串，返回空字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/minimum-window-substring
 */
public class _76_MinimumWindowSubstring {
    public String solution(String source, String target) {
        Map<Character, Integer> targetMap = new HashMap();
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }
        int left, right, rLeft, rRight;
        left = right = rLeft = 0;
        rRight = Integer.MAX_VALUE;
        Map<Character, Integer> sourceMap = new HashMap<>();
        while (right <= source.length()) {
            if (check(targetMap, sourceMap) && right >= left) {
                if (right - left < rRight - rLeft) {
                    rLeft = left;
                    rRight = right;
                }
                char removeChar = source.charAt(left);
                left++;
                sourceMap.put(removeChar, sourceMap.getOrDefault(removeChar, 0) - 1);
            } else {
                if(right < source.length()){
                    char addChar = source.charAt(right);
                    sourceMap.put(addChar, sourceMap.getOrDefault(addChar, 0) + 1);
                }
                right++;
            }
        }
        return source.substring(rLeft, rRight == Integer.MAX_VALUE ? 0 : rRight);
    }

    private boolean check(Map<Character, Integer> targetMap, Map<Character, Integer> sourceMap) {
        Iterator iterator = targetMap.keySet().iterator();
        while (iterator.hasNext()) {
            Character c = (Character) iterator.next();
            int sourceCharCount = sourceMap.getOrDefault(c, 0);
            int targetCharCount = targetMap.getOrDefault(c, 0);
            if (sourceCharCount < targetCharCount) {
                return false;
            }
        }
        return true;
    }
}
