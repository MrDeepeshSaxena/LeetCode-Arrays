public class Concatenation_of_Array_1929 {

    public int[] getConcatenation(int[] nums) {

        //Initialized two variables n(To store the length of Array) and m(To store the length of ans Array)
        int n, m;

        //Calculated the length of Array nums
        n = nums.length;

        //Evaluated the expression to calculate the length of ans array because as per question, length of ans Array is twice the length of Array nums
        m = 2 * n;

        //Created an Array ans which is exactly the result array having its length twice the num Array
        int[] ans = new int[m];

        //Used a method --> arraycopy(source array, the starting position to copy from the source array, a destination array, the starting position in the destination array, the number of elements to be copied) of System class in Java to Copy all the elements of nums Array into ans Array
        System.arraycopy(nums, 0, ans, 0, n);

        //Right now ans Array have all the elements as nums. So, using the same method to again copy the elements of nums Array at the end of ans Array
        System.arraycopy(nums, 0, ans, n, n);

        //Returned the ans Array
        return ans;
    }
}
