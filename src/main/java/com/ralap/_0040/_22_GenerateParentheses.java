package com.ralap._0040;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 * <p>
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 * 示例 2：
 * <p>
 * 输入：n = 1
 * 输出：["()"]
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/generate-parentheses
 */
public class _22_GenerateParentheses {

    public List<String> solution(int num) {
        List<String> res = new ArrayList<>();
        genAll(new char[num * 2], 0, res);
        return res;
    }

    private void genAll(char[] c, int pos, List<String> res) {
        if (pos == c.length) {
            String currStr = new String(c);
            if(this.isValid(currStr))
            res.add(currStr);
        } else {
            c[pos] = '(';
            genAll(c, pos + 1, res);
            c[pos] = ')';
            genAll(c, pos + 1, res);
        }
    }

    private boolean isValid(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            num = curr == '(' ? num ++  : num--;
            if (num < 0) {
                return  false;
            }
        }
        return num == 0;
    }

}
