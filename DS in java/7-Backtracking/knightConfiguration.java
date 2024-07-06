class Solution {
    public boolean helper(int[][] grid, int row, int col, int num) {
        int size = grid.length;
        if (grid[row][col] == size * size - 1) return true;

        int i, j;
        // 2 up 1 left
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < size && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        // 2 up 1 right
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        // 2 right 1 down
        i = row + 1;
        j = col + 2;
        if (i < size && j < size && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        // 2 right 1 up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < size && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        // 2 left 1 down
        i = row + 1;
        j = col - 2;
        if (i < size && j >= 0 && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        // 2 left 1 up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        // 2 down 1 left
        i = row + 2;
        j = col - 1;
        if (i < size && j >= 0 && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        // 2 down 1 right
        i = row + 2;
        j = col + 1;
        if (i < size && j < size && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        return false;
    }

    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0) return false;
        return helper(grid, 0, 0, 0);
    }
}
