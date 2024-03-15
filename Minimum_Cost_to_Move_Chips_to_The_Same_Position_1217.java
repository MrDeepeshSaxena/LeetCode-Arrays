public class Minimum_Cost_to_Move_Chips_to_The_Same_Position_1217 {
    public int minCostToMoveChips(int[] position) {
        int a = 0;
        for (int p : position) {
            a += p % 2;
        }
        int b = position.length - a;
        return Math.min(a, b);
    }
}
