package com.ralap._60;

/**
 * 44. 通配符匹配
 * <p>
 * 给定一个字符串 (s) 和一个字符模式 (p) ，实现一个支持 '?' 和 '*' 的通配符匹配。
 * <p>
 * '?' 可以匹配任何单个字符。
 * '*' 可以匹配任意字符串（包括空字符串）。
 * 两个字符串完全匹配才算匹配成功。
 * <p>
 * 说明:
 * <p>
 * s 可能为空，且只包含从 a-z 的小写字母。
 * p 可能为空，且只包含从 a-z 的小写字母，以及字符 ? 和 *。
 * 示例 1:
 * <p>
 * 输入:
 * s = "aa"
 * p = "a"
 * 输出: false
 * 解释: "a" 无法匹配 "aa" 整个字符串。
 * 示例 2:
 * <p>
 * 输入:
 * s = "aa"
 * p = "*"
 * 输出: true
 * 解释: '*' 可以匹配任意字符串。
 * 示例 3:
 * <p>
 * 输入:
 * s = "cb"
 * p = "?a"
 * 输出: false
 * 解释: '?' 可以匹配 'c', 但第二个 'a' 无法匹配 'b'。
 * 示例 4:
 * <p>
 * 输入:
 * s = "adceb"
 * p = "*a*b"
 * 输出: true
 * 解释: 第一个 '*' 可以匹配空字符串, 第二个 '*' 可以匹配字符串 "dce".
 * 示例 5:
 * <p>
 * 输入:
 * s = "acdcb"
 * p = "a*c?b"
 * 输出: false
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/wildcard-matching
 */
public class _44_WildcardMatching {

    public boolean solution(String str, String ruler) {
        int strLen = str.length(), rulerLen = ruler.length();
        boolean[][] dp = new boolean[strLen + 1][rulerLen + 1];
        dp[0][0] = true;
        for (int i = 1; i <= rulerLen; i++) {
            if (ruler.charAt(i - 1) == '*') {
                dp[0][i] = true;
            } else {
                break;
            }
        }
        for (int i = 1; i <= strLen; i++) {
            for (int j = 1; j <= rulerLen; j++) {
                if (str.charAt(i - 1) == ruler.charAt(j - 1) || ruler.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (ruler.charAt(j-1) == '*'){
                    dp[i][j] = dp[i][j - 1] || dp[i-1][j];
                }else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[strLen][rulerLen];
    }
}
