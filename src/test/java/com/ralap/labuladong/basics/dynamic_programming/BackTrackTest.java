package com.ralap.labuladong.basics.dynamic_programming;

import com.ralap.labuladong.basics.back_track.BackTrack;
import org.junit.Test;

import java.util.List;

public class BackTrackTest {

    @Test
    public void permute() {
        BackTrack backTrack = new BackTrack();
        List<List<Integer>> result = backTrack.permute(new int[]{1, 2, 3});
        for (List<Integer> integers : result) {
            System.out.println(integers);
        }
    }
}