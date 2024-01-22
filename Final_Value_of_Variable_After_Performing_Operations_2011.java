public class Final_Value_of_Variable_After_Performing_Operations_2011 {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;

        for (final String op : operations)
            ans += op.charAt(1) == '+' ? 1 : -1;

        return ans;
    }
}
