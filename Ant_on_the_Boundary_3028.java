public class Ant_on_the_Boundary_3028 {
    public int returnToBoundaryCount(int[] nums) {
        int ans = 0;
        int prefix = 0;

        for (final int num : nums) {
            prefix += num;
            if (prefix == 0)
                ++ans;
        }

        return ans;
    }
}
