import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordOccurrences {

    static void wordCount() {
        List<String> words = Arrays.asList("apple", "banana", "apple");
        Map<String, Long> map = words.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(map);
    }
}
