package com.ralap._0080;

/**
 * 66. 加一
 * <p>
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：digits = [1,2,3]
 * 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 * 示例 2：
 * <p>
 * 输入：digits = [4,3,2,1]
 * 输出：[4,3,2,2]
 * 解释：输入数组表示数字 4321。
 * 示例 3：
 * <p>
 * 输入：digits = [0]
 * 输出：[1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/plus-one
 */
public class _66_PlusOne {

    public int[] solution(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            // 找到倒数第一个不是9的: +1 ,并将后面9的置为0
            if (digits[i] != 9) {
                digits[i]++;
                for (int j = i + 1; j < len; j++) {
                    digits[j] = 0;
                }
                return digits;
            }
        }
        // 全部为9,进一位
        int[] result = new int[len + 1];
        result[0] = 1;
        return result;
    }
}
