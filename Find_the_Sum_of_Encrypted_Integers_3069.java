public class Find_the_Sum_of_Encrypted_Integers_3069 {
    public static void main(String[] args) {
        int[] nums = {10, 21, 31};
        System.out.println(sumOfEncryptedInt(nums));
    }

    public static int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += encrypted(nums[i]);
        }
        return sum;
    }

    public static int encrypted(int k) {
        if (k < 10) {
            return k;
        }
        int n = String.valueOf(k).length();
        String s = String.valueOf(k);
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, s.charAt(i) - '0');
        }
        int ans = max;
        for (int i = 1; i < n; i++) {
            ans = ans * 10 + max;
        }
        return ans;
    }
}
