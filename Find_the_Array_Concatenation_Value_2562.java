import java.util.List;

public class Find_the_Array_Concatenation_Value_2562 {
    public long findTheArrayConcVal(List<Integer> nums) {
        long ans = 0;

        for (int i = 0, j = nums.size() - 1; i <= j; ++i, --j) {
            ans += nums.get(j);
            if (i < j)
                ans += nums.get(i) * Math.pow(10, (int) (Math.log10(nums.get(j))) + 1);
        }
        return ans;
    }
}
