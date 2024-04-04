import java.util.HashMap;
import java.util.Map;

public class Count_Common_Words_With_One_Occurrence_2085 {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> count = new HashMap<>();

        for (final String word : words1)
            count.merge(word, 1, Integer::sum);

        for (final String word : words2)
            if (count.containsKey(word) && count.get(word) < 2)
                count.merge(word, -1, Integer::sum);

        return (int) count.values().stream().filter(v -> v == 0).count();
    }
}
