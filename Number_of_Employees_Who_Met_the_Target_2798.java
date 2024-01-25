import java.util.Arrays;

public class Number_of_Employees_Who_Met_the_Target_2798 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        return (int) Arrays.stream(hours).filter(hour -> hour >= target).count();
    }
}
