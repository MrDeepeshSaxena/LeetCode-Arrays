import java.util.HashMap;
import java.util.Map;

public class Kth_Distinct_String_in_an_Array_2053 {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> count = new HashMap<>();

        for (final String a : arr)
            count.merge(a, 1, Integer::sum);

        for (final String a : arr)
            if (count.get(a) == 1 && --k == 0)
                return a;

        return "";
    }

}
