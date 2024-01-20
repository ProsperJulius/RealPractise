package graphProblem;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RottenOranges {
    public static int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int freshOranges = 0;
        int minutes = 0;
        Queue<int[]> rotten = new LinkedList<>();
        List<int[]> directions = List.of(new int[]{0, 1}, new int[]{1, 0}, new int[]{-1, 0}, new int[]{0, -1});

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) freshOranges += 1;
                if (grid[i][j] == 2) rotten.add(new int[]{i, j});

            }
        }

        while (!rotten.isEmpty() && freshOranges > 0) {
            int i = 0;
            int rottenSize = rotten.size();
            while (i < rottenSize) {
                int[] rottenOrange = rotten.poll();
                for (int[] direction : directions) {
                    assert rottenOrange != null;
                    int newRow = direction[0] + rottenOrange[0];
                    int newCol = direction[1] + rottenOrange[1];
                    boolean isRowBound = newRow >= 0 && newRow < grid.length;
                    boolean isColBound = newCol >= 0 && newCol < grid[0].length;
                    if (!isColBound || !isRowBound || grid[newRow][newCol] != 1) continue;
                    freshOranges -= 1;
                    grid[newRow][newCol] = 2;
                    rotten.add(new int[]{newRow, newCol});
                }
                i++;
            }
            minutes += 1;
        }
        if (freshOranges == 0) return minutes;
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(orangesRotting(new int[][]{{2,1,1},{1,1,1},{0,1,2}}));
    }
}
