package com.ralap._0080;

/**
 * 67. 二进制求和
 * <p>
 * 给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入:a = "11", b = "1"
 * 输出："100"
 * 示例 2：
 * <p>
 * 输入：a = "1010", b = "1011"
 * 输出："10101"
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= a.length, b.length <= 104
 * a 和 b 仅由字符 '0' 或 '1' 组成
 * 字符串如果不是 "0" ，就不含前导零
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/add-binary
 */
public class _67_AddBinary {
    public String solution(String n1, String n2) {
        int flag = 0;
        int n1Len = n1.length() - 1;
        int n2Len = n2.length() - 1;
        StringBuffer sb = new StringBuffer();
        while (n1Len >= 0 && n2Len >= 0) {
            int sum = n1.charAt(n1Len) + n2.charAt(n2Len) - 2 * '0' + flag;
            if (sum >= 2) {
                flag = 1;
                sb.append(sum%2);
            } else {
                flag = 0;
                sb.append(sum);
            }
            n1Len--;
            n2Len--;
        }
        int maxLen = Math.max(n1Len, n2Len);
        String s = n1Len < 0 ? n2 : n1;
        for (int i = maxLen; i >=0; i--) {
            int sum =s.charAt(i) -  '0' + flag;
            if (sum >= 2) {
                flag = 1;
                sb.append(sum%2);
            } else {
                flag = 0;
                sb.append(sum);
            }
        }
        if (flag == 1) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
