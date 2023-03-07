package com.ralap._0100;

/**
 * 97. 交错字符串
 * <p>
 * 给定三个字符串 s1、s2、s3，请你帮忙验证 s3 是否是由 s1 和 s2 交错 组成的。
 * <p>
 * 两个字符串 s 和 t 交错 的定义与过程如下，其中每个字符串都会被分割成若干 非空 子字符串：
 * <p>
 * s = s1 + s2 + ... + sn
 * t = t1 + t2 + ... + tm
 * |n - m| <= 1
 * 交错 是 s1 + t1 + s2 + t2 + s3 + t3 + ... 或者 t1 + s1 + t2 + s2 + t3 + s3 + ...
 * 注意：a + b 意味着字符串 a 和 b 连接。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
 * 输出：false
 * 示例 3：
 * <p>
 * 输入：s1 = "", s2 = "", s3 = ""
 * 输出：true
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/interleaving-string
 */
public class _97_InterleavingString {
    public boolean solution(String s1, String s2, String s3) {
        int s1Len = s1.length();
        int s2Len = s2.length();
        int s3Len = s3.length();
        if (s1Len + s2Len != s3Len) {
            return false;
        }
        boolean[][] dp = new boolean[s1Len  + 1][s2Len + 1];
        dp[0][0] = true;
        for (int i = 1; i <= s1Len; i++) {
            dp[i][0] = (s3.charAt(i-1) == s1.charAt(i-1) & dp[i-1][0]);
        }
        for (int i = 1; i <= s2Len; i++) {
            dp[0][i] = (s3.charAt(i-1) == s2.charAt(i-1) & dp[0][i-1]);
        }

        for (int i = 1; i <= s1Len; i++) {
            for (int j = 1; j <= s2Len; j++) {
                int curr = i + j -1;
                dp[i][j] = (dp[i -1][j] && s1.charAt(i-1) == s3.charAt(curr))
                        || (dp[i][j -1] && s2.charAt(j-1) == s3.charAt(curr));
            }
        }
        return dp[s1Len][s2Len];
    }
}
