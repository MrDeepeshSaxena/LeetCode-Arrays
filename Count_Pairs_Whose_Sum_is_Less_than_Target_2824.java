import java.util.List;

public class Count_Pairs_Whose_Sum_is_Less_than_Target_2824 {
    public int countPairs(List<Integer> nums, int target) {

        int ans = 0;

        for (int i = 0; i < nums.size(); ++i)
            for (int j = i + 1; j < nums.size(); ++j)
                if (nums.get(i) + nums.get(j) < target)
                    ++ans;

        return ans;
    }
}
