package com.ralap._60;

import java.util.ArrayList;
import java.util.List;

/**
 * 57. 插入区间
 * <p>
 * 给你一个 无重叠的 ，按照区间起始端点排序的区间列表。
 * <p>
 * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：intervals = [[1,3],[6,9]], newInterval = [2,5]
 * 输出：[[1,5],[6,9]]
 * 示例 2：
 * <p>
 * 输入：intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * 输出：[[1,2],[3,10],[12,16]]
 * 解释：这是因为新的区间 [4,8] 与 [3,5],[6,7],[8,10] 重叠。
 * 示例 3：
 * <p>
 * 输入：intervals = [], newInterval = [5,7]
 * 输出：[[5,7]]
 * 示例 4：
 * <p>
 * 输入：intervals = [[1,5]], newInterval = [2,3]
 * 输出：[[1,5]]
 * 示例 5：
 * <p>
 * 输入：intervals = [[1,5]], newInterval = [2,7]
 * 输出：[[1,7]]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/insert-interval
 */

public class _57_InsertInterval {
    public int[][] solution(int[][] intervals, int[] newInterval) {
        List<int[]> ret = new ArrayList<>();
        int left = newInterval[0];
        int right = newInterval[1];
        boolean need = false;
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            // 在左侧，无交集，加入自身以当前数据
            if (start > right ) {
                if(!need){
                    ret.add(new int[]{left, right});
                    need = true;
                }
                ret.add(intervals[i]);
            } else if(left > end){
                // 在有侧，无交集，加当前数据
                ret.add(intervals[i]);
            }else {
                // 计算交集
                left = Math.min(left, start);
                right = Math.max(right, end);
            }
        }
        // 是不是已经加过自身
        if(!need){
            ret.add(new int[]{left, right});
        }
        int[][] retArray = new int[ret.size()][];
        for (int i = 0; i < ret.size(); i++) {
            retArray[i] = ret.get(i);
        }
        return retArray;
    }
}
