import java.util.Arrays;

public class Minimum_Number_of_Moves_to_Seat_Everyone_2037 {
    public int minMovesToSeat(int[] seats, int[] students) {
        int res = 0;

        Arrays.sort(seats);
        Arrays.sort(students);

        for (int i = 0; i < seats.length; ++i)
            res += Math.abs(seats[i] - students[i]);

        return res;
    }
}
