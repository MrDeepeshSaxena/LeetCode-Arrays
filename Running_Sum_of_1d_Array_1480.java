public class Running_Sum_of_1d_Array_1480 {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            answer[i] = sum;
        }
        return answer;
    }
}
