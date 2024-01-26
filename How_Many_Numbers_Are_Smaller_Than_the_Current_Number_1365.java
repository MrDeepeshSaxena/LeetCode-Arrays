public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count += 1;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}
