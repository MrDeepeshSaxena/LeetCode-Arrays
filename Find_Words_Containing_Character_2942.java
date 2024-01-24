import java.util.ArrayList;
import java.util.List;

public class Find_Words_Containing_Character_2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.indexOf(x) != -1) {
                answer.add(i);
            }
        }
        return answer;
    }
}
