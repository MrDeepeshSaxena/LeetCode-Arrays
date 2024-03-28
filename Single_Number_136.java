public class Single_Number_136 {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for (final int num : nums)
            ans ^= num;

        //Returning the answer
        return ans;
    }
}
