import java.util.ArrayList;
import java.util.List;

public class Decompress_Run_Length_Encoded_List_1313 {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < nums.length - 1; i += 2) {
            for (int freq = 0; freq < nums[i]; freq++) {
                answer.add(nums[i + 1]);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

