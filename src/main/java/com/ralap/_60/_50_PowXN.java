package com.ralap._60;

/**
 * 50. Pow(x, n)
 * <p>
 * 实现 pow(x, n) ，即计算 x 的整数 n 次幂函数（即，xn ）。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：x = 2.00000, n = 10
 * 输出：1024.00000
 * 示例 2：
 * <p>
 * 输入：x = 2.10000, n = 3
 * 输出：9.26100
 * 示例 3：
 * <p>
 * 输入：x = 2.00000, n = -2
 * 输出：0.25000
 * 解释：2-2 = 1/22 = 1/4 = 0.25
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/powx-n
 */
public class _50_PowXN {

    public double solution(double x, int n) {
        return n < 0 ? 1 / this.powxN(x, -n) : this.powxN(x, n);
    }

    private double powxN(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double half = powxN(x, n / 2);
        return n % 2 == 0 ? half * half : half * half * x;
    }
}
