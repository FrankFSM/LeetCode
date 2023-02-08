package com.ralap._20;

/**
 * 6. Z 字形变换
 * <p>
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行Z 字形排列。
 * <p>
 * 比如输入字符串为 "PAYPALISHIRING"行数为 3 时，排列如下：
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 * <p>
 * 请你实现这个将字符串进行指定行数变换的函数：
 * <p>
 * string convert(string s, int numRows);
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/zigzag-conversion
 */
public class _06_ZConvert {

    public String solution(String str, int rowCount) {
        // 只有一行，直接返回
        if(rowCount == 1){
            return str;
        }
        // 初始化指定行
        StringBuilder[] rows = new StringBuilder[rowCount];
        for (int i = 0; i < rowCount; i++) {
            rows[i] = new StringBuilder("");
        }
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            // 规律分组（一个来回），每组num
            int num = 2 * (rowCount - 1);

            // 计算下标
            int index = i % num;
            if(index <= num/2){
                rows[index].append(str.charAt(i));
            }else {
                rows[num - index].append(str.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < rows.length; i++) {
            result.append(rows[i]);
        }
        return result.toString();
    }
}
