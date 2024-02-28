import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Target_Indices_After_Sorting_Array_2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        final int count = (int) Arrays.stream(nums).filter(num -> num == target).count();
        int lessThan = (int) Arrays.stream(nums).filter(num -> num < target).count();

        for (int i = 0; i < count; ++i)
            ans.add(lessThan++);

        return ans;
    }
}
