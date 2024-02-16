public class Minimum_Operations_to_Make_the_Array_Increasing_1827 {
    public int minOperations(int[] nums) {
        int ans = 0;
        int last = 0;

        for (final int num : nums) {
            ans += Math.max(0, last - num + 1);
            last = Math.max(num, last + 1);
        }

        return ans;
    }
}
