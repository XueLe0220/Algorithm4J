package cn.xuele.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
 * 请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
 *
 * @author XueLe
 * @since 2025/10/28
 */
public class LC0056_MergeIntervals {
    public int[][] merge(int[][] intervals) {

        if(intervals.length < 2){
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int slow = 0;
        for (int fast = 1; fast < intervals.length; fast++) {
            if (intervals[slow][1] < intervals[fast][0]) {
                slow++;
                intervals[slow] = intervals[fast];
            } else {
                intervals[slow][1] = Math.max(intervals[slow][1], intervals[fast][1]);
            }
        }
        return Arrays.copyOf(intervals, slow + 1);
    }
}
