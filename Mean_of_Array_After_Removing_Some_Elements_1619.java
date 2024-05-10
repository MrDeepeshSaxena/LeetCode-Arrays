import java.util.Arrays;

public class Mean_of_Array_After_Removing_Some_Elements_1619 {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        final int offset = arr.length / 20;
        return Arrays.stream(Arrays.copyOfRange(arr, offset, arr.length - offset)).average().orElse(0);
    }

}
