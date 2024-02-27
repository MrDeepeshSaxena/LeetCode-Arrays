public class Sort_Array_By_Parity_905 {
    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        for (int j = 0; j < A.length; j++) {
            if (A[j] % 2 == 0) {
                swap(A, i, j);
                i++;
            }
        }
        return A;
    }

    void swap(int[] arr, int i, int j) {
        if (i == j) return;
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
