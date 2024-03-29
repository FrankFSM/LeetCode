package com.ralap._0100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 93. 复原 IP 地址
 * <p>
 * 有效 IP 地址 正好由四个整数（每个整数位于 0 到 255 之间组成，且不能含有前导 0），整数之间用 '.' 分隔。
 * <p>
 * 例如："0.1.2.201" 和 "192.168.1.1" 是 有效 IP 地址，但是 "0.011.255.245"、"192.168.1.312" 和 "192.168@1.1" 是 无效 IP 地址。
 * 给定一个只包含数字的字符串 s ，用以表示一个 IP 地址，返回所有可能的有效 IP 地址，这些地址可以通过在 s 中插入 '.' 来形成。你 不能 重新排序或删除 s 中的任何数字。你可以按 任何 顺序返回答案。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "25525511135"
 * 输出：["255.255.11.135","255.255.111.35"]
 * 示例 2：
 * <p>
 * 输入：s = "0000"
 * 输出：["0.0.0.0"]
 * 示例 3：
 * <p>
 * 输入：s = "101023"
 * 输出：["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/restore-ip-addresses
 */
public class _93_RestoreIpAddresses {

    List<List<String>> resultList = new ArrayList<>();

    public List<String> solution(String s) {
        this.backtracking(s, new LinkedList<>(), 0);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < resultList.size(); i++) {
            result.add(String.join(".", resultList.get(i)));
        }
        return result;
    }

    public void backtracking(String str, LinkedList<String> list, int start) {
        if (list.size() == 4) {
            if(start >= str.length()){
                resultList.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = 1; i <= 3; i++) {
            if(start + i <= str.length()){
                String subStr = str.substring(start, start + i);
                if((i != 1 && subStr.startsWith("0")) || Integer.parseInt(subStr) >255){
                    break;
                }
                list.addLast(subStr);
                this.backtracking(str, list, start + i);
                list.removeLast();
            } else {
                break;
            }
        }
    }
}
