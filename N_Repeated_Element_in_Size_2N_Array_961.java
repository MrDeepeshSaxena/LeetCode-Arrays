public class N_Repeated_Element_in_Size_2N_Array_961 {
    public int repeatedNTimes(int[] nums) {
        for (int i = 0; i + 2 < nums.length; ++i)
            if (nums[i] == nums[i + 1] || nums[i] == nums[i + 2])
                return nums[i];
        return nums[nums.length - 1];
    }
}
