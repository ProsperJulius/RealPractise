package graphProblem;

public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = i; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0) && search(board, visited, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean search(char[][] board, boolean[][] visited, String word, int row, int col, int index) {

        boolean isRowBound = row >= 0 && row < board.length;
        boolean isColBound = col >= 0 && col < board[0].length;
        if (index == word.length()) return true;
        if (!isRowBound || !isColBound || visited[row][col] || board[row][col] != word.charAt(index)) return false;
        visited[row][col] = true;
        if (search(board, visited, word, row - 1, col, index + 1)
                || search(board, visited, word, row + 1, col, index + 1)
                || search(board, visited, word, row, col - 1, index + 1)
                || search(board, visited, word, row, col + 1, index + 1)
        ) {
            return true;
        }
        visited[row][col] = false;
        return false;
    }
}
