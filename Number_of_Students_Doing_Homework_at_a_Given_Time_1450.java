public class Number_of_Students_Doing_Homework_at_a_Given_Time_1450 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i])
                count++;
        }
        return count;
    }
}
