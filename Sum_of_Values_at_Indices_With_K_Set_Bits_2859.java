import java.util.List;

public class Sum_of_Values_at_Indices_With_K_Set_Bits_2859 {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans = 0;

        for (int i = 0; i < nums.size(); ++i)
            if (Integer.bitCount(i) == k)
                ans += nums.get(i);

        return ans;
    }
}
