package com.ralap._0060;

import java.util.ArrayList;
import java.util.List;

/**
 * 43. 字符串相乘
 * <p>
 * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
 * <p>
 * 注意：不能使用任何内置的 BigInteger 库或直接将输入转换为整数。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: num1 = "2", num2 = "3"
 * 输出: "6"
 * 示例 2:
 * <p>
 * 输入: num1 = "123", num2 = "456"
 * 输出: "56088"
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/multiply-strings
 */
public class _43_MultiplyStrings {
    public String solution(String n1Str, String n2Str) {
        if("0".equals(n1Str) || "0".equals(n2Str)){
            return "0";
        }
        int n1StrLen = n1Str.length(), n2StrLen = n2Str.length();
        List<String> res = new ArrayList<>();
        for (int i = n2StrLen - 1; i >= 0; i--) {
            int n2Curr = n2Str.charAt(i) - '0';
            int carry = 0;
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < n2StrLen - i - 1; j++) {
                sb.append('0');
            }
            for (int j = n1StrLen - 1; j >= 0; j--) {
                int n1Curr = n1Str.charAt(j) - '0';
                int multiply = n1Curr * n2Curr + carry;
                int num = multiply % 10;
                carry = multiply / 10;
                sb.append(num);
            }
            if (carry != 0) {
                sb.append(carry);
            }
            res.add(sb.reverse().toString());
        }
        String sumStr = "";
        for (int i = 0; i < res.size(); i++) {
            sumStr = addStrings(sumStr, res.get(i));
        }
        return sumStr;
    }

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer ans = new StringBuffer();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        ans.reverse();
        return ans.toString();
    }
}
