package com.ralap._80;

/**
 * 72. 编辑距离
 * <p>
 * 给你两个单词 word1 和 word2， 请返回将 word1 转换成 word2 所使用的最少操作数  。
 * <p>
 * 你可以对一个单词进行如下三种操作：
 * <p>
 * 插入一个字符
 * 删除一个字符
 * 替换一个字符
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：word1 = "horse", word2 = "ros"
 * 输出：3
 * 解释：
 * horse -> rorse (将 'h' 替换为 'r')
 * rorse -> rose (删除 'r')
 * rose -> ros (删除 'e')
 * 示例 2：
 * <p>
 * 输入：word1 = "intention", word2 = "execution"
 * 输出：5
 * 解释：
 * intention -> inention (删除 't')
 * inention -> enention (将 'i' 替换为 'e')
 * enention -> exention (将 'n' 替换为 'x')
 * exention -> exection (将 'n' 替换为 'c')
 * exection -> execution (插入 'u')
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/edit-distance
 */
public class _72_EditDistance {
    private int[][] memo;

    public int solution(String s1, String s2) {
        memo = new int[s1.length()][s2.length()];
        return this.dp(s1, s2, s1.length() - 1, s2.length() - 1);
    }

    public int dp(String str1, String str2, int str1Index, int str2Index) {
        if (str1Index < 0) {
            return str2Index + 1;
        }
        if (str2Index < 0) {
            return str1Index + 1;
        }
        if (memo[str1Index][str2Index] != 0) {
            return memo[str1Index][str2Index];
        }
        char c1 = str1.charAt(str1Index);
        char c2 = str2.charAt(str2Index);
        if (c1 == c2) {
            memo[str1Index][str2Index] = dp(str1, str2, str1Index - 1, str2Index - 1);
        } else {
            int delete =  dp(str1, str2, str1Index - 1, str2Index);;
            int add = dp(str1, str2, str1Index , str2Index - 1);;
            int update =  dp(str1, str2, str1Index - 1, str2Index - 1);;
            memo[str1Index][str2Index] = Math.min(update, Math.min(delete, add)) + 1;
        }
        return memo[str1Index][str2Index];
    }
}
