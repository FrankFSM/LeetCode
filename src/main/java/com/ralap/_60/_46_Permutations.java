package com.ralap._60;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _46_Permutations {
    public List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> solution(int[] nums) {
        this.backtracking(nums, new LinkedList<>());
        return res;
    }

    private void backtracking(int[] nums, LinkedList<Integer> list) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            this.backtracking(nums, list);
            list.removeLast();
        }
    }
}
