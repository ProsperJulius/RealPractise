package Blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(firstInterval -> firstInterval[0]));
        List<int[]> mergedList = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int [] interval : intervals){
            if(mergedList.isEmpty()){
                mergedList.add(new int []{start,end});
            }
            else if(end >= interval[0]){
                int indexOfLastElement = mergedList.size()-1;
                end = Math.max(end,interval[1]);
                mergedList.get(indexOfLastElement)[1] = end;
            }else if(interval[0]> end){
                start = interval[0];
                end = interval[1];
                mergedList.add(new int []{start,end});
            }

        }

        return mergedList.toArray(new int [0][]);
    }
}
