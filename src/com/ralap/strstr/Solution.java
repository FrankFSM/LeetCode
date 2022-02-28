package com.ralap.strstr;

/**
 * 28. 实现 strStr()
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.strStr("hello", "ll");
        System.out.println(result);
    }

    /**
     * 暴力匹配
     * 时间复杂度:O(M+N)
     * 空间复杂度O(1)
     */
    public int strStr(String haystack, String needle) {
        if (needle == "") {
            return 0;
        }
        if (haystack == "") {
            return -1;
        }
        for (int i = 0; i + needle.length() <= haystack.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    flag = false;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;

    }
}
