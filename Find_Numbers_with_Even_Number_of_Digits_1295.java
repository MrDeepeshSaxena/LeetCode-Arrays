public class Find_Numbers_with_Even_Number_of_Digits_1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int size = Integer.toString(nums[i]).length();
            int digitCount = 0;
            for(int j=0; j<size; j++){
                digitCount+=1;
            }
            if(digitCount % 2 == 0){
                count+=1;
            }
        }
        return count;
    }
}
