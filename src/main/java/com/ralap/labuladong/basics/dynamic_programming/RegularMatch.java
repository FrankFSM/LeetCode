package com.ralap.labuladong.basics.dynamic_programming;

/**
 * 正则匹配
 */
public class RegularMatch {


    public boolean solution(String str, String temp) {
        return this.isMatch(str, 0, temp, 0);
    }

    public boolean isMatch(String str, int strIndex, String temp, int tempIndex) {
        // base case
        // 模版结束
        if (tempIndex == temp.length()) {
            // 字符串也结束，匹配成功，否则失败
            return strIndex == str.length();
        }
        // 字符串结束
        if (strIndex == str.length()) {
            // 模版字符要成对出现
            String subStr = temp.substring(tempIndex);
            if (subStr.length() % 2 != 0) {
                return false;
            }
            // 每个字符都匹配一个*
            char[] chars = subStr.toCharArray();
            for (int i = 1; i < chars.length; i += 2) {
                if (chars[i] != '*') {
                    return false;
                }
            }
            return true;
        }
        if (str.charAt(strIndex) == temp.charAt(tempIndex) || temp.charAt(tempIndex) == '.') {

            if (tempIndex < temp.length() - 1 && temp.charAt(tempIndex + 1) == '*') {
                // 匹配0次或多次
                return isMatch(str, strIndex + 1, temp, tempIndex)
                        || isMatch(str, strIndex, temp, tempIndex + 2);
            } else {
                return isMatch(str, strIndex + 1, temp, tempIndex + 1);
            }
        } else {
            // 匹配0次
            if (tempIndex < temp.length() - 1 && temp.charAt(tempIndex + 1) == '*') {
                return isMatch(str, strIndex, temp, tempIndex + 2);
            } else {
                return false;
            }
        }

    }

}
