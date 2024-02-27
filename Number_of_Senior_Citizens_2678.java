public class Number_of_Senior_Citizens_2678 {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String info : details) {
            int age = Integer.parseInt(info.substring(11, 13));
            if (age > 60) {
                count += 1;
            }
        }
        return count;
    }
}
