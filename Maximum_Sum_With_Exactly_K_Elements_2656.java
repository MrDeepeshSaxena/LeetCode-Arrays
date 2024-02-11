import java.util.Arrays;

public class Maximum_Sum_With_Exactly_K_Elements_2656 {
    public int maximizeSum(int[] nums, int k) {
        final int x = Arrays.stream(nums).max().getAsInt();
        return x * k + k * (k - 1) / 2;
    }
}
