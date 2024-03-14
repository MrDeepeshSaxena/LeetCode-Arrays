import java.util.Arrays;
import java.util.stream.Collectors;

public class Make_Two_Arrays_Equal_by_Reversing_Subarrays_1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()))
                .equals(Arrays.stream(target).boxed().collect(
                        Collectors.groupingBy(Integer::intValue, Collectors.counting())));
    }
}
