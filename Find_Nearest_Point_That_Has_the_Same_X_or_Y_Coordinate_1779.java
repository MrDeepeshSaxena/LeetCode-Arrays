public class Find_Nearest_Point_That_Has_the_Same_X_or_Y_Coordinate_1779 {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int ans = -1;
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < points.length; ++i) {
            final int dx = x - points[i][0];
            final int dy = y - points[i][1];
            if (dx == 0 || dy == 0) {
                final int dist = Math.abs(dx + dy);
                if (dist < minDist) {
                    minDist = dist;
                    ans = i;
                }
            }
        }
        return ans;
    }
}
