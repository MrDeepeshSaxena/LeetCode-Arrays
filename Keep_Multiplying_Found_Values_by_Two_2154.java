import java.util.HashSet;
import java.util.Set;

public class Keep_Multiplying_Found_Values_by_Two_2154 {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            s.add(num);
        }
        while (s.contains(original)) {
            original <<= 1;
        }
        return original;
    }
}
