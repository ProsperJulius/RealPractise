package Blind75;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervals {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals == null || intervals.length == 0) return new int[][]{newInterval};
        List<int[]> mergedIntervals = new ArrayList<>();

        for(int [] interval : intervals){
            // if newInterval is before [5,8] [2,4]
            if(newInterval[1]<interval[0]){
                mergedIntervals.add(newInterval);
                newInterval = interval;
            }else if(newInterval[0] >interval[1]){                                      //[8,9]
                mergedIntervals.add(interval); // [3,6] [7,9]
            }

            else if(newInterval[0] <= interval[1] || interval[0] <= newInterval[1]){  //[4,7] [5,8] [2,5] [3,8]
                   newInterval[0]= Math.min(newInterval[0],interval[0]);
                   newInterval[1] = Math.max(newInterval[1],interval[1]);
            }

        }
        mergedIntervals.add(newInterval);
        return mergedIntervals.toArray(new int[1][]);


    }
}
