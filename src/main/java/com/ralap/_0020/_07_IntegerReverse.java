package com.ralap._0020;

/**
 * 7. 整数反转
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * <p>
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * <p>
 * 示例 1：
 * 输入：x = 123
 * 输出：321
 * <p>
 * 示例 2：
 * 输入：x = -123
 * 输出：-321
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/reverse-integer
 */
public class _07_IntegerReverse {

    /**
     * 普通
     *
     * @param x
     * @return
     */
    public int solution(int x) {
        String xStr = x + "";
        String preStr = "";
        if (xStr.startsWith("-")) {
            preStr = "-";
            xStr = xStr.substring(1);
        }
        StringBuilder reverseStr = new StringBuilder("");
        for (int i = xStr.length() - 1; i >= 0; i--) {
            reverseStr.append(xStr.charAt(i));
        }
        try {
            return Integer.valueOf(preStr + reverseStr);
        } catch (Exception e) {  // 粗暴处理
            return 0;
        }
    }

    /**
     * 数学
     */
    public int mathSolution(int x) {
        int reverse = 0;
        while (x != 0) {
            // 处理越界
            if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10) {
                return 0;
            }
            int mod = x % 10;
            reverse = reverse * 10 + mod;
            x /= 10;
        }
        return reverse;
    }
}
