package com.ralap._0140;

/**
 * 125. 验证回文串
 * <p>
 * 如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。
 * 字母和数字都属于字母数字字符。
 * 给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
 * <p>
 * 示例 1：
 * <p>
 * 输入: s = "A man, a plan, a canal: Panama"
 * 输出：true
 * 解释："amanaplanacanalpanama" 是回文串。
 * <p>
 * 示例 2：
 * <p>
 * 输入：s = "race a car"
 * 输出：false
 * 解释："raceacar" 不是回文串。
 * <p>
 * 示例 3：
 * <p>
 * 输入：s = " "
 * 输出：true
 * 解释：在移除非字母数字字符之后，s 是一个空字符串 "" 。
 * 由于空字符串正着反着读都一样，所以是回文串。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 2 * 105
 * s 仅由可打印的 ASCII 字符组成
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-palindrome
 */
class _125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return true;
        }
        int len = s.length();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < len; i++) {
            char currChar = s.charAt(i);
            // 数字
            if (currChar >= 48 && currChar <= 57) {
                buffer.append(currChar);
            } else if (currChar >= 65 && currChar <= 90) {
                buffer.append((char) (currChar + 32));

            } else if (currChar >= 97 && currChar <= 122) {
                buffer.append(currChar);
            }
        }
        for (int i = 0; i < buffer.length() / 2; i++) {
            if (buffer.charAt(i) != buffer.charAt(buffer.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

