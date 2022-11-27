package com.ralap._40;

import java.util.ArrayList;
import java.util.List;

/**
 * 36. 有效的数独
 * <p>
 * 请你判断一个 9 x 9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
 * <p>
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
 * <p>
 * 输入：board =
 * [["5","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：board =
 * [["8","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * 输出：false
 * 解释：除了第一行的第一个数字从 5 改为 8 以外，空格内其他数字均与 示例1 相同。 但由于位于左上角的 3x3 宫内有两个 8 存在, 因此这个数独是无效的。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/valid-sudoku
 */
public class _36_ValidSudoku {
    public boolean solution(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        // 行是否存在
        for (int i = 0; i < board.length; i++) {
            boolean isValid = this.valid(board, i, i, 0, cols - 1);
            if (!isValid) {
                return false;
            }
        }

        // 列是否存在
        for (int i = 0; i < board.length; i++) {
            boolean isValid = this.valid(board, 0, rows - 1, i, i);
            if (!isValid) {
                return false;
            }
        }

        // 3*3
        for (int i = 0; i < board.length; i++) {
            int top = i / 3 * 3;
            int bottom = top + 2;
            int left = (i % 3) * 3;
            int right = (i % 3) * 3 + 2;
            boolean isValid = this.valid(board, top, bottom, left, right);
            if (!isValid) {
                return false;
            }
        }
        return true;
    }

    public boolean valid(char[][] board, int top, int bottom, int left, int right) {
        List<Character> list = new ArrayList<>();
        for (int i = top; i <= bottom; i++) {
            for (int j = left; j <= right; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (list.contains(board[i][j])) {
                    return false;
                }
                list.add(board[i][j]);
            }
        }
        return true;
    }
}
