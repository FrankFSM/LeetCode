package com.ralap.labuladong.basics.back_track;

import java.util.LinkedList;
import java.util.List;

public class BackTrack {
    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> permute(int[] numbers) {
        LinkedList<Integer> track = new LinkedList<>();
        this.backTrack(numbers, track);
        return res;
    }

    public void backTrack(int[] numbers, LinkedList<Integer> track) {
        // 结束条件: 已全部选择
        if (track.size() == numbers.length) {
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i = 0; i < numbers.length; i++) {
            // 排除已经选择过的
            if (track.contains(numbers[i])) {
                continue;
            }
            // 做出选择
            track.add(numbers[i]);
            // 进入下一层决策树
            backTrack(numbers, track);
            // 撤销选择
            track.removeLast();
        }
    }
}
