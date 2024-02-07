public class Minimum_Time_Visiting_All_Points_1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;

        for (int i = 1; i < points.length; ++i)
            ans += Math.max(Math.abs(points[i][0] - points[i - 1][0]),
                    Math.abs(points[i][1] - points[i - 1][1]));

        return ans;
    }
}
