package com.ralap._60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 56. 合并区间
 * <p>
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出：[[1,6],[8,10],[15,18]]
 * 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 示例 2：
 * <p>
 * 输入：intervals = [[1,4],[4,5]]
 * 输出：[[1,5]]
 * 解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/merge-intervals
 */
public class _56_MergeIntervals {

    public int[][] solution(int[][] intervals) {
        List<int[]> ret = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int[] curr = intervals[0];
        int preStart = curr[0];
        int preEnd = curr[1];

        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if(start > preEnd){
                ret.add(new int[]{preStart, preEnd});
                preStart = start;
                preEnd = end;
            }else {
                preStart = Math.min(preStart, start);
                preEnd = Math.max(preEnd, end);
            }
        }
        ret.add(new int[]{preStart, preEnd});
        int[][] retArray = new int[ret.size()][];
        for (int i = 0; i < ret.size(); i++) {
            retArray[i] = ret.get(i);
        }
        return retArray;
    }
}
