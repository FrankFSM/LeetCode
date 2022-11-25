package com.ralap._40;

/**
 * 29. 两数相除
 * <p>
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 * <p>
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 * <p>
 * 整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: dividend = 10, divisor = 3
 * 输出: 3
 * 解释: 10/3 = truncate(3.33333..) = truncate(3) = 3
 * 示例 2:
 * <p>
 * 输入: dividend = 7, divisor = -3
 * 输出: -2
 * 解释: 7/-3 = truncate(-2.33333..) = -2
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/divide-two-integers
 */
public class _29_DivideTwoIntegers {

    public int solution(int dividend, int divisor) {
        // 特例
        if (dividend == Integer.MIN_VALUE) {
            if (divisor == 1) {
                return Integer.MIN_VALUE;
            }
            if (divisor == -1) {
                return Integer.MAX_VALUE;
            }
        }
        // 负数标识（用于结果转化）
        boolean negative = true;
        // 被除数、除数都转为负数，（正数会有越界问题）
        if (dividend > 0) {
            negative = false;
            dividend = -dividend;
        }
        if (divisor > 0) {
            negative = !negative;
            divisor = -divisor;
        }

        // 通过累加计算，直到余数大于除数（应为都是负数）
        int count = 0;
        int rest = dividend;
        while (rest <= divisor) {
            rest = rest - divisor;
            count++;
        }
        // 根据标识转化结果
        return negative ? count : -count;
    }
}
