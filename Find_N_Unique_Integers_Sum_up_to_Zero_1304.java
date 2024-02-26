public class Find_N_Unique_Integers_Sum_up_to_Zero_1304 {
    public int[] sumZero(int n) {

        int[] ans = new int[n];

        for (int i = 0; i < n; ++i)
            ans[i] = i * 2 - n + 1;

        return ans;
    }
}
