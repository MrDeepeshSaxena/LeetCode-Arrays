public class Find_Greatest_Common_Divisor_of_Array_1979 {
    public int findGCD(int[] nums) {
        int a = 1, b = 1000;
        for (int x : nums) {
            a = Math.max(a, x);
            b = Math.min(b, x);
        }
        return gcd(a, b);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
