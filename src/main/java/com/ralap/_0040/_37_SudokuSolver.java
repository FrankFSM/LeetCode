package com.ralap._0040;

import java.util.ArrayList;
import java.util.List;

/**
 * 37. 解数独
 * <p>
 * 编写一个程序，通过填充空格来解决数独问题。
 * <p>
 * 数独的解法需 遵循如下规则：
 * <p>
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
 * 数独部分空格内已填入了数字，空白格用 '.' 表示。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/sudoku-solver
 */
public class _37_SudokuSolver {
    boolean[][] rows = new boolean[9][9];
    boolean[][] cols = new boolean[9][9];
    boolean[][][] tabs = new boolean[3][3][9];
    List<int[]> spaceList = new ArrayList<>();
    boolean flag = false;

    public void solution(char[][] board) {
        int boardLen = board.length;
        for (int i = 0; i < boardLen; i++) {
            for (int j = 0; j < boardLen; j++) {
                if (board[i][j] == '.') {
                    spaceList.add(new int[]{i, j});
                } else {
                    int number = board[i][j] - '0' - 1;
                    rows[i][number] = cols[j][number] = tabs[i / 3][j / 3][number] = true;
                }
            }
        }

        this.backtracking(board, 0);
    }

    public void backtracking(char[][] board, int pos) {
        if (pos == spaceList.size()) {
            flag = true;
            return;
        }
        int[] space = this.spaceList.get(pos);
        int row = space[0];
        int col = space[1];
        for (int i = 0; i < 9 && !flag; i++) {
            if (!rows[row][i] && !cols[col][i] && !tabs[row/3][col/3][i]) {
                rows[row][i] = cols[col][i] = tabs[row / 3][col / 3][i] = true;
                board[row][col] = (char) (i + '0' + 1);
                backtracking(board, pos + 1);
                rows[row][i] = cols[col][i] = tabs[row / 3][col / 3][i] = false;
            }
        }
    }
}
