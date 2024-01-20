package Blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EraseOverlaps {
    public int eraseOverlapIntervals(int[][] intervals) {

        if (intervals == null || intervals.length == 0) return 0;
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        List<int[]> intervalsList = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];
        int results = 0;

        for (int[] interval : intervals) {
            int lastIndex = intervalsList.size() - 1;
            if (intervalsList.isEmpty()) {
                intervalsList.add(new int[]{start, end});
            } else if (intervalsList.get(lastIndex)[1] > interval[0]) {
                results++;

            }else {
                intervalsList.add(interval);
            }
        }
        return results;

    }
}
