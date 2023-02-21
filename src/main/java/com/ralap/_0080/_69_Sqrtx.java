package com.ralap._0080;

/**
 * 69. x 的平方根
 * <p>
 * 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
 * <p>
 * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
 * <p>
 * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：x = 4
 * 输出：2
 * 示例 2：
 * <p>
 * 输入：x = 8
 * 输出：2
 * 解释：8 的算术平方根是 2.82842..., 由于返回类型是整数，小数部分将被舍去。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/sqrtx
 */
public class _69_Sqrtx {

    public int solution(int num) {
        if(num == 1){
            return 1;
        }
        for (int i = 1; i <= (num/2 + 1); i++) {
            if (i * i == num) {
                return i;
            } else if (num/i < i) {
                return i -1 ;
            }
        }
        return 0;
    }
}
