import java.util.Arrays;
import java.util.stream.IntStream;

public class The_K_Weakest_Rows_in_a_Matrix_1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        int[][] candidates = new int[mat.length][2];

        for (int i = 0; i < mat.length; ++i) {
            candidates[i][0] = IntStream.of(mat[i]).sum();
            candidates[i][1] = i;
        }

        Arrays.sort(candidates, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        for (int i = 0; i < k; ++i)
            ans[i] = candidates[i][1];

        return ans;
    }
}