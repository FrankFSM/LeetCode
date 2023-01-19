package com.ralap._80;

import java.util.ArrayList;
import java.util.List;

/**
 * 68. 文本左右对齐
 * <p>
 * 给定一个单词数组 words 和一个长度 maxWidth ，重新排版单词，使其成为每行恰好有 maxWidth 个字符，且左右两端对齐的文本。
 * <p>
 * 你应该使用 “贪心算法” 来放置给定的单词；也就是说，尽可能多地往每行中放置单词。必要时可用空格 ' ' 填充，使得每行恰好有 maxWidth 个字符。
 * <p>
 * 要求尽可能均匀分配单词间的空格数量。如果某一行单词间的空格不能均匀分配，则左侧放置的空格数要多于右侧的空格数。
 * <p>
 * 文本的最后一行应为左对齐，且单词之间不插入额外的空格。
 * <p>
 * 注意:
 * <p>
 * 单词是指由非空格字符组成的字符序列。
 * 每个单词的长度大于 0，小于等于 maxWidth。
 * 输入单词数组 words 至少包含一个单词。
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
 * 输出:
 * [
 *    "This    is    an",
 *    "example  of text",
 *    "justification.  "
 * ]
 * 示例 2:
 * <p>
 * 输入:words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
 * 输出:
 * [
 *   "What   must   be",
 *   "acknowledgment  ",
 *   "shall be        "
 * ]
 * 解释: 注意最后一行的格式应为 "shall be    " 而不是 "shall     be",
 *      因为最后一行应为左对齐，而不是左右两端对齐。
 * 第二行同样为左对齐，这是因为这行只包含一个单词。
 * 示例 3:
 * <p>
 * 输入:words = ["Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"]，maxWidth = 20
 * 输出:
 * [
 *   "Science  is  what we",
 * "understand      well",
 *   "enough to explain to",
 *   "a  computer.  Art is",
 *   "everything  else  we",
 *   "do                  "
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/text-justification
 */
public class _68_TextJustification {
    public List<String> solution(String[] words, int maxLen) {
        int wordSize = words.length;
        int currWord = 0;
        List ret = new ArrayList<String>();
        while (true) {
            int left = currWord;
            int sumLen = 0;
            while (currWord < wordSize) {
                int len = sumLen + words[currWord].length() + currWord - left;
                if (len <= maxLen) {
                    sumLen = sumLen + words[currWord].length();
                    currWord++;
                    continue;
                }
                break;
            }

            // 最后一行: 左对齐，单词间空格，最后补齐空格
            if (currWord == wordSize) {
                StringBuffer sb = new StringBuffer(words[left]);
                for (int i = left + 1; i < currWord; i++) {
                    sb.append(" ");
                    sb.append(words[i]);
                }
                int spaceLen = maxLen - sb.length();
                for (int i = 0; i < spaceLen; i++) {
                    sb.append(" ");

                }
                ret.add(sb.toString());
                break;
            }

            // 只有一个单词, 左对齐，后面添加空格
            if (currWord - left == 1) {
                StringBuffer sb = new StringBuffer(words[left]);
                int spaceLen = maxLen - sb.length();
                for (int i = 0; i < spaceLen; i++) {
                    sb.append(" ");
                }
                ret.add(sb.toString());
                continue;
            }
            int spaceLen = maxLen - sumLen;
            int currWordSize = currWord - left;
            // 不止一个单词
            int avgSpaces = spaceLen / (currWordSize - 1);
            int ex = spaceLen % (currWordSize - 1);
            int firstSpaces = avgSpaces + (ex-- == 0 ? 0 : 1);

            StringBuffer sb = new StringBuffer(words[left]);
            for (int i = 0; i < firstSpaces; i++) {
                sb.append(" ");
            }
            for (int i = left + 1; i < currWord; i++) {
                sb.append(words[i]);
                if (i != currWord - 1) {
                    if(ex-->0){
                        sb.append(" ");
                    }
                    for (int j = 0; j < avgSpaces; j++) {
                        sb.append(" ");
                    }
                }
            }
            ret.add(sb.toString());

        }
        return ret;
    }
}
