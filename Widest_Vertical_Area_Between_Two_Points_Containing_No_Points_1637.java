import java.util.Arrays;

public class Widest_Vertical_Area_Between_Two_Points_Containing_No_Points_1637 {
    public int maxWidthOfVerticalArea(int[][] points) {
        int ans = 0;
        int[] xs = new int[points.length];

        for (int i = 0; i < points.length; ++i)
            xs[i] = points[i][0];

        Arrays.sort(xs);

        for (int i = 1; i < xs.length; ++i)
            ans = Math.max(ans, xs[i] - xs[i - 1]);

        return ans;
    }
}
