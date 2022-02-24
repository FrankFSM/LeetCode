package com.ralap.isvalid;

import java.nio.charset.Charset;
import java.util.*;

/**
 * 2.有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.isValid("[]");
        System.out.println(result);
    }

    /**
     * 时间复杂度O(N)
     * 空间复杂度O(N)
     */
    public boolean isValid(String s) {
        // 长度为奇数,无效
        if (s.length() % 2 == 1) {
            return false;
        }
        // 匹配关系
        Map<Character, Character> map = Map.of('{', '}', '(', ')', '[', ']');
        // 前括号
        Set<Character> keys = map.keySet();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            // 前括号入栈
            if (keys.contains(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                // 为空,后括号与栈顶的不匹配
                if (stack.isEmpty() || !map.get(stack.pop()).equals(s.charAt(i))) {
                    return false;
                }
            }
        }
        // 最后的如是否都匹配出栈
        return stack.isEmpty();
    }
}
