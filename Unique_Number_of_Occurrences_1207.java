import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Unique_Number_of_Occurrences_1207 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        boolean hasDuplicates = false;

        for (int digit : arr) {
            if (map.containsKey(digit)) {
                map.put(digit, map.get(digit) + 1);
            } else {
                map.put(digit, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (Collections.frequency(map.values(), entry.getValue()) > 1) {
                hasDuplicates = true;
                break;
            }
        }
        return !hasDuplicates;
    }
}
