package com.ralap._0040;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 32. 最长有效括号
 * 给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "(()"
 * 输出：2
 * 解释：最长有效括号子串是 "()"
 * 示例 2：
 * <p>
 * 输入：s = ")()())"
 * 输出：4
 * 解释：最长有效括号子串是 "()()"
 * 示例 3：
 * <p>
 * 输入：s = ""
 * 输出：0
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/longest-valid-parentheses
 */
public class _32_LongestValidParentheses {

    public int solution(String str) {

        Stack<St> stack = new Stack<>();
        int index = 0;

        Map<Integer, Integer> map = new HashMap<>();

        while (index < str.length()) {
            char currChar = str.charAt(index);
            if (currChar == ')') {
                if (!stack.isEmpty()) {
                    St top = stack.peek();
                    if(top.c == '('){
                        stack.pop();
                        map.put(index, 1);
                        index++;
                        continue;
                    }
                }
            }
            map.put(index, 0);
            stack.push(new St(currChar,index));
            index++;
        }
        int max = 0;
        int end = str.length();
        while (!stack.isEmpty()){
            St st = stack.pop();
            int start = st.index;
            int count = 0;
            for (int i = start; i < end; i++) {
                count = count + map.get(i);
            }
            max = Math.max(count, max);
            end = start;
        }
        int count = 0;

        for (int i = 0; i < end; i++) {
            count = count + map.get(i);
        }
        max = Math.max(count, max);
        return max * 2;
    }

    class St{
        public St(Character c, int index) {
            this.c = c;
            this.index = index;
        }
        public Character c;
        public int index;
    }


}
