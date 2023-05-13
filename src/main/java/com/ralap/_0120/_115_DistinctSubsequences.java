package com.ralap._0120;

/**
 * 115. 不同的子序列
 * <p>
 * 给你两个字符串 s 和 t ，统计并返回在 s 的 子序列 中 t 出现的个数。
 * 题目数据保证答案符合 32 位带符号整数范围。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "rabbbit", t = "rabbit"
 * 输出：3
 * 解释：
 * 如下所示, 有 3 种可以从 s 中得到 "rabbit" 的方案。
 * rabbbit
 * rabbbit
 * rabbbit
 * 示例 2：
 * <p>
 * 输入：s = "babgbag", t = "bag"
 * 输出：5
 * 解释：
 * 如下所示, 有 5 种可以从 s 中得到 "bag" 的方案。
 * babgbag
 * babgbag
 * babgbag
 * babgbag
 * babgbag
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length, t.length <= 1000
 * s 和 t 由英文字母组成
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/distinct-subsequences
 */
class _115_DistinctSubsequences {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[t.length() + 1][s.length() + 1];
        for (int i = 0; i <= t.length(); i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= s.length(); i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i <= t.length(); i++) {
            for (int j = 1; j <= s.length(); j++) {
                if (t.charAt(i-1) == s.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                }else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[t.length()][s.length()];
    }
}

