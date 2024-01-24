public class Richest_Customer_Wealth_1672 {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int arraySum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                arraySum += accounts[i][j];
            }
            if (arraySum > wealth) {
                wealth = arraySum;
            }
        }
        return wealth;
    }
}
