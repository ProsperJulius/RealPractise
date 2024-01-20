package Blind75;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPoints {
    public int[][] kClosest(int[][] points, int k) {
        if(points == null || points.length == 0) return points;

        Queue<int[]> pointsInOrder = new PriorityQueue<>(Comparator.comparingInt(point->-1*(point[0]*point[0] + point[1]*point[1])));

       for(int [] point : points){
             pointsInOrder.add(point);
             if(pointsInOrder.size() > k){
                 pointsInOrder.peek();
             }
       }

        return pointsInOrder.toArray(new int [0][]);

    }
}
