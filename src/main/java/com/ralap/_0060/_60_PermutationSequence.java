package com.ralap._0060;

import java.util.Arrays;

/**
 * 60. 排列序列
 * <p>
 * 给出集合 [1,2,3,...,n]，其所有元素共有 n! 种排列。
 * <p>
 * 按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
 * <p>
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * 给定 n 和 k，返回第 k 个排列。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 3, k = 3
 * 输出："213"
 * 示例 2：
 * <p>
 * 输入：n = 4, k = 9
 * 输出："2314"
 * 示例 3：
 * <p>
 * 输入：n = 3, k = 1
 * 输出："123"
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/permutation-sequence
 */
public class _60_PermutationSequence {


    /**
     * 缩小范围
     */
    public String solution2(int n, int k) {
        int[] factorial = new int[n];
        factorial[0] = 1;
        for (int i = 1; i < n; ++i) {
            factorial[i] = factorial[i - 1] * i;
        }

        --k;
        StringBuffer ans = new StringBuffer();
        int[] valid = new int[n + 1];
        Arrays.fill(valid, 1);
        for (int i = 1; i <= n; ++i) {
            int order = k / factorial[n - i] + 1;
            for (int j = 1; j <= n; ++j) {
                order -= valid[j];
                if (order == 0) {
                    ans.append(j);
                    valid[j] = 0;
                    break;
                }
            }
            k %= factorial[n - i];
        }
        return ans.toString();
    }

    String ret = "";
    int count ;

    /**
     * 回溯 + 剪支
     * @return
     */
    public String solution(int n, int k) {
        count = k;
        this.trackingback(n, new StringBuffer(), new boolean[n + 1]);
        return ret;
    }

    private boolean trackingback(int n, StringBuffer sb, boolean[] valid) {
        if (sb.length() == n) {
            if (--count == 0) {
                ret = sb.toString();
                return true;
            }
            return false;
        }
        for (int i = 1; i <= n; i++) {
            if (valid[i]) {
                continue;
            }
            sb.append(i);
            valid[i] = true;
            boolean result = trackingback(n, sb, valid);
            if (result) {
                return true;
            }
            sb.deleteCharAt(sb.length() - 1);
            valid[i] = false;
        }
        return false;
    }
}
