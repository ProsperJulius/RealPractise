package graphProblem;

import java.util.HashSet;
import java.util.Set;

public class IsLandCount {
    public static int numberofIslands(char[][] board) {
        Set<String> visited = new HashSet<>();
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (explore(board, visited, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean explore(char[][] board, Set<String> visited, int row, int col) {
        boolean rowInBound = row >= 0 && row < board.length;
        boolean colInBound = col >= 0 && col < board[0].length;
        if (!rowInBound || !colInBound) return false;
        if (board[row][col] == 'W') return false;
        String newNode = new StringBuilder().append(row).append(',').append(col).toString();
        if (visited.contains(newNode)) return false;
        visited.add(newNode);
        explore(board, visited, row - 1, col);
        explore(board, visited, row + 1, col);
        explore(board, visited, row, col - 1);
        explore(board, visited, row, col + 1);
        return true;
    }

    public static void main(String[] args) {
        System.out.println(numberofIslands(new char[][]{{'W', 'L', 'W', 'W', 'W', 'W', 'L'},
                                                        {'W', 'L', 'W', 'W', 'L', 'W', 'L'},
                                                        {'W', 'L', 'W', 'W', 'L', 'W', 'W'},
                                                        {'W', 'W', 'L', 'L', 'W', 'W', 'W'}}));
    }
}
