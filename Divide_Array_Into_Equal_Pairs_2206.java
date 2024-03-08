import java.util.Arrays;

public class Divide_Array_Into_Equal_Pairs_2206 {
    public boolean divideArray(int[] nums) {
        int[] count = new int[501];

        for (final int num : nums)
            ++count[num];

        return Arrays.stream(count).allMatch(c -> c % 2 == 0);
    }
}
