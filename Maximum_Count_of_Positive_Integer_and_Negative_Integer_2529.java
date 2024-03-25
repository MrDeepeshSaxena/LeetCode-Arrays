import java.util.Arrays;

public class Maximum_Count_of_Positive_Integer_and_Negative_Integer_2529 {
    public int maximumCount(int[] nums) {
        return (int) Math.max(Arrays.stream(nums).filter(num -> num > 0).count(),
                Arrays.stream(nums).filter(num -> num < 0).count());
    }
}
