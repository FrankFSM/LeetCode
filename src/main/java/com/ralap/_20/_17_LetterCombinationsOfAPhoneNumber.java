package com.ralap._20;

import java.util.*;

/**
 * 17. 电话号码的字母组合
 * <p>
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * 示例 2：
 * <p>
 * 输入：digits = ""
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：digits = "2"
 * 输出：["a","b","c"]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/letter-combinations-of-a-phone-number
 */
public class _17_LetterCombinationsOfAPhoneNumber {

    Set<String> result = new HashSet<>();

    public List<String> solution(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>(result);
        }
        Map<Character, Character[]> digitsMap = new HashMap<>(8);
        digitsMap.put('2', new Character[]{'a', 'b', 'c'});
        digitsMap.put('3', new Character[]{'d', 'e', 'f'});
        digitsMap.put('4', new Character[]{'g', 'h', 'i'});
        digitsMap.put('5', new Character[]{'j', 'k', 'l'});
        digitsMap.put('6', new Character[]{'m', 'n', 'o'});
        digitsMap.put('7', new Character[]{'p', 'q', 'r', 's'});
        digitsMap.put('8', new Character[]{'t', 'u', 'v'});
        digitsMap.put('9', new Character[]{'w', 'x', 'y', 'z'});
        List<Character[]> characters = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            characters.add(digitsMap.get(digits.charAt(i)));
        }
        backtrack(characters, new LinkedList<>());

        return new ArrayList<>(result);

    }

    private void backtrack(List<Character[]> list, LinkedList<Character> chars) {
        if (list.size() == chars.size()) {
            char[] c = new char[chars.size()];
            for (int i = 0; i < c.length; i++) {
                c[i] = chars.get(i);
            }

            result.add(new String(c));
            return;
        }
        for (int i = chars.size(); i < list.size(); i++) {
            Character[] digit = list.get(i);
            if(list.get(chars.size()) != digit){
                continue;
            }

            for (int j = 0; j < digit.length; j++) {
                chars.add(digit[j]);
                backtrack(list, chars);
                chars.removeLast();
            }
        }
    }

    public List<String> solution_v2(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>(result);
        }
        Map<Character, String> digitsMap = new HashMap<>(8);
        digitsMap.put('2', "abc");
        digitsMap.put('3', "def");
        digitsMap.put('4', "ghi");
        digitsMap.put('5', "jkl");
        digitsMap.put('6', "mno");
        digitsMap.put('7', "pqrs");
        digitsMap.put('8', "tuv");
        digitsMap.put('9', "wxyz");
        List<String> characters = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            characters.add(digitsMap.get(digits.charAt(i)));
        }
        backtrack_v2(characters, new StringBuffer());
        return new ArrayList<>(result);
    }

    private void backtrack_v2(List<String> list, StringBuffer chars) {
        if (list.size() == chars.length()) {
            result.add(chars.toString());
            return;
        }
        for (int i = chars.length(); i < list.size(); i++) {
            String digit = list.get(i);
            // 对选择过滤
            if(list.get(chars.length()) != digit){
                continue;
            }
            for (int j = 0; j < digit.length(); j++) {
                chars.append(digit.charAt(j));
                backtrack_v2(list, chars);
                chars.deleteCharAt(chars.length() -1);
            }
        }
    }
}
