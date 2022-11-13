package com.ralap._20;

import java.nio.charset.IllegalCharsetNameException;
import java.util.HashMap;
import java.util.Map;

/**
 * 10. 正则表达式匹配
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 * <p>
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * 所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "aa", p = "a"
 * 输出：false
 * 解释："a" 无法匹配 "aa" 整个字符串。
 * <p>
 * 示例 2:
 * <p>
 * 输入：s = "aa", p = "a*"
 * 输出：true
 * 解释：因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
 * <p>
 * 示例 3：
 * <p>
 * 输入：s = "ab", p = ".*"
 * 输出：true
 * 解释：".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/regular-expression-matching
 */
public class _10_Regular_Match {
    public Map<String, Boolean> dpTable = new HashMap();


    public boolean solution(String s, String p) {
        return dp(s, 0, p, 0);
    }

    private boolean dp(String str, int strIndex, String reg, int regIndex) {
        int strLen = str.length();
        int regLen = reg.length();
        // baseCase
        if (regLen == regIndex) {  // 正则已经结束
            // 目标串结束：匹配成功，未结束：匹配失败
            return strLen == strIndex;
        }
        if (strLen == strIndex) {  // 目标串结束
            // 判断正则串都能匹配空
            // *与字母成对出现
            if ((regLen - regIndex) % 2 == 1) {
                return false;
            }
            for (int i = regIndex; i < regLen - 1; i += 2) {
                if (reg.charAt(i + 1) != '*') {
                    return false;
                }
            }
            return true;
        }

        String key = strIndex + "," + regIndex;
        if (dpTable.containsKey(key)) {
            return dpTable.get(key);
        }
        boolean result = false;
        char currStr = str.charAt(strIndex);
        char currReg = reg.charAt(regIndex);
        // 相同 ｜｜ 匹配到了.
        if (currReg == currStr || currReg == '.') {
            // 如果下一个是*， 匹配多次、或0次
            if (regIndex < regLen - 1 && reg.charAt(regIndex + 1) == '*') {
                result = dp(str, strIndex, reg, regIndex + 2)
                        || dp(str, strIndex + 1, reg, regIndex);
            } else {
                // 匹配一次
                result = dp(str, strIndex + 1, reg, regIndex + 1);
            }
        } else {
            //  如果下一个是*，只能匹配0次
            if (regIndex < regLen - 1 && reg.charAt(regIndex + 1) == '*') {
                result = dp(str, strIndex, reg, regIndex + 2);
            }
        }
        dpTable.put(key, result);
        return result;
    }
}
