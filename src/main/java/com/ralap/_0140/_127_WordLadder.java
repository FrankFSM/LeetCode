package com.ralap._0140;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 127. 单词接龙
 * <p>
 * 字典 wordList 中从单词 beginWord 和 endWord 的 转换序列 是一个按下述规格形成的序列 beginWord -> s1 -> s2 -> ... -> sk：
 * <p>
 * 每一对相邻的单词只差一个字母。
 * 对于 1 <= i <= k 时，每个 si 都在 wordList 中。注意， beginWord 不需要在 wordList 中。
 * sk == endWord
 * <p>
 * 给你两个单词 beginWord 和 endWord 和一个字典 wordList ，返回 从 beginWord 到 endWord 的 最短转换序列 中的 单词数目 。如果不存在这样的转换序列，返回 0 。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
 * 输出：5
 * 解释：一个最短转换序列是 "hit" -> "hot" -> "dot" -> "dog" -> "cog", 返回它的长度 5。
 * <p>
 * 示例 2：
 * <p>
 * 输入：beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
 * 输出：0
 * 解释：endWord "cog" 不在字典中，所以无法进行转换。
 * <p>
 * 提示：
 * <p>
 * 1 <= beginWord.length <= 10
 * endWord.length == beginWord.length
 * 1 <= wordList.length <= 5000
 * wordList[i].length == beginWord.length
 * beginWord、endWord 和 wordList[i] 由小写英文字母组成
 * beginWord != endWord
 * wordList 中的所有字符串 互不相同
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/word-ladder
 */
class _127_WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord)) {
            return 0;
        }
        Set<String> s1 = new HashSet<>();
        s1.add(beginWord);
        Set<String> s2 = new HashSet<>();
        s2.add(endWord);
        int step = 1;
        while (!s1.isEmpty() && !s2.isEmpty()) {
            step++;
            Set<String> tmp;
            if (s1.size() > s2.size()) {
                tmp = s1;
                s1 = s2;
                s2 = tmp;
            }
            s1.forEach(item -> dict.remove(item));
            s2.forEach(item -> dict.remove(item));
            Set<String> s = new HashSet<>();
            for (String item : s1) {
                for (int i = 0; i < item.length(); i++) {
                    char[] chars = item.toCharArray();
                    for (char j = 'a'; j <= 'z'; j++) {
                        chars[i] = j;
                        // 下一个字符
                        String nextChar = new String(chars);
                        // 与s2相遇
                        if (s2.contains(nextChar)) {
                            return step;
                        }
                        // 不在字典中，跳过
                        if (!dict.contains(nextChar)) {
                            continue;
                        }
                        s.add(nextChar);
                    }
                }
            }
            s1 = s;
        }
        // 不存在路径
        return 0;
    }
}

