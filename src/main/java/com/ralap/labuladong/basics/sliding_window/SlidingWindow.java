package com.ralap.labuladong.basics.sliding_window;

import java.util.*;

public class SlidingWindow {

    /**
     * 最长无重复子串
     */
    public int longSubstring(String source) {
        if (source.length() == 0) {
            return 0;
        }
        Map<Character, Integer> window, need;
        window = new HashMap<>();
        need = new HashMap<>();
        int left = 0, right = 0, valid = 0, result = 0;
        while (right < source.length()) {
            Character currLast = source.charAt(right);
            right++;
            window.put(currLast, window.getOrDefault(currLast, 0) + 1);
            while (window.get(currLast) > 1) {
                Character leftChar = source.charAt(left);
                left++;
                window.put(leftChar, window.get(leftChar) - 1);
            }
            result = Math.max(result, right - left);
        }
        return result;
    }
    /**
     * 所有字母异位词
     */
    public List<Integer> findAnagrams(String source, String target) {
        if (source.length() == 0 || target.length() == 0) {
            return Arrays.asList(0);
        }
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> window, need;
        window = new HashMap<>();
        need = new HashMap<>();
        for (int i = 0; i < target.length(); i++) {
            need.put(target.charAt(i), need.getOrDefault(target.charAt(i), 0) + 1);
        }
        int left = 0, right = 0, valid = 0;
        while (right < source.length()) {
            Character currLast = source.charAt(right);
            right++;
            if (need.containsKey(currLast)) {
                window.put(currLast, window.getOrDefault(currLast, 0) + 1);
                if (window.get(currLast) == need.get(currLast)) {
                    valid++;
                }
            }
            while (right - left >= target.length()) {
                if (valid == need.size()) {
                    result.add(left);
                }
                Character leftChar = source.charAt(left);
                left++;
                if (need.containsKey(leftChar)) {
                    if (need.get(leftChar) == window.get(leftChar)) {
                        valid--;
                    }
                    window.put(leftChar, window.get(leftChar) - 1);
                }
            }
        }
        return result;
    }

    /**
     * 字符串排列
     */
    public boolean checkInclusion(String source, String target) {
        // 合法性校验
        if (source.length() == 0 || target.length() == 0) {
            return false;
        }
        Map<Character, Integer> window, need;
        window = new HashMap<>();
        need = new HashMap<>();
        // 初始化need,方便后续判断
        for (int i = 0; i < target.length(); i++) {
            need.put(target.charAt(i), need.getOrDefault(target.charAt(i), 0) + 1);
        }
        // 初始化变量
        int left = 0, right = 0, valid = 0;
        while (right < source.length()) {
            Character currLast = source.charAt(right);
            right++;
            // 存在目标中
            if (need.containsKey(currLast)) {
                // 加入窗口中
                window.put(currLast, window.getOrDefault(currLast, 0) + 1);
                // 如果个数符合目标个数，更新valid
                if (need.get(currLast) == window.get(currLast)) {
                    valid++;
                }
            }

            // 判断是否需要收缩
            while (right - left >= target.length()) {
                // 符合要求
                if (valid == need.size()) {
                    return true;
                }
                Character leftChar = source.charAt(left);
                left++;
                // 如果移除去的包含目标字符
                if (need.containsKey(leftChar)) {
                    if (window.get(leftChar) == need.get(leftChar)) {
                        valid--;
                    }
                    window.put(leftChar, window.get(leftChar) - 1);
                }
            }

        }
        return false;
    }

    /**
     * 最小覆盖子串
     */
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        Map<Character, Integer> need, window;
        need = new HashMap<>();
        window = new HashMap<>();
        // 初始化子串
        for (int i = 0; i < t.toCharArray().length; i++) {
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0) + 1);
        }
        int left = 0, right = 0;
        int valid = 0;
        int start = 0, len = Integer.MAX_VALUE;
        while (right < s.length()) {
            // 向后扩展窗口
            char currLast = s.charAt(right);
            right++;
            // 更新数据
            if (need.containsKey(currLast)) {
                window.put(currLast, window.getOrDefault(currLast, 0) + 1);
                // 窗口中的个数是否和和目标的个数相等
                if (window.get(currLast) == need.get(currLast)) {
                    valid++;
                }
            }
            // 判断左侧窗口是否需要收缩
            while (valid == need.size()) {
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                char remove = s.charAt(left);
                left++;
                // 移出更新
                if (need.containsKey(remove)) {
                    window.put(remove, window.get(remove) - 1);
                    if (window.get(remove) == need.get(remove)) {
                        valid--;
                    }
                }
            }
        }
        return len == Integer.MAX_VALUE ? " " : s.substring(start, start + len);
    }
}
