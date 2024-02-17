public class Number_Of_Rectangles_That_Can_Form_The_Largest_Square_1725 {
    public int countGoodRectangles(int[][] rectangles) {
        int ans = 0, mx = 0;
        for (int[] r : rectangles) {
            int t = Math.min(r[0], r[1]);
            if (mx < t) {
                mx = t;
                ans = 1;
            } else if (mx == t) {
                ++ans;
            }
        }
        return ans;
    }
}
