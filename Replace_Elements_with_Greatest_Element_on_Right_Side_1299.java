public class Replace_Elements_with_Greatest_Element_on_Right_Side_1299 {
    public int[] replaceElements(int[] arr) {
        int maxOfRight = -1;
        for (int i = arr.length - 1; i >= 0; --i) {
            int a = arr[i];
            arr[i] = maxOfRight;
            maxOfRight = Math.max(maxOfRight, a);
        }
        return arr;
    }
}
