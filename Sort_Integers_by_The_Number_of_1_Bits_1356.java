import java.util.Arrays;

public class Sort_Integers_by_The_Number_of_1_Bits_1356 {
    public int[] sortByBits(int[] arr) {
        Integer[] A = Arrays.stream(arr).boxed().toArray(Integer[] ::new);
        Arrays.sort(A,
                (a, b)
                        -> Integer.bitCount(a) == Integer.bitCount(b)
                        ? a - b
                        : Integer.bitCount(a) - Integer.bitCount(b));
        return Arrays.stream(A).mapToInt(Integer::intValue).toArray();
    }
}
