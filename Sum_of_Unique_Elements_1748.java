import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sum_of_Unique_Elements_1748 {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int sum = 0;
        Set<Integer> set = map.keySet();
        for (int num : set) {
            int count = map.get(num);
            if (count == 1)
                sum += num;
        }
        return sum;
    }
}
