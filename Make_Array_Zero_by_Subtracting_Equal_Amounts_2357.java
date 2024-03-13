import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Make_Array_Zero_by_Subtracting_Equal_Amounts_2357 {
    public int minimumOperations(int[] nums) {
        Set<Integer> seen = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return seen.size() - (seen.contains(0) ? 1 : 0);
    }
}
