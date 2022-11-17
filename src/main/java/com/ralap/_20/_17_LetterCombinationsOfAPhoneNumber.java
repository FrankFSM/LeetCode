package com.ralap._20;

import java.util.*;

/**
 * 17. 电话号码的字母组合
 *
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * 示例 2：
 *
 * 输入：digits = ""
 * 输出：[]
 * 示例 3：
 *
 * 输入：digits = "2"
 * 输出：["a","b","c"]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/letter-combinations-of-a-phone-number
 *
 */
public class _17_LetterCombinationsOfAPhoneNumber {

    public List<String> solution(String digits) {
        Map<Integer, Character[]> digitsMap = new HashMap<Integer, Character[]>(16);
        digitsMap.put(2, new Character[]{'a', 'b', 'c'});
        digitsMap.put(3, new Character[]{'d', 'e', 'f'});
        digitsMap.put(4, new Character[]{'g', 'h', 'i'});
        digitsMap.put(5, new Character[]{'j', 'k', 'l'});
        digitsMap.put(6, new Character[]{'m', 'n', 'o'});
        digitsMap.put(7, new Character[]{'p', 'q', 'r', 's'});
        digitsMap.put(8, new Character[]{'t', 'u', 'v'});
        digitsMap.put(9, new Character[]{'w', 'x', 'u','z'});
        List<String> result = new ArrayList<>();

        Collection<Character[]> list = digitsMap.values();


        for (int i = 0; i < digits.length(); i++) {
            StringBuilder sb = new StringBuilder("");
            int num = Integer.parseInt (digits.charAt(i) + "");
            Character[] chars = digitsMap.get(num);

            for (int j = 0; j < chars.length; j++) {
                
            }
        }
        return null;
    }
}
