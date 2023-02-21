package com.ralap._0060;

/**
 * 58. 最后一个单词的长度
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
 *
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "Hello World"
 * 输出：5
 * 解释：最后一个单词是“World”，长度为5。
 * 示例 2：
 *
 * 输入：s = "   fly me   to   the moon  "
 * 输出：4
 * 解释：最后一个单词是“moon”，长度为4。
 * 示例 3：
 *
 * 输入：s = "luffy is still joyboy"
 * 输出：6
 * 解释：最后一个单词是长度为6的“joyboy”。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/length-of-last-word
 */
public class _58_LengthOfLastWord {

    public int solution(String str) {
        if (str == null || str.trim().length() == 0) {
            return 0;
        }
        int len = 0;
        boolean flag = false;
        for (int i = str.length()-1; i >=0 ; i--) {
            if(str.charAt(i) == ' ' && flag){
                break;
            }else if(str.charAt(i) == ' ') {
                continue;
            }else {
                flag = true;
                len++;
            }
        }
        return len;
    }
}
