package com.ralap._0140;

import com.ralap.sgg.arr.ArrayQueue;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * 126. 单词接龙 II
 * <p>
 * 按字典 wordList 完成从单词 beginWord 到单词 endWord 转化，一个表示此过程的 转换序列 是形式上像 beginWord -> s1 -> s2 -> ... -> sk 这样的单词序列，并满足：
 * <p>
 * <p>
 * <p>
 * 每对相邻的单词之间仅有单个字母不同。
 * 转换过程中的每个单词 si（1 <= i <= k）必须是字典 wordList 中的单词。注意，beginWord 不必是字典 wordList 中的单词。
 * sk == endWord
 * <p>
 * 给你两个单词 beginWord 和 endWord ，以及一个字典 wordList 。请你找出并返回所有从 beginWord 到 endWord 的 最短转换序列 ，如果不存在这样的转换序列，返回一个空列表。每个序列都应该以单词列表 [beginWord, s1, s2, ..., sk] 的形式返回。
 * <p>
 * 示例 1：
 * <p>
 * 输入：beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
 * 输出：[["hit","hot","dot","dog","cog"],["hit","hot","lot","log","cog"]]
 * 解释：存在 2 种最短的转换序列：
 * "hit" -> "hot" -> "dot" -> "dog" -> "cog"
 * "hit" -> "hot" -> "lot" -> "log" -> "cog"
 * <p>
 * 示例 2：
 * <p>
 * 输入：beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
 * 输出：[]
 * 解释：endWord "cog" 不在字典 wordList 中，所以不存在符合要求的转换序列。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= beginWord.length <= 5
 * endWord.length == beginWord.length
 * 1 <= wordList.length <= 500
 * wordList[i].length == beginWord.length
 * beginWord、endWord 和 wordList[i] 由小写英文字母组成
 * beginWord != endWord
 * wordList 中的所有单词 互不相同
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/word-ladder-ii
 */
class _126_WordLadderIi {
    Map<String, List<String>> childList = new HashMap<>();
    List<List<String>> result = new ArrayList<>();


    /**
     * 构图 + DFS
     *
     * @param beginWord
     * @param endWord
     * @param wordList
     * @return
     */
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        // 将原始数据放入Set中，方便查找
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord)) {
            return result;
        }
        Set<String> s1 = new HashSet<>();
        s1.add(beginWord);
        Set<String> s2 = new HashSet<>();
        s2.add(endWord);
        boolean found = false;
        boolean beginToEnd = true;
        while (!s1.isEmpty() && !s2.isEmpty() && !found) {
            Set<String> temp;
            // 从小的方向查找
            if (s1.size() > s2.size()) {
                temp = s1;
                s1 = s2;
                s2 = temp;
                beginToEnd = !beginToEnd;
            }
            Set<String> s = new HashSet<>();
            s1.forEach(item -> dict.remove(item));
            s2.forEach(item -> dict.remove(item));

            for (String str : s1) {
                String currStr = str;
                for (int i = 0; i < str.length(); i++) {
                    char[] chars = str.toCharArray();
                    for (char j = 'a'; j <= 'z'; j++) {
                        chars[i] = j;
                        String nextWord = new String(chars);
                        String word = nextWord;
                        String parent = currStr;
                        String tempStr;
                        if (!beginToEnd) {
                            tempStr = parent;
                            parent = nextWord;
                            nextWord = tempStr;
                        }
                        if (s2.contains(word)) {
                            found = true;
                            List<String> childes = childList.getOrDefault(parent, new ArrayList<>());
                            childList.put(parent, childes);
                            childes.add(nextWord);

                        } else if (dict.contains(word) && !found) {
                            s.add(word);
                            List<String> childes = childList.getOrDefault(parent, new ArrayList<>());
                            childes.add(nextWord);
                            childList.put(parent, childes);
                        }

                    }
                }
            }
            s1 = s;
        }


        if (found) {
            Deque<String> path = new ArrayDeque<>();
            path.add(beginWord);
            this.dfs(beginWord, endWord, path
            );
        }
        return result;
    }

    void dfs(String beginWord, String endWord,  Deque<String> path) {
        if (beginWord.equals(endWord)) {
            result.add(new ArrayList<>(path));
            return;
        }
        List<String> strList = childList.getOrDefault(beginWord, new ArrayList<>());
        for (String str : strList) {
            path.addLast(str);
            dfs(str, endWord, path);
            path.removeLast();
        }
    }
}

