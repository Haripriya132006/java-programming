public class nqueens {
    public static void main(String[] args) {
        int n =4;
        int[][] board = new int[n][n];
        solve(board, 0, n);

    }

    public static boolean issafe(int[][] board, int row, int col, int n) {
        // vertical up checkkk
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1)
                return false;
        }

        // Check upper-left diagonal
        int i = row - 1;
        int j = col - 1;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 1) {
                return false; // Found a queen in the upper-left diagonal
            }
            i--;
            j--;
        }

        // Check upper-right diagonal
        int i1 = row - 1;
        int j1 = col + 1;
        while (i1 >= 0 && j1 < n) {
            if (board[i1][j1] == 1) {
                return false; // Found a queen in the upper-right diagonal
            }
            i1--;
            j1++;
        }
        

        return true;
    }

    public static boolean solve(int[][] board, int row, int n) {
        if (row == n) {
            // All queens placed
            printBoard(board, n);
            return true; // return false if you want all solutions
        }

        for (int col = 0; col < n; col++) {

            if (issafe(board, row, col, n)) {
                board[row][col] = 1; // Place queen

                if (solve(board, row + 1, n))
                    return true;

                board[row][col] = 0; // Backtrack
            }
        }
        return false;
    }

    public static void printBoard(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

