package com.ralap._20;

import java.util.*;

/**
 * 20. 有效的括号
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 *  
 *
 * 示例 1：
 *
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 *
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 *
 * 输入：s = "(]"
 * 输出：false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/valid-parentheses
 */
public class _20_ValidParentheses {

    public boolean solution(String str){
        Map<Character, Character> map = new HashMap<>(4);
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if(map.containsKey(currChar)){
                stack.push(currChar);
            }
            if(map.containsValue(currChar)){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                char should = map.get(top);
                if(should == 0 || should != currChar){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
