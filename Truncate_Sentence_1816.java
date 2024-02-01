public class Truncate_Sentence_1816 {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        String[] truncated = new String[k];

        for (int i = 0; i < k; ++i)
            truncated[i] = words[i];

        return String.join(" ", truncated);
    }
}
