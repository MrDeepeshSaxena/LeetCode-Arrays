public class Number_of_Students_Unable_to_Eat_Lunch_1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];

        for (final int student : students)
            ++count[student];

        for (int i = 0; i < sandwiches.length; ++i) {
            if (count[sandwiches[i]] == 0)
                return sandwiches.length - i;
            --count[sandwiches[i]];
        }

        return 0;
    }
}
