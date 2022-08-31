package com.ralap.labuladong.basics.back_track;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NQueens {
    /* 返回结果 */
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> nQueens(int n) {
        List<String> board = this.initBoard(n);
        this.backTrack(0, board);
        return res;
    }

    private void backTrack(int row, List<String> board) {
        // 到最后一个行（最后一个皇后）结束
        if (board.size() == row) {
            // 将整个棋盘放入
            res.add(new ArrayList(board));
            return;
        }
        int n = board.get(row).length();
        // 所有列，选择列表
        for (int col = 0; col < n; col++) {
            // 排除不符合要求的
            if(!this.isValid(board, row, col)){
                continue;
            }
            // 选择
            StringBuilder sb = new StringBuilder(board.get(row));
            board.set(row, sb.replace(col, col+1, "Q").toString());
            backTrack(row + 1, board);
            // 撤销选择
            board.set(row, sb.replace(col, col+1, ".").toString());
        }
    }

    /**
     * 是否有效
     * @param board
     * @param row
     * @param col
     * @return
     */
    public boolean isValid(List<String> board, int row, int col){
        int n = board.size();
        // 已经放置过的行，这一列是否已经存在
        for (int i = 0; i < row; i++) {
            if(board.get(i).charAt(col) == 'Q'){
                return false;
            }
        }
        // 左上
        for (int i = row -1,  j = col -1; i>=0 && j>=0 ; i--, j--) {
            if(board.get(i).charAt(j) == 'Q'){
                return false;
            }
        }
        // 右上
        for (int i = row -1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board.get(i).charAt(j) == 'Q'){
                return false;
            }
        }
        return true;

    }
    /**
     * 初始化棋盘
     *
     * @param n 边长
     * @return board
     * eg: n = 3
     *    ...
     *    ...
     *    ...
     */
    private List<String> initBoard(int n) {
        List<String> board = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            board.add(String.join("", Collections.nCopies(n, ".")));
        }
        return board;
    }

}
