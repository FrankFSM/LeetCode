package com.ralap._20;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 8. 字符串转换整数 (atoi)
 * <p>
 * 请你来实现一个 myAtoi(string s) 函数，使其能将字符串转换成一个 32 位有符号整数（类似 C/C++ 中的 atoi 函数）。
 * <p>
 * 函数 myAtoi(string s) 的算法如下：
 * <p>
 * 读入字符串并丢弃无用的前导空格
 * 检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。 确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。
 * 读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
 * 将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0 。必要时更改符号（从步骤 2 开始）。
 * 如果整数数超过 32 位有符号整数范围 [−231,  231 − 1] ，需要截断这个整数，使其保持在这个范围内。具体来说，小于 −231 的整数应该被固定为 −231 ，大于 231 − 1 的整数应该被固定为 231 − 1 。
 * 返回整数作为最终结果。
 * 注意：
 * <p>
 * 本题中的空白字符只包括空格字符 ' ' 。
 * 除前导空格或数字后的其余字符串外，请勿忽略 任何其他字符。
 * <p>
 * 示例 1：
 * 输入：s = "42"
 * 输出：42
 * <p>
 * 示例 2：
 * 输入：s = "   -42"
 * 输出：-42
 * <p>
 * 示例 3：
 * 输入：s = "4193 with words"
 * 输出：4193
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/string-to-integer-atoi
 */
public class _8_StringToIntegerAtoi {

    public int soluteion(String str) {
        str = str.trim();
        if (str == null || str.length() == 0) {
            return 0;
        }
        char firstChar = str.charAt(0);
        boolean hasSymbol = firstChar == '+' || firstChar == '-';

        String newStr = hasSymbol ? str.substring(1) : str;

        StringBuilder resultStr = new StringBuilder("");

        for (int i = 0; i < newStr.length(); i++) {
            // 非数字过滤
            if ('0' > newStr.charAt(i) || newStr.charAt(i) > '9') {
                break;
            }
            String preStr = hasSymbol ? (firstChar + resultStr.toString()) : resultStr.toString();
            // 初步过滤拦截
            if (preStr.length() > (Integer.MAX_VALUE + "").length() - 2) {
                int currInt = Integer.valueOf(newStr.charAt(i) + "");
                // 精确过滤拦截
                if (Integer.valueOf(preStr) > (Integer.MAX_VALUE - currInt) / 10) {
                    return Integer.MAX_VALUE;
                }
                if (Integer.valueOf(preStr) < (Integer.MIN_VALUE + currInt) / 10) {
                    return Integer.MIN_VALUE;
                }
            }
            resultStr.append(newStr.charAt(i));
        }
        // 空串拦截
        if (resultStr.toString() == "") {
            return 0;
        }
        String rest = hasSymbol ? (firstChar + resultStr.toString()) : resultStr.toString();
        return Integer.valueOf(rest);
    }
}
