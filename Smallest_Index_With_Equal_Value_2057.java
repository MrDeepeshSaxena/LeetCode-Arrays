public class Smallest_Index_With_Equal_Value_2057 {
    public int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; ++i)
            if (nums[i] == i % 10)
                return i;
        return -1;
    }
}
