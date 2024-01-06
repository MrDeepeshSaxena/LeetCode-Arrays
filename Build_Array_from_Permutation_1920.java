public class Build_Array_from_Permutation_1920 {
    public int[] buildArray(int[] nums) {

         // Created an ans Array, whose length is equal to the length of nums Array
        // i.e. no of elements in nums Array is equal to the no of elements in ans Array
        int[] ans = new int[nums.length];

        //Using a for loop to itterate over each element of nums and perform some operation on it
        for(int i=0; i<nums.length; i++){

            // Performed operation --> ans[i] = nums[nums[i]] on current element(ith element of nums Array)
            // and then assigned it to the ith element of ans Array
            ans[i] = nums[nums[i]];
        }

        //Returned the ans Array
        return ans;
    }
}
