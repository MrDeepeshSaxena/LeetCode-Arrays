import java.util.ArrayDeque;
import java.util.Deque;

public class Final_Prices_With_a_Special_Discount_in_a_Shop_1475 {
    public int[] finalPrices(int[] prices) {
        int[] ans = prices.clone();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int j = 0; j < prices.length; ++j) {
            // stack[-1] := i in the problem description.
            while (!stack.isEmpty() && prices[j] <= prices[stack.peek()])
                ans[stack.pop()] -= prices[j];
            stack.push(j);
        }

        return ans;
    }
}
