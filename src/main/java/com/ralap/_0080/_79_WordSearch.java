package com.ralap._0080;

/**
 * 79. 单词搜索
 * <p>
 * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。
 * <p>
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * 输出：true
 * 示例 2：
 * <p>
 * <p>
 * 输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
 * 输出：true
 * 示例 3：
 * <p>
 * <p>
 * 输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
 * 输出：false
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/word-search
 */
public class _79_WordSearch {

    public boolean solution(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (backtracking(board, word, 0, i, j, new boolean[board.length][board[i].length])) {
                    return true;
                }
            }

        }
        return false;
    }

    private boolean backtracking(char[][] board, String word, int curr, int row, int col, boolean[][] valid) {
        if (curr == word.length()) {
            return true;
        }
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length
                || curr >= word.length() || valid[row][col] || board[row][col] != word.charAt(curr)) {
            return false;
        } else {
            valid[row][col] = true;
            boolean result = backtracking(board, word, curr + 1, row, col + 1, valid)
                    || backtracking(board, word, curr + 1, row + 1, col, valid)
                    || backtracking(board, word, curr + 1, row, col - 1, valid)
                    || backtracking(board, word, curr + 1, row - 1, col, valid);
            valid[row][col] = false;
            return result;
        }

    }
}
