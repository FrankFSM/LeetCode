package com.ralap.labuladong.basics.back_track;

import org.junit.Test;

import java.util.List;

public class NQueensTest {

    @Test
    public void nQueens() {
        NQueens queens  = new NQueens();
        int number = 3;
        List<List<String>> res =  queens.nQueens(number);
        System.out.println(number + " 皇后，解法：【" + res.size() + "】种");
        res.forEach(item->{
            item.forEach(System.out::println);
            System.out.println();
        });
    }
}