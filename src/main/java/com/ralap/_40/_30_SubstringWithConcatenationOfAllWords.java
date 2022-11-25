package com.ralap._40;

import java.util.*;

/**
 * 30. 串联所有单词的子串
 * <p>
 * 给定一个字符串 s 和一个字符串数组 words。 words 中所有字符串 长度相同。
 * <p>
 *  s 中的 串联子串 是指一个包含  words 中所有字符串以任意顺序排列连接起来的子串。
 * <p>
 * 例如，如果 words = ["ab","cd","ef"]， 那么 "abcdef"， "abefcd"，"cdabef"， "cdefab"，"efabcd"， 和 "efcdab" 都是串联子串。 "acdbef" 不是串联子串，因为他不是任何 words 排列的连接。
 * 返回所有串联字串在 s 中的开始索引。你可以以 任意顺序 返回答案。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "barfoothefoobarman", words = ["foo","bar"]
 * 输出：[0,9]
 * 解释：因为 words.length == 2 同时 words[i].length == 3，连接的子字符串的长度必须为 6。
 * 子串 "barfoo" 开始位置是 0。它是 words 中以 ["bar","foo"] 顺序排列的连接。
 * 子串 "foobar" 开始位置是 9。它是 words 中以 ["foo","bar"] 顺序排列的连接。
 * 输出顺序无关紧要。返回 [9,0] 也是可以的。
 * 示例 2：
 * <p>
 * 输入：s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
 * 输出：[]
 * 解释：因为 words.length == 4 并且 words[i].length == 4，所以串联子串的长度必须为 16。
 * s 中没有子串长度为 16 并且等于 words 的任何顺序排列的连接。
 * 所以我们返回一个空数组。
 * 示例 3：
 * <p>
 * 输入：s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
 * 输出：[6,9,12]
 * 解释：因为 words.length == 3 并且 words[i].length == 3，所以串联子串的长度必须为 9。
 * 子串 "foobarthe" 开始位置是 6。它是 words 中以 ["foo","bar","the"] 顺序排列的连接。
 * 子串 "barthefoo" 开始位置是 9。它是 words 中以 ["bar","the","foo"] 顺序排列的连接。
 * 子串 "thefoobar" 开始位置是 12。它是 words 中以 ["the","foo","bar"] 顺序排列的连接。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/substring-with-concatenation-of-all-words
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _30_SubstringWithConcatenationOfAllWords {

    Set<String> allPC = new HashSet<>();

    public List<Integer> solution(String s, String[] words) {
        getAllPC(words);
        List<Integer> allIndex = new ArrayList<>();

        for (String pc : allPC) {
            List<Integer> index = this.kmpSolution(s, pc);
            allIndex.addAll(index);
        }
        return allIndex;
    }

    public List<Integer> kmpSolution(String haystack, String needle) {
        List<Integer> list = new ArrayList<>();
        int[] next = this.genNext(needle);
        int first = 0, second = 0;
        while (first < haystack.length()) {
            if (haystack.charAt(first) == needle.charAt(second)) {
                second++;
            } else {
                first = first - (second - next[second]);
                second = 0;
            }
            first++;
            if (second == needle.length()) {
                list.add(first - needle.length());
                first = first - (second) + 1;
                second = 0;
            }
        }
        return list;
    }

    /**
     * 部分匹配表
     *
     * @param str
     * @return
     */
    public int[] genNext(String str) {
        int[] next = new int[str.length()];
        for (int i = 1; i <= str.length(); i++) {
            int maxLen = 0;
            int j = 1;
            while (j < i) {
                if (str.substring(0, j).equals(str.substring(i - j, i))) {
                    maxLen = j;
                }
                j++;
            }
            next[i - 1] = maxLen;
        }
        return next;
    }


    /**
     * 获取所有排列组合
     */
    public Set<String> getAllPC(String[] words) {
        LinkedList<String> pc = new LinkedList<>();
        this.getPC(words, pc, new ArrayList<>());
        return this.allPC;
    }

    public void getPC(String[] words, LinkedList<String> pc, List<Integer> list) {
        if (pc.size() == words.length) {
            allPC.add(this.listToStr(pc));
            return;
        }
        for (int i = 0; i < words.length; i++) {
            if (list.contains(Integer.valueOf(i))) {
                continue;
            }
            pc.add(words[i]);
            list.add(Integer.valueOf(i));
            getPC(words, pc, list);
            pc.removeLast();
            list.remove(Integer.valueOf(i));
        }
    }

    private String listToStr(List list) {
        StringBuffer sb = new StringBuffer();
        list.forEach(item -> {
            sb.append(item);
        });
        return sb.toString();
    }


    public List<Integer> moveWinSolution(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return res;
        }
        Map<String, Integer> wordMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            wordMap.clear();
            // 初始化Map
            for (int j = 0; j < words.length; j++) {
                if (wordMap.containsKey(words[j])) {
                    int count = wordMap.get(words[j]) + 1;
                    wordMap.put(words[j], count);
                } else {
                    wordMap.put(words[j], 1);
                }
            }

            int groupNum = words[0].length();
            int size = words.length;

            int group = 0;
            while (group + 1 <= size) {
                int start = i + (group * groupNum);
                int end = start + groupNum;
                if(end > s.length()){
                    break;
                }
                String key = s.substring(start, end);
                if (!wordMap.containsKey(key) || wordMap.get(key) == 0) {
                    wordMap.put(key, -1);
                    break;
                }else {
                    int count = wordMap.get(key) - 1;
                    wordMap.put(key, count);
                }
                group++;
            }

            if (wordMap.values().stream().allMatch(item -> (item == 0))){
                res.add(i);

            }
        }
        return res;
    }
}
