public class Number_of_Good_Pairs_1512 {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[102];
        int totalCount = 0;

        for (int num : nums) {
            count[num]++;
        }

        for (int i : count) {
            totalCount += ((i) * (i - 1)) / 2;
        }

        return totalCount;
    }
}
