package com.ralap.labuladong.basics.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindow {

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
