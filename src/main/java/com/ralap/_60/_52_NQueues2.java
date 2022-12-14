package com.ralap._60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 52. N皇后 II
 * <p>
 * n 皇后问题 研究的是如何将 n 个皇后放置在 n × n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 * <p>
 * 给你一个整数 n ，返回 n 皇后问题 不同的解决方案的数量。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：n = 4
 * 输出：2
 * 解释：如上图所示，4 皇后问题存在两个不同的解法。
 * 示例 2：
 * <p>
 * 输入：n = 1
 * 输出：1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/n-queens-ii
 */
public class _52_NQueues2 {
    private int count = 0;

    public int solution(int n) {
        List<char[]> board = this.genBoard(n);
        this.backtrack(board, 0);
        return count;
    }

    /**
     * 回溯
     */
    private void backtrack(List<char[]> board, int row) {
        if (row == board.size()) {
            count++;
            return;
        }
        for (int i = 0; i < board.size(); i++) {
            if (!isValid(board, row, i)) {
                continue;
            }
            board.get(row)[i] = 'Q';
            this.backtrack(board, row + 1);
            board.get(row)[i] = '.';
        }
    }

    /**
     * 判断是否有效
     */
    private boolean isValid(List<char[]> board, int row, int col) {
        // 列
        for (int i = 0; i < row; i++) {
            if (board.get(i)[col] != '.') {
                return false;
            }
        }
        // 左上
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i)[j] != '.') {
                return false;
            }
        }
        // 左上
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.size(); i--, j++) {
            if (board.get(i)[j] != '.') {
                return false;
            }
        }
        return true;
    }

    /**
     * 初始化棋盘
     */
    private List<char[]> genBoard(int len) {
        List board = new ArrayList();
        for (int i = 0; i < len; i++) {
            char[] chars = new char[len];
            Arrays.fill(chars, '.');
            board.add(chars);
        }
        return board;
    }
}
