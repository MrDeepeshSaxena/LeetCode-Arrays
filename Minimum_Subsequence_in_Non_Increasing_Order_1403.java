import java.util.*;

public class Minimum_Subsequence_in_Non_Increasing_Order_1403 {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (final int num : nums)
            maxHeap.offer(num);
        int half = Arrays.stream(nums).sum() / 2;

        while (half >= 0) {
            ans.add(maxHeap.peek());
            half -= maxHeap.poll();
        }

        return ans;
    }
}
