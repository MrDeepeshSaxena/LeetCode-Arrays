import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Split_Strings_by_Separator_2788 {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        return words.stream()
                .flatMap(word -> Arrays.stream(word.split("\\" + separator)))
                .filter(word -> !word.isEmpty())
                .collect(Collectors.toList());
    }
}
