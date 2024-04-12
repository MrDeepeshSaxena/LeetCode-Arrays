public class Check_if_Bitwise_OR_Has_Trailing_Zeros_2980 {
    public boolean hasTrailingZeros(int[] nums) {
        int countEven = 0;

        for (final int num : nums)
            if (num % 2 == 0)
                ++countEven;

        return countEven >= 2;
    }
}
