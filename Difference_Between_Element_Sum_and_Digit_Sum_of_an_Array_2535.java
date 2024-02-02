public class Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array_2535 {
    public int differenceOfSum(int[] nums) {
        int a = 0, b = 0;
        for (int x : nums) {
            a += x;
            for (; x > 0; x /= 10) {
                b += x % 10;
            }
        }
        return Math.abs(a - b);
    }
}
