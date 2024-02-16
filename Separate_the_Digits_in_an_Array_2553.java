import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Separate_the_Digits_in_an_Array_2553 {
    public int[] separateDigits(int[] nums) {
        List<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int test = nums[i];
            List<Integer> temp = new ArrayList<Integer>();
            while (test > 0) {
                int rem = test % 10;
                temp.add(rem);
                test /= 10;
            }
            Collections.reverse(temp);
            answer.addAll(temp);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
