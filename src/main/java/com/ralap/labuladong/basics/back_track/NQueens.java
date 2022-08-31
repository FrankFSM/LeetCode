package com.ralap.labuladong.basics.back_track;

import java.util.LinkedList;
import java.util.List;

public class NQueens {
    List<List<String>> res = new LinkedList<>();

    public List<List<Character>> nQueens(int n) {

    }

    private void backTrack(int n , List<Character> board){
        if (board.size() == n) {
            res.add(new LinkedList(board));
            return;
        }

        for()

    }
}
