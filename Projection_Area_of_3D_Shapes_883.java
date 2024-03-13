public class Projection_Area_of_3D_Shapes_883 {
    public int projectionArea(int[][] grid) {
        int ans = 0;

        for (int i = 0; i < grid.length; ++i) {
            int maxOfRow = 0;
            int maxOfCol = 0;
            for (int j = 0; j < grid.length; ++j) {
                maxOfRow = Math.max(maxOfRow, grid[i][j]);
                maxOfCol = Math.max(maxOfCol, grid[j][i]);
                if (grid[i][j] > 0)
                    ++ans;
            }
            ans += maxOfRow + maxOfCol;
        }

        return ans;
    }
}
