package com.ralap._0060;

import java.util.ArrayList;
import java.util.List;

/**
 * 51. N 皇后
 * <p>
 * 按照国际象棋的规则，皇后可以攻击与之处在同一行或同一列或同一斜线上的棋子。
 * <p>
 * n 皇后问题 研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 * <p>
 * 给你一个整数 n ，返回所有不同的 n 皇后问题 的解决方案。
 * <p>
 * 每一种解法包含一个不同的 n 皇后问题 的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：n = 4
 * 输出：[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
 * 解释：如上图所示，4 皇后问题存在两个不同的解法。
 * 示例 2：
 * <p>
 * 输入：n = 1
 * 输出：[["Q"]]
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/n-queens
 */
public class _51_NQueens {
    List<List<String>> rest = new ArrayList<>();

    public List<List<String>> solution(int n) {
        // 初始化棋盘
        StringBuffer[] sbArr = new StringBuffer[n];
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(".");
        }
        for (int i = 0; i < n; i++) {
            sbArr[i] = new StringBuffer(sb.toString());
        }
        this.backtrack(sbArr, 0);
        return rest;
    }


    /**
     * 回溯
     */
    private void backtrack(StringBuffer[] board, int row) {
        if (row == board.length) {
            List<String> strList = new ArrayList<>();
            for (int i = 0; i < row; i++) {
                strList.add(board[i].toString());
            }
            rest.add(strList);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (!isValid(board, row, i)) {
                continue;
            }
            board[row].replace(i, i + 1, "Q");
            backtrack(board, row + 1);
            board[row].replace(i, i + 1, ".");
        }
    }

    /**
     * 是否有效
     */
    private boolean isValid(StringBuffer[] board, int row, int col) {
        int len = board.length;
        // 检查列
        for (int i = 0; i < row; i++) {
            if ('Q' == board[i].charAt(col)) {
                return false;
            }
        }
        // 检查左上
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if ('Q' == board[i].charAt(j)) {
                return false;
            }
        }
        // 检查右上
        for (int i = row - 1, j = col + 1; i >= 0 && j < len; i--, j++) {
            if ('Q' == board[i].charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
