public class Maximum_Number_of_Words_Found_in_Sentences_2114 {
    public int mostWordsFound(String[] sentences) {

        int[] counts = new int[sentences.length];
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            counts[i] = words.length;

        }

        int max = counts[0];
        for (int j = 0; j < counts.length; j++) {
            if (counts[j] > max) {
                max = counts[j];
            }
        }

        return max;
    }
}

