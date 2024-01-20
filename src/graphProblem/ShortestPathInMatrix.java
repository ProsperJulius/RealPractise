package graphProblem;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInMatrix {
    public class PairAndResult {
        int row;
        int column;
        int moves;

        public PairAndResult(int row, int column, int moves) {
            this.row = row;
            this.column = column;
            this.moves = moves;
        }
    }

    public int shortestPathBinaryMatrix(int[][] grid) {

        if (grid[0][0] != 0 || grid[grid.length - 1][grid[0].length - 1] != 0) {
            return -1;
        }
        Queue<PairAndResult> nodeQueue = new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int[][] directions = {{1, 0}, {0, 1}, {1, 1}, {-1, -1}, {-1, 0}, {0, -1}, {-1, 1}, {1, -1}};
        nodeQueue.add(new PairAndResult(0, 0, 1));
        int gridLength = grid.length - 1;
        while (!nodeQueue.isEmpty()) {
            PairAndResult pairAndResult = nodeQueue.poll();
            int row = pairAndResult.row;
            int column = pairAndResult.column;
            if (row == gridLength && column == gridLength && grid[row][column] == 0) {
                return pairAndResult.moves;
            }
            for (int[] direction : directions) {
                int newRow = row + direction[0];
                int newColumn = column + direction[1];
                boolean isRowBound = newRow >= 0 && newRow < grid.length;
                boolean isColumnBound = newColumn >= 0 && newColumn < grid[0].length;

                if (isRowBound && isColumnBound && !visited[newRow][newColumn] && grid[newRow][newColumn] == 0) {
                    nodeQueue.add(new PairAndResult(newRow, newColumn, pairAndResult.moves + 1));
                    visited[row][column] = true;
                }
            }
        }

        return -1;
    }

    private static int explore(int[][] grid, boolean[][] visited, int row, int column, int size) {
        boolean isRowBound = row >= 0 && row < grid.length;
        boolean isColumnBound = column >= 0 && column < grid[0].length;
        if (!isRowBound || !isColumnBound || visited[row][column] || grid[row][column] != 0) return 0;
        visited[row][column] = true;
        int gridLength = grid.length - 1;
        if (row == gridLength && column == gridLength && grid[row][column] == 0) return size + 1;
        explore(grid, visited, row + 1, column, size++);
        explore(grid, visited, row + 1, column + 1, size++);
        explore(grid, visited, row, column + 1, size++);
        explore(grid, visited, row + 1, column, size++);
        return -1;
    }

}
