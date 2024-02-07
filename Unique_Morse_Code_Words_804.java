import java.util.HashSet;
import java.util.Set;

public class Unique_Morse_Code_Words_804 {
    public int uniqueMorseRepresentations(String[] words) {
        final String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> transformations = new HashSet<>();

        for (final String word : words) {
            StringBuilder transformation = new StringBuilder();
            for (final char c : word.toCharArray())
                transformation.append(morse[c - 'a']);
            transformations.add(transformation.toString());
        }

        return transformations.size();
    }
}
